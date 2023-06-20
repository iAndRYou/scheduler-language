import * as fs from "fs";
import { beforeEach, chai, describe, expect, test } from "vitest";
import {
  CompletionItem,
  Connection,
  Diagnostic,
  DocumentSymbol,
  Hover,
  Position,
  Range,
  RemoteConsole,
  SymbolKind,
} from "vscode-languageserver";
import { DocumentHandler, createHandler } from "../handler";

import { z } from "zod";

chai.config.truncateThreshold = 100000;

const assertT = <A, B_ extends A>() => {
  /* empty */
};

const ge = (
  [a, b]: readonly [number, number],
  [c, d]: readonly [number, number]
) => (a == c ? b >= d : a >= c);

const PositionT: z.Schema<Position> = z.object({
  line: z.number().nonnegative(),
  character: z.number().nonnegative(),
});

const RangeT: z.Schema<Range> = z
  .object({
    start: PositionT,
    end: PositionT,
  })
  .refine((x) =>
    ge([x.end.line, x.end.character], [x.start.line, x.start.character])
  );

const DocumentSymbolT = z
  .object({
    name: z.string(),
    detail: z.string().optional(),
    kind: z.number(),
    tags: z.any().optional(),
    range: RangeT,
    selectionRange: RangeT,
    children: z.any().optional(),
  })
  .refine(
    (x) =>
      ge(
        [x.range.end.line, x.range.end.character],
        [x.selectionRange.end.line, x.selectionRange.end.character]
      ) &&
      ge(
        [x.selectionRange.start.line, x.selectionRange.start.character],
        [x.range.start.line, x.range.start.character]
      )
  );

assertT<z.infer<typeof DocumentSymbolT>, DocumentSymbol>();

const logging = false;

const consoleStub: RemoteConsole = {
  error(message) {
    logging && console.error("[remote] %s", message);
  },
  info(message) {
    logging && console.info("[remote] %s", message);
  },
  initialize(capabilities_) {
    /* empty */
  },
  log(message) {
    logging && console.log("[remote] %s", message);
  },
  fillServerCapabilities(capabilities_) {
    /* empty */
  },
  warn(message) {
    logging && console.warn("[remote] %s", message);
  },
  get connection() {
    return undefined!;
  },
};

const URI = "<URI>";
const CURSOR = Symbol("CURSOR");

let diagnostics: Diagnostic[] = [];

beforeEach(() => {
  diagnostics = [];
});

const getHandler = async (text: string): Promise<DocumentHandler> =>
  createHandler(URI, text, {
    console: consoleStub,
    sendDiagnostics(params) {
      diagnostics = params.diagnostics;
      return Promise.resolve();
    },
  } as Connection);

const cursor = (
  text: TemplateStringsArray,
  cursor_: typeof CURSOR
): [Position, string] => {
  const lines = text[0].split("\n");
  const line = lines.length - 1;
  const character = lines[lines.length - 1].length;
  return [PositionT.parse({ line, character }), text[0] + text[1]];
};

test("internal: cursor", () => {
  expect(cursor`${CURSOR}`).toEqual([{ line: 0, character: 0 }, ""]);
  expect(cursor` ${CURSOR}`).toEqual([{ line: 0, character: 1 }, " "]);
  expect(cursor`\n${CURSOR}`).toEqual([{ line: 1, character: 0 }, "\n"]);
});

