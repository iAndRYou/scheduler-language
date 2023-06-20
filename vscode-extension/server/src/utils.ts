import {
  BaseSymbol,
  IScopedSymbol,
  ParameterSymbol,
  ReferenceKind,
  RoutineSymbol,
  ScopedSymbol,
  SymbolConstructor,
  SymbolTable,
  Type,
  TypeKind,
  VariableSymbol,
} from "antlr4-c3";
import { Token } from "antlr4ts";
import { Interval } from "antlr4ts/misc/Interval";
import { ParseTree } from "antlr4ts/tree/ParseTree";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Diagnostic, Range, RemoteConsole } from "vscode-languageserver/node";
import { SchedulerParser } from "./antlr/SchedulerParser";

export type ParserContext = {
  readonly parser: Readonly<SchedulerParser>;
  readonly tokens: ReadonlyArray<Token>;
};

export type Logger = Readonly<RemoteConsole>;

export type DiagnosticsContext = {
  addDiagnostic: (d: Diagnostic) => void;
  error: (node: ParseTree, msg: string) => void;
  warning: (node: ParseTree, msg: string) => void;
};

export const stringType = (name: string): Type => ({
  baseTypes: [],
  kind: TypeKind.Unknown,
  reference: ReferenceKind.Irrelevant,
  name: name.replace(/COLLECTION OF ?/g, "COLLECTION OF "),
});

export const symbolDescription = (symbol: BaseSymbol): string | undefined => {
  if (symbol instanceof VariableSymbol) {
    return `${symbol.type!.name} ${symbol.name}`;
  } else if (symbol instanceof RoutineSymbol) {
    const params = symbol.getNestedSymbolsOfTypeSync(ParameterSymbol);
    const paramsValue = params
      .map((x) => `${x.type!.name} ${x.name}`)
      .join(", ");
    return `${symbol.returnType!.name} ${symbol.name}(${paramsValue})`;
  }
};

export function findTerminal(
  tokens: TerminalNode[],
  line: number,
  column: number
): TerminalNode | undefined {
  const pos = [line + 1, column] as const;
  let lo = 0,
    hi = tokens.length;
  const lt = (
    [a, b]: readonly [number, number],
    [c, d]: readonly [number, number]
  ) => (a == c ? b < d : a < c);
  const ge = (
    [a, b]: readonly [number, number],
    [c, d]: readonly [number, number]
  ) => (a == c ? b >= d : a >= c);

  while (hi - lo > 1) {
    const i = lo + Math.floor((hi - lo) / 2);
    const current = tokens[i];
    const start = [
      current._symbol.line,
      current._symbol.charPositionInLine,
    ] as const;
    const end = [
      current._symbol.line,
      current._symbol.charPositionInLine + current.text!.length,
    ] as const;

    if (ge(pos, start) && lt(pos, end)) {
      return current;
    } else if (lt(pos, start)) {
      hi = i;
    } else if (ge(pos, end)) {
      lo = i;
    } else {
      break;
    }
  }

  return tokens[hi];
}

// Adapted from https://github.com/mike-lischke/antlr4-c3/blob/4cf2e3d3d2305a6ff230987073e4ef6673b742e3/src/ScopedSymbol.ts#L420
// The original version has a bug on line 439: s/this/this.parent
export function getSymbolsInScope<T extends BaseSymbol, Args extends unknown[]>(
  scope: IScopedSymbol,
  t: SymbolConstructor<T, Args>
): T[] {
  const result: T[] = [];
  for (const child of scope.children) {
    if (child instanceof t) {
      result.push(child);
    }
  }
  if (scope.parent) {
    const childSymbols = getSymbolsInScope(scope.parent, t);
    result.push(...childSymbols);
  }

  return result;
}

export const intervalToRange = (
  tokens: readonly Token[],
  interval: Interval
): Range => {
  const a = tokens[interval.a];
  const b = tokens[interval.b];

  return {
    start: {
      character: a.charPositionInLine,
      line: a.line - 1,
    },
    end: {
      character: b.charPositionInLine + b.text!.length,
      line: b.line - 1,
    },
  };
};

export function findScope(
  terminal: TerminalNode | undefined,
  rootTable: SymbolTable
): ScopedSymbol | null {
  let ruleCtx = terminal?.parent?.ruleContext;

  while (
    ruleCtx != null &&
    ruleCtx?.ruleIndex !== SchedulerParser.RULE_block &&
    ruleCtx?.ruleIndex !== SchedulerParser.RULE_delete &&
    ruleCtx?.ruleIndex !== SchedulerParser.RULE_get &&
    ruleCtx?.ruleIndex !== SchedulerParser.RULE_function
  ) {
    ruleCtx = ruleCtx?.parent;
  }

  const scope =
    ruleCtx == null ? rootTable : rootTable.symbolWithContextSync(ruleCtx);
  return (scope ?? null) as ScopedSymbol | null;
}

export function findParentOfType<T extends ParseTree>(
  node: ParseTree,
  /* eslint-disable-next-line @typescript-eslint/no-explicit-any */
  type: new (...args_: any[]) => T
): T | null {
  let current = node;

  while (current.parent != null) {
    current = current.parent;
    if (current instanceof type) return current;
  }

  return null;
}

export function assert(condition: boolean, message: string): asserts condition {
  if (!condition) throw new Error(`Assertion error: ${message}`);
}

export function mapNullable<T, U>(
  x: T,
  f: (x: NonNullable<T>) => U
): U | Extract<T, null | undefined> {
  if (x != null) return f(x);
  return x as Extract<T, null | undefined>;
}
