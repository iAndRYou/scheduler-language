grammar Scheduler;        
prog: code EOF;
code: (instruction | canvas_instruction) ';'| code /*NEWLINE**/ code;
instruction: def // Definition
    | assign // Assignment
    | if_statement // IfStatement
    | funcion // FunctionDefinition
    | func_call //FunctionCall chyba nie trzeba --- chcecie miec mozliwosc wywolania funkcji bez przypisania jej do zmiennej?
    | transfer_statement // TransferStatement 
    | loop // Loop
    ;
canvas_instruction: 'not_implemented'; // global variables: DAYS, WEEKS, TEACHERS, SUBJECTS, CLASSES, GROUPS, SCHEDULE
block: '{' NEWLINE* code NEWLINE* '}';

// transfer statements
transfer_statement: 'RETURN' SPACE expr # Return
    | 'BREAK' # Break
    ;

// loops
loop: for_loop # ForLoop
    | while_loop # WhileLoop
    ;
// for loops
for_loop: 'FOR' SPACE VARNAME SPACE? 'IN' SPACE? expr SPACE? NEWLINE* block;
// while loops
while_loop: 'WHILE' SPACE condition SPACE? NEWLINE* block;

// if statement
if_statement : 'IF' SPACE condition SPACE? NEWLINE* block;
condition: expr; 

// function definitions and calls
funcion: 'DEF' SPACE VARNAME SPACE? '(' SPACE? args? SPACE? ')' NEWLINE* block;
args: arg (SPACE? ',' SPACE? arg)*; 
arg: TYPENAME SPACE VARNAME;
func_call: VARNAME SPACE? '(' SPACE? args? SPACE? ')';

// variable definitions
def:  TYPENAME SPACE VARNAME SPACE? '=' SPACE? expr
| dayDef
| classDef
| weekDef;
// variable assignments
assign: VARNAME SPACE? '=' SPACE? expr;

// expressions
expr:   expr '*' expr # Multiplication
    |   expr '/' expr # Division
    |   expr '+' expr # Addition
    |   expr '-' expr # Subtraction
    |   expr '==' expr # Equal
    |   expr '!=' expr # NotEqual
    |   expr '<' expr # LessThan
    |   expr '>' expr # GreaterThan
    |   expr '<=' expr # LessThanOrEqual
    |   expr '>=' expr # GreaterThanOrEqual
    |   expr 'AND' expr # And
    |   expr 'OR' expr # Or
    |   'NOT' expr # Not
    |   '#' expr # Overlap  // Check if two objects overlap --- jeszcze do ogarnięcia -> bool expression
    |   '(' expr ')' # Parenthesis
    |   func_call # FunctionCall // value from function call
    |   value # ExpressionValue // direct value
    |   VARNAME # VariableName // reference to variable
    ;

// collection of classes, days, weeks in day, week and schedule 
collection: '[' VARNAME (SPACE? ',' SPACE? VARNAME)* ']';

/* 
// CLASS definition
classDef: 'CLASS' SPACE VARNAME SPACE 'SUBJECT' SPACE VARNAME SPACE 'TEACHER' SPACE VARNAME SPACE 'START' SPACE TIME SPACE 'END' SPACE TIME;
// DAY definition
dayDef: 'DAY' SPACE VARNAME SPACE 'DATE' SPACE DATE SPACE 'CLASSES' collection;

weekDef: 'WEEK' SPACE VARNAME SPACE 'STARTDATE' SPACE DATE SPACE 'DAYS' collection;
*/
classDef: 'CLASS' VARNAME 'SUBJECT' VARNAME 'TEACHER' VARNAME 'START' TIME 'END' TIME;
// DAY definition
dayDef: 'DAY' VARNAME 'DATE' DATE 'CLASSES' collection;

weekDef: 'WEEK' VARNAME 'STARTDATE' DATE 'DAYS' collection;



TYPENAME: 'INT' | 'BOOL' | 'STRING' | 'DATE' | 'TIME' | 'CLASS' | 'DAY' | 'WEEK' | 'SUBJECT' | 'TEACHER';
VARNAME : [a-zA-Z]+;

// whitespace
SPACE  : [ ]+   -> skip;
FORCESPACE : [ ]+;
NEWLINE : [\r\n]+ -> skip;
TAB : '\t' -> skip;

value: INT | BOOL | STRING | DATE | TIME; //| /*CLASS |*/ //DAY | WEEK;
// value types
INT	: [0-9]+ ;
BOOL	: 'True' | 'False';
STRING : '"'[a-zA-Z0-9]*'"'; // Old def [a-zA-Z0-9]+
DATE    : ('0'?[1-9] | [1-2][0-9] | '3'[0-1]) '/' ('0'?[1-9] | '1'[0-2]) '/' ([0-9][0-9][0-9][0-9]);
TIME	:  ([0-1][0-9] | '2'[0-3]) ':' [0-5][0-9];
//CLASS	: 'not_implemented';
//DAY	    : 'not_implemented';
//WEEK	: 'not_implemented';
SUBJECT	: STRING;
TEACHER	: STRING;


//For testing
/*
antlr4-parse Scheduler.g4 prog -gui 
CLASS zaj SUBJECT fizyka TEACHER ostachiewicz START 09:30 END 11:00;
 */