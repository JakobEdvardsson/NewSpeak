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
: 'again' '(' whilecondition ')' '{'code'}'
;

whilecondition
: expr* condition expr*;


condition
: 'greater'
| 'ungreater'
| 'equals'
;

add
: unaryExpression 'dubleplus' expr;

sub
: unaryExpression 'dubleunplus' expr;

unaryExpression
: ID
| INT
;

print: 'versificator' ID | 'versificator' INT;

expr
: unaryExpression
| add
| sub
;

ID: ('a'..'z'|'A'..'Z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip;
COMMENT: ('//' .*? '\n' | '//' .*? EOF) -> skip;
MULTILINE: ('/*' .*? '*/') -> skip;
