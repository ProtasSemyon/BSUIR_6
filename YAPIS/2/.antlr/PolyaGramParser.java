// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PolyaGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, EQUAL=2, PLUS=3, MINUS=4, MULTIPLY=5, DIVIDE=6, EXCLAMATION=7, 
		LESS=8, MOR=9, IF=10, AND=11, OR=12, ELSE=13, SWITCH=14, CASE=15, DEFAULT=16, 
		SEMI=17, TYPE=18, INT=19, OPERATOR_ID=20, WS=21, Point=22, LEFT_BR=23, 
		RIGHT_BR=24, LEFT_FIG=25, RIGHT_FIG=26, COMMA=27, AMPERSANT=28, RETURN=29, 
		FUNCTION=30, FOR=31, COLON=32, WHILE=33, STRING=34, ID=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_methodUsage = 2, RULE_fieldUsage = 3, 
		RULE_functionUsage = 4, RULE_block = 5, RULE_func = 6, RULE_loop = 7, 
		RULE_for_loop = 8, RULE_while_loop = 9, RULE_brackets_expr = 10, RULE_baseExpr = 11, 
		RULE_asiignmentExpression = 12, RULE_unaryExpr = 13, RULE_atomExpr = 14, 
		RULE_binaryExpr = 15, RULE_mulExpr = 16, RULE_logicExpression = 17, RULE_condition = 18, 
		RULE_if_cond = 19, RULE_switch_cond = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "methodUsage", "fieldUsage", "functionUsage", 
			"block", "func", "loop", "for_loop", "while_loop", "brackets_expr", "baseExpr", 
			"asiignmentExpression", "unaryExpr", "atomExpr", "binaryExpr", "mulExpr", 
			"logicExpression", "condition", "if_cond", "switch_cond"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolyaGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PolyaGramParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 63359960210L) != 0 );
			setState(47);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AsiignmentExpressionContext asiignmentExpression() {
			return getRuleContext(AsiignmentExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PolyaGramParser.SEMI, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MethodUsageContext methodUsage() {
			return getRuleContext(MethodUsageContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				asiignmentExpression();
				setState(53);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				unaryExpr();
				setState(56);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				methodUsage();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodUsageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolyaGramParser.ID, 0); }
		public List<FunctionUsageContext> functionUsage() {
			return getRuleContexts(FunctionUsageContext.class);
		}
		public FunctionUsageContext functionUsage(int i) {
			return getRuleContext(FunctionUsageContext.class,i);
		}
		public List<TerminalNode> Point() { return getTokens(PolyaGramParser.Point); }
		public TerminalNode Point(int i) {
			return getToken(PolyaGramParser.Point, i);
		}
		public MethodUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterMethodUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitMethodUsage(this);
		}
	}

	public final MethodUsageContext methodUsage() throws RecognitionException {
		MethodUsageContext _localctx = new MethodUsageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(61);
				match(ID);
				}
				break;
			case 2:
				{
				setState(62);
				functionUsage();
				}
				break;
			}
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(Point);
				setState(66);
				functionUsage();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Point );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldUsageContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PolyaGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolyaGramParser.ID, i);
		}
		public List<TerminalNode> Point() { return getTokens(PolyaGramParser.Point); }
		public TerminalNode Point(int i) {
			return getToken(PolyaGramParser.Point, i);
		}
		public FieldUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterFieldUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitFieldUsage(this);
		}
	}

	public final FieldUsageContext fieldUsage() throws RecognitionException {
		FieldUsageContext _localctx = new FieldUsageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(Point);
				setState(73);
				match(ID);
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Point );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionUsageContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PolyaGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolyaGramParser.ID, i);
		}
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public List<FieldUsageContext> fieldUsage() {
			return getRuleContexts(FieldUsageContext.class);
		}
		public FieldUsageContext fieldUsage(int i) {
			return getRuleContext(FieldUsageContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(PolyaGramParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PolyaGramParser.STRING, i);
		}
		public List<FunctionUsageContext> functionUsage() {
			return getRuleContexts(FunctionUsageContext.class);
		}
		public FunctionUsageContext functionUsage(int i) {
			return getRuleContext(FunctionUsageContext.class,i);
		}
		public List<BaseExprContext> baseExpr() {
			return getRuleContexts(BaseExprContext.class);
		}
		public BaseExprContext baseExpr(int i) {
			return getRuleContext(BaseExprContext.class,i);
		}
		public List<TerminalNode> AMPERSANT() { return getTokens(PolyaGramParser.AMPERSANT); }
		public TerminalNode AMPERSANT(int i) {
			return getToken(PolyaGramParser.AMPERSANT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PolyaGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PolyaGramParser.COMMA, i);
		}
		public FunctionUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionUsage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterFunctionUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitFunctionUsage(this);
		}
	}

	public final FunctionUsageContext functionUsage() throws RecognitionException {
		FunctionUsageContext _localctx = new FunctionUsageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionUsage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(LEFT_BR);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 51817218192L) != 0) {
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AMPERSANT) {
					{
					setState(80);
					match(AMPERSANT);
					}
				}

				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(83);
					match(ID);
					}
					break;
				case 2:
					{
					setState(84);
					fieldUsage();
					}
					break;
				case 3:
					{
					setState(85);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(86);
					functionUsage();
					}
					break;
				case 5:
					{
					setState(87);
					baseExpr();
					}
					break;
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AMPERSANT) {
						{
						setState(91);
						match(AMPERSANT);
						}
					}

					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(94);
						match(ID);
						}
						break;
					case 2:
						{
						setState(95);
						fieldUsage();
						}
						break;
					case 3:
						{
						setState(96);
						match(STRING);
						}
						break;
					case 4:
						{
						setState(97);
						functionUsage();
						}
						break;
					case 5:
						{
						setState(98);
						baseExpr();
						}
						break;
					}
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
			match(RIGHT_BR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_FIG() { return getToken(PolyaGramParser.LEFT_FIG, 0); }
		public TerminalNode RIGHT_FIG() { return getToken(PolyaGramParser.RIGHT_FIG, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PolyaGramParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(PolyaGramParser.RETURN, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LEFT_FIG);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 63359960210L) != 0) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				{
				setState(117);
				match(RETURN);
				setState(118);
				baseExpr();
				}
				setState(120);
				match(SEMI);
				}
			}

			setState(124);
			match(RIGHT_FIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> TYPE() { return getTokens(PolyaGramParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(PolyaGramParser.TYPE, i);
		}
		public TerminalNode FUNCTION() { return getToken(PolyaGramParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(PolyaGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolyaGramParser.ID, i);
		}
		public TerminalNode OPERATOR_ID() { return getToken(PolyaGramParser.OPERATOR_ID, 0); }
		public List<TerminalNode> AMPERSANT() { return getTokens(PolyaGramParser.AMPERSANT); }
		public TerminalNode AMPERSANT(int i) {
			return getToken(PolyaGramParser.AMPERSANT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PolyaGramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PolyaGramParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==FUNCTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==OPERATOR_ID || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(LEFT_BR);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(129);
				match(TYPE);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AMPERSANT) {
					{
					setState(130);
					match(AMPERSANT);
					}
				}

				setState(133);
				match(ID);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(134);
					match(COMMA);
					setState(135);
					match(TYPE);
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AMPERSANT) {
						{
						setState(136);
						match(AMPERSANT);
						}
					}

					setState(139);
					match(ID);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(147);
			match(RIGHT_BR);
			setState(148);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				while_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PolyaGramParser.FOR, 0); }
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public TerminalNode TYPE() { return getToken(PolyaGramParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(PolyaGramParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PolyaGramParser.COLON, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(FOR);
			setState(155);
			match(LEFT_BR);
			setState(156);
			match(TYPE);
			setState(157);
			match(ID);
			setState(158);
			match(COLON);
			setState(159);
			baseExpr();
			setState(160);
			match(RIGHT_BR);
			setState(161);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PolyaGramParser.WHILE, 0); }
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(WHILE);
			setState(164);
			match(LEFT_BR);
			setState(165);
			baseExpr();
			setState(166);
			match(RIGHT_BR);
			setState(167);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Brackets_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public Brackets_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterBrackets_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitBrackets_expr(this);
		}
	}

	public final Brackets_exprContext brackets_expr() throws RecognitionException {
		Brackets_exprContext _localctx = new Brackets_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_brackets_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LEFT_BR);
			setState(170);
			baseExpr();
			setState(171);
			match(RIGHT_BR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public Brackets_exprContext brackets_expr() {
			return getRuleContext(Brackets_exprContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public BaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitBaseExpr(this);
		}
	}

	public final BaseExprContext baseExpr() throws RecognitionException {
		BaseExprContext _localctx = new BaseExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_baseExpr);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				brackets_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				logicExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsiignmentExpressionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PolyaGramParser.ASSIGN, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PolyaGramParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(PolyaGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolyaGramParser.ID, i);
		}
		public List<FieldUsageContext> fieldUsage() {
			return getRuleContexts(FieldUsageContext.class);
		}
		public FieldUsageContext fieldUsage(int i) {
			return getRuleContext(FieldUsageContext.class,i);
		}
		public AsiignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asiignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterAsiignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitAsiignmentExpression(this);
		}
	}

	public final AsiignmentExpressionContext asiignmentExpression() throws RecognitionException {
		AsiignmentExpressionContext _localctx = new AsiignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asiignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(178);
				match(TYPE);
				}
			}

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(181);
					match(ID);
					}
					break;
				case 2:
					{
					setState(182);
					fieldUsage();
					}
					break;
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(ASSIGN);
			setState(189);
			baseExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(PolyaGramParser.EXCLAMATION, 0); }
		public TerminalNode MINUS() { return getToken(PolyaGramParser.MINUS, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==EXCLAMATION) {
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==EXCLAMATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(194);
			binaryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolyaGramParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(PolyaGramParser.TYPE, 0); }
		public TerminalNode INT() { return getToken(PolyaGramParser.INT, 0); }
		public TerminalNode STRING() { return getToken(PolyaGramParser.STRING, 0); }
		public MethodUsageContext methodUsage() {
			return getRuleContext(MethodUsageContext.class,0);
		}
		public FieldUsageContext fieldUsage() {
			return getRuleContext(FieldUsageContext.class,0);
		}
		public FunctionUsageContext functionUsage() {
			return getRuleContext(FunctionUsageContext.class,0);
		}
		public Brackets_exprContext brackets_expr() {
			return getRuleContext(Brackets_exprContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitAtomExpr(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomExpr);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(196);
					match(TYPE);
					}
				}

				setState(199);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				methodUsage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				fieldUsage();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				functionUsage();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				brackets_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PolyaGramParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PolyaGramParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PolyaGramParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PolyaGramParser.MINUS, i);
		}
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitBinaryExpr(this);
		}
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			mulExpr();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(209);
					match(PLUS);
					setState(210);
					mulExpr();
					}
					break;
				case MINUS:
					{
					setState(211);
					match(MINUS);
					setState(212);
					mulExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(PolyaGramParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(PolyaGramParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(PolyaGramParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(PolyaGramParser.DIVIDE, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitMulExpr(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			atomExpr();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLY:
					{
					setState(219);
					match(MULTIPLY);
					setState(220);
					atomExpr();
					}
					break;
				case DIVIDE:
					{
					setState(221);
					match(DIVIDE);
					setState(222);
					atomExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpressionContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(PolyaGramParser.LESS, 0); }
		public TerminalNode MOR() { return getToken(PolyaGramParser.MOR, 0); }
		public TerminalNode EQUAL() { return getToken(PolyaGramParser.EQUAL, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitLogicExpression(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			atomExpr();
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
				{
				setState(229);
				match(LESS);
				setState(230);
				atomExpr();
				}
				break;
			case MOR:
				{
				setState(231);
				match(MOR);
				setState(232);
				atomExpr();
				}
				break;
			case EQUAL:
				{
				setState(233);
				match(EQUAL);
				setState(234);
				atomExpr();
				}
				break;
			case AND:
			case OR:
			case SEMI:
			case RIGHT_BR:
			case COMMA:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public Switch_condContext switch_cond() {
			return getRuleContext(Switch_condContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				if_cond();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				switch_cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PolyaGramParser.IF, 0); }
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BaseExprContext> baseExpr() {
			return getRuleContexts(BaseExprContext.class);
		}
		public BaseExprContext baseExpr(int i) {
			return getRuleContext(BaseExprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PolyaGramParser.ELSE, 0); }
		public List<TerminalNode> AND() { return getTokens(PolyaGramParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PolyaGramParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(PolyaGramParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PolyaGramParser.OR, i);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitIf_cond(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IF);
			setState(242);
			match(LEFT_BR);
			{
			setState(243);
			baseExpr();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(244);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				baseExpr();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(251);
			match(RIGHT_BR);
			setState(252);
			block();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(253);
				match(ELSE);
				setState(254);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_condContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(PolyaGramParser.SWITCH, 0); }
		public TerminalNode LEFT_BR() { return getToken(PolyaGramParser.LEFT_BR, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(PolyaGramParser.RIGHT_BR, 0); }
		public TerminalNode COLON() { return getToken(PolyaGramParser.COLON, 0); }
		public List<TerminalNode> CASE() { return getTokens(PolyaGramParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(PolyaGramParser.CASE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(PolyaGramParser.DEFAULT, 0); }
		public List<TerminalNode> ID() { return getTokens(PolyaGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolyaGramParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(PolyaGramParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PolyaGramParser.INT, i);
		}
		public Switch_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).enterSwitch_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolyaGramParserListener ) ((PolyaGramParserListener)listener).exitSwitch_cond(this);
		}
	}

	public final Switch_condContext switch_cond() throws RecognitionException {
		Switch_condContext _localctx = new Switch_condContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switch_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(SWITCH);
			setState(258);
			match(LEFT_BR);
			setState(259);
			baseExpr();
			setState(260);
			match(RIGHT_BR);
			setState(261);
			match(COLON);
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(CASE);
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				block();
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(269);
				match(DEFAULT);
				setState(270);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0112\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
		",\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0004\u0002D\b\u0002"+
		"\u000b\u0002\f\u0002E\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"K\b\u0003\u000b\u0003\f\u0003L\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"d\b\u0004\u0005\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0003\u0004k\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005q\b"+
		"\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0084"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008a"+
		"\b\u0006\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t"+
		"\u0006\u0003\u0006\u0092\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0099\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00b1\b\u000b\u0001\f\u0003\f\u00b4\b\f\u0001"+
		"\f\u0001\f\u0005\f\u00b8\b\f\n\f\f\f\u00bb\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0003\r\u00c1\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00c6"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00cf\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d6\b\u000f\n\u000f\f\u000f"+
		"\u00d9\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00e0\b\u0010\n\u0010\f\u0010\u00e3\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00ec\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00f0\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00f7\b\u0013\n\u0013\f\u0013\u00fa\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0100\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u010a\b\u0014\u000b\u0014\f\u0014\u010b\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0110\b\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(\u0000\u0005\u0002\u0000\u0012\u0012\u001e\u001e\u0002\u0000\u0014"+
		"\u0014##\u0002\u0000\u0004\u0004\u0007\u0007\u0001\u0000\u000b\f\u0002"+
		"\u0000\u0013\u0013##\u0131\u0000+\u0001\u0000\u0000\u0000\u0002;\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000"+
		"\u0000\bN\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\f~\u0001"+
		"\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000\u0000\u0010\u009a\u0001"+
		"\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a9\u0001"+
		"\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b3\u0001"+
		"\u0000\u0000\u0000\u001a\u00c0\u0001\u0000\u0000\u0000\u001c\u00ce\u0001"+
		"\u0000\u0000\u0000\u001e\u00d0\u0001\u0000\u0000\u0000 \u00da\u0001\u0000"+
		"\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000$\u00ef\u0001\u0000\u0000"+
		"\u0000&\u00f1\u0001\u0000\u0000\u0000(\u0101\u0001\u0000\u0000\u0000*"+
		",\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u0000"+
		"1<\u0003\f\u0006\u00002<\u0003\u000e\u0007\u00003<\u0003$\u0012\u0000"+
		"45\u0003\u0018\f\u000056\u0005\u0011\u0000\u00006<\u0001\u0000\u0000\u0000"+
		"78\u0003\u001a\r\u000089\u0005\u0011\u0000\u00009<\u0001\u0000\u0000\u0000"+
		":<\u0003\u0004\u0002\u0000;1\u0001\u0000\u0000\u0000;2\u0001\u0000\u0000"+
		"\u0000;3\u0001\u0000\u0000\u0000;4\u0001\u0000\u0000\u0000;7\u0001\u0000"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000"+
		"=@\u0005#\u0000\u0000>@\u0003\b\u0004\u0000?=\u0001\u0000\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000AB\u0005\u0016\u0000"+
		"\u0000BD\u0003\b\u0004\u0000CA\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001"+
		"\u0000\u0000\u0000GJ\u0005#\u0000\u0000HI\u0005\u0016\u0000\u0000IK\u0005"+
		"#\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0007\u0001\u0000\u0000"+
		"\u0000NO\u0005#\u0000\u0000Oj\u0005\u0017\u0000\u0000PR\u0005\u001c\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RX\u0001\u0000"+
		"\u0000\u0000SY\u0005#\u0000\u0000TY\u0003\u0006\u0003\u0000UY\u0005\""+
		"\u0000\u0000VY\u0003\b\u0004\u0000WY\u0003\u0016\u000b\u0000XS\u0001\u0000"+
		"\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Yg\u0001\u0000\u0000\u0000"+
		"Z\\\u0005\u001b\u0000\u0000[]\u0005\u001c\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]c\u0001\u0000\u0000\u0000^d\u0005#\u0000"+
		"\u0000_d\u0003\u0006\u0003\u0000`d\u0005\"\u0000\u0000ad\u0003\b\u0004"+
		"\u0000bd\u0003\u0016\u000b\u0000c^\u0001\u0000\u0000\u0000c_\u0001\u0000"+
		"\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eZ\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jQ\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0018\u0000\u0000m\t\u0001\u0000\u0000\u0000nr\u0005\u0019\u0000\u0000"+
		"oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sz\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u001d\u0000\u0000vw\u0003"+
		"\u0016\u000b\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0011\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u001a\u0000\u0000}\u000b\u0001"+
		"\u0000\u0000\u0000~\u007f\u0007\u0000\u0000\u0000\u007f\u0080\u0007\u0001"+
		"\u0000\u0000\u0080\u0091\u0005\u0017\u0000\u0000\u0081\u0083\u0005\u0012"+
		"\u0000\u0000\u0082\u0084\u0005\u001c\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u008e\u0005#\u0000\u0000\u0086\u0087\u0005\u001b\u0000"+
		"\u0000\u0087\u0089\u0005\u0012\u0000\u0000\u0088\u008a\u0005\u001c\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0005#\u0000\u0000"+
		"\u008c\u0086\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0081\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0018\u0000\u0000"+
		"\u0094\u0095\u0003\n\u0005\u0000\u0095\r\u0001\u0000\u0000\u0000\u0096"+
		"\u0099\u0003\u0010\b\u0000\u0097\u0099\u0003\u0012\t\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u000f"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u001f\u0000\u0000\u009b\u009c"+
		"\u0005\u0017\u0000\u0000\u009c\u009d\u0005\u0012\u0000\u0000\u009d\u009e"+
		"\u0005#\u0000\u0000\u009e\u009f\u0005 \u0000\u0000\u009f\u00a0\u0003\u0016"+
		"\u000b\u0000\u00a0\u00a1\u0005\u0018\u0000\u0000\u00a1\u00a2\u0003\n\u0005"+
		"\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005!\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0017\u0000\u0000\u00a5\u00a6\u0003\u0016\u000b\u0000"+
		"\u00a6\u00a7\u0005\u0018\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000\u00a8"+
		"\u0013\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0017\u0000\u0000\u00aa"+
		"\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac"+
		"\u0015\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003\u001a\r\u0000\u00ae\u00b1"+
		"\u0003\u0014\n\u0000\u00af\u00b1\u0003\"\u0011\u0000\u00b0\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005"+
		"\u0012\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b9\u0001\u0000\u0000\u0000\u00b5\u00b8\u0005"+
		"#\u0000\u0000\u00b6\u00b8\u0003\u0006\u0003\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000\u00bd\u00be\u0003\u0016"+
		"\u000b\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c1\u0007\u0002"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u001e"+
		"\u000f\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005\u0012"+
		"\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00cf\u0005#\u0000"+
		"\u0000\u00c8\u00cf\u0005\u0013\u0000\u0000\u00c9\u00cf\u0005\"\u0000\u0000"+
		"\u00ca\u00cf\u0003\u0004\u0002\u0000\u00cb\u00cf\u0003\u0006\u0003\u0000"+
		"\u00cc\u00cf\u0003\b\u0004\u0000\u00cd\u00cf\u0003\u0014\n\u0000\u00ce"+
		"\u00c5\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d7\u0003 \u0010\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d6"+
		"\u0003 \u0010\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d6\u0003"+
		" \u0010\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u001f\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00e1\u0003\u001c"+
		"\u000e\u0000\u00db\u00dc\u0005\u0005\u0000\u0000\u00dc\u00e0\u0003\u001c"+
		"\u000e\u0000\u00dd\u00de\u0005\u0006\u0000\u0000\u00de\u00e0\u0003\u001c"+
		"\u000e\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2!\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00eb\u0003\u001c\u000e"+
		"\u0000\u00e5\u00e6\u0005\b\u0000\u0000\u00e6\u00ec\u0003\u001c\u000e\u0000"+
		"\u00e7\u00e8\u0005\t\u0000\u0000\u00e8\u00ec\u0003\u001c\u000e\u0000\u00e9"+
		"\u00ea\u0005\u0002\u0000\u0000\u00ea\u00ec\u0003\u001c\u000e\u0000\u00eb"+
		"\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"#\u0001\u0000\u0000\u0000\u00ed\u00f0\u0003&\u0013\u0000\u00ee\u00f0\u0003"+
		"(\u0014\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0%\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\n\u0000"+
		"\u0000\u00f2\u00f3\u0005\u0017\u0000\u0000\u00f3\u00f8\u0003\u0016\u000b"+
		"\u0000\u00f4\u00f5\u0007\u0003\u0000\u0000\u00f5\u00f7\u0003\u0016\u000b"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\u0018\u0000\u0000\u00fc\u00ff\u0003\n\u0005\u0000"+
		"\u00fd\u00fe\u0005\r\u0000\u0000\u00fe\u0100\u0003\n\u0005\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\'\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u000e\u0000\u0000\u0102\u0103"+
		"\u0005\u0017\u0000\u0000\u0103\u0104\u0003\u0016\u000b\u0000\u0104\u0105"+
		"\u0005\u0018\u0000\u0000\u0105\u0109\u0005 \u0000\u0000\u0106\u0107\u0005"+
		"\u000f\u0000\u0000\u0107\u0108\u0007\u0004\u0000\u0000\u0108\u010a\u0003"+
		"\n\u0005\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0010"+
		"\u0000\u0000\u010e\u0110\u0003\n\u0005\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110)\u0001\u0000\u0000\u0000"+
		"#-;?ELQX\\cgjrz\u0083\u0089\u008e\u0091\u0098\u00b0\u00b3\u00b7\u00b9"+
		"\u00c0\u00c5\u00ce\u00d5\u00d7\u00df\u00e1\u00eb\u00ef\u00f8\u00ff\u010b"+
		"\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}