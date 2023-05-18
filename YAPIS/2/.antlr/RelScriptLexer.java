// Generated from /home/smn/BSUIR_6/YAPIS/2/RelScriptLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, Assign=3, Comma=4, Semi=5, Quot=6, Return=7, BlockStart=8, 
		Point=9, LParen=10, RParen=11, LCurly=12, RCurly=13, LSquare=14, RSquare=15, 
		Const=16, TableType=17, ColumnTupe=18, RowType=19, NumberType=20, TupleType=21, 
		StringWord=22, Plus=23, Minus=24, Divide=25, Multiplication=26, Less=27, 
		Equal=28, More=29, LessEqual=30, MoreEqual=31, While=32, For=33, Switch=34, 
		Case=35, Default=36, If=37, Else=38, Break=39, ID=40, IntNumber=41, FloatNumber=42, 
		StringLiteral=43, UnterminatedStringLiteral=44, NEWLINE=45, WS=46, BlockComment=47, 
		LineComment=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Assign", "Comma", "Semi", "Quot", "Return", "BlockStart", "Point", "LParen", 
			"RParen", "LCurly", "RCurly", "LSquare", "RSquare", "Const", "TableType", 
			"ColumnTupe", "RowType", "NumberType", "TupleType", "StringWord", "Plus", 
			"Minus", "Divide", "Multiplication", "Less", "Equal", "More", "LessEqual", 
			"MoreEqual", "While", "For", "Switch", "Case", "Default", "If", "Else", 
			"Break", "ID", "IntNumber", "FloatNumber", "StringLiteral", "UnterminatedStringLiteral", 
			"NEWLINE", "WS", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'is'", "','", "';'", "'\"'", "'<<'", "'>>'", "'.'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'const'", "'table'", "'column'", 
			"'row'", "'number'", "'tuple'", "'string'", "'+'", "'-'", "'/'", "'*'", 
			"'less'", "'equal'", "'more'", "'lessEqual'", "'moreEqual'", "'while'", 
			"'for'", "'switch'", "'case'", "'default'", "'if'", "'else'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "Assign", "Comma", "Semi", "Quot", "Return", 
			"BlockStart", "Point", "LParen", "RParen", "LCurly", "RCurly", "LSquare", 
			"RSquare", "Const", "TableType", "ColumnTupe", "RowType", "NumberType", 
			"TupleType", "StringWord", "Plus", "Minus", "Divide", "Multiplication", 
			"Less", "Equal", "More", "LessEqual", "MoreEqual", "While", "For", "Switch", 
			"Case", "Default", "If", "Else", "Break", "ID", "IntNumber", "FloatNumber", 
			"StringLiteral", "UnterminatedStringLiteral", "NEWLINE", "WS", "BlockComment", 
			"LineComment"
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
		case 42:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u0102\n\'\f\'\16\'\u0105\13"+
		"\'\3(\3(\6(\u0109\n(\r(\16(\u010a\3(\5(\u010e\n(\3)\3)\3)\6)\u0113\n)"+
		"\r)\16)\u0114\3*\3*\3*\3+\3+\3+\3+\3+\5+\u011f\n+\7+\u0121\n+\f+\16+\u0124"+
		"\13+\3,\5,\u0127\n,\3,\3,\5,\u012b\n,\3,\3,\3-\6-\u0130\n-\r-\16-\u0131"+
		"\3-\3-\3.\3.\3.\3.\3.\7.\u013b\n.\f.\16.\u013e\13.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\7/\u0149\n/\f/\16/\u014c\13/\3/\3/\3\u013c\2\60\3\5\5\6\7\7\t"+
		"\b\13\t\r\n\17\13\21\f\23\r\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25"+
		"%\26\'\27)\30+\31-\32/\33\61\34\63\35\65\36\67\379 ;!=\"?#A$C%E&G\'I("+
		"K)M*O+Q,S-U.W/Y\60[\61]\62\3\2\t\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2"+
		"\62;\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u015b\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5b\3\2\2\2\7d\3\2"+
		"\2\2\tf\3\2\2\2\13h\3\2\2\2\rk\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2"+
		"\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35|\3\2\2\2\37\u0082"+
		"\3\2\2\2!\u0088\3\2\2\2#\u008f\3\2\2\2%\u0093\3\2\2\2\'\u009a\3\2\2\2"+
		")\u00a0\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad"+
		"\3\2\2\2\63\u00af\3\2\2\2\65\u00b4\3\2\2\2\67\u00ba\3\2\2\29\u00bf\3\2"+
		"\2\2;\u00c9\3\2\2\2=\u00d3\3\2\2\2?\u00d9\3\2\2\2A\u00dd\3\2\2\2C\u00e4"+
		"\3\2\2\2E\u00e9\3\2\2\2G\u00f1\3\2\2\2I\u00f4\3\2\2\2K\u00f9\3\2\2\2M"+
		"\u00ff\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2\2\2S\u0116\3\2\2\2U\u0119\3\2"+
		"\2\2W\u012a\3\2\2\2Y\u012f\3\2\2\2[\u0135\3\2\2\2]\u0144\3\2\2\2_`\7k"+
		"\2\2`a\7u\2\2a\4\3\2\2\2bc\7.\2\2c\6\3\2\2\2de\7=\2\2e\b\3\2\2\2fg\7$"+
		"\2\2g\n\3\2\2\2hi\7>\2\2ij\7>\2\2j\f\3\2\2\2kl\7@\2\2lm\7@\2\2m\16\3\2"+
		"\2\2no\7\60\2\2o\20\3\2\2\2pq\7*\2\2q\22\3\2\2\2rs\7+\2\2s\24\3\2\2\2"+
		"tu\7}\2\2u\26\3\2\2\2vw\7\177\2\2w\30\3\2\2\2xy\7]\2\2y\32\3\2\2\2z{\7"+
		"_\2\2{\34\3\2\2\2|}\7e\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7u\2\2\u0080"+
		"\u0081\7v\2\2\u0081\36\3\2\2\2\u0082\u0083\7v\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7d\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087 \3\2\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b\u008c\7w\2\2"+
		"\u008c\u008d\7o\2\2\u008d\u008e\7p\2\2\u008e\"\3\2\2\2\u008f\u0090\7t"+
		"\2\2\u0090\u0091\7q\2\2\u0091\u0092\7y\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7w\2\2\u0095\u0096\7o\2\2\u0096\u0097\7d\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7t\2\2\u0099&\3\2\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7r\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2"+
		"\u009f(\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2"+
		"\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7i\2\2\u00a6*\3\2"+
		"\2\2\u00a7\u00a8\7-\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa.\3\2\2"+
		"\2\u00ab\u00ac\7\61\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\62\3"+
		"\2\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7s\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\66\3\2\2\2\u00ba"+
		"\u00bb\7o\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2"+
		"\u00be8\3\2\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7u\2"+
		"\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7s\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8:\3\2\2\2\u00c9\u00ca"+
		"\7o\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7G\2\2\u00ce\u00cf\7s\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7c\2\2"+
		"\u00d1\u00d2\7n\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2"+
		"\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8>\3\2"+
		"\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc@\3"+
		"\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7j\2\2\u00e3B\3\2\2\2\u00e4"+
		"\u00e5\7e\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8D\3\2\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7h\2"+
		"\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3H\3"+
		"\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7t\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7m\2\2\u00feL\3\2\2\2\u00ff"+
		"\u0103\t\2\2\2\u0100\u0102\t\3\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104N\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0108\t\4\2\2\u0107\u0109\t\5\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010e\t\5\2\2\u010d\u0106\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"P\3\2\2\2\u010f\u0110\5O(\2\u0110\u0112\7\60\2\2\u0111\u0113\t\5\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115R\3\2\2\2\u0116\u0117\5U+\2\u0117\u0118\5\t\5\2\u0118T\3\2\2"+
		"\2\u0119\u0122\5\t\5\2\u011a\u0121\n\6\2\2\u011b\u011e\7^\2\2\u011c\u011f"+
		"\13\2\2\2\u011d\u011f\7\2\2\3\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0121\3\2\2\2\u0120\u011a\3\2\2\2\u0120\u011b\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123V\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0127\7\17\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\7\f\2\2\u0129\u012b\7\17\2\2\u012a"+
		"\u0126\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b,"+
		"\2\2\u012dX\3\2\2\2\u012e\u0130\t\7\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b-\3\2\u0134Z\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7,\2\2\u0137"+
		"\u013c\3\2\2\2\u0138\u013b\5[.\2\u0139\u013b\13\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7,"+
		"\2\2\u0140\u0141\7\61\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b.\4\2\u0143"+
		"\\\3\2\2\2\u0144\u0145\7\61\2\2\u0145\u0146\7\61\2\2\u0146\u014a\3\2\2"+
		"\2\u0147\u0149\n\b\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014e\b/\4\2\u014e^\3\2\2\2\20\2\u0103\u010a\u010d\u0114\u011e\u0120"+
		"\u0122\u0126\u012a\u0131\u013a\u013c\u014a\5\3,\2\3-\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}