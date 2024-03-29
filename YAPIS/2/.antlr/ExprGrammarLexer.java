// Generated from /home/smn/BSUIR_6/YAPIS/2/ExprGrammarLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, EQUAL=2, PLUS=3, MINUS=4, MULTIPLY=5, DIVIDE=6, EXCLAMATION=7, 
		LESS=8, MOR=9, IF=10, AND=11, OR=12, ELSE=13, SWITCH=14, CASE=15, DEFAULT=16, 
		SEMI=17, TYPE=18, INT=19, OPERATOR_ID=20, WS=21, Point=22, LEFT_BR=23, 
		RIGHT_BR=24, LEFT_FIG=25, RIGHT_FIG=26, COMMA=27, AMPERSANT=28, RETURN=29, 
		FUNCTION=30, FOR=31, COLON=32, WHILE=33, STRING=34, ID=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "EXCLAMATION", 
			"LESS", "MOR", "IF", "AND", "OR", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"SEMI", "TYPE", "INT", "OPERATOR_ID", "WS", "Point", "LEFT_BR", "RIGHT_BR", 
			"LEFT_FIG", "RIGHT_FIG", "COMMA", "AMPERSANT", "RETURN", "FUNCTION", 
			"FOR", "COLON", "WHILE", "STRING", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'=='", "'+'", "'-'", "'*'", "'/'", "'!'", "'<'", "'>'", 
			"'if'", "'and'", "'or'", "'else'", "'switch'", "'case'", "'default'", 
			"';'", null, null, null, null, "'.'", "'('", "')'", "'{'", "'}'", "','", 
			"'&'", "'return'", "'func'", "'for'", "':'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "EXCLAMATION", 
			"LESS", "MOR", "IF", "AND", "OR", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"SEMI", "TYPE", "INT", "OPERATOR_ID", "WS", "Point", "LEFT_BR", "RIGHT_BR", 
			"LEFT_FIG", "RIGHT_FIG", "COMMA", "AMPERSANT", "RETURN", "FUNCTION", 
			"FOR", "COLON", "WHILE", "STRING", "ID"
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


	public ExprGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprGrammarLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u009d\n\23\3\24\3\24\3\24\7\24\u00a2\n\24\f\24\16\24\u00a5\13\24\5\24"+
		"\u00a7\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00b6\n\25\3\26\6\26\u00b9\n\26\r\26\16\26\u00ba\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00e7\n#\f#\16#\u00ea\13#\3"+
		"#\3#\3$\3$\7$\u00f0\n$\f$\16$\u00f3\13$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\t\3\2\62"+
		"\62\3\2\63;\3\2\62;\5\2\13\f\16\17\"\"\7\2\"\"\62;C\\aac|\5\2C\\aac|\6"+
		"\2\62;C\\aac|\2\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7N\3\2\2\2\tP\3\2\2\2\13"+
		"R\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2"+
		"\27_\3\2\2\2\31c\3\2\2\2\33f\3\2\2\2\35k\3\2\2\2\37r\3\2\2\2!w\3\2\2\2"+
		"#\177\3\2\2\2%\u009c\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00b8\3\2"+
		"\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2\65"+
		"\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00ca\3\2\2\2;\u00cc\3\2\2\2=\u00d3\3"+
		"\2\2\2?\u00d8\3\2\2\2A\u00dc\3\2\2\2C\u00de\3\2\2\2E\u00e4\3\2\2\2G\u00ed"+
		"\3\2\2\2IJ\7?\2\2J\4\3\2\2\2KL\7?\2\2LM\7?\2\2M\6\3\2\2\2NO\7-\2\2O\b"+
		"\3\2\2\2PQ\7/\2\2Q\n\3\2\2\2RS\7,\2\2S\f\3\2\2\2TU\7\61\2\2U\16\3\2\2"+
		"\2VW\7#\2\2W\20\3\2\2\2XY\7>\2\2Y\22\3\2\2\2Z[\7@\2\2[\24\3\2\2\2\\]\7"+
		"k\2\2]^\7h\2\2^\26\3\2\2\2_`\7c\2\2`a\7p\2\2ab\7f\2\2b\30\3\2\2\2cd\7"+
		"q\2\2de\7t\2\2e\32\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\34\3\2"+
		"\2\2kl\7u\2\2lm\7y\2\2mn\7k\2\2no\7v\2\2op\7e\2\2pq\7j\2\2q\36\3\2\2\2"+
		"rs\7e\2\2st\7c\2\2tu\7u\2\2uv\7g\2\2v \3\2\2\2wx\7f\2\2xy\7g\2\2yz\7h"+
		"\2\2z{\7c\2\2{|\7w\2\2|}\7n\2\2}~\7v\2\2~\"\3\2\2\2\177\u0080\7=\2\2\u0080"+
		"$\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u009d\7v\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7q\2\2\u0086\u0087\7f\2\2\u0087\u009d\7g\2\2"+
		"\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a\u009d\7e\2\2\u008b\u008c"+
		"\7i\2\2\u008c\u008d\7t\2\2\u008d\u008e\7c\2\2\u008e\u008f\7r\2\2\u008f"+
		"\u009d\7j\2\2\u0090\u0091\7s\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2"+
		"\u0093\u0094\7w\2\2\u0094\u009d\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7k\2\2\u0097\u0098\7u\2\2\u0098\u009d\7v\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009d\7v\2\2\u009c\u0081\3\2\2\2\u009c\u0084\3\2\2"+
		"\2\u009c\u0088\3\2\2\2\u009c\u008b\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0095"+
		"\3\2\2\2\u009c\u0099\3\2\2\2\u009d&\3\2\2\2\u009e\u00a7\t\2\2\2\u009f"+
		"\u00a3\t\3\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u009f\3\2\2\2\u00a7(\3\2\2\2"+
		"\u00a8\u00a9\7q\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b5\3\2\2\2\u00b1\u00b6\5\7\4\2\u00b2\u00b6\5\t"+
		"\5\2\u00b3\u00b6\5\13\6\2\u00b4\u00b6\5\r\7\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6*\3\2\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\b\26\2\2\u00bd,\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf.\3\2\2\2\u00c0"+
		"\u00c1\7*\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7+\2\2\u00c3\62\3\2\2\2\u00c4"+
		"\u00c5\7}\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7\177\2\2\u00c7\66\3\2\2\2"+
		"\u00c8\u00c9\7.\2\2\u00c98\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb:\3\2\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7w\2\2"+
		"\u00d0\u00d1\7t\2\2\u00d1\u00d2\7p\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7h\2"+
		"\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7e\2\2\u00d7>\3\2"+
		"\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db@\3"+
		"\2\2\2\u00dc\u00dd\7<\2\2\u00ddB\3\2\2\2\u00de\u00df\7y\2\2\u00df\u00e0"+
		"\7j\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"D\3\2\2\2\u00e4\u00e8\7$\2\2\u00e5\u00e7\t\6\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ecF\3\2\2\2\u00ed\u00f1"+
		"\t\7\2\2\u00ee\u00f0\t\b\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2H\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\n\2\u009c\u00a3\u00a6\u00b5\u00ba\u00e8\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}