describe("LSP handler", () => {
  test("basic symbols", async () => {
    const handler = await getHandler("INT variable = 42;");
    const response = await handler.handleDocumentSymbol(
      { textDocument: { uri: URI } },
      undefined!,
      undefined!
    );
    const result = z.array(DocumentSymbolT).parse(response);
    expect(result.length).toBe(1);
    const range = RangeT.parse({
      start: {
        character: 4,
        line: 0,
      },
      end: {
        character: 12,
        line: 0,
      },
    });
    const expected: DocumentSymbol[] = [
      {
        kind: SymbolKind.Variable,
        name: "variable",
        range,
        selectionRange: range,
        detail: "INT",
      },
    ];
    expect(result).toEqual(expected);
  });

  describe("completion", () => {
    const testCompletion = async (
      input: [Position, string]
    ): Promise<CompletionItem[]> => {
      const [position, text] = input;
      const handler = await getHandler(text);
      const response = await handler.handleCompletion(
        {
          textDocument: { uri: URI },
          position: position,
        },
        undefined!,
        undefined!
      );

      expect(response).toBeInstanceOf(Array);
      return response as CompletionItem[];
    };
    test("basic", async () => {
      const result = await testCompletion(cursor`INT variable = 42; ${CURSOR}`);
      expect(result.filter((x) => x.label === "variable").length).toBe(1);
    });

    test("empty document", async () => {
      const result = await testCompletion(cursor`${CURSOR}`);
      expect(result.length).toBeGreaterThan(0);
    });

    test("attributes: CLASS", async () => {
      const result = await testCompletion(cursor`
    CLASS eksploracja START 16:15 END 17:45 SUBJECT "Eksploracja podwodna" TEACHER "dr inz Krzysztof Broda";
    eksploracja.${CURSOR}
    `);
      const labels = result.map((x) => x.label);

      expect(labels).to.include.members(["START", "END", "SUBJECT", "TEACHER"]);
      expect(labels).not.to.include.members(["CLASSES"]);
    });

    test("attributes: DAY", async () => {
      const result = await testCompletion(cursor`
    DAY sroda CLASSES [];
    sroda.${CURSOR}
    `);
      const labels = result.map((x) => x.label);

      expect(labels).not.to.include.members([
        "START",
        "END",
        "SUBJECT",
        "TEACHER",
      ]);
      expect(labels).to.include.members(["CLASSES"]);
    });

    test.skip("[not implemented] structure: CLASS", async () => {
      const result = await testCompletion(cursor`
      CLASS eksploracja START 16:15 END 17:45 ${CURSOR}
    `);
      const labels = result.map((x) => x.label);

      expect(labels).not.to.include.members(["START", "END"]);
      expect(labels).to.include.members(["SUBJECT", "TEACHER"]);
    });
  });

  test("basic hover", async () => {
    const [position, text] = cursor`INT vari${CURSOR}able = 42; `;
    const handler = await getHandler(text);
    const response = await handler.handleHover(
      {
        textDocument: { uri: URI },
        position,
      },
      undefined!,
      undefined!
    );
    const result = response as Hover;
    expect(result.contents).toEqual({
      value: "INT variable",
      language: "scheduler-language",
    });
    expect(result.range).toEqual({
      start: {
        character: 4,
        line: 0,
      },
      end: {
        character: 12,
        line: 0,
      },
    });
  });

  describe("diagnostics", () => {
    test("uninitialized variable", async () => {
      await getHandler("INT variable = variable;");
      expect(diagnostics).toSatisfy<typeof diagnostics>((d) =>
        d.some((x) => x.message.includes("uninitialized"))
      );
    });

    test("unused variable", async () => {
      await getHandler("INT variable = 42;");
      expect(diagnostics).toSatisfy<typeof diagnostics>((d) =>
        d.some((x) => x.message.includes("not used"))
      );
    });

    test("undefined variable", async () => {
      await getHandler("PRINT variable;");
      expect(diagnostics).toSatisfy<typeof diagnostics>((d) =>
        d.some((x) => x.message.includes("not defined"))
      );
    });

    test("variable redefinition", async () => {
      await getHandler("INT variable = 42; INT variable = 42;");
      expect(diagnostics).toSatisfy<typeof diagnostics>((d) =>
        d.some((x) => x.message.includes("redefinition"))
      );
    });

    test("function redefinition", async () => {
      await getHandler("INT f() {RETURN 42;} INT f() {RETURN 42;}");
      expect(diagnostics).toSatisfy<typeof diagnostics>((d) =>
        d.some((x) => x.message.includes("redefinition"))
      );
    });

    test.each([
      "PRINT 1 == 2;",
      "PRINT 1 + 2;",
      "PRINT 1 * 2;",
      "PRINT 1 <= 2;",
      "PRINT [1, 2] == [1, 2];",
      "PRINT [1, 2] + [1, 2];",
      "PRINT 1/1/2023 <= 1/2/2023;",
      `PRINT "asd" + "def";`,
      "PRINT True + True;",
      "IF True {PRINT 1;}",
      `CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER "dr hab inz Igor Wojnicki"; PRINT uczmasz;`,
      `CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe"; PRINT uczmasz;`,
    ])("valid types: %s", async (text) => {
      await getHandler(text);
      expect(diagnostics).to.be.empty;
    });

    test.each([
      `PRINT 1 == "2";`,
      "PRINT 1 < True;",
      "PRINT 1/1/2023 + 1/2/2023;",
      "PRINT 10:00 - 12:00;",
      "IF 1 {PRINT 1;}",
      `CLASS uczmasz START 11:30 END 13:00 SUBJECT "Uczenie maszynowe" TEACHER 42; PRINT uczmasz;`,
    ])("invalid types: %s", async (text) => {
      await getHandler(text);
      expect(diagnostics).toSatisfy<typeof diagnostics>((d) =>
        d.some((x) => x.message.includes("type"))
      );
    });
  });

  test.each(["program.sch", "program1.sch", "program2.sch", "program3.sch"])(
    "file symbols: %s",
    async (filename) => {
      const path = `${__dirname}/programs/${filename}`;
      const fixturePath = `${__dirname}/fixtures/${filename}.json`;

      const content = fs.readFileSync(path).toString();
      const handler = await getHandler(content);
      expect(diagnostics).toEqual([]);
      const response = await handler.handleDocumentSymbol(
        { textDocument: { uri: URI } },
        undefined!,
        undefined!
      );
      const result = z.array(DocumentSymbolT).parse(response);
      const json = JSON.stringify(result, null, 2);
      expect(json).toMatchFileSnapshot(fixturePath);
    }
  );
});
