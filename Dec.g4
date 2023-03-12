grammar Dec;        
prog: canvasinstr prog? | code prog?;
code: instruction ';' NEWLINE? code | EOF;
instruction: def | assign | if | func;
if : 'IF' SPACE condition optspace NEWLINE? block;


// function handling
func: 'DEF' SPACE VARNAME optspace '(' args? ')' NEWLINE? block;
args: arg (',' args)?; 
arg: TYPENAME SPACE VARNAME;


def:  TYPENAME SPACE VARNAME optspace '=' optspace (value | expr);
assign: VARNAME optspace '=' optspace (value | expr);

expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   value 
    |   VARNAME
    |   '(' expr ')'
    ;
condition: expr; 
block: { code };
canvasinstr: 'not_implemented';




TYPENAME: 'INT' | 'BOOL' | 'STRING' | 'DATE' | 'TIME' | 'CLASS' | 'DAY' | 'WEEK';
VARNAME : [a-zA-Z]+ ;
SPACE  : [ ]+ -> skip;
optspace:  SPACE?;
NEWLINE : [\r\n]+ -> skip;


value: INT | BOOL | STRING | DATE | TIME | CLASS | DAY | WEEK;
// value types
INT	: [0-9]+ ;
BOOL	: 'True' | 'False';
STRING : [a-zA-Z0-9]+;
DATE	: '0'[1-9] | [1-2][0-9] | '3'[0-1];
TIME	:  ([0-1][0-9] | '2'[0-3]) ':' [0-5][0-9];
CLASS	: 'not_implemented';
DAY	    : 'not_implemented';
WEEK	: 'not_implemented';




