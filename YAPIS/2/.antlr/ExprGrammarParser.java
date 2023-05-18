// Generated from /home/smn/BSUIR_6/YAPIS/2/ExprGrammarParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarParser extends Parser {
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
	public String getGrammarFileName() { return "ExprGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprGrammarParser.EOF, 0); }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << MINUS) | (1L << EXCLAMATION) | (1L << IF) | (1L << SWITCH) | (1L << TYPE) | (1L << INT) | (1L << LEFT_BR) | (1L << FUNCTION) | (1L << FOR) | (1L << WHILE) | (1L << STRING) | (1L << ID))) != 0) );
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
		public TerminalNode SEMI() { return getToken(ExprGrammarParser.SEMI, 0); }
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

	public static class MethodUsageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprGrammarParser.ID, 0); }
		public List<FunctionUsageContext> functionUsage() {
			return getRuleContexts(FunctionUsageContext.class);
		}
		public FunctionUsageContext functionUsage(int i) {
			return getRuleContext(FunctionUsageContext.class,i);
		}
		public List<TerminalNode> Point() { return getTokens(ExprGrammarParser.Point); }
		public TerminalNode Point(int i) {
			return getToken(ExprGrammarParser.Point, i);
		}
		public MethodUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodUsage; }
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

	public static class FieldUsageContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprGrammarParser.ID, i);
		}
		public List<TerminalNode> Point() { return getTokens(ExprGrammarParser.Point); }
		public TerminalNode Point(int i) {
			return getToken(ExprGrammarParser.Point, i);
		}
		public FieldUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldUsage; }
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

	public static class FunctionUsageContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprGrammarParser.ID, i);
		}
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
		public List<FieldUsageContext> fieldUsage() {
			return getRuleContexts(FieldUsageContext.class);
		}
		public FieldUsageContext fieldUsage(int i) {
			return getRuleContext(FieldUsageContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(ExprGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprGrammarParser.STRING, i);
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
		public List<TerminalNode> AMPERSANT() { return getTokens(ExprGrammarParser.AMPERSANT); }
		public TerminalNode AMPERSANT(int i) {
			return getToken(ExprGrammarParser.AMPERSANT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprGrammarParser.COMMA, i);
		}
		public FunctionUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionUsage; }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << EXCLAMATION) | (1L << TYPE) | (1L << INT) | (1L << LEFT_BR) | (1L << AMPERSANT) | (1L << STRING) | (1L << ID))) != 0)) {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_FIG() { return getToken(ExprGrammarParser.LEFT_FIG, 0); }
		public TerminalNode RIGHT_FIG() { return getToken(ExprGrammarParser.RIGHT_FIG, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ExprGrammarParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(ExprGrammarParser.RETURN, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << MINUS) | (1L << EXCLAMATION) | (1L << IF) | (1L << SWITCH) | (1L << TYPE) | (1L << INT) | (1L << LEFT_BR) | (1L << FUNCTION) | (1L << FOR) | (1L << WHILE) | (1L << STRING) | (1L << ID))) != 0)) {
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> TYPE() { return getTokens(ExprGrammarParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ExprGrammarParser.TYPE, i);
		}
		public TerminalNode FUNCTION() { return getToken(ExprGrammarParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprGrammarParser.ID, i);
		}
		public TerminalNode OPERATOR_ID() { return getToken(ExprGrammarParser.OPERATOR_ID, 0); }
		public List<TerminalNode> AMPERSANT() { return getTokens(ExprGrammarParser.AMPERSANT); }
		public TerminalNode AMPERSANT(int i) {
			return getToken(ExprGrammarParser.AMPERSANT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprGrammarParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExprGrammarParser.FOR, 0); }
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public TerminalNode TYPE() { return getToken(ExprGrammarParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ExprGrammarParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ExprGrammarParser.COLON, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprGrammarParser.WHILE, 0); }
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
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

	public static class Brackets_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
		public Brackets_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets_expr; }
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

	public static class AsiignmentExpressionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ExprGrammarParser.ASSIGN, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(ExprGrammarParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprGrammarParser.ID, i);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(ExprGrammarParser.EXCLAMATION, 0); }
		public TerminalNode MINUS() { return getToken(ExprGrammarParser.MINUS, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
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

	public static class AtomExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprGrammarParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(ExprGrammarParser.TYPE, 0); }
		public TerminalNode INT() { return getToken(ExprGrammarParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ExprGrammarParser.STRING, 0); }
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

	public static class BinaryExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExprGrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExprGrammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExprGrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExprGrammarParser.MINUS, i);
		}
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
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

	public static class MulExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(ExprGrammarParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(ExprGrammarParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(ExprGrammarParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(ExprGrammarParser.DIVIDE, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(ExprGrammarParser.LESS, 0); }
		public TerminalNode MOR() { return getToken(ExprGrammarParser.MOR, 0); }
		public TerminalNode EQUAL() { return getToken(ExprGrammarParser.EQUAL, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
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

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprGrammarParser.IF, 0); }
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
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
		public TerminalNode ELSE() { return getToken(ExprGrammarParser.ELSE, 0); }
		public List<TerminalNode> AND() { return getTokens(ExprGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprGrammarParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprGrammarParser.OR, i);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
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

	public static class Switch_condContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ExprGrammarParser.SWITCH, 0); }
		public TerminalNode LEFT_BR() { return getToken(ExprGrammarParser.LEFT_BR, 0); }
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(ExprGrammarParser.RIGHT_BR, 0); }
		public TerminalNode COLON() { return getToken(ExprGrammarParser.COLON, 0); }
		public List<TerminalNode> CASE() { return getTokens(ExprGrammarParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(ExprGrammarParser.CASE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(ExprGrammarParser.DEFAULT, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprGrammarParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprGrammarParser.INT, i);
		}
		public Switch_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cond; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\5\4B\n\4\3"+
		"\4\3\4\6\4F\n\4\r\4\16\4G\3\5\3\5\3\5\6\5M\n\5\r\5\16\5N\3\6\3\6\3\6\5"+
		"\6T\n\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6f\n\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\6\3\6\3\7\3\7\7\7s\n"+
		"\7\f\7\16\7v\13\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0086\n\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\7\b\u008f\n\b\f\b"+
		"\16\b\u0092\13\b\5\b\u0094\n\b\3\b\3\b\3\b\3\t\3\t\5\t\u009b\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\5\r\u00b3\n\r\3\16\5\16\u00b6\n\16\3\16\3\16\7\16\u00ba"+
		"\n\16\f\16\16\16\u00bd\13\16\3\16\3\16\3\16\3\17\5\17\u00c3\n\17\3\17"+
		"\3\17\3\20\5\20\u00c8\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d1"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u00d8\n\21\f\21\16\21\u00db\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\5\24\u00f2\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\7\25\u00f9\n\25\f\25\16\25\u00fc\13\25\3"+
		"\25\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\6\26\u010c\n\26\r\26\16\26\u010d\3\26\3\26\5\26\u0112\n\26\3\26"+
		"\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\4\2\24\24  "+
		"\4\2\26\26%%\4\2\6\6\t\t\3\2\r\16\4\2\25\25%%\2\u0133\2-\3\2\2\2\4=\3"+
		"\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nP\3\2\2\2\fp\3\2\2\2\16\u0080\3\2\2\2\20"+
		"\u009a\3\2\2\2\22\u009c\3\2\2\2\24\u00a5\3\2\2\2\26\u00ab\3\2\2\2\30\u00b2"+
		"\3\2\2\2\32\u00b5\3\2\2\2\34\u00c2\3\2\2\2\36\u00d0\3\2\2\2 \u00d2\3\2"+
		"\2\2\"\u00dc\3\2\2\2$\u00e6\3\2\2\2&\u00f1\3\2\2\2(\u00f3\3\2\2\2*\u0103"+
		"\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2"+
		"\2\2\61\62\7\2\2\3\62\3\3\2\2\2\63>\5\16\b\2\64>\5\20\t\2\65>\5&\24\2"+
		"\66\67\5\32\16\2\678\7\23\2\28>\3\2\2\29:\5\34\17\2:;\7\23\2\2;>\3\2\2"+
		"\2<>\5\6\4\2=\63\3\2\2\2=\64\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2=9\3\2\2\2"+
		"=<\3\2\2\2>\5\3\2\2\2?B\7%\2\2@B\5\n\6\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2"+
		"CD\7\30\2\2DF\5\n\6\2EC\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2"+
		"\2IL\7%\2\2JK\7\30\2\2KM\7%\2\2LJ\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2O\t\3\2\2\2PQ\7%\2\2Ql\7\31\2\2RT\7\36\2\2SR\3\2\2\2ST\3\2\2\2TZ\3\2"+
		"\2\2U[\7%\2\2V[\5\b\5\2W[\7$\2\2X[\5\n\6\2Y[\5\30\r\2ZU\3\2\2\2ZV\3\2"+
		"\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[i\3\2\2\2\\^\7\35\2\2]_\7\36\2\2^]"+
		"\3\2\2\2^_\3\2\2\2_e\3\2\2\2`f\7%\2\2af\5\b\5\2bf\7$\2\2cf\5\n\6\2df\5"+
		"\30\r\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fh\3\2\2\2g\\"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2lS\3\2\2\2l"+
		"m\3\2\2\2mn\3\2\2\2no\7\32\2\2o\13\3\2\2\2pt\7\33\2\2qs\5\4\3\2rq\3\2"+
		"\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vt\3\2\2\2wx\7\37\2\2xy\5"+
		"\30\r\2yz\3\2\2\2z{\7\23\2\2{}\3\2\2\2|w\3\2\2\2|}\3\2\2\2}~\3\2\2\2~"+
		"\177\7\34\2\2\177\r\3\2\2\2\u0080\u0081\t\2\2\2\u0081\u0082\t\3\2\2\u0082"+
		"\u0093\7\31\2\2\u0083\u0085\7\24\2\2\u0084\u0086\7\36\2\2\u0085\u0084"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0090\7%\2\2\u0088"+
		"\u0089\7\35\2\2\u0089\u008b\7\24\2\2\u008a\u008c\7\36\2\2\u008b\u008a"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7%\2\2\u008e"+
		"\u0088\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0083\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\32\2\2\u0096\u0097\5"+
		"\f\7\2\u0097\17\3\2\2\2\u0098\u009b\5\22\n\2\u0099\u009b\5\24\13\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d\7!\2\2"+
		"\u009d\u009e\7\31\2\2\u009e\u009f\7\24\2\2\u009f\u00a0\7%\2\2\u00a0\u00a1"+
		"\7\"\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5\f\7\2"+
		"\u00a4\23\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8"+
		"\5\30\r\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\5\f\7\2\u00aa\25\3\2\2\2\u00ab"+
		"\u00ac\7\31\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\32\2\2\u00ae\27\3\2"+
		"\2\2\u00af\u00b3\5\34\17\2\u00b0\u00b3\5\26\f\2\u00b1\u00b3\5$\23\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\31\3\2\2"+
		"\2\u00b4\u00b6\7\24\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00ba\7%\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\3"+
		"\2\2\u00bf\u00c0\5\30\r\2\u00c0\33\3\2\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5 \21\2\u00c5"+
		"\35\3\2\2\2\u00c6\u00c8\7\24\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00d1\7%\2\2\u00ca\u00d1\7\25\2\2\u00cb\u00d1"+
		"\7$\2\2\u00cc\u00d1\5\6\4\2\u00cd\u00d1\5\b\5\2\u00ce\u00d1\5\n\6\2\u00cf"+
		"\u00d1\5\26\f\2\u00d0\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cb\3"+
		"\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d9\5\"\22\2\u00d3\u00d4\7\5\2"+
		"\2\u00d4\u00d8\5\"\22\2\u00d5\u00d6\7\6\2\2\u00d6\u00d8\5\"\22\2\u00d7"+
		"\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da!\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e3"+
		"\5\36\20\2\u00dd\u00de\7\7\2\2\u00de\u00e2\5\36\20\2\u00df\u00e0\7\b\2"+
		"\2\u00e0\u00e2\5\36\20\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4#\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00ed\5\36\20\2\u00e7\u00e8\7\n\2\2\u00e8\u00ee"+
		"\5\36\20\2\u00e9\u00ea\7\13\2\2\u00ea\u00ee\5\36\20\2\u00eb\u00ec\7\4"+
		"\2\2\u00ec\u00ee\5\36\20\2\u00ed\u00e7\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00f2\5(\25\2"+
		"\u00f0\u00f2\5*\26\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3"+
		"\2\2\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5\7\31\2\2\u00f5\u00fa\5\30\r\2\u00f6"+
		"\u00f7\t\5\2\2\u00f7\u00f9\5\30\r\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7\32\2\2\u00fe\u0101\5\f\7\2\u00ff\u0100\7"+
		"\17\2\2\u0100\u0102\5\f\7\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		")\3\2\2\2\u0103\u0104\7\20\2\2\u0104\u0105\7\31\2\2\u0105\u0106\5\30\r"+
		"\2\u0106\u0107\7\32\2\2\u0107\u010b\7\"\2\2\u0108\u0109\7\21\2\2\u0109"+
		"\u010a\t\6\2\2\u010a\u010c\5\f\7\2\u010b\u0108\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u0110\7\22\2\2\u0110\u0112\5\f\7\2\u0111\u010f\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112+\3\2\2\2%/=AGNSZ^eilt|\u0085\u008b\u0090\u0093\u009a\u00b2"+
		"\u00b5\u00b9\u00bb\u00c2\u00c7\u00d0\u00d7\u00d9\u00e1\u00e3\u00ed\u00f1"+
		"\u00fa\u0101\u010d\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}