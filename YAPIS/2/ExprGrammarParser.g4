parser grammar ExprGrammarParser;
options { tokenVocab=ExprGrammarLexer; }

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

functionUsage : ID LEFT_BR (AMPERSANT? (ID|fieldUsage|STRING|functionUsage|baseExpr) (COMMA AMPERSANT? (ID|fieldUsage|STRING|functionUsage|baseExpr))*)? RIGHT_BR;
block : LEFT_FIG (statement)*  ((RETURN baseExpr) SEMI)? RIGHT_FIG;
func : (TYPE|FUNCTION) (ID|OPERATOR_ID) LEFT_BR (TYPE AMPERSANT? ID (COMMA TYPE AMPERSANT? ID)*)? RIGHT_BR block;

loop : for_loop
  | while_loop
  ;

for_loop : FOR LEFT_BR TYPE ID COLON baseExpr RIGHT_BR block;

while_loop : WHILE LEFT_BR baseExpr RIGHT_BR block ;

brackets_expr : LEFT_BR baseExpr RIGHT_BR;

baseExpr : unaryExpr | brackets_expr | logicExpression;

asiignmentExpression :
  (TYPE)? (ID|fieldUsage)* ASSIGN baseExpr;

unaryExpr :
  (EXCLAMATION | MINUS)?binaryExpr;

atomExpr: 
  (TYPE)? ID
  | INT
  | STRING
  | methodUsage
  | fieldUsage 
  | functionUsage
  | brackets_expr;

binaryExpr :
  mulExpr (PLUS mulExpr | MINUS mulExpr)*;

mulExpr :
  atomExpr (MULTIPLY atomExpr | DIVIDE atomExpr)*;

logicExpression :
  atomExpr (LESS atomExpr | MOR atomExpr | EQUAL atomExpr)?;

condition :if_cond|switch_cond;
if_cond: IF LEFT_BR(baseExpr ((AND|OR) baseExpr)*) RIGHT_BR block (ELSE block)?;
switch_cond: SWITCH LEFT_BR baseExpr RIGHT_BR COLON (CASE (ID|INT) block)+ (DEFAULT block)?;
