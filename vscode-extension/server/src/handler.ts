import {
  BaseSymbol,
  CodeCompletionCore,
  ParameterSymbol,
  RoutineSymbol,
  ScopedSymbol,
  SymbolTable,
  TypedSymbol,
  VariableSymbol,
} from "antlr4-c3";
import {
  ANTLRErrorListener,
  CharStreams,
  CommonTokenStream,
  DefaultErrorStrategy,
  Parser,
  Token,
} from "antlr4ts";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import {
  CompletionItem,
  CompletionItemKind,
  Connection,
  Diagnostic,
  DiagnosticSeverity,
  DocumentSymbol,
  InsertTextFormat,
  RemoteConsole,
  SymbolKind,
  _Connection,
} from "vscode-languageserver/node";

import { SchedulerLexer } from "./antlr/SchedulerLexer";
import { AttributeContext, SchedulerParser } from "./antlr/SchedulerParser";

import { TableBuildingListener } from "./symbolTable";
import { TypecheckingVisitor } from "./typechecker";
import { BASIC_TYPES, STRUCTURES } from "./types";
import {
  DiagnosticsContext,
  Logger,
  ParserContext,
  assert,
  findParentOfType,
  findScope,
  findTerminal,
  getSymbolsInScope,
  intervalToRange,
  mapNullable,
  symbolDescription,
} from "./utils";

/* eslint-disable @typescript-eslint/no-explicit-any */
type Handler<
  Name extends string,
  KeyName extends string & keyof _Connection = `on${Name}` extends string &
    keyof _Connection
    ? `on${Name}`
    : never,
  KeyValue extends (...args: any) => any = _Connection[KeyName] extends (
    ...args: any
  ) => any
    ? _Connection[KeyName]
    : never
> = Parameters<KeyValue>[0];
/* eslint-enable @typescript-eslint/no-explicit-any */

export interface DocumentHandler {
  handleHover: Handler<"Hover">;
  handleCompletion: Handler<"Completion">;
  handleDocumentSymbol: Handler<"DocumentSymbol">;
  handleDefinition: Handler<"Definition">;
}

function convertC3SymbolsToLspSymbols(
  tokens: Token[],
  sym: BaseSymbol
): DocumentSymbol {
  const range = mapNullable(sym.context, (x) =>
    intervalToRange(tokens, x.sourceInterval)
  ) ?? {
    start: {
      character: 0,
      line: 0,
    },
    end: {
      character: 0,
      line: 0,
    },
  };

  if (sym instanceof SymbolTable) {
    return {
      kind: SymbolKind.File,
      name: "root",
      range,
      selectionRange: range,
      children: sym.children.map((x) =>
        convertC3SymbolsToLspSymbols(tokens, x)
      ),
    };
  } else if (sym instanceof VariableSymbol) {
    assert(sym.type != null, "missing type of a variable");

    return {
      kind: sym.type.name.startsWith("COLLECTION OF")
        ? SymbolKind.Array
        : SymbolKind.Variable,
      name: sym.name,
      range,
      selectionRange: range,
      detail: sym.type!.name,
    };
  } else if (sym instanceof ParameterSymbol) {
    return {
      kind: SymbolKind.Property,
      name: sym.name,
      range,
      selectionRange: range,
      detail: sym.type!.name,
    };
  } else if (sym instanceof RoutineSymbol) {
    return {
      kind: SymbolKind.Function,
      name: sym.name,
      range,
      selectionRange: range,
      children: sym.children.map((x) =>
        convertC3SymbolsToLspSymbols(tokens, x)
      ),
    };
  } else if (sym instanceof ScopedSymbol) {
    return {
      kind: SymbolKind.Namespace,
      name: sym.name.split("_")[0],
      range,
      selectionRange: range,
      children: sym.children.map((x) =>
        convertC3SymbolsToLspSymbols(tokens, x)
      ),
    };
  } else {
    throw new Error(`unknown symbol '${sym}'`);
  }
}

class ErrorStrategy extends DefaultErrorStrategy {
  protected override singleTokenDeletion(
    recognizer_: Parser
  ): Token | undefined {
    return undefined;
  }
}

const createDiagnosticErrorListener = (
  logger: Logger,
  diagnostics: DiagnosticsContext
): ANTLRErrorListener<Token> => ({
  syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e_) {
    const parser = recognizer as SchedulerParser;
    diagnostics.addDiagnostic({
      message: `Syntax error: ${msg}`,
      range: {
        start: {
          character: charPositionInLine,
          line: line - 1,
        },
        end: {
          character: charPositionInLine + (offendingSymbol?.text?.length ?? 0),
          line: line - 1,
        },
      },
    });
    logger.error(`Syntax error: ${msg}`);
    logger.error(`  ctx: ${parser.ruleNames[parser.ruleContext.ruleIndex]}`);
    logger.error(
      `  expected: ${parser
        .getExpectedTokens()
        .toStringVocabulary(parser.vocabulary)}`
    );
  },
});

