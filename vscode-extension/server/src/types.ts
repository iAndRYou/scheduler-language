export type BasicType = (typeof BASIC_TYPES)[number];
export type Collection =
  | `COLLECTION OF ${BasicType | Structure}`
  | "COLLECTION";
export type Structure = keyof typeof STRUCTURES;

export type Type = BasicType | Structure | Collection | null;

export const BASIC_TYPES = [
  "VOID",
  "INT",
  "BOOL",
  "STRING",
  "DATE",
  "TIME",
] as const;

export const STRUCTURES = {
  CLASS: {
    START: "TIME",
    END: "TIME",
    SUBJECT: "STRING",
    TEACHER: "STRING",
  },
  DAY: {
    CLASSES: "COLLECTION OF CLASS",
  },
};

export function isValidType(x: string | null): x is Type {
  if (x == null) return true;
  return (
    BASIC_TYPES.includes(x as BasicType) ||
    x in STRUCTURES ||
    (x.startsWith("COLLECTION OF ") && isValidType(x.slice(14)))
  );
}

export function parseType(x: string | null): Type {
  if (!isValidType(x)) throw new Error(`Invalid type: '${x}'`);
  return x;
}

export type Signature = {
  params: Type[];
  result: Type;
};

export const OPERATORS = {
  BOOLEAN: [
    {
      params: ["BOOL", "BOOL"],
      result: "BOOL",
    },
  ],
  COMPARISON: (["BOOL", "STRING", "INT", "DATE", "TIME", "BOOL"] as const)
    .map(
      (a) =>
        [
          {
            params: [a, a],
            result: "BOOL",
          },
          {
            params: [`COLLECTION OF ${a}`, `COLLECTION OF ${a}`],
            result: "BOOL",
          },
        ] satisfies Signature[]
    )
    .flat(),
  EQUALITY: (
    ["BOOL", "STRING", "INT", "DATE", "TIME", "BOOL", "DAY", "CLASS"] as const
  )
    .map(
      (a) =>
        [
          {
            params: [a, a],
            result: "BOOL",
          },
          {
            params: [`COLLECTION OF ${a}`, `COLLECTION OF ${a}`],
            result: "BOOL",
          },
        ] satisfies Signature[]
    )
    .flat(),
  ADDITION: [
    [
      {
        params: ["BOOL", "BOOL"],
        result: "INT",
      },
      {
        params: ["INT", "INT"],
        result: "INT",
      },
      {
        params: ["STRING", "STRING"],
        result: "STRING",
      },
      {
        params: ["DATE", "INT"],
        result: "DATE",
      },
      {
        params: ["INT", "DATE"],
        result: "DATE",
      },
      {
        params: ["TIME", "INT"],
        result: "TIME",
      },
      {
        params: ["INT", "TIME"],
        result: "TIME",
      },
    ] satisfies Signature[],
    (
      [
        ...BASIC_TYPES,
        ...(Object.keys(STRUCTURES) as (keyof typeof STRUCTURES)[]),
      ] as const
    ).map((a) => ({
      params: [`COLLECTION OF ${a}`, `COLLECTION OF ${a}`],
      result: `COLLECTION OF ${a}`,
    })) satisfies Signature[],
  ].flat(),
  SUBTRACTION: [
    {
      params: ["BOOL", "BOOL"],
      result: "INT",
    },
    {
      params: ["INT", "INT"],
      result: "INT",
    },
    {
      params: ["DATE", "INT"],
      result: "DATE",
    },
    {
      params: ["INT", "DATE"],
      result: "DATE",
    },
    {
      params: ["TIME", "INT"],
      result: "TIME",
    },
    {
      params: ["INT", "TIME"],
      result: "TIME",
    },
  ],
  MULTIPLICATION: [
    {
      params: ["INT", "INT"],
      result: "INT",
    },
  ],
  DIVISION: [
    {
      params: ["INT", "INT"],
      result: "INT",
    },
  ],
  INTERSECTION: [
    {
      params: ["CLASS", "CLASS"],
      result: "BOOL",
    },
  ],
  CONTAINMENT: (
    [
      ...BASIC_TYPES,
      ...(Object.keys(STRUCTURES) as (keyof typeof STRUCTURES)[]),
    ] as const
  ).map((a) => ({
    params: [a, `COLLECTION OF ${a}`],
    result: "BOOL",
  })) satisfies Signature[],
} satisfies Record<any, Signature[]>;
