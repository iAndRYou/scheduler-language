import {
  ParameterSymbol,
  RoutineSymbol,
  SymbolTable,
  TypedSymbol,
} from "antlr4-c3";
import { ErrorNode } from "antlr4ts/tree/ErrorNode";
import { ParseTree } from "antlr4ts/tree/ParseTree";
import { RuleNode } from "antlr4ts/tree/RuleNode";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { SchedulerLexer } from "./antlr/SchedulerLexer";
import {
  AddSubContext,
  AndExprContext,
  AssignContext,
  Attribute_callContext,
  ClassDefContext,
  CollectionContext,
  Collection_subscriptionContext,
  CompareContext,
  ConditionContext,
  DayDefContext,
  DefContext,
  DeleteContext,
  DumpContext,
  EqualExprContext,
  ExprContext,
  Func_callContext,
  GetContext,
  InExprContext,
  LoadContext,
  MultDivContext,
  NotExprContext,
  OrExprContext,
  OverlapExprContext,
  ParenthesisContext,
  ValueContext,
  ValueExprContext,
} from "./antlr/SchedulerParser";
import { SchedulerVisitor } from "./antlr/SchedulerVisitor";
import { OPERATORS, STRUCTURES, Structure, Type, parseType } from "./types";
import {
  DiagnosticsContext,
  Logger,
  ParserContext,
  assert,
  findScope,
  mapNullable,
  stringType,
} from "./utils";

export class TypecheckingVisitor implements SchedulerVisitor<Type> {
  public constructor(
    private readonly parserContext: ParserContext,
    private readonly diagnostics: DiagnosticsContext,
    private readonly logger: Logger,
    private readonly rootTable: SymbolTable
  ) {}

  private checkType(ctx: ParseTree, a: Type, b: Type, msg: string) {
    if (a != null && b != null && a !== b) {
      this.diagnostics.error(
        ctx,
        msg.replace("$1", a ?? "<UNKNOWN>").replace("$2", b ?? "<UNKNOWN>")
      );
    }
  }

  private visitBinOp(
    ctx: ParseTree & { expr: (i: number) => ExprContext },
    kind: keyof typeof OPERATORS
  ): Type {
    const lhs = ctx.expr(0);
    const rhs = ctx.expr(1);
    const lhsType = this.visit(lhs);
    const rhsType = this.visit(rhs);

    if (lhsType == null || rhsType == null) return null;

    for (const signature of OPERATORS[kind]) {
      if (
        signature.params.length === 2 &&
        signature.params[0] === lhsType &&
        signature.params[1] === rhsType
      ) {
        return signature.result;
      }
    }

    this.diagnostics.error(
      ctx,
      `Cannot apply operator to values of types '${lhsType}' and '${rhsType}'`
    );
    return null;
  }

  public visit(tree: ParseTree): Type {
    if (!tree) return null;
    return tree.accept(this);
  }

  public visitChildren(node: RuleNode): Type {
    if (node.childCount == 1) return this.visit(node.getChild(0));
    for (let i = 0; i < node.childCount; i++) this.visit(node.getChild(i));
    return null;
  }

  public visitErrorNode(node: ErrorNode): Type {
    this.logger.error(`typechecker: ${node.toString()}`);
    return null;
  }

  public visitTerminal(node: TerminalNode): Type {
    if (node.symbol.type === SchedulerLexer.VARNAME) {
      const scope = findScope(node, this.rootTable);
      const symbol = scope?.resolveSync(node.text);
      if (symbol == null || !(symbol instanceof TypedSymbol)) return null;
      const type = symbol?.type?.name ?? null;
      return parseType(type);
    }
    return null;
  }

  public visitValue(ctx: ValueContext): Type {
    if (ctx.BOOL()) return "BOOL";
    if (ctx.DATE()) return "DATE";
    if (ctx.INT()) return "INT";
    if (ctx.STRING()) return "STRING";
    if (ctx.TIME()) return "TIME";
    return null;
  }

  public visitParenthesis(ctx: ParenthesisContext): Type {
    return this.visit(ctx.expr());
  }

  public visitValueExpr(ctx: ValueExprContext): Type {
    if (ctx.value()) return this.visit(ctx.value()!);
    if (ctx.VARNAME()) {
      let node: ParseTree = ctx;
      while (node.parent && !(node.parent instanceof DefContext))
        node = node.parent;
      if (node.parent instanceof DefContext) {
        if (node.parent.VARNAME()?.text === ctx.VARNAME()?.text) {
          this.diagnostics.error(ctx, "Usage of uninitialized variable");
          return null;
        }
      }

      return this.visit(ctx.VARNAME()!);
    }
    if (ctx.collection()) return this.visit(ctx.collection()!);
    return null;
  }