class HandlerImpl implements DocumentHandler {
  private constructor(
    private readonly uri: string,
    private readonly terminals: TerminalNode[],
    private readonly rootTable: SymbolTable,
    private readonly codeCompletionCore: CodeCompletionCore,
    private readonly parser: SchedulerParser,
    private readonly tokens: Token[],
    private readonly lspSymbolTable: DocumentSymbol[],
    private readonly logger: RemoteConsole
  ) {}

  public static async create(
    uri: string,
    text: string,
    { console, sendDiagnostics }: Connection
  ): Promise<DocumentHandler> {
    const inputStream = CharStreams.fromString(text);
    const lexer = new SchedulerLexer(inputStream);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new SchedulerParser(tokenStream);
    const tokens = tokenStream.getTokens();

    const parserContext: ParserContext = {
      parser,
      tokens,
    };
    const logger = console;

    const diagnostics: Diagnostic[] = [];
    const diagnosticsContext: DiagnosticsContext = {
      addDiagnostic: (x) => diagnostics.push(x),
      error(node, msg) {
        this.addDiagnostic({
          range: intervalToRange(tokens, node.sourceInterval),
          message: msg,
        });
      },
      warning(node, msg) {
        this.addDiagnostic({
          range: intervalToRange(tokens, node.sourceInterval),
          message: msg,
          severity: DiagnosticSeverity.Warning,
        });
      },
    };

    parser.errorHandler = new ErrorStrategy();
    parser.removeErrorListeners();
    parser.addErrorListener(
      createDiagnosticErrorListener(logger, diagnosticsContext)
    );

    const tableBuildingListener = new TableBuildingListener(
      logger,
      parserContext,
      diagnosticsContext
    );
    parser.addParseListener(tableBuildingListener);

    const terminals: TerminalNode[] = [];
    parser.addParseListener({
      visitTerminal(node) {
        terminals.push(node);
      },
    });

    const tree = parser.prog();
    const rootTable = tableBuildingListener.symbolTable;

    const typechecker = new TypecheckingVisitor(
      parserContext,
      diagnosticsContext,
      logger,
      rootTable
    );
    typechecker.visit(tree);

    await sendDiagnostics({
      uri,
      diagnostics,
    });

    const codeCompletionCore = new CodeCompletionCore(parser);
    codeCompletionCore.preferredRules.add(SchedulerParser.RULE_attribute);

    const lspSymbolTable = convertC3SymbolsToLspSymbols(tokens, rootTable)
      .children!;

    return new this(
      uri,
      terminals,
      rootTable,
      codeCompletionCore,
      parser,
      tokens,
      lspSymbolTable,
      console
    );
  }

  private findScope(
    line: number,
    column: number
  ): [ScopedSymbol | null, TerminalNode | undefined] {
    const terminal = findTerminal(this.terminals, line, column);
    return [findScope(terminal, this.rootTable), terminal];
  }

