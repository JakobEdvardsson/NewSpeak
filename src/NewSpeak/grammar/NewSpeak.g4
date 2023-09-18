grammar NewSpeak;

file: code | EOF;

code
: statement ';' code
| statement ';'      // Implicitly defined terminal
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
: 'again' whilecondition code 'unagain'
;

whilecondition
: expr* condition expr*;


condition
: 'greater'
| 'ungreater'
| 'samegreater'
| 'sameungreater'
;

addExpression
: unaryExpression 'dubleplus' expr;

unaryExpression
: ID
| INT
;

print: 'versificator' expr;

expr
: unaryExpression
| addExpression
;

ID: ('a'..'z'|'A'..'Z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;
COMMENT: ('//' .*? '\n' | '//' .*? EOF) -> skip;
MULTILINE: ('/*' .*? '*/') -> skip;
