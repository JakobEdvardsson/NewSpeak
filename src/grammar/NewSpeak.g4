grammar NewSpeak;

file:code EOF;

code
: statement code
| statement      // Implicitly defined terminal
;



statement
: decl
| assign
| print
| while
;


decl: 'artsem' ID;

assign: ID 'blackwhite' expr;

while
: 'again' unaryExpression condition unaryExpression code 'unagain'
;

condition
: 'greater'
| 'ungreater'
| 'samegreater'
| 'sameungreater'
;

addExpression
: unaryExpression 'dubleplus' expr
|
;

unaryExpression
: ID
| INT
;

print: 'versificator' expr;

expr
: ID
| INT
| addExpression
;

ID: ('a'..'z'|'A'..'Z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;