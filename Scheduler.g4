grammar Scheduler;        
prog: code EOF;
code: ((instruction | canvas_instruction) ';')+ | comments;

// code elements
instruction: def // Definition
    | assign // Assignment
    | if_statement // IfStatement
    | function // FunctionDefinition
    | func_call //FunctionCall 
    | transfer_statement // TransferStatement
    | loop // Loop
    ;
canvas_instruction: add 
    | update // Update content of an object on canvas
    | delete // Dekete an object from canvas
    | get // Get specified objects from canvas as a collection
    ;
block: OPEN_CURLY code CLOSE_CURLY;


// CANVAS INSTRUCTIONS
// adds an objects to canvas
add: ADD_CANVA expr TYPENAME expr; // date 

// updates an objects on canvas
update: UPDATE_CANVA expr (TYPENAME expr | 'DATES' collection); // date or dates

// deletes an objects from canvas
delete : DELETE_CANVA (TYPENAME expr (TYPENAME TIME)? | 'DATES' collection); // date time or dates

// gets objects that fulfill the conditions given
get: GET_CANVA (CLASSESTOKEN | DAYSTOKEN) WHERE get_arg*;  //you can get CLASSES or DAYS 
get_arg: (TYPENAME | attribute) value;


// INSTRUCTIONS
// transfer statements
transfer_statement: RETURN expr # Return
    | BREAK # Break
    ;

// loops
loop: for_loop # ForLoop
    | while_loop # WhileLoop
    ;
// for loops
for_loop: FOR VARNAME IN expr block;
// while loops
while_loop: WHILE condition block;

// if statement
if_statement : IF condition block;
condition: expr;

// function definitions 
function: DEF VARNAME OPEN_PAREN args? CLOSE_PAREN block;
args: arg (COMMA arg)*;
arg: TYPENAME VARNAME;

// function call
func_call: VARNAME OPEN_PAREN  expr? (COMMA expr)* CLOSE_PAREN;

// variable definitions
def:  TYPENAME VARNAME SINGLEEQUAL expr
    | COLLECTION_OF TYPENAME VARNAME SINGLEEQUAL expr
    | dayDef
    | classDef
    | weekDef
    ;
// classDef: 'CLASS' VARNAME 'SUBJECT' STRING 'TEACHER' STRING 'START' TIME 'END' TIME;
classDef: CLASSTOKEN VARNAME (CLASS_ATTRIBUTE expr)*;
dayDef: DAYTOKEN VARNAME CLASSESTOKEN collection;
weekDef: WEEKTOKEN VARNAME DAYSTOKEN collection;

// variable assignments and variable attribute assignments
assign: VARNAME SINGLEEQUAL expr
    | VARNAME DOT attribute SINGLEEQUAL expr
    ;
attribute: CLASS_ATTRIBUTE;
attribute_call: VARNAME DOT attribute;
// attribute names
CLASS_ATTRIBUTE: 'START' | 'END' | 'SUBJECT' | 'TEACHER';

// collections 
collection: OPEN_BRACKET  elements?  CLOSE_BRACKET;
elements: element ( COMMA element)*;
element: expr;
// collection subscription - access to elements in a collection
collection_subscription: VARNAME OPEN_BRACKET expr CLOSE_BRACKET;


// expressions
expr:   (func_call | attribute_call | canvas_instruction | collection_subscription) # Calls// instruction
    |   NOT expr # NotExpr // negation
    |   expr (MULTIPLY | DIVIDE) expr # MultDiv
    |   expr (ADD | SUBTRACT) expr # AddSub
    |   expr ( LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL) expr # Compare
    |   expr (EQUAL | NOT_EQUAL) expr # EqualExpr
    |   expr AND expr # AndExpr
    |   expr OR expr # OrExpr
    |   expr OVERLAP expr # OverlapExpr  // Check if two objects overlap 
    |   expr IN expr # InExpr
    |   OPEN_PAREN expr CLOSE_PAREN # Parenthesis
    |   (collection | value | VARNAME) # ValueExpr
    ;


// type rule and tokens 
typerule: TYPENAME 
    | CLASSTOKEN 
    | DAYTOKEN 
    | WEEKTOKEN
    ;
TYPENAME: 'INT' | 'BOOL' | 'STRING' | 'DATE' | 'TIME';
CLASSTOKEN : 'CLASS';
DAYTOKEN : 'DAY';
WEEKTOKEN : 'WEEK';


// canvas collection keywords
CLASSESTOKEN: 'CLASSES';
DAYSTOKEN: 'DAYS';


// Expression tokens
MULTIPLY : '*';
DIVIDE : '/';
ADD : '+';
SUBTRACT : '-';
EQUAL : '==';
NOT_EQUAL : '!=';
LESS_THAN : '<';
GREATER_THAN : '>';
LESS_THAN_OR_EQUAL : '<=';
GREATER_THAN_OR_EQUAL : '>=';
AND : 'AND';
OR : 'OR';
NOT : 'NOT';
IN : 'IN';
OVERLAP : '#';
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BRACKET : '[';
CLOSE_BRACKET : ']';
DOT : '.';
COMMA : ',';
COLON : ':';
SINGLEEQUAL : '=';
COLLECTION_OF : 'COLLECTION OF';
ADD_CANVA : 'ADD';
UPDATE_CANVA : 'UPDATE';
DELETE_CANVA : 'DELETE';
GET_CANVA : 'GET';
WHERE : 'WHERE';
DEF : 'DEF';
IF : 'IF';
FOR : 'FOR';
WHILE : 'WHILE';
RETURN : 'RETURN';
BREAK : 'BREAK';
OPEN_CURLY : '{';
CLOSE_CURLY : '}';


// values
value: INT 
    | BOOL 
    | STRING 
    | DATE 
    | TIME
    ;


// types
INT : [0-9]+ ;
BOOL    : 'True' | 'False';
STRING : '"' [a-zA-Z0-9]* '"'; // Old def [a-zA-Z0-9]+
DATE    : ('0'?[1-9] | [1-2][0-9] | '3'[0-1]) '/' ('0'?[1-9] | '1'[0-2]) '/' ([0-9][0-9][0-9][0-9]);
TIME    :  ([0-1][0-9] | '2'[0-3]) ':' [0-5][0-9];


// whitespace
WS : [ \t\r\n]+ -> skip;


// varnames
VARNAME : [a-zA-Z][a-zA-Z0-9]*; 


// comments
comments : COMMENT_LINE 
    | COMMENT
    ;
COMMENT_LINE : '//' .*? '\r'? '\n' -> channel(HIDDEN);
COMMENT : '/*' .*? '*/' -> channel(HIDDEN);


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


INT a = 2+3*4-(5+6)*2;
 */