  public visitDef(ctx: DefContext): Type {
    if (ctx.dayDef()) return this.visit(ctx.dayDef()!);
    if (ctx.classDef()) return this.visit(ctx.classDef()!);

    if (ctx.TYPENAME() || ctx.COLLECTION_OF()) {
      const expr = this.visit(ctx.expr()!);
      const type = stringType(
        ctx.TYPENAME()
          ? ctx.TYPENAME()!.text
          : `COLLECTION OF ${ctx.type()!.text}`
      ).name;
      this.checkType(
        ctx,
        parseType(type),
        expr,
        "Cannot assign value of type $2 to a variable of type $1"
      );
    }
    return null;
  }

  public visitAssign(ctx: AssignContext): Type {
    if (!ctx.VARNAME()) return null;
    const target = this.visit(ctx.VARNAME());
    const attribute = ctx.attribute()?.text;
    if (attribute && target) {
      const structureType =
        target in STRUCTURES ? STRUCTURES[target as Structure] : null;
      const type = mapNullable(structureType, (x) =>
        attribute in x ? x[attribute as keyof typeof x] : null
      );

      if (!type) {
        this.diagnostics.error(
          ctx,
          `Unknown attribute ${attribute} on type ${target}`
        );
      } else {
        mapNullable(ctx.expr(), (expr) =>
          this.checkType(
            ctx,
            parseType(type),
            this.visit(expr),
            "Cannot assign value of type $2 to an attribute of type $1"
          )
        );
      }
    } else {
      mapNullable(ctx.expr(), (expr) =>
        this.checkType(
          ctx,
          target,
          this.visit(expr),
          "Cannot assign value of type $2 to a variable of type $1"
        )
      );
    }
    return null;
  }

  public visitFunc_call(ctx: Func_callContext): Type {
    const scope = findScope(ctx.VARNAME(), this.rootTable);
    const symbol = scope?.resolveSync(ctx.VARNAME().text);
    if (symbol == null || !(symbol instanceof RoutineSymbol)) return null;

    const params = symbol.getNestedSymbolsOfTypeSync(ParameterSymbol);
    if (params.length !== ctx.expr().length) {
      this.diagnostics.error(
        ctx,
        `Expected ${params.length} parameters, got ${ctx.expr().length}`
      );
    } else {
      for (let i = 0; i < params.length; i++) {
        const type = this.visit(ctx.expr(i));
        this.checkType(
          ctx,
          parseType(params[i].type!.name),
          type,
          `Invalid value for the parameter ${params[i].name}: expected $1, got $2`
        );
      }
    }
    return parseType(symbol.returnType!.name);
  }

  public visitCollection(ctx: CollectionContext): Type {
    if (!ctx.collection_elements()) return null;
    let prevType = null;
    for (
      let i = 0;
      i < ctx.collection_elements()!.collection_element().length;
      i++
    ) {
      const elem = ctx.collection_elements()!.collection_element(i);
      const currentType = this.visit(elem);
      if (prevType != null && currentType != null && prevType != currentType) {
        this.diagnostics.error(ctx, "Collection has values of multiple types");
        return null;
      }
      prevType = currentType;
    }
    assert(!prevType?.startsWith("COLLECTION OF"), "nested COLLECTION types");
    return prevType != null ? (`COLLECTION OF ${prevType}` as Type) : null;
  }

  private checkStructure(
    ctx: ParseTree,
    name: Structure,
    actual: Record<string, Type>
  ) {
    const expected = STRUCTURES[name];

    for (const attr in expected) {
      const expectedType = expected[attr as keyof typeof expected];
      if (
        actual[attr] &&
        expected[attr as keyof typeof expected] !== actual[attr]
      ) {
        this.diagnostics.error(
          ctx,
          `Invalid type for attribute ${attr}: expected ${expectedType}, got ${actual[attr]}`
        );
      }
    }
  }

