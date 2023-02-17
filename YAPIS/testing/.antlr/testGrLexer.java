// Generated from /home/smn/BSUIR/6/YAPIS/testing/testGrLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testGrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NEWLINE=3, WS=4, BlockComment=5, LineComment=6, LEGIT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "BlockComment", "LineComment", "LEGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NEWLINE", "WS", "BlockComment", "LineComment", 
			"LEGIT"
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
		private boolean pendingDent = true;
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


	public testGrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "testGrLexer.g4"; }

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
		case 0:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tB\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\5\2\17\n\2\3\2\3\2\5\2\23\n\2\3\2\3"+
		"\2\3\3\6\3\30\n\3\r\3\16\3\31\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4#\n\4\f\4"+
		"\16\4&\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\5\3\5\3\6\6\69\n\6\r\6\16\6:\3\6\7\6>\n\6\f\6\16\6A\13\6\3$\2"+
		"\7\3\5\5\6\7\7\t\b\13\t\3\2\5\4\2\13\13\"\"\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\2I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\3\22\3\2\2\2\5\27\3\2\2\2\7\35\3\2\2\2\t,\3\2\2\2\138\3\2\2\2\r\17"+
		"\7\17\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\23\7\f\2\2\21\23"+
		"\7\17\2\2\22\16\3\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\25\b\2\2\2\25\4"+
		"\3\2\2\2\26\30\t\2\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\33\3\2\2\2\33\34\b\3\3\2\34\6\3\2\2\2\35\36\7\61\2\2\36\37"+
		"\7,\2\2\37$\3\2\2\2 #\5\7\4\2!#\13\2\2\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2"+
		"\2$%\3\2\2\2$\"\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7,\2\2()\7\61\2\2)*\3"+
		"\2\2\2*+\b\4\4\2+\b\3\2\2\2,-\7\61\2\2-.\7\61\2\2.\62\3\2\2\2/\61\n\3"+
		"\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2"+
		"\2\64\62\3\2\2\2\65\66\b\5\4\2\66\n\3\2\2\2\679\n\4\2\28\67\3\2\2\29:"+
		"\3\2\2\2:8\3\2\2\2:;\3\2\2\2;?\3\2\2\2<>\n\3\2\2=<\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\f\3\2\2\2A?\3\2\2\2\13\2\16\22\31\"$\62:?\5\3\2\2"+
		"\3\3\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}