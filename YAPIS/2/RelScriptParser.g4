parser grammar RelScriptParser;
options { tokenVocab=RelScriptLexer; }

program : ( NEWLINE | statement )* EOF ;

statement 
  : (assignExpression | functionDeclaration | functionUsage) NEWLINE?;

assignExpression 
  : Const? type? ID Assign expression;

number : IntNumber | FloatNumber;


expression 
  : inBracesExpression
  | functionUsage
  | arithmeticExpression
  | ID 
  | number 
  | StringLiteral
  ;

arithmeticExpression
  : expressionLeft binarySign expression;

expressionLeft
  : inBracesExpression
  | functionUsage
  | ID
  | number
  | StringLiteral
  ;

binarySign
  : Plus
  | Minus
  | Divide
  | LessEqual
  | MoreEqual
  | Less
  | More
  | Equal;



inBracesExpression 
  : inCurlyExpression 
  | inSquareExpression 
  | inParenExpression;

inCurlyExpression 
  : LCurly expressionInsideBraces RCurly;

inSquareExpression 
  : LSquare expressionInsideBraces RSquare;

inParenExpression 
  : LParen expressionInsideBraces RParen;

expressionInsideBraces 
  : expression 
  | expression Comma expressionInsideBraces;

functionDeclaration
  : type ID functionDeclarationBraces BlockStart NEWLINE block;

block
  : INDENT statement+ returnExpression? DEDENT;

returnExpression
  : Return expression? NEWLINE;

functionDeclarationBraces
  : LParen functionDeclarationArgs RParen;

functionDeclarationArgs
  : type ID | type ID Comma functionDeclarationArgs;

functionUsage
  : ID inParenExpression;

type 
  : TableType 
  | ColumnTupe 
  | RowType 
  | stringType
  | NumberType;

stringType
  : StringWord LParen IntNumber RParen;





