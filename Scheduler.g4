grammar Scheduler;        
prog: code EOF;
code: ((instruction | canvas_instruction) ';')+;
instruction: def // Definition
    | assign // Assignment
    | if_statement // IfStatement
    | function // FunctionDefinition
    | func_call //FunctionCall 
    | transfer_statement // TransferStatement
    | loop // Loop
    ;
canvas_instruction: add 
    | update 
    | delete
    | get 
    ;

block: '{' code '}';

// CANVAS INSTRUCTIONS

// adds an objects to canvas
add: 'ADD' expr 'DATE' expr;
// updates an objects on canvas
update: 'UPDATE' expr ('DATE' expr | 'DATES' collection);
// deletes an objects from canvas
delete : 'DELETE' ('DATE' expr ('TIME' TIME)? | 'DATES' collection);
// gets objects that fulfill the conditions given
get: 'GET' canvas_collection 'WHERE' get_arg*;
canvas_collection: 'CLASSES' | 'DAYS';
get_arg: (TYPENAME | attribute) value;


// INSTRUCTIONS

// transfer statements
transfer_statement: 'RETURN' expr # Return
    | 'BREAK' # Break
    ;

// loops
loop: for_loop # ForLoop
    | while_loop # WhileLoop
    ;
// for loops
for_loop: 'FOR' VARNAME 'IN' expr block;
// while loops
while_loop: 'WHILE' condition block;

// if statement
if_statement : 'IF' condition block;
condition: expr;

// function definitions 
function: 'DEF' VARNAME '(' args? ')' block;
args: arg (',' arg)*;
arg: TYPENAME VARNAME;
// function call
func_call: VARNAME '('  expr? (',' expr)* ')';

// variable definitions
def:  TYPENAME VARNAME '=' expr
    | 'COLLECTION OF' TYPENAME VARNAME '=' expr
    | dayDef
    | classDef
    | weekDef;
// classDef: 'CLASS' VARNAME 'SUBJECT' STRING 'TEACHER' STRING 'START' TIME 'END' TIME;
classDef: 'CLASS' VARNAME (CLASS_ATTRIBUTE expr)*;
dayDef: 'DAY' VARNAME 'CLASSES' collection;
weekDef: 'WEEK' VARNAME 'DAYS' collection;

// variable assignments
assign: VARNAME '=' expr
    | VARNAME '.' attribute '=' expr;

attribute: CLASS_ATTRIBUTE;
CLASS_ATTRIBUTE: 'START' | 'END' | 'SUBJECT' | 'TEACHER';


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
    |   collection # ExpressionCollection // collection of values
    |   get # ExpressionGet // value from canvas
    |   value # ExpressionValue // direct value
    |   VARNAME # VariableName // reference to variable
    |   VARNAME '.' attribute # ExpressionAttribute // reference to attribute of variable
    ;


// collections 
collection: '['  elements?  ']';
elements: element ( ',' element)*;
element: expr;


TYPENAME: 'INT' | 'BOOL' | 'STRING' | 'DATE' | 'TIME' | 'CLASS' | 'DAY' | 'WEEK';
VARNAME : [a-zA-Z]+;


value: INT | BOOL | STRING | DATE | TIME;
// types
INT : [0-9]+ ;
BOOL    : 'True' | 'False';
STRING : '"' [a-zA-Z0-9]* '"'; // Old def [a-zA-Z0-9]+
DATE    : ('0'?[1-9] | [1-2][0-9] | '3'[0-1]) '/' ('0'?[1-9] | '1'[0-2]) '/' ([0-9][0-9][0-9][0-9]);
TIME    :  ([0-1][0-9] | '2'[0-3]) ':' [0-5][0-9];

// whitespace
WS : [ \t\r\n]+ -> skip;


//For testing
/*
antlr4-parse Scheduler.g4 prog -gui
CLASS zaj SUBJECT fizyka TEACHER ostachiewicz START 09:30 END 11:00;
CLASS var SUBJECT fgf TEACHER vfgf START 21:37 END 21:47;


STRING a = "a";
DEF func(INT aa, INT bb) {
    RETURN aa+bb;
};
INT c = func(1, 2);
FOR x IN [1, 2, 3] {
    INT tmp = x;
    IF (tmp == 2){
        BREAK;
    };
};
ADD exClass DATE 1/1/2019;
 */
