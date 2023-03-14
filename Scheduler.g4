grammar Scheduler;        
prog: code EOF;
code: (instruction | canvas_instruction) ';' NEWLINE* code;
instruction: def // Definition
    | assign // Assignment
    | if // IfStatement
    | funcion // FunctionDefinition
    | func_call //FunctionCall chyba nie trzeba --- chcecie miec mozliwosc wywolania funkcji bez przypisania jej do zmiennej?
    | transfer_statement // TransferStatement 
    | loop // Loop
    ;
canvas_instruction: 'not_implemented';
block: '{' NEWLINE* code NEWLINE* '}';

// transfer statements
transfer_statement: 'RETURN' SPACE expr # Return
    | 'BREAK' # Break
    ;

// loops
loop: for # ForLoop
    | while # WhileLoop
    ;
// for loops
for: 'FOR' SPACE VARNAME SPACE? 'IN' SPACE? expr SPACE? NEWLINE* block;
// while loops
while: 'WHILE' SPACE condition SPACE? NEWLINE* block;

// if statement
if : 'IF' SPACE condition SPACE? NEWLINE* block;
condition: expr; 

// function definitions and calls
funcion: 'DEF' SPACE VARNAME SPACE? '(' SPACE? args? SPACE? ')' NEWLINE* block;
args: arg (SPACE? ',' SPACE? arg)*; 
arg: TYPENAME SPACE VARNAME;
func_call: VARNAME SPACE? '(' SPACE? args? SPACE? ')';

// variable definitions
def:  TYPENAME SPACE VARNAME SPACE? '=' SPACE? expr;
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
    |   '#' expr # Overlap  // Check if two objects overlap
    |   '(' expr ')' # Parenthesis
    |   func_call # FunctionCall // value from function call
    |   value # ExpressionValue // direct value
    |   VARNAME # VariableName // reference to variable
    ;

// CLASS definition
class: 'CLASS' SPACE VARNAME SPACE 'SUBJECT' SPACE STRING SPACE 'TEACHER' SPACE STRING SPACE 'START' SPACE TIME SPACE 'END' SPACE TIME;

TYPENAME: 'INT' | 'BOOL' | 'STRING' | 'DATE' | 'TIME' | 'CLASS' | 'DAY' | 'WEEK';
VARNAME : [a-zA-Z]+ ;

// whitespace
SPACE  : [ ]+ -> skip;
NEWLINE : [\r\n]+ -> skip;


value: INT | BOOL | STRING | DATE | TIME | /*CLASS |*/ DAY | WEEK;
// value types
INT	: [0-9]+ ;
BOOL	: 'True' | 'False';
STRING : [a-zA-Z0-9]+;
DATE    : ('0'?[1-9] | [1-2][0-9] | '3'[0-1]) '/' ('0'?[1-9] | '1'[0-2]) '/' ([0-9][0-9][0-9][0-9]);
TIME	:  ([0-1][0-9] | '2'[0-3]) ':' [0-5][0-9];
//CLASS	: 'not_implemented';
DAY	    : 'not_implemented';
WEEK	: 'not_implemented';
