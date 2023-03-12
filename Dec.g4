grammar Dec;		
prog:	dec EOF ;
dec:	'INT' SPACE NAME optspace '=' optspace INT
    |   'BOOL' SPACE NAME optspace '=' optspace BOOL;
optspace:  SPACE?;

NEWLINE : [\r\n]+ -> skip;

// types
INT     : [0-9]+ ;
BOOL    : 'True' | 'False';

NAME    : [a-zA-Z]* ;
SPACE  : [ ]+;