  public handleCompletion: DocumentHandler["handleCompletion"] = (params) => {
    this.logger.info("handleCompletion");
    const [scope, terminal] = this.findScope(
      params.position.line,
      params.position.character
    );
    assert(scope != null, "scope is null");
    const candidates = this.codeCompletionCore.collectCandidates(
      terminal?.symbol.tokenIndex ?? 0
    );
    this.logger.info(`handleCompletion: terminal=${terminal?.text}`);
    this.logger.info(
      `   rules: ${[...candidates.rules.entries()].map(
        ([k, v]) => `${this.parser.ruleNames[k]} : ${v.ruleList}`
      )}`
    );
    this.logger.info(
      `   tokens: ${[...candidates.tokens.entries()].map(
        ([k, v]) => `${this.parser.vocabulary.getDisplayName(k)}: ${v}`
      )}`
    );

    const attributes = (() => {
      if (!(terminal && candidates.rules.has(SchedulerParser.RULE_attribute)))
        return [];

      const varname = this.tokens[terminal.symbol.tokenIndex - 2].text!;
      const symbol = scope?.resolveSync(varname) as TypedSymbol | undefined;

      if (symbol?.type?.name === "DAY")
        return Object.entries(STRUCTURES["DAY"]);
      else if (symbol?.type?.name === "CLASS")
        return Object.entries(STRUCTURES["CLASS"]);
      else return [];
    })().map(
      ([name, type]): CompletionItem => ({
        label: name,
        kind: CompletionItemKind.Property,
        detail: type,
        sortText: `000${name}`,
      })
    );

    this.logger.warn(JSON.stringify(attributes));

    const types = candidates.tokens.has(SchedulerLexer.TYPENAME)
      ? BASIC_TYPES.map(
          (x): CompletionItem => ({
            label: x,
            kind: CompletionItemKind.TypeParameter,
            sortText: `ZZZ${x}`,
          })
        )
      : [];

    const isExpr = attributes.length === 0; //candidates.rules.has(SchedulerParser.RULE_expr);

    this.logger.warn(`handleCompletion: scope ${scope.name}`);

    const variables = isExpr
      ? getSymbolsInScope(scope, VariableSymbol).map(
          (x): CompletionItem => ({
            label: x.name,
            kind: CompletionItemKind.Variable,
            detail: symbolDescription(x),
            commitCharacters: ["("],
          })
        )
      : [];

    const functions: CompletionItem[] = isExpr
      ? getSymbolsInScope(scope, RoutineSymbol).map(
          (x): CompletionItem => ({
            label: x.name,
            kind: CompletionItemKind.Function,
            detail: symbolDescription(x),
          })
        )
      : [];

    const snippets: CompletionItem[] = [
      {
        label: "CLASS",
        detail: "create a new CLASS structure",
        insertText:
          "CLASS ${1:name} START ${2:12:00} END ${3:13:00} SUBJECT ${4:subject} TEACHER ${5:teacher};",
      },
      {
        label: "DAY",
        detail: "create a new DAY structure",
        insertText: "DAY ${1:name} CLASSES ${2:classes};",
      },
      {
        label: "DUMP",
        detail: "dump canvas contents to a file",
        insertText: "DUMP ${1:path};",
      },
      {
        label: "LOAD",
        detail: "load canvas contents from a file",
        insertText: "LOAD ${1:path};",
      },
      {
        label: "START DATE",
        detail: "set canvas start date",
        insertText: "START DATE ${1:1/1/2023};",
      },
      {
        label: "END DATE",
        detail: "set canvas end date",
        insertText: "END DATE ${1:1/1/2023};",
      },
      {
        label: "ADD",
        detail: "add classes or days to canvas",
        insertText:
          "ADD ${1|CLASS,DAY|} ${2:value} ON ${3|DATE,DATES|} ${4:value};",
      },
      {
        label: "DELETE",
        detail: "delete classes or days from canvas",
        insertText:
          "DELETE ${1|CLASSES,DAYS|} ${2:name} SATISFYING ${3:condition};",
      },
      {
        label: "GET",
        detail: "get classes or days from canvas",
        insertText:
          "GET ${1|CLASSES,DAYS|} ${2:name} SATISFYING ${3:condition};",
      },
      {
        label: "PRINT",
        detail: "print a value",
        insertText: "PRINT ${1:value};",
      },
    ].map((x) => ({
      ...x,
      kind: CompletionItemKind.Snippet,
      insertTextFormat: InsertTextFormat.Snippet,
      sortText: `ZZ${x.label}`,
    }));

    return [...attributes, ...variables, ...functions, ...types, ...snippets];
  };

  public handleHover: DocumentHandler["handleHover"] = (params) => {
    const [scope, terminal] = this.findScope(
      params.position.line,
      params.position.character
    );

    if (terminal == null) return null;

    const attribute = findParentOfType(terminal, AttributeContext);
    const target = attribute?.parent?.tryGetToken(
      SchedulerParser.VARNAME,
      0
    )?.text;

    if (attribute != null && target != null) {
      const symbol = scope?.resolveSync(target);

      if (symbol instanceof TypedSymbol) {
        const type = symbol.type?.name;
        const structure = STRUCTURES[type as keyof typeof STRUCTURES];
        const attributeType =
          structure[attribute.text as keyof typeof structure];
        const value = mapNullable(
          attributeType,
          (x) => `${x} ${symbol.name}.${attribute.text}`
        );
        return mapNullable(value, (x) => ({
          contents: {
            value: x,
            language: "scheduler-language",
          },
          range: intervalToRange(this.tokens, terminal.sourceInterval),
        }));
      }
    } else {
      const symbol = scope?.resolveSync(terminal.text);
      const value = mapNullable(symbol, symbolDescription);

      return mapNullable(value, (x) => ({
        contents: {
          value: x,
          language: "scheduler-language",
        },
        range: intervalToRange(this.tokens, terminal.sourceInterval),
      }));
    }
  };

  public handleDefinition: DocumentHandler["handleDefinition"] = (params) => {
    const [scope, terminal] = this.findScope(
      params.position.line,
      params.position.character
    );
    if (!terminal) return null;
    const symbol = scope?.resolveSync(terminal.text);
    const symbolCtx = symbol?.context;

    if (!symbolCtx) return null;

    const result = {
      uri: this.uri,
      range: intervalToRange(this.tokens, symbolCtx.sourceInterval),
    };
    this.logger.info(`handleDefinition: ${JSON.stringify(result)}`);
    return result;
  };

  public handleDocumentSymbol: DocumentHandler["handleDocumentSymbol"] = (
    params_
  ) => this.lspSymbolTable;
}

export const createHandler = async (
  uri: string,
  text: string,
  conn: Connection
): Promise<DocumentHandler> => {
  return await HandlerImpl.create(uri, text, conn);
};
