// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RelScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, Assign=3, Comma=4, Semi=5, Quot=6, Return=7, BlockStart=8, 
		LParen=9, RParen=10, LCurly=11, RCurly=12, LSquare=13, RSquare=14, Const=15, 
		TableType=16, ColumnTupe=17, RowType=18, NumberType=19, StringWord=20, 
		Plus=21, Minus=22, Less=23, Equal=24, More=25, LessEqual=26, MoreEqual=27, 
		Divide=28, Multiplication=29, ID=30, IntNumber=31, FloatNumber=32, StringLiteral=33, 
		UnterminatedStringLiteral=34, NEWLINE=35, WS=36, BlockComment=37, LineComment=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Assign", "Comma", "Semi", "Quot", "Return", "BlockStart", "LParen", 
			"RParen", "LCurly", "RCurly", "LSquare", "RSquare", "Const", "TableType", 
			"ColumnTupe", "RowType", "NumberType", "StringWord", "Plus", "Minus", 
			"Less", "Equal", "More", "LessEqual", "MoreEqual", "Divide", "Multiplication", 
			"ID", "IntNumber", "FloatNumber", "StringLiteral", "UnterminatedStringLiteral", 
			"NEWLINE", "WS", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'is'", "','", "';'", "'\"'", "'<<'", "'>>'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'const'", "'table'", "'column'", 
			"'row'", "'number'", "'string'", "'+'", "'-'", "'less'", "'equal'", "'more'", 
			"'lessEqual'", "'moreEqual'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "Assign", "Comma", "Semi", "Quot", "Return", 
			"BlockStart", "LParen", "RParen", "LCurly", "RCurly", "LSquare", "RSquare", 
			"Const", "TableType", "ColumnTupe", "RowType", "NumberType", "StringWord", 
			"Plus", "Minus", "Less", "Equal", "More", "LessEqual", "MoreEqual", "Divide", 
			"Multiplication", "ID", "IntNumber", "FloatNumber", "StringLiteral", 
			"UnterminatedStringLiteral", "NEWLINE", "WS", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public RelScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    if (pendingDent) { setChannel(HIDDEN); }
			    pendingDent = true;
			    indentCount = 0;
			    initialIndentToken = null;

			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    setChannel(HIDDEN);
			    if (pendingDent) { indentCount += getText().length(); }

			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000&\u0105\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00b8"+
		"\b\u001b\n\u001b\f\u001b\u00bb\t\u001b\u0001\u001c\u0001\u001c\u0004\u001c"+
		"\u00bf\b\u001c\u000b\u001c\f\u001c\u00c0\u0001\u001c\u0003\u001c\u00c4"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0004\u001d\u00c9\b\u001d"+
		"\u000b\u001d\f\u001d\u00ca\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u00d5\b\u001f"+
		"\u0005\u001f\u00d7\b\u001f\n\u001f\f\u001f\u00da\t\u001f\u0001 \u0003"+
		" \u00dd\b \u0001 \u0001 \u0003 \u00e1\b \u0001 \u0001 \u0001!\u0004!\u00e6"+
		"\b!\u000b!\f!\u00e7\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u00f1\b\"\n\"\f\"\u00f4\t\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005#\u00ff\b#\n#\f#\u0102\t#\u0001"+
		"#\u0001#\u0001\u00f2\u0000$\u0001\u0003\u0003\u0004\u0005\u0005\u0007"+
		"\u0006\t\u0007\u000b\b\r\t\u000f\n\u0011\u000b\u0013\f\u0015\r\u0017\u000e"+
		"\u0019\u000f\u001b\u0010\u001d\u0011\u001f\u0012!\u0013#\u0014%\u0015"+
		"\'\u0016)\u0017+\u0018-\u0019/\u001a1\u001b3\u001c5\u001d7\u001e9\u001f"+
		"; =!?\"A#C$E%G&\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__"+
		"az\u0001\u000019\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\u0002\u0000"+
		"\t\t  \u0002\u0000\n\n\r\r\u0111\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0001I"+
		"\u0001\u0000\u0000\u0000\u0003L\u0001\u0000\u0000\u0000\u0005N\u0001\u0000"+
		"\u0000\u0000\u0007P\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000"+
		"\u000bU\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000fZ\u0001"+
		"\u0000\u0000\u0000\u0011\\\u0001\u0000\u0000\u0000\u0013^\u0001\u0000"+
		"\u0000\u0000\u0015`\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000"+
		"\u0019d\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dp"+
		"\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000\u0000!{\u0001\u0000"+
		"\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%\u0089\u0001\u0000\u0000\u0000"+
		"\'\u008b\u0001\u0000\u0000\u0000)\u008d\u0001\u0000\u0000\u0000+\u0092"+
		"\u0001\u0000\u0000\u0000-\u0098\u0001\u0000\u0000\u0000/\u009d\u0001\u0000"+
		"\u0000\u00001\u00a7\u0001\u0000\u0000\u00003\u00b1\u0001\u0000\u0000\u0000"+
		"5\u00b3\u0001\u0000\u0000\u00007\u00b5\u0001\u0000\u0000\u00009\u00c3"+
		"\u0001\u0000\u0000\u0000;\u00c5\u0001\u0000\u0000\u0000=\u00cc\u0001\u0000"+
		"\u0000\u0000?\u00cf\u0001\u0000\u0000\u0000A\u00e0\u0001\u0000\u0000\u0000"+
		"C\u00e5\u0001\u0000\u0000\u0000E\u00eb\u0001\u0000\u0000\u0000G\u00fa"+
		"\u0001\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005s\u0000\u0000K\u0002"+
		"\u0001\u0000\u0000\u0000LM\u0005,\u0000\u0000M\u0004\u0001\u0000\u0000"+
		"\u0000NO\u0005;\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005\"\u0000"+
		"\u0000Q\b\u0001\u0000\u0000\u0000RS\u0005<\u0000\u0000ST\u0005<\u0000"+
		"\u0000T\n\u0001\u0000\u0000\u0000UV\u0005>\u0000\u0000VW\u0005>\u0000"+
		"\u0000W\f\u0001\u0000\u0000\u0000XY\u0005(\u0000\u0000Y\u000e\u0001\u0000"+
		"\u0000\u0000Z[\u0005)\u0000\u0000[\u0010\u0001\u0000\u0000\u0000\\]\u0005"+
		"{\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005}\u0000\u0000_\u0014"+
		"\u0001\u0000\u0000\u0000`a\u0005[\u0000\u0000a\u0016\u0001\u0000\u0000"+
		"\u0000bc\u0005]\u0000\u0000c\u0018\u0001\u0000\u0000\u0000de\u0005c\u0000"+
		"\u0000ef\u0005o\u0000\u0000fg\u0005n\u0000\u0000gh\u0005s\u0000\u0000"+
		"hi\u0005t\u0000\u0000i\u001a\u0001\u0000\u0000\u0000jk\u0005t\u0000\u0000"+
		"kl\u0005a\u0000\u0000lm\u0005b\u0000\u0000mn\u0005l\u0000\u0000no\u0005"+
		"e\u0000\u0000o\u001c\u0001\u0000\u0000\u0000pq\u0005c\u0000\u0000qr\u0005"+
		"o\u0000\u0000rs\u0005l\u0000\u0000st\u0005u\u0000\u0000tu\u0005m\u0000"+
		"\u0000uv\u0005n\u0000\u0000v\u001e\u0001\u0000\u0000\u0000wx\u0005r\u0000"+
		"\u0000xy\u0005o\u0000\u0000yz\u0005w\u0000\u0000z \u0001\u0000\u0000\u0000"+
		"{|\u0005n\u0000\u0000|}\u0005u\u0000\u0000}~\u0005m\u0000\u0000~\u007f"+
		"\u0005b\u0000\u0000\u007f\u0080\u0005e\u0000\u0000\u0080\u0081\u0005r"+
		"\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082\u0083\u0005s\u0000"+
		"\u0000\u0083\u0084\u0005t\u0000\u0000\u0084\u0085\u0005r\u0000\u0000\u0085"+
		"\u0086\u0005i\u0000\u0000\u0086\u0087\u0005n\u0000\u0000\u0087\u0088\u0005"+
		"g\u0000\u0000\u0088$\u0001\u0000\u0000\u0000\u0089\u008a\u0005+\u0000"+
		"\u0000\u008a&\u0001\u0000\u0000\u0000\u008b\u008c\u0005-\u0000\u0000\u008c"+
		"(\u0001\u0000\u0000\u0000\u008d\u008e\u0005l\u0000\u0000\u008e\u008f\u0005"+
		"e\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090\u0091\u0005s\u0000"+
		"\u0000\u0091*\u0001\u0000\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093"+
		"\u0094\u0005q\u0000\u0000\u0094\u0095\u0005u\u0000\u0000\u0095\u0096\u0005"+
		"a\u0000\u0000\u0096\u0097\u0005l\u0000\u0000\u0097,\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005m\u0000\u0000\u0099\u009a\u0005o\u0000\u0000\u009a"+
		"\u009b\u0005r\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c.\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005l\u0000\u0000\u009e\u009f\u0005e\u0000"+
		"\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005s\u0000\u0000\u00a1"+
		"\u00a2\u0005E\u0000\u0000\u00a2\u00a3\u0005q\u0000\u0000\u00a3\u00a4\u0005"+
		"u\u0000\u0000\u00a4\u00a5\u0005a\u0000\u0000\u00a5\u00a6\u0005l\u0000"+
		"\u0000\u00a60\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005m\u0000\u0000\u00a8"+
		"\u00a9\u0005o\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005"+
		"e\u0000\u0000\u00ab\u00ac\u0005E\u0000\u0000\u00ac\u00ad\u0005q\u0000"+
		"\u0000\u00ad\u00ae\u0005u\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af"+
		"\u00b0\u0005l\u0000\u0000\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"/\u0000\u0000\u00b24\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005*\u0000"+
		"\u0000\u00b46\u0001\u0000\u0000\u0000\u00b5\u00b9\u0007\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0007\u0001\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00be\u0007\u0002\u0000\u0000\u00bd"+
		"\u00bf\u0007\u0003\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c4\u0007\u0003\u0000\u0000\u00c3\u00bc\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4:\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u00039\u001c\u0000\u00c6\u00c8\u0005.\u0000\u0000\u00c7\u00c9\u0007\u0003"+
		"\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb<\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003?\u001f\u0000"+
		"\u00cd\u00ce\u0003\u0007\u0003\u0000\u00ce>\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d8\u0003\u0007\u0003\u0000\u00d0\u00d7\b\u0004\u0000\u0000\u00d1\u00d4"+
		"\u0005\\\u0000\u0000\u00d2\u00d5\t\u0000\u0000\u0000\u00d3\u00d5\u0005"+
		"\u0000\u0000\u0001\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9@\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0005\r\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0005\n\u0000\u0000\u00df\u00e1\u0005\r\u0000\u0000"+
		"\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0006 \u0000\u0000\u00e3"+
		"B\u0001\u0000\u0000\u0000\u00e4\u00e6\u0007\u0005\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0006!\u0001\u0000\u00eaD\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ec\u00ed\u0005*\u0000\u0000"+
		"\u00ed\u00f2\u0001\u0000\u0000\u0000\u00ee\u00f1\u0003E\"\u0000\u00ef"+
		"\u00f1\t\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005*\u0000\u0000\u00f6\u00f7\u0005/\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0006\"\u0002\u0000\u00f9F\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005/\u0000\u0000\u00fb\u00fc\u0005/\u0000\u0000\u00fc"+
		"\u0100\u0001\u0000\u0000\u0000\u00fd\u00ff\b\u0006\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0006#\u0002\u0000\u0104H\u0001\u0000\u0000\u0000\u000e\u0000\u00b9\u00c0"+
		"\u00c3\u00ca\u00d4\u00d6\u00d8\u00dc\u00e0\u00e7\u00f0\u00f2\u0100\u0003"+
		"\u0001 \u0000\u0001!\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}