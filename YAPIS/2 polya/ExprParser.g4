grammar ExprParser;

program : statement+ EOF;

statement : func
  | loop
  | condition
  | asiignmentExpression SEMI
  | unaryExpr SEMI
  | methodUsage
  ;

methodUsage
  :(ID | functionUsage)(Point functionUsage)+;

fieldUsage
  :ID(Point ID)+;


functionUsage : ID '(' ('&'? (ID|fieldUsage|STRING|functionUsage|baseExpr) (',' '&'? (ID|fieldUsage|STRING|functionUsage|baseExpr))*)?')';
block : '{' (statement)*  (('return' baseExpr) SEMI)?'}';
func : (TYPE|'func') (ID|OPERATOR_ID) '(' (TYPE '&'? ID (',' TYPE '&'? ID)*)? ')' block;

loop : for_loop
  | while_loop
  ;

for_loop : 'for' '(' TYPE ID ':' baseExpr ')' block
  | 'for' '(' TYPE ID ';' baseExpr ';' baseExpr ')' block
  ;

while_loop : 'while' '(' baseExpr ')' block ;

brackets_expr : '('baseExpr')';

baseExpr : unaryExpr | brackets_expr | logicExpression;

asiignmentExpression :
  (TYPE)? ID EQ baseExpr;

unaryExpr :
  ('!' | '-')?binaryExpr;

atomExpr: 
  ID
  | INT
  | STRING
  | methodUsage
  | fieldUsage 
  | functionUsage
  | brackets_expr;

binaryExpr :
  mulExpr ('+' mulExpr | '-' mulExpr)*;

mulExpr :
  atomExpr ('*' atomExpr | '/' atomExpr)*;

logicExpression :
  atomExpr ('<' atomExpr | '>' atomExpr | '==' atomExpr)?;

condition :if_cond|switch_cond;
if_cond: 'if ('(baseExpr (('and'|'or') baseExpr)*) ')' block ('else' block)?;
switch_cond: 'switch' '(' ID '):' ('case' (ID|INT) block)+ ('default' block)?;

STRING : '"'[a-zA-Z_0-9 ]*'"';
    
SEMI : ';'; 
TYPE : 'int'|'node'|'arc'|'graph'|'queue'|'list'|'set';
INT : [0]|[1-9][0-9]*;
OP : '=='|'<'|'>'|'*'|'/'|'+'|'-';
OPERATOR_ID: 'operator'('+'|'-'|'*'|'/')?;
ID : [a-zA-Z_][a-zA-Z_0-9]*;
EQ : '=';
WS : [ \t\n\r]+{setChannel(HIDDEN);};
Point : '.';