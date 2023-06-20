import {
  BaseSymbol,
  ParameterSymbol,
  RoutineSymbol,
  ScopedSymbol,
  SymbolTable,
  VariableSymbol,
} from "antlr4-c3";
import { ParserRuleContext } from "antlr4ts";
import { ParseTree } from "antlr4ts/tree/ParseTree";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Logger } from "vscode-languageserver/node";
import { SchedulerLexer } from "./antlr/SchedulerLexer";
import { SchedulerListener } from "./antlr/SchedulerListener";
import {
  ArgContext,
  AssignContext,
  Attribute_callContext,
  BlockContext,
  DefContext,
  DeleteContext,
  For_loopContext,
  Func_callContext,
  FunctionContext,
  GetContext,
  ProgContext,
  SchedulerParser,
  ValueExprContext,
} from "./antlr/SchedulerParser";
import {
  DiagnosticsContext,
  ParserContext,
  assert,
  intervalToRange,
  stringType,
} from "./utils";

export class TableBuildingListener implements SchedulerListener {
  private readonly rootTable: SymbolTable;
  private readonly scopes: ScopedSymbol[];
  private readonly unusedSymbols = new Set<BaseSymbol>();

  private symbolIdCounter = 0;

  constructor(
    private logger: Logger,
    private parserContext: ParserContext,
    private diagnostics: DiagnosticsContext
  ) {
    this.rootTable = new SymbolTable("root", {
      allowDuplicateSymbols: false,
    });
    this.scopes = [this.rootTable];
  }

  public get symbolTable(): SymbolTable {
    return this.rootTable;
  }

  private popScope(): ScopedSymbol {
    assert(this.scopes.length > 1, "attempting to pop root scope");
    return this.scopes.pop()!;
  }

  private currentScope(): ScopedSymbol {
    return this.scopes[this.scopes.length - 1];
  }

  private tryAddSymbol(symbol: BaseSymbol): void {
    const scope = this.currentScope();
    const existingSymbol = scope.resolveSync(symbol.name, true);
    if (existingSymbol) {
      assert(symbol.context != null, "missing symbol context");
      const name =
        symbol.context instanceof ParserRuleContext
          ? symbol.context.tryGetToken(SchedulerParser.VARNAME, 0)
          : null;

      this.diagnostics.addDiagnostic({
        message: `Symbol redefinition: '${symbol.name}'`,
        range: intervalToRange(
          this.parserContext.tokens,
          (name ?? symbol.context).sourceInterval
        ),
      });
    } else {
      scope.addSymbol(symbol);
      this.unusedSymbols.add(symbol);
    }
  }

  private pushScope(name: string, ctx?: ParseTree): ScopedSymbol {
    const scope = new ScopedSymbol(`${name}_${this.symbolIdCounter++}`);
    scope.context = ctx;
    this.currentScope().addSymbol(scope);
    this.scopes.push(scope);
    return scope;
  }

  public exitFunction(ctx: FunctionContext) {
    const symbol = this.popScope();
    (symbol as RoutineSymbol).returnType = stringType(ctx.type()!.text);
  }
  public enterBlock(ctx: BlockContext) {
    this.pushScope("block", ctx);
  }

  public exitBlock(ctx_: BlockContext) {
    this.popScope();
  }

  public enterDelete(ctx: DeleteContext) {
    this.pushScope("delete", ctx);

    const symbol = new VariableSymbol("date", null, stringType("DATE"));
    symbol.context = ctx.SATISFYING();
    this.tryAddSymbol(symbol);
  }

  public exitDelete(ctx_: DeleteContext) {
    this.popScope();
  }

  public enterGet(ctx: GetContext) {
    this.pushScope("get", ctx);

    const symbol = new VariableSymbol("date", null, stringType("DATE"));
    symbol.context = ctx.SATISFYING();
    this.tryAddSymbol(symbol);
  }

  public exitGet(ctx_: GetContext) {
    this.popScope();
  }

  public enterFor_loop(ctx: For_loopContext) {
    this.pushScope("for", ctx);
  }

  public exitFor_loop(ctx_: For_loopContext) {
    this.popScope();
  }

  public visitTerminal(node: TerminalNode) {
    if (node.symbol.type !== SchedulerLexer.VARNAME) return;

    const context = node.parent?.ruleContext;
    const rule = context?.ruleIndex;

    assert(rule != null, "rule not defined");

    if (
      [
        SchedulerParser.RULE_def,
        SchedulerParser.RULE_classDef,
        SchedulerParser.RULE_dayDef,
        SchedulerParser.RULE_for_loop,
      ].includes(rule)
    ) {
      let type = "UNKNOWN";
      if (context instanceof DefContext) {
        type = context.TYPENAME()
          ? context.TYPENAME()!.text
          : `COLLECTION OF ${context.type()!.text}`;
      } else if (context instanceof For_loopContext) {
        type = context.type()!.text;
      } else if (rule === SchedulerParser.RULE_classDef) {
        type = "CLASS";
      } else if (rule === SchedulerParser.RULE_dayDef) {
        type = "DAY";
      }
      const symbol = new VariableSymbol(node.text, null, stringType(type));
      symbol.context = node;
      this.tryAddSymbol(symbol);
    } else if (rule === SchedulerParser.RULE_function) {
      const symbol = new RoutineSymbol(node.text, undefined);
      symbol.context = context;
      this.tryAddSymbol(symbol);
      this.scopes.push(symbol);
    } else if (rule === SchedulerParser.RULE_arg) {
      const symbol = new ParameterSymbol(
        node.text,
        null,
        stringType((context as ArgContext).type()!.text)
      );
      symbol.context = node;
      this.tryAddSymbol(symbol);
    } else if (
      (context instanceof ValueExprContext ||
        context instanceof Func_callContext ||
        context instanceof Attribute_callContext ||
        context instanceof AssignContext) &&
      context.VARNAME()
    ) {
      const resolvedSymbol = this.currentScope().resolveSync(
        context.VARNAME()!.text
      );
      if (!resolvedSymbol) {
        const token = context.VARNAME()!.symbol;
        this.diagnostics.error(
          context.VARNAME()!,
          `Symbol not defined: '${token.text}'`
        );
      } else {
        this.unusedSymbols.delete(resolvedSymbol);
      }
    } else if (
      context instanceof DeleteContext ||
      context instanceof GetContext
    ) {
      if (context.VARNAME()) {
        const symbol = new VariableSymbol(
          context.VARNAME()!.text,
          null,
          stringType(context.CLASSESTOKEN() ? "CLASS" : "DAY")
        );
        symbol.context = context.VARNAME();
        this.tryAddSymbol(symbol);
      }
    } else {
      this.logger.error(
        `visitTerminal: unhandled terminal '${node.text}' ${
          this.parserContext.parser.ruleNames[
            node.parent?.ruleContext.ruleIndex ?? -1
          ]
        }`
      );
    }
  }

  public exitProg(_: ProgContext) {
    this.unusedSymbols.forEach((x) => {
      const context = x.context;
      if (context) {
        const name =
          context instanceof ParserRuleContext
            ? context.tryGetToken(SchedulerParser.VARNAME, 0)
            : null;
        this.diagnostics.warning(name ?? context, `'${x.name}' is not used`);
      }
    });
  }
}
