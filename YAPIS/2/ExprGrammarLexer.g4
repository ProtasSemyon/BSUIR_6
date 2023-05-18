lexer grammar ExprGrammarLexer;


//signs
ASSIGN: '=';
EQUAL: '==';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
EXCLAMATION: '!';
LESS: '<';
MOR: '>';

IF: 'if';
AND: 'and';
OR: 'or';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';


SEMI : ';'; 
TYPE : 'int'|'node'|'arc'|'graph'|'queue'|'list'|'set';
INT : [0]|[1-9][0-9]*;
OPERATOR_ID: 'operator' (PLUS|MINUS|MULTIPLY|DIVIDE)?;
WS: [\n\r\f\t ]+ -> skip ;
Point : '.';
LEFT_BR: '(';
RIGHT_BR: ')';
LEFT_FIG: '{';
RIGHT_FIG: '}';
COMMA: ',';
AMPERSANT: '&';
RETURN: 'return';
FUNCTION: 'func';
FOR: 'for';
COLON: ':';
WHILE: 'while';

STRING : '"'[a-zA-Z_0-9 ]*'"';
ID : [a-zA-Z_][a-zA-Z_0-9]*;


