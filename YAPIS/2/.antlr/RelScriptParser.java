// Generated from /home/smn/BSUIR_6/YAPIS/2/RelScriptParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelScriptParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_methodUsage = 2, RULE_assignExpression = 3, 
		RULE_number = 4, RULE_atom = 5, RULE_expression = 6, RULE_mulExpression = 7, 
		RULE_logicExpression = 8, RULE_binarySign = 9, RULE_inBracesExpression = 10, 
		RULE_inCurlyExpression = 11, RULE_inSquareExpression = 12, RULE_inParenExpression = 13, 
		RULE_expressionInsideBraces = 14, RULE_functionDeclaration = 15, RULE_block = 16, 
		RULE_returnExpression = 17, RULE_functionDeclarationBraces = 18, RULE_functionDeclarationArgs = 19, 
		RULE_functionUsage = 20, RULE_type = 21, RULE_stringType = 22, RULE_whileStatement = 23, 
		RULE_forStatement = 24, RULE_switchStatement = 25, RULE_caseStatement = 26, 
		RULE_defaultStatement = 27, RULE_ifStatement = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "methodUsage", "assignExpression", "number", 
			"atom", "expression", "mulExpression", "logicExpression", "binarySign", 
			"inBracesExpression", "inCurlyExpression", "inSquareExpression", "inParenExpression", 
			"expressionInsideBraces", "functionDeclaration", "block", "returnExpression", 
			"functionDeclarationBraces", "functionDeclarationArgs", "functionUsage", 
			"type", "stringType", "whileStatement", "forStatement", "switchStatement", 
			"caseStatement", "defaultStatement", "ifStatement"
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

	@Override
	public String getGrammarFileName() { return "RelScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RelScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RelScriptParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RelScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RelScriptParser.NEWLINE, i);
		}
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord) | (1L << While) | (1L << For) | (1L << Switch) | (1L << If) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(58);
					match(NEWLINE);
					}
					break;
				case Const:
				case TableType:
				case ColumnTupe:
				case RowType:
				case NumberType:
				case TupleType:
				case StringWord:
				case While:
				case For:
				case Switch:
				case If:
				case ID:
					{
					setState(59);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionUsageContext functionUsage() {
			return getRuleContext(FunctionUsageContext.class,0);
		}
		public MethodUsageContext methodUsage() {
			return getRuleContext(MethodUsageContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				assignExpression();
				}
				break;
			case 2:
				{
				setState(68);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(69);
				functionUsage();
				}
				break;
			case 4:
				{
				setState(70);
				methodUsage();
				}
				break;
			case 5:
				{
				setState(71);
				whileStatement();
				}
				break;
			case 6:
				{
				setState(72);
				forStatement();
				}
				break;
			case 7:
				{
				setState(73);
				switchStatement();
				}
				break;
			case 8:
				{
				setState(74);
				ifStatement();
				}
				break;
			}
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(77);
				match(NEWLINE);
				}
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

	public static class MethodUsageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public List<FunctionUsageContext> functionUsage() {
			return getRuleContexts(FunctionUsageContext.class);
		}
		public FunctionUsageContext functionUsage(int i) {
			return getRuleContext(FunctionUsageContext.class,i);
		}
		public List<TerminalNode> Point() { return getTokens(RelScriptParser.Point); }
		public TerminalNode Point(int i) {
			return getToken(RelScriptParser.Point, i);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(80);
				match(ID);
				}
				break;
			case 2:
				{
				setState(81);
				functionUsage();
				}
				break;
			}
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(Point);
				setState(85);
				functionUsage();
				}
				}
				setState(88); 
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public TerminalNode Assign() { return getToken(RelScriptParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Const() { return getToken(RelScriptParser.Const, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(90);
				match(Const);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord))) != 0)) {
				{
				setState(93);
				type();
				}
			}

			setState(96);
			match(ID);
			setState(97);
			match(Assign);
			setState(98);
			expression();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode IntNumber() { return getToken(RelScriptParser.IntNumber, 0); }
		public TerminalNode FloatNumber() { return getToken(RelScriptParser.FloatNumber, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==IntNumber || _la==FloatNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(RelScriptParser.StringLiteral, 0); }
		public FunctionUsageContext functionUsage() {
			return getRuleContext(FunctionUsageContext.class,0);
		}
		public MethodUsageContext methodUsage() {
			return getRuleContext(MethodUsageContext.class,0);
		}
		public InBracesExpressionContext inBracesExpression() {
			return getRuleContext(InBracesExpressionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				functionUsage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				methodUsage();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				inBracesExpression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MulExpressionContext> mulExpression() {
			return getRuleContexts(MulExpressionContext.class);
		}
		public MulExpressionContext mulExpression(int i) {
			return getRuleContext(MulExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(RelScriptParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(RelScriptParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(RelScriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(RelScriptParser.Minus, i);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				mulExpression();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus || _la==Minus) {
					{
					setState(115);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Plus:
						{
						setState(111);
						match(Plus);
						setState(112);
						mulExpression();
						}
						break;
					case Minus:
						{
						setState(113);
						match(Minus);
						setState(114);
						mulExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				logicExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				type();
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

	public static class MulExpressionContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> Multiplication() { return getTokens(RelScriptParser.Multiplication); }
		public TerminalNode Multiplication(int i) {
			return getToken(RelScriptParser.Multiplication, i);
		}
		public List<TerminalNode> Divide() { return getTokens(RelScriptParser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(RelScriptParser.Divide, i);
		}
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mulExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			atom();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Divide || _la==Multiplication) {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiplication:
					{
					setState(125);
					match(Multiplication);
					setState(126);
					atom();
					}
					break;
				case Divide:
					{
					setState(127);
					match(Divide);
					setState(128);
					atom();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
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
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode Equal() { return getToken(RelScriptParser.Equal, 0); }
		public TerminalNode More() { return getToken(RelScriptParser.More, 0); }
		public TerminalNode Less() { return getToken(RelScriptParser.Less, 0); }
		public TerminalNode MoreEqual() { return getToken(RelScriptParser.MoreEqual, 0); }
		public TerminalNode LessEqual() { return getToken(RelScriptParser.LessEqual, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			atom();
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(135);
				match(Equal);
				setState(136);
				atom();
				}
				break;
			case More:
				{
				setState(137);
				match(More);
				setState(138);
				atom();
				}
				break;
			case Less:
				{
				setState(139);
				match(Less);
				setState(140);
				atom();
				}
				break;
			case MoreEqual:
				{
				setState(141);
				match(MoreEqual);
				setState(142);
				atom();
				}
				break;
			case LessEqual:
				{
				setState(143);
				match(LessEqual);
				setState(144);
				atom();
				}
				break;
			case EOF:
			case DEDENT:
			case Comma:
			case Semi:
			case Return:
			case RParen:
			case RCurly:
			case RSquare:
			case Const:
			case TableType:
			case ColumnTupe:
			case RowType:
			case NumberType:
			case TupleType:
			case StringWord:
			case While:
			case For:
			case Switch:
			case If:
			case ID:
			case NEWLINE:
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

	public static class BinarySignContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(RelScriptParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(RelScriptParser.Minus, 0); }
		public TerminalNode Divide() { return getToken(RelScriptParser.Divide, 0); }
		public TerminalNode LessEqual() { return getToken(RelScriptParser.LessEqual, 0); }
		public TerminalNode MoreEqual() { return getToken(RelScriptParser.MoreEqual, 0); }
		public TerminalNode Less() { return getToken(RelScriptParser.Less, 0); }
		public TerminalNode More() { return getToken(RelScriptParser.More, 0); }
		public TerminalNode Equal() { return getToken(RelScriptParser.Equal, 0); }
		public BinarySignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarySign; }
	}

	public final BinarySignContext binarySign() throws RecognitionException {
		BinarySignContext _localctx = new BinarySignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binarySign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Divide) | (1L << Less) | (1L << Equal) | (1L << More) | (1L << LessEqual) | (1L << MoreEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InBracesExpressionContext extends ParserRuleContext {
		public InCurlyExpressionContext inCurlyExpression() {
			return getRuleContext(InCurlyExpressionContext.class,0);
		}
		public InSquareExpressionContext inSquareExpression() {
			return getRuleContext(InSquareExpressionContext.class,0);
		}
		public InParenExpressionContext inParenExpression() {
			return getRuleContext(InParenExpressionContext.class,0);
		}
		public InBracesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBracesExpression; }
	}

	public final InBracesExpressionContext inBracesExpression() throws RecognitionException {
		InBracesExpressionContext _localctx = new InBracesExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inBracesExpression);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCurly:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				inCurlyExpression();
				}
				break;
			case LSquare:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				inSquareExpression();
				}
				break;
			case LParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				inParenExpression();
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

	public static class InCurlyExpressionContext extends ParserRuleContext {
		public TerminalNode LCurly() { return getToken(RelScriptParser.LCurly, 0); }
		public ExpressionInsideBracesContext expressionInsideBraces() {
			return getRuleContext(ExpressionInsideBracesContext.class,0);
		}
		public TerminalNode RCurly() { return getToken(RelScriptParser.RCurly, 0); }
		public InCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inCurlyExpression; }
	}

	public final InCurlyExpressionContext inCurlyExpression() throws RecognitionException {
		InCurlyExpressionContext _localctx = new InCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inCurlyExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LCurly);
			setState(155);
			expressionInsideBraces();
			setState(156);
			match(RCurly);
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

	public static class InSquareExpressionContext extends ParserRuleContext {
		public TerminalNode LSquare() { return getToken(RelScriptParser.LSquare, 0); }
		public ExpressionInsideBracesContext expressionInsideBraces() {
			return getRuleContext(ExpressionInsideBracesContext.class,0);
		}
		public TerminalNode RSquare() { return getToken(RelScriptParser.RSquare, 0); }
		public InSquareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inSquareExpression; }
	}

	public final InSquareExpressionContext inSquareExpression() throws RecognitionException {
		InSquareExpressionContext _localctx = new InSquareExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inSquareExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LSquare);
			setState(159);
			expressionInsideBraces();
			setState(160);
			match(RSquare);
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

	public static class InParenExpressionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public ExpressionInsideBracesContext expressionInsideBraces() {
			return getRuleContext(ExpressionInsideBracesContext.class,0);
		}
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public InParenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inParenExpression; }
	}

	public final InParenExpressionContext inParenExpression() throws RecognitionException {
		InParenExpressionContext _localctx = new InParenExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inParenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LParen);
			setState(163);
			expressionInsideBraces();
			setState(164);
			match(RParen);
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

	public static class ExpressionInsideBracesContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(RelScriptParser.Comma, 0); }
		public ExpressionInsideBracesContext expressionInsideBraces() {
			return getRuleContext(ExpressionInsideBracesContext.class,0);
		}
		public ExpressionInsideBracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionInsideBraces; }
	}

	public final ExpressionInsideBracesContext expressionInsideBraces() throws RecognitionException {
		ExpressionInsideBracesContext _localctx = new ExpressionInsideBracesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionInsideBraces);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				expression();
				setState(168);
				match(Comma);
				setState(169);
				expressionInsideBraces();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public FunctionDeclarationBracesContext functionDeclarationBraces() {
			return getRuleContext(FunctionDeclarationBracesContext.class,0);
		}
		public TerminalNode BlockStart() { return getToken(RelScriptParser.BlockStart, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			type();
			setState(174);
			match(ID);
			setState(175);
			functionDeclarationBraces();
			setState(176);
			match(BlockStart);
			setState(177);
			match(NEWLINE);
			setState(178);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(RelScriptParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(RelScriptParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(INDENT);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord) | (1L << While) | (1L << For) | (1L << Switch) | (1L << If) | (1L << ID))) != 0)) {
				{
				{
				setState(181);
				statement();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(187);
				returnExpression();
				}
			}

			setState(190);
			match(DEDENT);
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(RelScriptParser.Return, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Return);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParen) | (1L << LCurly) | (1L << LSquare) | (1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord) | (1L << ID) | (1L << IntNumber) | (1L << FloatNumber) | (1L << StringLiteral))) != 0)) {
				{
				setState(193);
				expression();
				}
			}

			setState(196);
			match(NEWLINE);
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

	public static class FunctionDeclarationBracesContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public FunctionDeclarationArgsContext functionDeclarationArgs() {
			return getRuleContext(FunctionDeclarationArgsContext.class,0);
		}
		public FunctionDeclarationBracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationBraces; }
	}

	public final FunctionDeclarationBracesContext functionDeclarationBraces() throws RecognitionException {
		FunctionDeclarationBracesContext _localctx = new FunctionDeclarationBracesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDeclarationBraces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(LParen);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord))) != 0)) {
				{
				setState(199);
				functionDeclarationArgs();
				}
			}

			setState(202);
			match(RParen);
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

	public static class FunctionDeclarationArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public TerminalNode Comma() { return getToken(RelScriptParser.Comma, 0); }
		public FunctionDeclarationArgsContext functionDeclarationArgs() {
			return getRuleContext(FunctionDeclarationArgsContext.class,0);
		}
		public FunctionDeclarationArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationArgs; }
	}

	public final FunctionDeclarationArgsContext functionDeclarationArgs() throws RecognitionException {
		FunctionDeclarationArgsContext _localctx = new FunctionDeclarationArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDeclarationArgs);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				type();
				setState(205);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				type();
				setState(208);
				match(ID);
				setState(209);
				match(Comma);
				setState(210);
				functionDeclarationArgs();
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

	public static class FunctionUsageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public InParenExpressionContext inParenExpression() {
			return getRuleContext(InParenExpressionContext.class,0);
		}
		public FunctionUsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionUsage; }
	}

	public final FunctionUsageContext functionUsage() throws RecognitionException {
		FunctionUsageContext _localctx = new FunctionUsageContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionUsage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(215);
				match(LParen);
				setState(216);
				match(RParen);
				}
				break;
			case 2:
				{
				setState(217);
				inParenExpression();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TableType() { return getToken(RelScriptParser.TableType, 0); }
		public TerminalNode ColumnTupe() { return getToken(RelScriptParser.ColumnTupe, 0); }
		public TerminalNode RowType() { return getToken(RelScriptParser.RowType, 0); }
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public TerminalNode NumberType() { return getToken(RelScriptParser.NumberType, 0); }
		public TerminalNode TupleType() { return getToken(RelScriptParser.TupleType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TableType:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(TableType);
				}
				break;
			case ColumnTupe:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(ColumnTupe);
				}
				break;
			case RowType:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(RowType);
				}
				break;
			case StringWord:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				stringType();
				}
				break;
			case NumberType:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(NumberType);
				}
				break;
			case TupleType:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(TupleType);
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

	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode StringWord() { return getToken(RelScriptParser.StringWord, 0); }
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public TerminalNode IntNumber() { return getToken(RelScriptParser.IntNumber, 0); }
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(StringWord);
			setState(229);
			match(LParen);
			setState(230);
			match(IntNumber);
			setState(231);
			match(RParen);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(RelScriptParser.While, 0); }
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public TerminalNode BlockStart() { return getToken(RelScriptParser.BlockStart, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(While);
			setState(234);
			match(LParen);
			setState(235);
			logicExpression();
			setState(236);
			match(RParen);
			setState(237);
			match(BlockStart);
			setState(238);
			match(NEWLINE);
			setState(239);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(RelScriptParser.For, 0); }
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public List<TerminalNode> Semi() { return getTokens(RelScriptParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(RelScriptParser.Semi, i);
		}
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public TerminalNode BlockStart() { return getToken(RelScriptParser.BlockStart, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignExpressionContext> assignExpression() {
			return getRuleContexts(AssignExpressionContext.class);
		}
		public AssignExpressionContext assignExpression(int i) {
			return getRuleContext(AssignExpressionContext.class,i);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(For);
			setState(242);
			match(LParen);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord) | (1L << ID))) != 0)) {
				{
				setState(243);
				assignExpression();
				}
			}

			setState(246);
			match(Semi);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParen) | (1L << LCurly) | (1L << LSquare) | (1L << ID) | (1L << IntNumber) | (1L << FloatNumber) | (1L << StringLiteral))) != 0)) {
				{
				setState(247);
				logicExpression();
				}
			}

			setState(250);
			match(Semi);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << TableType) | (1L << ColumnTupe) | (1L << RowType) | (1L << NumberType) | (1L << TupleType) | (1L << StringWord) | (1L << ID))) != 0)) {
				{
				setState(251);
				assignExpression();
				}
			}

			setState(254);
			match(RParen);
			setState(255);
			match(BlockStart);
			setState(256);
			match(NEWLINE);
			setState(257);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(RelScriptParser.Switch, 0); }
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public TerminalNode ID() { return getToken(RelScriptParser.ID, 0); }
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public TerminalNode BlockStart() { return getToken(RelScriptParser.BlockStart, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(RelScriptParser.INDENT, 0); }
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(RelScriptParser.DEDENT, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(Switch);
			setState(260);
			match(LParen);
			setState(261);
			match(ID);
			setState(262);
			match(RParen);
			setState(263);
			match(BlockStart);
			setState(264);
			match(NEWLINE);
			setState(265);
			match(INDENT);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(266);
				caseStatement();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			defaultStatement();
			setState(273);
			match(DEDENT);
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(RelScriptParser.Case, 0); }
		public TerminalNode BlockStart() { return getToken(RelScriptParser.BlockStart, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(RelScriptParser.StringLiteral, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(Case);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(276);
				match(StringLiteral);
				}
				break;
			case IntNumber:
			case FloatNumber:
				{
				setState(277);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(BlockStart);
			setState(281);
			match(NEWLINE);
			setState(282);
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

	public static class DefaultStatementContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(RelScriptParser.Default, 0); }
		public TerminalNode BlockStart() { return getToken(RelScriptParser.BlockStart, 0); }
		public TerminalNode NEWLINE() { return getToken(RelScriptParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Default);
			setState(285);
			match(BlockStart);
			setState(286);
			match(NEWLINE);
			setState(287);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(RelScriptParser.If, 0); }
		public TerminalNode LParen() { return getToken(RelScriptParser.LParen, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(RelScriptParser.RParen, 0); }
		public List<TerminalNode> BlockStart() { return getTokens(RelScriptParser.BlockStart); }
		public TerminalNode BlockStart(int i) {
			return getToken(RelScriptParser.BlockStart, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RelScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RelScriptParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(RelScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(If);
			setState(290);
			match(LParen);
			setState(291);
			logicExpression();
			setState(292);
			match(RParen);
			setState(293);
			match(BlockStart);
			setState(294);
			match(NEWLINE);
			setState(295);
			block();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(296);
				match(Else);
				setState(297);
				match(BlockStart);
				setState(298);
				match(NEWLINE);
				setState(299);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\5\3"+
		"Q\n\3\3\4\3\4\5\4U\n\4\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\5\5\5^\n\5\3\5\5\5"+
		"a\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0094\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00ae\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22"+
		"\u00b9\n\22\f\22\16\22\u00bc\13\22\3\22\5\22\u00bf\n\22\3\22\3\22\3\23"+
		"\3\23\5\23\u00c5\n\23\3\23\3\23\3\24\3\24\5\24\u00cb\n\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d7\n\25\3\26\3\26\3\26"+
		"\3\26\5\26\u00dd\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e5\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\5\32\u00f7\n\32\3\32\3\32\5\32\u00fb\n\32\3\32\3\32\5\32\u00ff"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u010e\n\33\f\33\16\33\u0111\13\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u0119\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u012f\n\36\3\36\2\2"+
		"\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\4"+
		"\3\2+,\4\2\31\33\35!\2\u0145\2@\3\2\2\2\4M\3\2\2\2\6T\3\2\2\2\b]\3\2\2"+
		"\2\nf\3\2\2\2\fn\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0088\3\2\2\2\24\u0095"+
		"\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a0\3\2\2\2\34\u00a4\3"+
		"\2\2\2\36\u00ad\3\2\2\2 \u00af\3\2\2\2\"\u00b6\3\2\2\2$\u00c2\3\2\2\2"+
		"&\u00c8\3\2\2\2(\u00d6\3\2\2\2*\u00d8\3\2\2\2,\u00e4\3\2\2\2.\u00e6\3"+
		"\2\2\2\60\u00eb\3\2\2\2\62\u00f3\3\2\2\2\64\u0105\3\2\2\2\66\u0115\3\2"+
		"\2\28\u011e\3\2\2\2:\u0123\3\2\2\2<?\7/\2\2=?\5\4\3\2><\3\2\2\2>=\3\2"+
		"\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\2\2\3D\3\3"+
		"\2\2\2EN\5\b\5\2FN\5 \21\2GN\5*\26\2HN\5\6\4\2IN\5\60\31\2JN\5\62\32\2"+
		"KN\5\64\33\2LN\5:\36\2ME\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2"+
		"\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NP\3\2\2\2OQ\7/\2\2PO\3\2\2\2PQ\3\2\2"+
		"\2Q\5\3\2\2\2RU\7*\2\2SU\5*\26\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VW\7\13"+
		"\2\2WY\5*\26\2XV\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3\2\2\2\\^\7"+
		"\22\2\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5,\27\2`_\3\2\2\2`a\3\2\2\2a"+
		"b\3\2\2\2bc\7*\2\2cd\7\5\2\2de\5\16\b\2e\t\3\2\2\2fg\t\2\2\2g\13\3\2\2"+
		"\2ho\7*\2\2io\5\n\6\2jo\7-\2\2ko\5*\26\2lo\5\6\4\2mo\5\26\f\2nh\3\2\2"+
		"\2ni\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\r\3\2\2\2pw\5\20"+
		"\t\2qr\7\31\2\2rv\5\20\t\2st\7\32\2\2tv\5\20\t\2uq\3\2\2\2us\3\2\2\2v"+
		"y\3\2\2\2wu\3\2\2\2wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z}\5\22\n\2{}\5,\27\2"+
		"|p\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\17\3\2\2\2~\u0085\5\f\7\2\177\u0080\7"+
		"\34\2\2\u0080\u0084\5\f\7\2\u0081\u0082\7\33\2\2\u0082\u0084\5\f\7\2\u0083"+
		"\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0093"+
		"\5\f\7\2\u0089\u008a\7\36\2\2\u008a\u0094\5\f\7\2\u008b\u008c\7\37\2\2"+
		"\u008c\u0094\5\f\7\2\u008d\u008e\7\35\2\2\u008e\u0094\5\f\7\2\u008f\u0090"+
		"\7!\2\2\u0090\u0094\5\f\7\2\u0091\u0092\7 \2\2\u0092\u0094\5\f\7\2\u0093"+
		"\u0089\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096"+
		"\t\3\2\2\u0096\25\3\2\2\2\u0097\u009b\5\30\r\2\u0098\u009b\5\32\16\2\u0099"+
		"\u009b\5\34\17\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3"+
		"\2\2\2\u009b\27\3\2\2\2\u009c\u009d\7\16\2\2\u009d\u009e\5\36\20\2\u009e"+
		"\u009f\7\17\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\5\36"+
		"\20\2\u00a2\u00a3\7\21\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\7\r\2\2\u00a7\35\3\2\2\2\u00a8\u00ae\5\16"+
		"\b\2\u00a9\u00aa\5\16\b\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5\36\20\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\37\3\2\2"+
		"\2\u00af\u00b0\5,\27\2\u00b0\u00b1\7*\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3"+
		"\7\n\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\5\"\22\2\u00b5!\3\2\2\2\u00b6"+
		"\u00ba\7\3\2\2\u00b7\u00b9\5\4\3\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00bf\5$\23\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1#\3\2\2\2\u00c2\u00c4"+
		"\7\t\2\2\u00c3\u00c5\5\16\b\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7%\3\2\2\2\u00c8\u00ca\7\f"+
		"\2\2\u00c9\u00cb\5(\25\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\r\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\5,\27\2"+
		"\u00cf\u00d0\7*\2\2\u00d0\u00d7\3\2\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3"+
		"\7*\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7)\3\2\2\2\u00d8\u00dc\7*\2\2\u00d9"+
		"\u00da\7\f\2\2\u00da\u00dd\7\r\2\2\u00db\u00dd\5\34\17\2\u00dc\u00d9\3"+
		"\2\2\2\u00dc\u00db\3\2\2\2\u00dd+\3\2\2\2\u00de\u00e5\7\23\2\2\u00df\u00e5"+
		"\7\24\2\2\u00e0\u00e5\7\25\2\2\u00e1\u00e5\5.\30\2\u00e2\u00e5\7\26\2"+
		"\2\u00e3\u00e5\7\27\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5-\3\2\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9"+
		"\7+\2\2\u00e9\u00ea\7\r\2\2\u00ea/\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00ed"+
		"\7\f\2\2\u00ed\u00ee\5\22\n\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\7\n\2\2"+
		"\u00f0\u00f1\7/\2\2\u00f1\u00f2\5\"\22\2\u00f2\61\3\2\2\2\u00f3\u00f4"+
		"\7#\2\2\u00f4\u00f6\7\f\2\2\u00f5\u00f7\5\b\5\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7\7\2\2\u00f9\u00fb\5\22"+
		"\n\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\7\7\2\2\u00fd\u00ff\5\b\5\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\r\2\2\u0101\u0102\7\n\2\2\u0102"+
		"\u0103\7/\2\2\u0103\u0104\5\"\22\2\u0104\63\3\2\2\2\u0105\u0106\7$\2\2"+
		"\u0106\u0107\7\f\2\2\u0107\u0108\7*\2\2\u0108\u0109\7\r\2\2\u0109\u010a"+
		"\7\n\2\2\u010a\u010b\7/\2\2\u010b\u010f\7\3\2\2\u010c\u010e\5\66\34\2"+
		"\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\58\35\2\u0113"+
		"\u0114\7\4\2\2\u0114\65\3\2\2\2\u0115\u0118\7%\2\2\u0116\u0119\7-\2\2"+
		"\u0117\u0119\5\n\6\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\7\n\2\2\u011b\u011c\7/\2\2\u011c\u011d\5\"\22\2\u011d"+
		"\67\3\2\2\2\u011e\u011f\7&\2\2\u011f\u0120\7\n\2\2\u0120\u0121\7/\2\2"+
		"\u0121\u0122\5\"\22\2\u01229\3\2\2\2\u0123\u0124\7\'\2\2\u0124\u0125\7"+
		"\f\2\2\u0125\u0126\5\22\n\2\u0126\u0127\7\r\2\2\u0127\u0128\7\n\2\2\u0128"+
		"\u0129\7/\2\2\u0129\u012e\5\"\22\2\u012a\u012b\7(\2\2\u012b\u012c\7\n"+
		"\2\2\u012c\u012d\7/\2\2\u012d\u012f\5\"\22\2\u012e\u012a\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f;\3\2\2\2 >@MPTZ]`nuw|\u0083\u0085\u0093\u009a\u00ad"+
		"\u00ba\u00be\u00c4\u00ca\u00d6\u00dc\u00e4\u00f6\u00fa\u00fe\u010f\u0118"+
		"\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}