  public visitClassDef(ctx: ClassDefContext): Type {
    const actual: Record<string, Type> = {};
    for (let i = 0; i < ctx.CLASS_ATTRIBUTE().length; i++) {
      const attr = ctx.CLASS_ATTRIBUTE(i);
      const type = this.visit(ctx.expr(i));
      actual[attr.text] = type;
    }
    this.checkStructure(ctx, "CLASS", actual);
    return "CLASS";
  }

  public visitDayDef(ctx: DayDefContext): Type {
    const actual: Record<string, Type> = {};
    if (ctx.day_attribute()) {
      actual[ctx.day_attribute()!.text] = this.visit(ctx.expr()!);
    }
    this.checkStructure(ctx, "DAY", actual);
    return "DAY";
  }

  public visitCollection_subscription(
    ctx: Collection_subscriptionContext
  ): Type {
    const collection = this.visit(ctx.VARNAME());
    if (!collection || !collection.startsWith("COLLECTION OF ")) {
      this.diagnostics.error(
        ctx,
        `Cannot subscript a variable of type ${collection}`
      );
      return null;
    }
    this.checkType(
      ctx,
      "INT",
      this.visit(ctx.expr()),
      "Cannot subscript a collection with a value of type $2"
    );

    const type = collection.substring("COLLECTION OF ".length);
    return parseType(type);
  }

  public visitAttribute_call(ctx: Attribute_callContext): Type {
    const target = this.visit(ctx.VARNAME());
    if (!ctx.attribute() || !target) return null;

    const attribute = ctx.attribute()!.text;
    const structureType =
      target in STRUCTURES ? STRUCTURES[target as Structure] : null;
    const type = mapNullable(structureType, (x) =>
      attribute in x ? x[attribute as keyof typeof x] : null
    );

    if (!type) {
      this.diagnostics.error(
        ctx,
        `Invalid attribute ${attribute} for type ${target}`
      );
    }
    return parseType(type ?? null);
  }

  public visitCompare(ctx: CompareContext): Type {
    return this.visitBinOp(ctx, "COMPARISON");
  }

  public visitEqualExpr(ctx: EqualExprContext): Type {
    return this.visitBinOp(ctx, "EQUALITY");
  }

  public visitAddSub(ctx: AddSubContext): Type {
    if (ctx.ADD()) {
      return this.visitBinOp(ctx, "ADDITION");
    } else {
      return this.visitBinOp(ctx, "SUBTRACTION");
    }
  }

  public visitMultDiv(ctx: MultDivContext): Type {
    if (ctx.MULTIPLY()) {
      return this.visitBinOp(ctx, "MULTIPLICATION");
    } else {
      return this.visitBinOp(ctx, "DIVISION");
    }
  }

  public visitOverlapExpr(ctx: OverlapExprContext): Type {
    return this.visitBinOp(ctx, "INTERSECTION");
  }

  public visitAndExpr(ctx: AndExprContext): Type {
    return this.visitBinOp(ctx, "BOOLEAN");
  }

  public visitOrExpr(ctx: OrExprContext): Type {
    return this.visitBinOp(ctx, "BOOLEAN");
  }

  public visitInExpr(ctx: InExprContext): Type {
    return this.visitBinOp(ctx, "CONTAINMENT");
  }

  public visitNotExpr(ctx: NotExprContext): Type {
    this.checkType(
      ctx,
      "BOOL",
      this.visit(ctx.expr()),
      "Cannot apply operator to a value of type $2"
    );
    return "BOOL";
  }

  public visitCondition(ctx: ConditionContext): Type {
    this.checkType(
      ctx,
      "BOOL",
      this.visit(ctx.expr()),
      "Cannot use a value of type $2 as a condition"
    );

    return "BOOL";
  }

  public visitGet(ctx: GetContext): Type {
    if (ctx.condition()) {
      this.visit(ctx.condition()!);
    }
    return ctx.CLASSESTOKEN() ? "COLLECTION OF CLASS" : "COLLECTION OF DAY";
  }

  public visitDelete(ctx: DeleteContext): Type {
    if (ctx.condition()) {
      this.visit(ctx.condition()!);
    }
    return null;
  }

  public visitLoad(ctx: LoadContext): Type {
    this.checkType(
      ctx,
      "STRING",
      this.visit(ctx.file_path()),
      "Cannot use a value of type $2 as a file path"
    );
    return null;
  }

  public visitDump(ctx: DumpContext): Type {
    this.checkType(
      ctx,
      "STRING",
      this.visit(ctx.file_path()),
      "Cannot use a value of type $2 as a file path"
    );
    return null;
  }
}
