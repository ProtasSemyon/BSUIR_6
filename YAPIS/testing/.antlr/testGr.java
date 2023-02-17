// Generated from /home/smn/BSUIR/6/YAPIS/testing/testGr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testGr extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, INDENT=3, DEDENT=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "INDENT", "DEDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'INDENT'", "'DEDENT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "INDENT", "DEDENT"
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



	public testGr(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "testGr.g4"; }

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
		case 2:
			INDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			DEDENT_action((RuleContext)_localctx, actionIndex);
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
	private void INDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 setChannel(HIDDEN); 
			break;
		}
	}
	private void DEDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 setChannel(HIDDEN); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6-\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\5\2\r\n\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3\3\6"+
		"\3\26\n\3\r\3\16\3\27\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\2\2\6\3\3\5\4\7\5\t\6\3\2\3\4\2\13\13"+
		"\"\"\2/\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\20\3\2\2\2\5"+
		"\25\3\2\2\2\7\33\3\2\2\2\t$\3\2\2\2\13\r\7\17\2\2\f\13\3\2\2\2\f\r\3\2"+
		"\2\2\r\16\3\2\2\2\16\21\7\f\2\2\17\21\7\17\2\2\20\f\3\2\2\2\20\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\23\b\2\2\2\23\4\3\2\2\2\24\26\t\2\2\2\25\24\3\2"+
		"\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\b\3"+
		"\3\2\32\6\3\2\2\2\33\34\7K\2\2\34\35\7P\2\2\35\36\7F\2\2\36\37\7G\2\2"+
		"\37 \7P\2\2 !\7V\2\2!\"\3\2\2\2\"#\b\4\4\2#\b\3\2\2\2$%\7F\2\2%&\7G\2"+
		"\2&\'\7F\2\2\'(\7G\2\2()\7P\2\2)*\7V\2\2*+\3\2\2\2+,\b\5\5\2,\n\3\2\2"+
		"\2\6\2\f\20\27\6\3\2\2\3\3\3\3\4\4\3\5\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}