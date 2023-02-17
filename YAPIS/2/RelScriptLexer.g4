lexer grammar RelScriptLexer;

tokens { INDENT, DEDENT }

@lexer::members {
	// Initializing `pendingDent` to true means any whitespace at the beginning
	// of the file will trigger an INDENT, which will probably be a syntax error,
	// as it is in Python.
	private boolean pendingDent = false;
	private int indentCount = 0;
	private java.util.LinkedList<Token> tokenQueue = new java.util.LinkedList<>();
	private java.util.Stack<Integer> indentStack = new java.util.Stack<>();
	private Token initialIndentToken = null;
	private int getSavedIndent() { return indentStack.isEmpty() ? 0 : indentStack.peek(); }

	private CommonToken createToken(int type, String text, Token next) {
		CommonToken token = new CommonToken(type, text);
		if (null != initialIndentToken) {
			token.setStartIndex(initialIndentToken.getStartIndex());
			token.setLine(initialIndentToken.getLine());
			token.setCharPositionInLine(initialIndentToken.getCharPositionInLine());
			token.setStopIndex(next.getStartIndex()-1);
		}
		return token;
	}

	@Override
	public Token nextToken() {
		// Return tokens from the queue if it is not empty.
		if (!tokenQueue.isEmpty()) { return tokenQueue.poll(); }

		// Grab the next token and if nothing special is needed, simply return it.
		// Initialize `initialIndentToken` if needed.
		Token next = super.nextToken();
		//NOTE: This could be an appropriate spot to count whitespace or deal with
		//NEWLINES, but it is already handled with custom actions down in the
		//lexer rules.
		if (pendingDent && null == initialIndentToken && NEWLINE != next.getType()) { initialIndentToken = next; }
		if (null == next || HIDDEN == next.getChannel() || NEWLINE == next.getType()) { return next; }

		// Handle EOF. In particular, handle an abrupt EOF that comes without an
		// immediately preceding NEWLINE.
		if (next.getType() == EOF) {
			indentCount = 0;
			// EOF outside of `pendingDent` state means input did not have a final
			// NEWLINE before end of file.
			if (!pendingDent) {
				initialIndentToken = next;
				tokenQueue.offer(createToken(NEWLINE, "NEWLINE", next));
			}
		}

		// Before exiting `pendingDent` state queue up proper INDENTS and DEDENTS.
		while (indentCount != getSavedIndent()) {
			if (indentCount > getSavedIndent()) {
				indentStack.push(indentCount);
				tokenQueue.offer(createToken(INDENT, "INDENT" + indentCount, next));
			} else {
				indentStack.pop();
				tokenQueue.offer(createToken(DEDENT, "DEDENT"+getSavedIndent(), next));
			}
		}
		pendingDent = false;
		tokenQueue.offer(next);
		return tokenQueue.poll();
	}
}

Assign : 'is';
Comma : ',' ;
Semi : ';' ;
Quot : '"';
Return : '<<';
BlockStart : '>>';

//brackets
LParen : '(' ;
RParen : ')' ;
LCurly : '{' ;
RCurly : '}' ;
LSquare : '[' ;
RSquare : ']' ;

//datatype
Const : 'const';
TableType : 'table';
ColumnTupe : 'column';
RowType : 'row';
NumberType : 'number';
StringWord : 'string';

//math operands
Plus : '+';
Minus : '-';
Less : 'less';
Equal : 'equal';
More : 'more';
LessEqual : 'lessEqual';
MoreEqual : 'moreEqual';
Divide : '/';
Multiplication : '*';

ID : [a-zA-Z_][a-zA-Z0-9_]*;
IntNumber : [1-9][0-9]+ | [0-9];
FloatNumber : IntNumber('.'[0-9]+);

StringLiteral
  : UnterminatedStringLiteral Quot
  ;

UnterminatedStringLiteral
  : Quot (~["\\\r\n] | '\\' (. | EOF))*
  ;

NEWLINE : ( '\r'? '\n' | '\r' ) {
    if (pendingDent) { setChannel(HIDDEN); }
    pendingDent = true;
    indentCount = 0;
    initialIndentToken = null;
} ;

WS : [ \t]+ {
    setChannel(HIDDEN);
    if (pendingDent) { indentCount += getText().length(); }
} ;

BlockComment : '/*' ( BlockComment | . )*? '*/' -> channel(HIDDEN) ;   // allow nesting comments
LineComment : '//' ~[\r\n]* -> channel(HIDDEN) ;

