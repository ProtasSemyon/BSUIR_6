
// Generated from /home/smn/BSUIR_6/YAPIS/2/RelScriptParser.g4 by ANTLR 4.9.2



#include "RelScriptParser.h"


using namespace antlrcpp;
using namespace antlr4;

RelScriptParser::RelScriptParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

RelScriptParser::~RelScriptParser() {
  delete _interpreter;
}

std::string RelScriptParser::getGrammarFileName() const {
  return "RelScriptParser.g4";
}

const std::vector<std::string>& RelScriptParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& RelScriptParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgramContext ------------------------------------------------------------------

RelScriptParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::ProgramContext::EOF() {
  return getToken(RelScriptParser::EOF, 0);
}

std::vector<tree::TerminalNode *> RelScriptParser::ProgramContext::NEWLINE() {
  return getTokens(RelScriptParser::NEWLINE);
}

tree::TerminalNode* RelScriptParser::ProgramContext::NEWLINE(size_t i) {
  return getToken(RelScriptParser::NEWLINE, i);
}

std::vector<RelScriptParser::StatementContext *> RelScriptParser::ProgramContext::statement() {
  return getRuleContexts<RelScriptParser::StatementContext>();
}

RelScriptParser::StatementContext* RelScriptParser::ProgramContext::statement(size_t i) {
  return getRuleContext<RelScriptParser::StatementContext>(i);
}


size_t RelScriptParser::ProgramContext::getRuleIndex() const {
  return RelScriptParser::RuleProgram;
}


RelScriptParser::ProgramContext* RelScriptParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 0, RelScriptParser::RuleProgram);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(62);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::Const)
      | (1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord)
      | (1ULL << RelScriptParser::While)
      | (1ULL << RelScriptParser::For)
      | (1ULL << RelScriptParser::Switch)
      | (1ULL << RelScriptParser::If)
      | (1ULL << RelScriptParser::ID)
      | (1ULL << RelScriptParser::NEWLINE))) != 0)) {
      setState(60);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case RelScriptParser::NEWLINE: {
          setState(58);
          match(RelScriptParser::NEWLINE);
          break;
        }

        case RelScriptParser::Const:
        case RelScriptParser::TableType:
        case RelScriptParser::ColumnTupe:
        case RelScriptParser::RowType:
        case RelScriptParser::NumberType:
        case RelScriptParser::TupleType:
        case RelScriptParser::StringWord:
        case RelScriptParser::While:
        case RelScriptParser::For:
        case RelScriptParser::Switch:
        case RelScriptParser::If:
        case RelScriptParser::ID: {
          setState(59);
          statement();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(64);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(65);
    match(RelScriptParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

RelScriptParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

RelScriptParser::AssignExpressionContext* RelScriptParser::StatementContext::assignExpression() {
  return getRuleContext<RelScriptParser::AssignExpressionContext>(0);
}

RelScriptParser::FunctionDeclarationContext* RelScriptParser::StatementContext::functionDeclaration() {
  return getRuleContext<RelScriptParser::FunctionDeclarationContext>(0);
}

RelScriptParser::FunctionUsageContext* RelScriptParser::StatementContext::functionUsage() {
  return getRuleContext<RelScriptParser::FunctionUsageContext>(0);
}

RelScriptParser::MethodUsageContext* RelScriptParser::StatementContext::methodUsage() {
  return getRuleContext<RelScriptParser::MethodUsageContext>(0);
}

RelScriptParser::WhileStatementContext* RelScriptParser::StatementContext::whileStatement() {
  return getRuleContext<RelScriptParser::WhileStatementContext>(0);
}

RelScriptParser::ForStatementContext* RelScriptParser::StatementContext::forStatement() {
  return getRuleContext<RelScriptParser::ForStatementContext>(0);
}

RelScriptParser::SwitchStatementContext* RelScriptParser::StatementContext::switchStatement() {
  return getRuleContext<RelScriptParser::SwitchStatementContext>(0);
}

RelScriptParser::IfStatementContext* RelScriptParser::StatementContext::ifStatement() {
  return getRuleContext<RelScriptParser::IfStatementContext>(0);
}

tree::TerminalNode* RelScriptParser::StatementContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}


size_t RelScriptParser::StatementContext::getRuleIndex() const {
  return RelScriptParser::RuleStatement;
}


RelScriptParser::StatementContext* RelScriptParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 2, RelScriptParser::RuleStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(75);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(67);
      assignExpression();
      break;
    }

    case 2: {
      setState(68);
      functionDeclaration();
      break;
    }

    case 3: {
      setState(69);
      functionUsage();
      break;
    }

    case 4: {
      setState(70);
      methodUsage();
      break;
    }

    case 5: {
      setState(71);
      whileStatement();
      break;
    }

    case 6: {
      setState(72);
      forStatement();
      break;
    }

    case 7: {
      setState(73);
      switchStatement();
      break;
    }

    case 8: {
      setState(74);
      ifStatement();
      break;
    }

    default:
      break;
    }
    setState(78);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
    case 1: {
      setState(77);
      match(RelScriptParser::NEWLINE);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodUsageContext ------------------------------------------------------------------

RelScriptParser::MethodUsageContext::MethodUsageContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::MethodUsageContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

std::vector<RelScriptParser::FunctionUsageContext *> RelScriptParser::MethodUsageContext::functionUsage() {
  return getRuleContexts<RelScriptParser::FunctionUsageContext>();
}

RelScriptParser::FunctionUsageContext* RelScriptParser::MethodUsageContext::functionUsage(size_t i) {
  return getRuleContext<RelScriptParser::FunctionUsageContext>(i);
}

std::vector<tree::TerminalNode *> RelScriptParser::MethodUsageContext::Point() {
  return getTokens(RelScriptParser::Point);
}

tree::TerminalNode* RelScriptParser::MethodUsageContext::Point(size_t i) {
  return getToken(RelScriptParser::Point, i);
}


size_t RelScriptParser::MethodUsageContext::getRuleIndex() const {
  return RelScriptParser::RuleMethodUsage;
}


RelScriptParser::MethodUsageContext* RelScriptParser::methodUsage() {
  MethodUsageContext *_localctx = _tracker.createInstance<MethodUsageContext>(_ctx, getState());
  enterRule(_localctx, 4, RelScriptParser::RuleMethodUsage);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(82);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      setState(80);
      match(RelScriptParser::ID);
      break;
    }

    case 2: {
      setState(81);
      functionUsage();
      break;
    }

    default:
      break;
    }
    setState(86); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(84);
      match(RelScriptParser::Point);
      setState(85);
      functionUsage();
      setState(88); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == RelScriptParser::Point);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignExpressionContext ------------------------------------------------------------------

RelScriptParser::AssignExpressionContext::AssignExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::AssignExpressionContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

tree::TerminalNode* RelScriptParser::AssignExpressionContext::Assign() {
  return getToken(RelScriptParser::Assign, 0);
}

RelScriptParser::ExpressionContext* RelScriptParser::AssignExpressionContext::expression() {
  return getRuleContext<RelScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* RelScriptParser::AssignExpressionContext::Const() {
  return getToken(RelScriptParser::Const, 0);
}

RelScriptParser::TypeContext* RelScriptParser::AssignExpressionContext::type() {
  return getRuleContext<RelScriptParser::TypeContext>(0);
}


size_t RelScriptParser::AssignExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleAssignExpression;
}


RelScriptParser::AssignExpressionContext* RelScriptParser::assignExpression() {
  AssignExpressionContext *_localctx = _tracker.createInstance<AssignExpressionContext>(_ctx, getState());
  enterRule(_localctx, 6, RelScriptParser::RuleAssignExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(91);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == RelScriptParser::Const) {
      setState(90);
      match(RelScriptParser::Const);
    }
    setState(94);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord))) != 0)) {
      setState(93);
      type();
    }
    setState(96);
    match(RelScriptParser::ID);
    setState(97);
    match(RelScriptParser::Assign);
    setState(98);
    expression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NumberContext ------------------------------------------------------------------

RelScriptParser::NumberContext::NumberContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::NumberContext::IntNumber() {
  return getToken(RelScriptParser::IntNumber, 0);
}

tree::TerminalNode* RelScriptParser::NumberContext::FloatNumber() {
  return getToken(RelScriptParser::FloatNumber, 0);
}


size_t RelScriptParser::NumberContext::getRuleIndex() const {
  return RelScriptParser::RuleNumber;
}


RelScriptParser::NumberContext* RelScriptParser::number() {
  NumberContext *_localctx = _tracker.createInstance<NumberContext>(_ctx, getState());
  enterRule(_localctx, 8, RelScriptParser::RuleNumber);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(100);
    _la = _input->LA(1);
    if (!(_la == RelScriptParser::IntNumber

    || _la == RelScriptParser::FloatNumber)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AtomContext ------------------------------------------------------------------

RelScriptParser::AtomContext::AtomContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::AtomContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

RelScriptParser::NumberContext* RelScriptParser::AtomContext::number() {
  return getRuleContext<RelScriptParser::NumberContext>(0);
}

tree::TerminalNode* RelScriptParser::AtomContext::StringLiteral() {
  return getToken(RelScriptParser::StringLiteral, 0);
}

RelScriptParser::FunctionUsageContext* RelScriptParser::AtomContext::functionUsage() {
  return getRuleContext<RelScriptParser::FunctionUsageContext>(0);
}

RelScriptParser::MethodUsageContext* RelScriptParser::AtomContext::methodUsage() {
  return getRuleContext<RelScriptParser::MethodUsageContext>(0);
}

RelScriptParser::InBracesExpressionContext* RelScriptParser::AtomContext::inBracesExpression() {
  return getRuleContext<RelScriptParser::InBracesExpressionContext>(0);
}


size_t RelScriptParser::AtomContext::getRuleIndex() const {
  return RelScriptParser::RuleAtom;
}


RelScriptParser::AtomContext* RelScriptParser::atom() {
  AtomContext *_localctx = _tracker.createInstance<AtomContext>(_ctx, getState());
  enterRule(_localctx, 10, RelScriptParser::RuleAtom);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(108);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(102);
      match(RelScriptParser::ID);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(103);
      number();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(104);
      match(RelScriptParser::StringLiteral);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(105);
      functionUsage();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(106);
      methodUsage();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(107);
      inBracesExpression();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

RelScriptParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<RelScriptParser::MulExpressionContext *> RelScriptParser::ExpressionContext::mulExpression() {
  return getRuleContexts<RelScriptParser::MulExpressionContext>();
}

RelScriptParser::MulExpressionContext* RelScriptParser::ExpressionContext::mulExpression(size_t i) {
  return getRuleContext<RelScriptParser::MulExpressionContext>(i);
}

std::vector<tree::TerminalNode *> RelScriptParser::ExpressionContext::Plus() {
  return getTokens(RelScriptParser::Plus);
}

tree::TerminalNode* RelScriptParser::ExpressionContext::Plus(size_t i) {
  return getToken(RelScriptParser::Plus, i);
}

std::vector<tree::TerminalNode *> RelScriptParser::ExpressionContext::Minus() {
  return getTokens(RelScriptParser::Minus);
}

tree::TerminalNode* RelScriptParser::ExpressionContext::Minus(size_t i) {
  return getToken(RelScriptParser::Minus, i);
}

RelScriptParser::LogicExpressionContext* RelScriptParser::ExpressionContext::logicExpression() {
  return getRuleContext<RelScriptParser::LogicExpressionContext>(0);
}

RelScriptParser::TypeContext* RelScriptParser::ExpressionContext::type() {
  return getRuleContext<RelScriptParser::TypeContext>(0);
}


size_t RelScriptParser::ExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleExpression;
}


RelScriptParser::ExpressionContext* RelScriptParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 12, RelScriptParser::RuleExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(122);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(110);
      mulExpression();
      setState(117);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == RelScriptParser::Plus

      || _la == RelScriptParser::Minus) {
        setState(115);
        _errHandler->sync(this);
        switch (_input->LA(1)) {
          case RelScriptParser::Plus: {
            setState(111);
            match(RelScriptParser::Plus);
            setState(112);
            mulExpression();
            break;
          }

          case RelScriptParser::Minus: {
            setState(113);
            match(RelScriptParser::Minus);
            setState(114);
            mulExpression();
            break;
          }

        default:
          throw NoViableAltException(this);
        }
        setState(119);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(120);
      logicExpression();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(121);
      type();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MulExpressionContext ------------------------------------------------------------------

RelScriptParser::MulExpressionContext::MulExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<RelScriptParser::AtomContext *> RelScriptParser::MulExpressionContext::atom() {
  return getRuleContexts<RelScriptParser::AtomContext>();
}

RelScriptParser::AtomContext* RelScriptParser::MulExpressionContext::atom(size_t i) {
  return getRuleContext<RelScriptParser::AtomContext>(i);
}

std::vector<tree::TerminalNode *> RelScriptParser::MulExpressionContext::Multiplication() {
  return getTokens(RelScriptParser::Multiplication);
}

tree::TerminalNode* RelScriptParser::MulExpressionContext::Multiplication(size_t i) {
  return getToken(RelScriptParser::Multiplication, i);
}

std::vector<tree::TerminalNode *> RelScriptParser::MulExpressionContext::Divide() {
  return getTokens(RelScriptParser::Divide);
}

tree::TerminalNode* RelScriptParser::MulExpressionContext::Divide(size_t i) {
  return getToken(RelScriptParser::Divide, i);
}


size_t RelScriptParser::MulExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleMulExpression;
}


RelScriptParser::MulExpressionContext* RelScriptParser::mulExpression() {
  MulExpressionContext *_localctx = _tracker.createInstance<MulExpressionContext>(_ctx, getState());
  enterRule(_localctx, 14, RelScriptParser::RuleMulExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(124);
    atom();
    setState(131);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == RelScriptParser::Divide

    || _la == RelScriptParser::Multiplication) {
      setState(129);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case RelScriptParser::Multiplication: {
          setState(125);
          match(RelScriptParser::Multiplication);
          setState(126);
          atom();
          break;
        }

        case RelScriptParser::Divide: {
          setState(127);
          match(RelScriptParser::Divide);
          setState(128);
          atom();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(133);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LogicExpressionContext ------------------------------------------------------------------

RelScriptParser::LogicExpressionContext::LogicExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<RelScriptParser::AtomContext *> RelScriptParser::LogicExpressionContext::atom() {
  return getRuleContexts<RelScriptParser::AtomContext>();
}

RelScriptParser::AtomContext* RelScriptParser::LogicExpressionContext::atom(size_t i) {
  return getRuleContext<RelScriptParser::AtomContext>(i);
}

tree::TerminalNode* RelScriptParser::LogicExpressionContext::Equal() {
  return getToken(RelScriptParser::Equal, 0);
}

tree::TerminalNode* RelScriptParser::LogicExpressionContext::More() {
  return getToken(RelScriptParser::More, 0);
}

tree::TerminalNode* RelScriptParser::LogicExpressionContext::Less() {
  return getToken(RelScriptParser::Less, 0);
}

tree::TerminalNode* RelScriptParser::LogicExpressionContext::MoreEqual() {
  return getToken(RelScriptParser::MoreEqual, 0);
}

tree::TerminalNode* RelScriptParser::LogicExpressionContext::LessEqual() {
  return getToken(RelScriptParser::LessEqual, 0);
}


size_t RelScriptParser::LogicExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleLogicExpression;
}


RelScriptParser::LogicExpressionContext* RelScriptParser::logicExpression() {
  LogicExpressionContext *_localctx = _tracker.createInstance<LogicExpressionContext>(_ctx, getState());
  enterRule(_localctx, 16, RelScriptParser::RuleLogicExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(134);
    atom();
    setState(145);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case RelScriptParser::Equal: {
        setState(135);
        match(RelScriptParser::Equal);
        setState(136);
        atom();
        break;
      }

      case RelScriptParser::More: {
        setState(137);
        match(RelScriptParser::More);
        setState(138);
        atom();
        break;
      }

      case RelScriptParser::Less: {
        setState(139);
        match(RelScriptParser::Less);
        setState(140);
        atom();
        break;
      }

      case RelScriptParser::MoreEqual: {
        setState(141);
        match(RelScriptParser::MoreEqual);
        setState(142);
        atom();
        break;
      }

      case RelScriptParser::LessEqual: {
        setState(143);
        match(RelScriptParser::LessEqual);
        setState(144);
        atom();
        break;
      }

      case RelScriptParser::EOF:
      case RelScriptParser::DEDENT:
      case RelScriptParser::Comma:
      case RelScriptParser::Semi:
      case RelScriptParser::Return:
      case RelScriptParser::RParen:
      case RelScriptParser::RCurly:
      case RelScriptParser::RSquare:
      case RelScriptParser::Const:
      case RelScriptParser::TableType:
      case RelScriptParser::ColumnTupe:
      case RelScriptParser::RowType:
      case RelScriptParser::NumberType:
      case RelScriptParser::TupleType:
      case RelScriptParser::StringWord:
      case RelScriptParser::While:
      case RelScriptParser::For:
      case RelScriptParser::Switch:
      case RelScriptParser::If:
      case RelScriptParser::ID:
      case RelScriptParser::NEWLINE: {
        break;
      }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BinarySignContext ------------------------------------------------------------------

RelScriptParser::BinarySignContext::BinarySignContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::BinarySignContext::Plus() {
  return getToken(RelScriptParser::Plus, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::Minus() {
  return getToken(RelScriptParser::Minus, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::Divide() {
  return getToken(RelScriptParser::Divide, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::LessEqual() {
  return getToken(RelScriptParser::LessEqual, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::MoreEqual() {
  return getToken(RelScriptParser::MoreEqual, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::Less() {
  return getToken(RelScriptParser::Less, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::More() {
  return getToken(RelScriptParser::More, 0);
}

tree::TerminalNode* RelScriptParser::BinarySignContext::Equal() {
  return getToken(RelScriptParser::Equal, 0);
}


size_t RelScriptParser::BinarySignContext::getRuleIndex() const {
  return RelScriptParser::RuleBinarySign;
}


RelScriptParser::BinarySignContext* RelScriptParser::binarySign() {
  BinarySignContext *_localctx = _tracker.createInstance<BinarySignContext>(_ctx, getState());
  enterRule(_localctx, 18, RelScriptParser::RuleBinarySign);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(147);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::Plus)
      | (1ULL << RelScriptParser::Minus)
      | (1ULL << RelScriptParser::Divide)
      | (1ULL << RelScriptParser::Less)
      | (1ULL << RelScriptParser::Equal)
      | (1ULL << RelScriptParser::More)
      | (1ULL << RelScriptParser::LessEqual)
      | (1ULL << RelScriptParser::MoreEqual))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InBracesExpressionContext ------------------------------------------------------------------

RelScriptParser::InBracesExpressionContext::InBracesExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

RelScriptParser::InCurlyExpressionContext* RelScriptParser::InBracesExpressionContext::inCurlyExpression() {
  return getRuleContext<RelScriptParser::InCurlyExpressionContext>(0);
}

RelScriptParser::InSquareExpressionContext* RelScriptParser::InBracesExpressionContext::inSquareExpression() {
  return getRuleContext<RelScriptParser::InSquareExpressionContext>(0);
}

RelScriptParser::InParenExpressionContext* RelScriptParser::InBracesExpressionContext::inParenExpression() {
  return getRuleContext<RelScriptParser::InParenExpressionContext>(0);
}


size_t RelScriptParser::InBracesExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleInBracesExpression;
}


RelScriptParser::InBracesExpressionContext* RelScriptParser::inBracesExpression() {
  InBracesExpressionContext *_localctx = _tracker.createInstance<InBracesExpressionContext>(_ctx, getState());
  enterRule(_localctx, 20, RelScriptParser::RuleInBracesExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(152);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case RelScriptParser::LCurly: {
        enterOuterAlt(_localctx, 1);
        setState(149);
        inCurlyExpression();
        break;
      }

      case RelScriptParser::LSquare: {
        enterOuterAlt(_localctx, 2);
        setState(150);
        inSquareExpression();
        break;
      }

      case RelScriptParser::LParen: {
        enterOuterAlt(_localctx, 3);
        setState(151);
        inParenExpression();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InCurlyExpressionContext ------------------------------------------------------------------

RelScriptParser::InCurlyExpressionContext::InCurlyExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::InCurlyExpressionContext::LCurly() {
  return getToken(RelScriptParser::LCurly, 0);
}

RelScriptParser::ExpressionInsideBracesContext* RelScriptParser::InCurlyExpressionContext::expressionInsideBraces() {
  return getRuleContext<RelScriptParser::ExpressionInsideBracesContext>(0);
}

tree::TerminalNode* RelScriptParser::InCurlyExpressionContext::RCurly() {
  return getToken(RelScriptParser::RCurly, 0);
}


size_t RelScriptParser::InCurlyExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleInCurlyExpression;
}


RelScriptParser::InCurlyExpressionContext* RelScriptParser::inCurlyExpression() {
  InCurlyExpressionContext *_localctx = _tracker.createInstance<InCurlyExpressionContext>(_ctx, getState());
  enterRule(_localctx, 22, RelScriptParser::RuleInCurlyExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(154);
    match(RelScriptParser::LCurly);
    setState(155);
    expressionInsideBraces();
    setState(156);
    match(RelScriptParser::RCurly);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InSquareExpressionContext ------------------------------------------------------------------

RelScriptParser::InSquareExpressionContext::InSquareExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::InSquareExpressionContext::LSquare() {
  return getToken(RelScriptParser::LSquare, 0);
}

RelScriptParser::ExpressionInsideBracesContext* RelScriptParser::InSquareExpressionContext::expressionInsideBraces() {
  return getRuleContext<RelScriptParser::ExpressionInsideBracesContext>(0);
}

tree::TerminalNode* RelScriptParser::InSquareExpressionContext::RSquare() {
  return getToken(RelScriptParser::RSquare, 0);
}


size_t RelScriptParser::InSquareExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleInSquareExpression;
}


RelScriptParser::InSquareExpressionContext* RelScriptParser::inSquareExpression() {
  InSquareExpressionContext *_localctx = _tracker.createInstance<InSquareExpressionContext>(_ctx, getState());
  enterRule(_localctx, 24, RelScriptParser::RuleInSquareExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(158);
    match(RelScriptParser::LSquare);
    setState(159);
    expressionInsideBraces();
    setState(160);
    match(RelScriptParser::RSquare);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InParenExpressionContext ------------------------------------------------------------------

RelScriptParser::InParenExpressionContext::InParenExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::InParenExpressionContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

RelScriptParser::ExpressionInsideBracesContext* RelScriptParser::InParenExpressionContext::expressionInsideBraces() {
  return getRuleContext<RelScriptParser::ExpressionInsideBracesContext>(0);
}

tree::TerminalNode* RelScriptParser::InParenExpressionContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}


size_t RelScriptParser::InParenExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleInParenExpression;
}


RelScriptParser::InParenExpressionContext* RelScriptParser::inParenExpression() {
  InParenExpressionContext *_localctx = _tracker.createInstance<InParenExpressionContext>(_ctx, getState());
  enterRule(_localctx, 26, RelScriptParser::RuleInParenExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(162);
    match(RelScriptParser::LParen);
    setState(163);
    expressionInsideBraces();
    setState(164);
    match(RelScriptParser::RParen);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionInsideBracesContext ------------------------------------------------------------------

RelScriptParser::ExpressionInsideBracesContext::ExpressionInsideBracesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

RelScriptParser::ExpressionContext* RelScriptParser::ExpressionInsideBracesContext::expression() {
  return getRuleContext<RelScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* RelScriptParser::ExpressionInsideBracesContext::Comma() {
  return getToken(RelScriptParser::Comma, 0);
}

RelScriptParser::ExpressionInsideBracesContext* RelScriptParser::ExpressionInsideBracesContext::expressionInsideBraces() {
  return getRuleContext<RelScriptParser::ExpressionInsideBracesContext>(0);
}


size_t RelScriptParser::ExpressionInsideBracesContext::getRuleIndex() const {
  return RelScriptParser::RuleExpressionInsideBraces;
}


RelScriptParser::ExpressionInsideBracesContext* RelScriptParser::expressionInsideBraces() {
  ExpressionInsideBracesContext *_localctx = _tracker.createInstance<ExpressionInsideBracesContext>(_ctx, getState());
  enterRule(_localctx, 28, RelScriptParser::RuleExpressionInsideBraces);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(171);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(166);
      expression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(167);
      expression();
      setState(168);
      match(RelScriptParser::Comma);
      setState(169);
      expressionInsideBraces();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDeclarationContext ------------------------------------------------------------------

RelScriptParser::FunctionDeclarationContext::FunctionDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

RelScriptParser::TypeContext* RelScriptParser::FunctionDeclarationContext::type() {
  return getRuleContext<RelScriptParser::TypeContext>(0);
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

RelScriptParser::FunctionDeclarationBracesContext* RelScriptParser::FunctionDeclarationContext::functionDeclarationBraces() {
  return getRuleContext<RelScriptParser::FunctionDeclarationBracesContext>(0);
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationContext::BlockStart() {
  return getToken(RelScriptParser::BlockStart, 0);
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

RelScriptParser::BlockContext* RelScriptParser::FunctionDeclarationContext::block() {
  return getRuleContext<RelScriptParser::BlockContext>(0);
}


size_t RelScriptParser::FunctionDeclarationContext::getRuleIndex() const {
  return RelScriptParser::RuleFunctionDeclaration;
}


RelScriptParser::FunctionDeclarationContext* RelScriptParser::functionDeclaration() {
  FunctionDeclarationContext *_localctx = _tracker.createInstance<FunctionDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 30, RelScriptParser::RuleFunctionDeclaration);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(173);
    type();
    setState(174);
    match(RelScriptParser::ID);
    setState(175);
    functionDeclarationBraces();
    setState(176);
    match(RelScriptParser::BlockStart);
    setState(177);
    match(RelScriptParser::NEWLINE);
    setState(178);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

RelScriptParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::BlockContext::INDENT() {
  return getToken(RelScriptParser::INDENT, 0);
}

tree::TerminalNode* RelScriptParser::BlockContext::DEDENT() {
  return getToken(RelScriptParser::DEDENT, 0);
}

std::vector<RelScriptParser::StatementContext *> RelScriptParser::BlockContext::statement() {
  return getRuleContexts<RelScriptParser::StatementContext>();
}

RelScriptParser::StatementContext* RelScriptParser::BlockContext::statement(size_t i) {
  return getRuleContext<RelScriptParser::StatementContext>(i);
}

RelScriptParser::ReturnExpressionContext* RelScriptParser::BlockContext::returnExpression() {
  return getRuleContext<RelScriptParser::ReturnExpressionContext>(0);
}


size_t RelScriptParser::BlockContext::getRuleIndex() const {
  return RelScriptParser::RuleBlock;
}


RelScriptParser::BlockContext* RelScriptParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 32, RelScriptParser::RuleBlock);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(180);
    match(RelScriptParser::INDENT);
    setState(184);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::Const)
      | (1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord)
      | (1ULL << RelScriptParser::While)
      | (1ULL << RelScriptParser::For)
      | (1ULL << RelScriptParser::Switch)
      | (1ULL << RelScriptParser::If)
      | (1ULL << RelScriptParser::ID))) != 0)) {
      setState(181);
      statement();
      setState(186);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(188);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == RelScriptParser::Return) {
      setState(187);
      returnExpression();
    }
    setState(190);
    match(RelScriptParser::DEDENT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ReturnExpressionContext ------------------------------------------------------------------

RelScriptParser::ReturnExpressionContext::ReturnExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::ReturnExpressionContext::Return() {
  return getToken(RelScriptParser::Return, 0);
}

tree::TerminalNode* RelScriptParser::ReturnExpressionContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

RelScriptParser::ExpressionContext* RelScriptParser::ReturnExpressionContext::expression() {
  return getRuleContext<RelScriptParser::ExpressionContext>(0);
}


size_t RelScriptParser::ReturnExpressionContext::getRuleIndex() const {
  return RelScriptParser::RuleReturnExpression;
}


RelScriptParser::ReturnExpressionContext* RelScriptParser::returnExpression() {
  ReturnExpressionContext *_localctx = _tracker.createInstance<ReturnExpressionContext>(_ctx, getState());
  enterRule(_localctx, 34, RelScriptParser::RuleReturnExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(192);
    match(RelScriptParser::Return);
    setState(194);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::LParen)
      | (1ULL << RelScriptParser::LCurly)
      | (1ULL << RelScriptParser::LSquare)
      | (1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord)
      | (1ULL << RelScriptParser::ID)
      | (1ULL << RelScriptParser::IntNumber)
      | (1ULL << RelScriptParser::FloatNumber)
      | (1ULL << RelScriptParser::StringLiteral))) != 0)) {
      setState(193);
      expression();
    }
    setState(196);
    match(RelScriptParser::NEWLINE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDeclarationBracesContext ------------------------------------------------------------------

RelScriptParser::FunctionDeclarationBracesContext::FunctionDeclarationBracesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationBracesContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationBracesContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}

RelScriptParser::FunctionDeclarationArgsContext* RelScriptParser::FunctionDeclarationBracesContext::functionDeclarationArgs() {
  return getRuleContext<RelScriptParser::FunctionDeclarationArgsContext>(0);
}


size_t RelScriptParser::FunctionDeclarationBracesContext::getRuleIndex() const {
  return RelScriptParser::RuleFunctionDeclarationBraces;
}


RelScriptParser::FunctionDeclarationBracesContext* RelScriptParser::functionDeclarationBraces() {
  FunctionDeclarationBracesContext *_localctx = _tracker.createInstance<FunctionDeclarationBracesContext>(_ctx, getState());
  enterRule(_localctx, 36, RelScriptParser::RuleFunctionDeclarationBraces);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(198);
    match(RelScriptParser::LParen);
    setState(200);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord))) != 0)) {
      setState(199);
      functionDeclarationArgs();
    }
    setState(202);
    match(RelScriptParser::RParen);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionDeclarationArgsContext ------------------------------------------------------------------

RelScriptParser::FunctionDeclarationArgsContext::FunctionDeclarationArgsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

RelScriptParser::TypeContext* RelScriptParser::FunctionDeclarationArgsContext::type() {
  return getRuleContext<RelScriptParser::TypeContext>(0);
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationArgsContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

tree::TerminalNode* RelScriptParser::FunctionDeclarationArgsContext::Comma() {
  return getToken(RelScriptParser::Comma, 0);
}

RelScriptParser::FunctionDeclarationArgsContext* RelScriptParser::FunctionDeclarationArgsContext::functionDeclarationArgs() {
  return getRuleContext<RelScriptParser::FunctionDeclarationArgsContext>(0);
}


size_t RelScriptParser::FunctionDeclarationArgsContext::getRuleIndex() const {
  return RelScriptParser::RuleFunctionDeclarationArgs;
}


RelScriptParser::FunctionDeclarationArgsContext* RelScriptParser::functionDeclarationArgs() {
  FunctionDeclarationArgsContext *_localctx = _tracker.createInstance<FunctionDeclarationArgsContext>(_ctx, getState());
  enterRule(_localctx, 38, RelScriptParser::RuleFunctionDeclarationArgs);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(212);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(204);
      type();
      setState(205);
      match(RelScriptParser::ID);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(207);
      type();
      setState(208);
      match(RelScriptParser::ID);
      setState(209);
      match(RelScriptParser::Comma);
      setState(210);
      functionDeclarationArgs();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionUsageContext ------------------------------------------------------------------

RelScriptParser::FunctionUsageContext::FunctionUsageContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::FunctionUsageContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

tree::TerminalNode* RelScriptParser::FunctionUsageContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

tree::TerminalNode* RelScriptParser::FunctionUsageContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}

RelScriptParser::InParenExpressionContext* RelScriptParser::FunctionUsageContext::inParenExpression() {
  return getRuleContext<RelScriptParser::InParenExpressionContext>(0);
}


size_t RelScriptParser::FunctionUsageContext::getRuleIndex() const {
  return RelScriptParser::RuleFunctionUsage;
}


RelScriptParser::FunctionUsageContext* RelScriptParser::functionUsage() {
  FunctionUsageContext *_localctx = _tracker.createInstance<FunctionUsageContext>(_ctx, getState());
  enterRule(_localctx, 40, RelScriptParser::RuleFunctionUsage);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(214);
    match(RelScriptParser::ID);
    setState(218);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      setState(215);
      match(RelScriptParser::LParen);
      setState(216);
      match(RelScriptParser::RParen);
      break;
    }

    case 2: {
      setState(217);
      inParenExpression();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

RelScriptParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::TypeContext::TableType() {
  return getToken(RelScriptParser::TableType, 0);
}

tree::TerminalNode* RelScriptParser::TypeContext::ColumnTupe() {
  return getToken(RelScriptParser::ColumnTupe, 0);
}

tree::TerminalNode* RelScriptParser::TypeContext::RowType() {
  return getToken(RelScriptParser::RowType, 0);
}

RelScriptParser::StringTypeContext* RelScriptParser::TypeContext::stringType() {
  return getRuleContext<RelScriptParser::StringTypeContext>(0);
}

tree::TerminalNode* RelScriptParser::TypeContext::NumberType() {
  return getToken(RelScriptParser::NumberType, 0);
}

tree::TerminalNode* RelScriptParser::TypeContext::TupleType() {
  return getToken(RelScriptParser::TupleType, 0);
}


size_t RelScriptParser::TypeContext::getRuleIndex() const {
  return RelScriptParser::RuleType;
}


RelScriptParser::TypeContext* RelScriptParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 42, RelScriptParser::RuleType);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(226);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case RelScriptParser::TableType: {
        enterOuterAlt(_localctx, 1);
        setState(220);
        match(RelScriptParser::TableType);
        break;
      }

      case RelScriptParser::ColumnTupe: {
        enterOuterAlt(_localctx, 2);
        setState(221);
        match(RelScriptParser::ColumnTupe);
        break;
      }

      case RelScriptParser::RowType: {
        enterOuterAlt(_localctx, 3);
        setState(222);
        match(RelScriptParser::RowType);
        break;
      }

      case RelScriptParser::StringWord: {
        enterOuterAlt(_localctx, 4);
        setState(223);
        stringType();
        break;
      }

      case RelScriptParser::NumberType: {
        enterOuterAlt(_localctx, 5);
        setState(224);
        match(RelScriptParser::NumberType);
        break;
      }

      case RelScriptParser::TupleType: {
        enterOuterAlt(_localctx, 6);
        setState(225);
        match(RelScriptParser::TupleType);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StringTypeContext ------------------------------------------------------------------

RelScriptParser::StringTypeContext::StringTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::StringTypeContext::StringWord() {
  return getToken(RelScriptParser::StringWord, 0);
}

tree::TerminalNode* RelScriptParser::StringTypeContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

tree::TerminalNode* RelScriptParser::StringTypeContext::IntNumber() {
  return getToken(RelScriptParser::IntNumber, 0);
}

tree::TerminalNode* RelScriptParser::StringTypeContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}


size_t RelScriptParser::StringTypeContext::getRuleIndex() const {
  return RelScriptParser::RuleStringType;
}


RelScriptParser::StringTypeContext* RelScriptParser::stringType() {
  StringTypeContext *_localctx = _tracker.createInstance<StringTypeContext>(_ctx, getState());
  enterRule(_localctx, 44, RelScriptParser::RuleStringType);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(228);
    match(RelScriptParser::StringWord);
    setState(229);
    match(RelScriptParser::LParen);
    setState(230);
    match(RelScriptParser::IntNumber);
    setState(231);
    match(RelScriptParser::RParen);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- WhileStatementContext ------------------------------------------------------------------

RelScriptParser::WhileStatementContext::WhileStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::WhileStatementContext::While() {
  return getToken(RelScriptParser::While, 0);
}

tree::TerminalNode* RelScriptParser::WhileStatementContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

RelScriptParser::LogicExpressionContext* RelScriptParser::WhileStatementContext::logicExpression() {
  return getRuleContext<RelScriptParser::LogicExpressionContext>(0);
}

tree::TerminalNode* RelScriptParser::WhileStatementContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}

tree::TerminalNode* RelScriptParser::WhileStatementContext::BlockStart() {
  return getToken(RelScriptParser::BlockStart, 0);
}

tree::TerminalNode* RelScriptParser::WhileStatementContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

RelScriptParser::BlockContext* RelScriptParser::WhileStatementContext::block() {
  return getRuleContext<RelScriptParser::BlockContext>(0);
}


size_t RelScriptParser::WhileStatementContext::getRuleIndex() const {
  return RelScriptParser::RuleWhileStatement;
}


RelScriptParser::WhileStatementContext* RelScriptParser::whileStatement() {
  WhileStatementContext *_localctx = _tracker.createInstance<WhileStatementContext>(_ctx, getState());
  enterRule(_localctx, 46, RelScriptParser::RuleWhileStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(233);
    match(RelScriptParser::While);
    setState(234);
    match(RelScriptParser::LParen);
    setState(235);
    logicExpression();
    setState(236);
    match(RelScriptParser::RParen);
    setState(237);
    match(RelScriptParser::BlockStart);
    setState(238);
    match(RelScriptParser::NEWLINE);
    setState(239);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ForStatementContext ------------------------------------------------------------------

RelScriptParser::ForStatementContext::ForStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::ForStatementContext::For() {
  return getToken(RelScriptParser::For, 0);
}

tree::TerminalNode* RelScriptParser::ForStatementContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

std::vector<tree::TerminalNode *> RelScriptParser::ForStatementContext::Semi() {
  return getTokens(RelScriptParser::Semi);
}

tree::TerminalNode* RelScriptParser::ForStatementContext::Semi(size_t i) {
  return getToken(RelScriptParser::Semi, i);
}

tree::TerminalNode* RelScriptParser::ForStatementContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}

tree::TerminalNode* RelScriptParser::ForStatementContext::BlockStart() {
  return getToken(RelScriptParser::BlockStart, 0);
}

tree::TerminalNode* RelScriptParser::ForStatementContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

RelScriptParser::BlockContext* RelScriptParser::ForStatementContext::block() {
  return getRuleContext<RelScriptParser::BlockContext>(0);
}

std::vector<RelScriptParser::AssignExpressionContext *> RelScriptParser::ForStatementContext::assignExpression() {
  return getRuleContexts<RelScriptParser::AssignExpressionContext>();
}

RelScriptParser::AssignExpressionContext* RelScriptParser::ForStatementContext::assignExpression(size_t i) {
  return getRuleContext<RelScriptParser::AssignExpressionContext>(i);
}

RelScriptParser::LogicExpressionContext* RelScriptParser::ForStatementContext::logicExpression() {
  return getRuleContext<RelScriptParser::LogicExpressionContext>(0);
}


size_t RelScriptParser::ForStatementContext::getRuleIndex() const {
  return RelScriptParser::RuleForStatement;
}


RelScriptParser::ForStatementContext* RelScriptParser::forStatement() {
  ForStatementContext *_localctx = _tracker.createInstance<ForStatementContext>(_ctx, getState());
  enterRule(_localctx, 48, RelScriptParser::RuleForStatement);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(241);
    match(RelScriptParser::For);
    setState(242);
    match(RelScriptParser::LParen);
    setState(244);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::Const)
      | (1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord)
      | (1ULL << RelScriptParser::ID))) != 0)) {
      setState(243);
      assignExpression();
    }
    setState(246);
    match(RelScriptParser::Semi);
    setState(248);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::LParen)
      | (1ULL << RelScriptParser::LCurly)
      | (1ULL << RelScriptParser::LSquare)
      | (1ULL << RelScriptParser::ID)
      | (1ULL << RelScriptParser::IntNumber)
      | (1ULL << RelScriptParser::FloatNumber)
      | (1ULL << RelScriptParser::StringLiteral))) != 0)) {
      setState(247);
      logicExpression();
    }
    setState(250);
    match(RelScriptParser::Semi);
    setState(252);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << RelScriptParser::Const)
      | (1ULL << RelScriptParser::TableType)
      | (1ULL << RelScriptParser::ColumnTupe)
      | (1ULL << RelScriptParser::RowType)
      | (1ULL << RelScriptParser::NumberType)
      | (1ULL << RelScriptParser::TupleType)
      | (1ULL << RelScriptParser::StringWord)
      | (1ULL << RelScriptParser::ID))) != 0)) {
      setState(251);
      assignExpression();
    }
    setState(254);
    match(RelScriptParser::RParen);
    setState(255);
    match(RelScriptParser::BlockStart);
    setState(256);
    match(RelScriptParser::NEWLINE);
    setState(257);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SwitchStatementContext ------------------------------------------------------------------

RelScriptParser::SwitchStatementContext::SwitchStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::Switch() {
  return getToken(RelScriptParser::Switch, 0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::ID() {
  return getToken(RelScriptParser::ID, 0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::BlockStart() {
  return getToken(RelScriptParser::BlockStart, 0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::INDENT() {
  return getToken(RelScriptParser::INDENT, 0);
}

RelScriptParser::DefaultStatementContext* RelScriptParser::SwitchStatementContext::defaultStatement() {
  return getRuleContext<RelScriptParser::DefaultStatementContext>(0);
}

tree::TerminalNode* RelScriptParser::SwitchStatementContext::DEDENT() {
  return getToken(RelScriptParser::DEDENT, 0);
}

std::vector<RelScriptParser::CaseStatementContext *> RelScriptParser::SwitchStatementContext::caseStatement() {
  return getRuleContexts<RelScriptParser::CaseStatementContext>();
}

RelScriptParser::CaseStatementContext* RelScriptParser::SwitchStatementContext::caseStatement(size_t i) {
  return getRuleContext<RelScriptParser::CaseStatementContext>(i);
}


size_t RelScriptParser::SwitchStatementContext::getRuleIndex() const {
  return RelScriptParser::RuleSwitchStatement;
}


RelScriptParser::SwitchStatementContext* RelScriptParser::switchStatement() {
  SwitchStatementContext *_localctx = _tracker.createInstance<SwitchStatementContext>(_ctx, getState());
  enterRule(_localctx, 50, RelScriptParser::RuleSwitchStatement);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(259);
    match(RelScriptParser::Switch);
    setState(260);
    match(RelScriptParser::LParen);
    setState(261);
    match(RelScriptParser::ID);
    setState(262);
    match(RelScriptParser::RParen);
    setState(263);
    match(RelScriptParser::BlockStart);
    setState(264);
    match(RelScriptParser::NEWLINE);
    setState(265);
    match(RelScriptParser::INDENT);
    setState(269);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == RelScriptParser::Case) {
      setState(266);
      caseStatement();
      setState(271);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(272);
    defaultStatement();
    setState(273);
    match(RelScriptParser::DEDENT);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CaseStatementContext ------------------------------------------------------------------

RelScriptParser::CaseStatementContext::CaseStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::CaseStatementContext::Case() {
  return getToken(RelScriptParser::Case, 0);
}

tree::TerminalNode* RelScriptParser::CaseStatementContext::BlockStart() {
  return getToken(RelScriptParser::BlockStart, 0);
}

tree::TerminalNode* RelScriptParser::CaseStatementContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

RelScriptParser::BlockContext* RelScriptParser::CaseStatementContext::block() {
  return getRuleContext<RelScriptParser::BlockContext>(0);
}

tree::TerminalNode* RelScriptParser::CaseStatementContext::StringLiteral() {
  return getToken(RelScriptParser::StringLiteral, 0);
}

RelScriptParser::NumberContext* RelScriptParser::CaseStatementContext::number() {
  return getRuleContext<RelScriptParser::NumberContext>(0);
}


size_t RelScriptParser::CaseStatementContext::getRuleIndex() const {
  return RelScriptParser::RuleCaseStatement;
}


RelScriptParser::CaseStatementContext* RelScriptParser::caseStatement() {
  CaseStatementContext *_localctx = _tracker.createInstance<CaseStatementContext>(_ctx, getState());
  enterRule(_localctx, 52, RelScriptParser::RuleCaseStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(275);
    match(RelScriptParser::Case);
    setState(278);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case RelScriptParser::StringLiteral: {
        setState(276);
        match(RelScriptParser::StringLiteral);
        break;
      }

      case RelScriptParser::IntNumber:
      case RelScriptParser::FloatNumber: {
        setState(277);
        number();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(280);
    match(RelScriptParser::BlockStart);
    setState(281);
    match(RelScriptParser::NEWLINE);
    setState(282);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DefaultStatementContext ------------------------------------------------------------------

RelScriptParser::DefaultStatementContext::DefaultStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::DefaultStatementContext::Default() {
  return getToken(RelScriptParser::Default, 0);
}

tree::TerminalNode* RelScriptParser::DefaultStatementContext::BlockStart() {
  return getToken(RelScriptParser::BlockStart, 0);
}

tree::TerminalNode* RelScriptParser::DefaultStatementContext::NEWLINE() {
  return getToken(RelScriptParser::NEWLINE, 0);
}

RelScriptParser::BlockContext* RelScriptParser::DefaultStatementContext::block() {
  return getRuleContext<RelScriptParser::BlockContext>(0);
}


size_t RelScriptParser::DefaultStatementContext::getRuleIndex() const {
  return RelScriptParser::RuleDefaultStatement;
}


RelScriptParser::DefaultStatementContext* RelScriptParser::defaultStatement() {
  DefaultStatementContext *_localctx = _tracker.createInstance<DefaultStatementContext>(_ctx, getState());
  enterRule(_localctx, 54, RelScriptParser::RuleDefaultStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(284);
    match(RelScriptParser::Default);
    setState(285);
    match(RelScriptParser::BlockStart);
    setState(286);
    match(RelScriptParser::NEWLINE);
    setState(287);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IfStatementContext ------------------------------------------------------------------

RelScriptParser::IfStatementContext::IfStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* RelScriptParser::IfStatementContext::If() {
  return getToken(RelScriptParser::If, 0);
}

tree::TerminalNode* RelScriptParser::IfStatementContext::LParen() {
  return getToken(RelScriptParser::LParen, 0);
}

RelScriptParser::LogicExpressionContext* RelScriptParser::IfStatementContext::logicExpression() {
  return getRuleContext<RelScriptParser::LogicExpressionContext>(0);
}

tree::TerminalNode* RelScriptParser::IfStatementContext::RParen() {
  return getToken(RelScriptParser::RParen, 0);
}

std::vector<tree::TerminalNode *> RelScriptParser::IfStatementContext::BlockStart() {
  return getTokens(RelScriptParser::BlockStart);
}

tree::TerminalNode* RelScriptParser::IfStatementContext::BlockStart(size_t i) {
  return getToken(RelScriptParser::BlockStart, i);
}

std::vector<tree::TerminalNode *> RelScriptParser::IfStatementContext::NEWLINE() {
  return getTokens(RelScriptParser::NEWLINE);
}

tree::TerminalNode* RelScriptParser::IfStatementContext::NEWLINE(size_t i) {
  return getToken(RelScriptParser::NEWLINE, i);
}

std::vector<RelScriptParser::BlockContext *> RelScriptParser::IfStatementContext::block() {
  return getRuleContexts<RelScriptParser::BlockContext>();
}

RelScriptParser::BlockContext* RelScriptParser::IfStatementContext::block(size_t i) {
  return getRuleContext<RelScriptParser::BlockContext>(i);
}

tree::TerminalNode* RelScriptParser::IfStatementContext::Else() {
  return getToken(RelScriptParser::Else, 0);
}


size_t RelScriptParser::IfStatementContext::getRuleIndex() const {
  return RelScriptParser::RuleIfStatement;
}


RelScriptParser::IfStatementContext* RelScriptParser::ifStatement() {
  IfStatementContext *_localctx = _tracker.createInstance<IfStatementContext>(_ctx, getState());
  enterRule(_localctx, 56, RelScriptParser::RuleIfStatement);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(289);
    match(RelScriptParser::If);
    setState(290);
    match(RelScriptParser::LParen);
    setState(291);
    logicExpression();
    setState(292);
    match(RelScriptParser::RParen);
    setState(293);
    match(RelScriptParser::BlockStart);
    setState(294);
    match(RelScriptParser::NEWLINE);
    setState(295);
    block();
    setState(300);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == RelScriptParser::Else) {
      setState(296);
      match(RelScriptParser::Else);
      setState(297);
      match(RelScriptParser::BlockStart);
      setState(298);
      match(RelScriptParser::NEWLINE);
      setState(299);
      block();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> RelScriptParser::_decisionToDFA;
atn::PredictionContextCache RelScriptParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN RelScriptParser::_atn;
std::vector<uint16_t> RelScriptParser::_serializedATN;

std::vector<std::string> RelScriptParser::_ruleNames = {
  "program", "statement", "methodUsage", "assignExpression", "number", "atom", 
  "expression", "mulExpression", "logicExpression", "binarySign", "inBracesExpression", 
  "inCurlyExpression", "inSquareExpression", "inParenExpression", "expressionInsideBraces", 
  "functionDeclaration", "block", "returnExpression", "functionDeclarationBraces", 
  "functionDeclarationArgs", "functionUsage", "type", "stringType", "whileStatement", 
  "forStatement", "switchStatement", "caseStatement", "defaultStatement", 
  "ifStatement"
};

std::vector<std::string> RelScriptParser::_literalNames = {
  "", "", "", "'is'", "','", "';'", "'\"'", "'<<'", "'>>'", "'.'", "'('", 
  "')'", "'{'", "'}'", "'['", "']'", "'const'", "'table'", "'column'", "'row'", 
  "'number'", "'tuple'", "'string'", "'+'", "'-'", "'/'", "'*'", "'less'", 
  "'equal'", "'more'", "'lessEqual'", "'moreEqual'", "'while'", "'for'", 
  "'switch'", "'case'", "'default'", "'if'", "'else'", "'break'"
};

std::vector<std::string> RelScriptParser::_symbolicNames = {
  "", "INDENT", "DEDENT", "Assign", "Comma", "Semi", "Quot", "Return", "BlockStart", 
  "Point", "LParen", "RParen", "LCurly", "RCurly", "LSquare", "RSquare", 
  "Const", "TableType", "ColumnTupe", "RowType", "NumberType", "TupleType", 
  "StringWord", "Plus", "Minus", "Divide", "Multiplication", "Less", "Equal", 
  "More", "LessEqual", "MoreEqual", "While", "For", "Switch", "Case", "Default", 
  "If", "Else", "Break", "ID", "IntNumber", "FloatNumber", "StringLiteral", 
  "UnterminatedStringLiteral", "NEWLINE", "WS", "BlockComment", "LineComment"
};

dfa::Vocabulary RelScriptParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> RelScriptParser::_tokenNames;

RelScriptParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  static const uint16_t serializedATNSegment0[] = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
       0x3, 0x32, 0x131, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x4, 0x18, 0x9, 0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 
       0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 
       0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x3, 0x2, 0x3, 0x2, 0x7, 0x2, 0x3f, 
       0xa, 0x2, 0xc, 0x2, 0xe, 0x2, 0x42, 0xb, 0x2, 0x3, 0x2, 0x3, 0x2, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x3, 0x3, 0x5, 0x3, 0x4e, 0xa, 0x3, 0x3, 0x3, 0x5, 0x3, 0x51, 
       0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x55, 0xa, 0x4, 0x3, 0x4, 
       0x3, 0x4, 0x6, 0x4, 0x59, 0xa, 0x4, 0xd, 0x4, 0xe, 0x4, 0x5a, 0x3, 
       0x5, 0x5, 0x5, 0x5e, 0xa, 0x5, 0x3, 0x5, 0x5, 0x5, 0x61, 0xa, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 
       0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 
       0x6f, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 
       0x7, 0x8, 0x76, 0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x79, 0xb, 0x8, 0x3, 
       0x8, 0x3, 0x8, 0x5, 0x8, 0x7d, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 
       0x9, 0x3, 0x9, 0x3, 0x9, 0x7, 0x9, 0x84, 0xa, 0x9, 0xc, 0x9, 0xe, 
       0x9, 0x87, 0xb, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x5, 0xa, 0x94, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 
       0x3, 0xc, 0x5, 0xc, 0x9b, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 
       0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
       0x3, 0x10, 0x5, 0x10, 0xae, 0xa, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 
       0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x12, 0x3, 
       0x12, 0x7, 0x12, 0xb9, 0xa, 0x12, 0xc, 0x12, 0xe, 0x12, 0xbc, 0xb, 
       0x12, 0x3, 0x12, 0x5, 0x12, 0xbf, 0xa, 0x12, 0x3, 0x12, 0x3, 0x12, 
       0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0xc5, 0xa, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 0xcb, 0xa, 0x14, 0x3, 0x14, 
       0x3, 0x14, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 
       0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0xd7, 0xa, 0x15, 0x3, 
       0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0xdd, 0xa, 0x16, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x5, 0x17, 0xe5, 0xa, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 
       0x18, 0x3, 0x18, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 
       0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x1a, 0x3, 0x1a, 0x3, 
       0x1a, 0x5, 0x1a, 0xf7, 0xa, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 
       0xfb, 0xa, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x5, 0x1a, 0xff, 0xa, 0x1a, 
       0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1b, 
       0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 
       0x3, 0x1b, 0x7, 0x1b, 0x10e, 0xa, 0x1b, 0xc, 0x1b, 0xe, 0x1b, 0x111, 
       0xb, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 
       0x3, 0x1c, 0x5, 0x1c, 0x119, 0xa, 0x1c, 0x3, 0x1c, 0x3, 0x1c, 0x3, 
       0x1c, 0x3, 0x1c, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 
       0x1d, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 
       0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x3, 0x1e, 0x5, 
       0x1e, 0x12f, 0xa, 0x1e, 0x3, 0x1e, 0x2, 0x2, 0x1f, 0x2, 0x4, 0x6, 
       0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 
       0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 
       0x36, 0x38, 0x3a, 0x2, 0x4, 0x3, 0x2, 0x2b, 0x2c, 0x4, 0x2, 0x19, 
       0x1b, 0x1d, 0x21, 0x2, 0x145, 0x2, 0x40, 0x3, 0x2, 0x2, 0x2, 0x4, 
       0x4d, 0x3, 0x2, 0x2, 0x2, 0x6, 0x54, 0x3, 0x2, 0x2, 0x2, 0x8, 0x5d, 
       0x3, 0x2, 0x2, 0x2, 0xa, 0x66, 0x3, 0x2, 0x2, 0x2, 0xc, 0x6e, 0x3, 
       0x2, 0x2, 0x2, 0xe, 0x7c, 0x3, 0x2, 0x2, 0x2, 0x10, 0x7e, 0x3, 0x2, 
       0x2, 0x2, 0x12, 0x88, 0x3, 0x2, 0x2, 0x2, 0x14, 0x95, 0x3, 0x2, 0x2, 
       0x2, 0x16, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x18, 0x9c, 0x3, 0x2, 0x2, 0x2, 
       0x1a, 0xa0, 0x3, 0x2, 0x2, 0x2, 0x1c, 0xa4, 0x3, 0x2, 0x2, 0x2, 0x1e, 
       0xad, 0x3, 0x2, 0x2, 0x2, 0x20, 0xaf, 0x3, 0x2, 0x2, 0x2, 0x22, 0xb6, 
       0x3, 0x2, 0x2, 0x2, 0x24, 0xc2, 0x3, 0x2, 0x2, 0x2, 0x26, 0xc8, 0x3, 
       0x2, 0x2, 0x2, 0x28, 0xd6, 0x3, 0x2, 0x2, 0x2, 0x2a, 0xd8, 0x3, 0x2, 
       0x2, 0x2, 0x2c, 0xe4, 0x3, 0x2, 0x2, 0x2, 0x2e, 0xe6, 0x3, 0x2, 0x2, 
       0x2, 0x30, 0xeb, 0x3, 0x2, 0x2, 0x2, 0x32, 0xf3, 0x3, 0x2, 0x2, 0x2, 
       0x34, 0x105, 0x3, 0x2, 0x2, 0x2, 0x36, 0x115, 0x3, 0x2, 0x2, 0x2, 
       0x38, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x123, 0x3, 0x2, 0x2, 0x2, 
       0x3c, 0x3f, 0x7, 0x2f, 0x2, 0x2, 0x3d, 0x3f, 0x5, 0x4, 0x3, 0x2, 
       0x3e, 0x3c, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x3f, 
       0x42, 0x3, 0x2, 0x2, 0x2, 0x40, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x40, 0x41, 
       0x3, 0x2, 0x2, 0x2, 0x41, 0x43, 0x3, 0x2, 0x2, 0x2, 0x42, 0x40, 0x3, 
       0x2, 0x2, 0x2, 0x43, 0x44, 0x7, 0x2, 0x2, 0x3, 0x44, 0x3, 0x3, 0x2, 
       0x2, 0x2, 0x45, 0x4e, 0x5, 0x8, 0x5, 0x2, 0x46, 0x4e, 0x5, 0x20, 
       0x11, 0x2, 0x47, 0x4e, 0x5, 0x2a, 0x16, 0x2, 0x48, 0x4e, 0x5, 0x6, 
       0x4, 0x2, 0x49, 0x4e, 0x5, 0x30, 0x19, 0x2, 0x4a, 0x4e, 0x5, 0x32, 
       0x1a, 0x2, 0x4b, 0x4e, 0x5, 0x34, 0x1b, 0x2, 0x4c, 0x4e, 0x5, 0x3a, 
       0x1e, 0x2, 0x4d, 0x45, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x46, 0x3, 0x2, 
       0x2, 0x2, 0x4d, 0x47, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x48, 0x3, 0x2, 0x2, 
       0x2, 0x4d, 0x49, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x4a, 0x3, 0x2, 0x2, 0x2, 
       0x4d, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x4e, 
       0x50, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x51, 0x7, 0x2f, 0x2, 0x2, 0x50, 
       0x4f, 0x3, 0x2, 0x2, 0x2, 0x50, 0x51, 0x3, 0x2, 0x2, 0x2, 0x51, 0x5, 
       0x3, 0x2, 0x2, 0x2, 0x52, 0x55, 0x7, 0x2a, 0x2, 0x2, 0x53, 0x55, 
       0x5, 0x2a, 0x16, 0x2, 0x54, 0x52, 0x3, 0x2, 0x2, 0x2, 0x54, 0x53, 
       0x3, 0x2, 0x2, 0x2, 0x55, 0x58, 0x3, 0x2, 0x2, 0x2, 0x56, 0x57, 0x7, 
       0xb, 0x2, 0x2, 0x57, 0x59, 0x5, 0x2a, 0x16, 0x2, 0x58, 0x56, 0x3, 
       0x2, 0x2, 0x2, 0x59, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x58, 0x3, 0x2, 
       0x2, 0x2, 0x5a, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x5b, 0x7, 0x3, 0x2, 0x2, 
       0x2, 0x5c, 0x5e, 0x7, 0x12, 0x2, 0x2, 0x5d, 0x5c, 0x3, 0x2, 0x2, 
       0x2, 0x5d, 0x5e, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x60, 0x3, 0x2, 0x2, 0x2, 
       0x5f, 0x61, 0x5, 0x2c, 0x17, 0x2, 0x60, 0x5f, 0x3, 0x2, 0x2, 0x2, 
       0x60, 0x61, 0x3, 0x2, 0x2, 0x2, 0x61, 0x62, 0x3, 0x2, 0x2, 0x2, 0x62, 
       0x63, 0x7, 0x2a, 0x2, 0x2, 0x63, 0x64, 0x7, 0x5, 0x2, 0x2, 0x64, 
       0x65, 0x5, 0xe, 0x8, 0x2, 0x65, 0x9, 0x3, 0x2, 0x2, 0x2, 0x66, 0x67, 
       0x9, 0x2, 0x2, 0x2, 0x67, 0xb, 0x3, 0x2, 0x2, 0x2, 0x68, 0x6f, 0x7, 
       0x2a, 0x2, 0x2, 0x69, 0x6f, 0x5, 0xa, 0x6, 0x2, 0x6a, 0x6f, 0x7, 
       0x2d, 0x2, 0x2, 0x6b, 0x6f, 0x5, 0x2a, 0x16, 0x2, 0x6c, 0x6f, 0x5, 
       0x6, 0x4, 0x2, 0x6d, 0x6f, 0x5, 0x16, 0xc, 0x2, 0x6e, 0x68, 0x3, 
       0x2, 0x2, 0x2, 0x6e, 0x69, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x6a, 0x3, 0x2, 
       0x2, 0x2, 0x6e, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x6c, 0x3, 0x2, 0x2, 
       0x2, 0x6e, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x6f, 0xd, 0x3, 0x2, 0x2, 0x2, 
       0x70, 0x77, 0x5, 0x10, 0x9, 0x2, 0x71, 0x72, 0x7, 0x19, 0x2, 0x2, 
       0x72, 0x76, 0x5, 0x10, 0x9, 0x2, 0x73, 0x74, 0x7, 0x1a, 0x2, 0x2, 
       0x74, 0x76, 0x5, 0x10, 0x9, 0x2, 0x75, 0x71, 0x3, 0x2, 0x2, 0x2, 
       0x75, 0x73, 0x3, 0x2, 0x2, 0x2, 0x76, 0x79, 0x3, 0x2, 0x2, 0x2, 0x77, 
       0x75, 0x3, 0x2, 0x2, 0x2, 0x77, 0x78, 0x3, 0x2, 0x2, 0x2, 0x78, 0x7d, 
       0x3, 0x2, 0x2, 0x2, 0x79, 0x77, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7d, 0x5, 
       0x12, 0xa, 0x2, 0x7b, 0x7d, 0x5, 0x2c, 0x17, 0x2, 0x7c, 0x70, 0x3, 
       0x2, 0x2, 0x2, 0x7c, 0x7a, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x7b, 0x3, 0x2, 
       0x2, 0x2, 0x7d, 0xf, 0x3, 0x2, 0x2, 0x2, 0x7e, 0x85, 0x5, 0xc, 0x7, 
       0x2, 0x7f, 0x80, 0x7, 0x1c, 0x2, 0x2, 0x80, 0x84, 0x5, 0xc, 0x7, 
       0x2, 0x81, 0x82, 0x7, 0x1b, 0x2, 0x2, 0x82, 0x84, 0x5, 0xc, 0x7, 
       0x2, 0x83, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x83, 0x81, 0x3, 0x2, 0x2, 0x2, 
       0x84, 0x87, 0x3, 0x2, 0x2, 0x2, 0x85, 0x83, 0x3, 0x2, 0x2, 0x2, 0x85, 
       0x86, 0x3, 0x2, 0x2, 0x2, 0x86, 0x11, 0x3, 0x2, 0x2, 0x2, 0x87, 0x85, 
       0x3, 0x2, 0x2, 0x2, 0x88, 0x93, 0x5, 0xc, 0x7, 0x2, 0x89, 0x8a, 0x7, 
       0x1e, 0x2, 0x2, 0x8a, 0x94, 0x5, 0xc, 0x7, 0x2, 0x8b, 0x8c, 0x7, 
       0x1f, 0x2, 0x2, 0x8c, 0x94, 0x5, 0xc, 0x7, 0x2, 0x8d, 0x8e, 0x7, 
       0x1d, 0x2, 0x2, 0x8e, 0x94, 0x5, 0xc, 0x7, 0x2, 0x8f, 0x90, 0x7, 
       0x21, 0x2, 0x2, 0x90, 0x94, 0x5, 0xc, 0x7, 0x2, 0x91, 0x92, 0x7, 
       0x20, 0x2, 0x2, 0x92, 0x94, 0x5, 0xc, 0x7, 0x2, 0x93, 0x89, 0x3, 
       0x2, 0x2, 0x2, 0x93, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x93, 0x8d, 0x3, 0x2, 
       0x2, 0x2, 0x93, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x93, 0x91, 0x3, 0x2, 0x2, 
       0x2, 0x93, 0x94, 0x3, 0x2, 0x2, 0x2, 0x94, 0x13, 0x3, 0x2, 0x2, 0x2, 
       0x95, 0x96, 0x9, 0x3, 0x2, 0x2, 0x96, 0x15, 0x3, 0x2, 0x2, 0x2, 0x97, 
       0x9b, 0x5, 0x18, 0xd, 0x2, 0x98, 0x9b, 0x5, 0x1a, 0xe, 0x2, 0x99, 
       0x9b, 0x5, 0x1c, 0xf, 0x2, 0x9a, 0x97, 0x3, 0x2, 0x2, 0x2, 0x9a, 
       0x98, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x99, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x17, 
       0x3, 0x2, 0x2, 0x2, 0x9c, 0x9d, 0x7, 0xe, 0x2, 0x2, 0x9d, 0x9e, 0x5, 
       0x1e, 0x10, 0x2, 0x9e, 0x9f, 0x7, 0xf, 0x2, 0x2, 0x9f, 0x19, 0x3, 
       0x2, 0x2, 0x2, 0xa0, 0xa1, 0x7, 0x10, 0x2, 0x2, 0xa1, 0xa2, 0x5, 
       0x1e, 0x10, 0x2, 0xa2, 0xa3, 0x7, 0x11, 0x2, 0x2, 0xa3, 0x1b, 0x3, 
       0x2, 0x2, 0x2, 0xa4, 0xa5, 0x7, 0xc, 0x2, 0x2, 0xa5, 0xa6, 0x5, 0x1e, 
       0x10, 0x2, 0xa6, 0xa7, 0x7, 0xd, 0x2, 0x2, 0xa7, 0x1d, 0x3, 0x2, 
       0x2, 0x2, 0xa8, 0xae, 0x5, 0xe, 0x8, 0x2, 0xa9, 0xaa, 0x5, 0xe, 0x8, 
       0x2, 0xaa, 0xab, 0x7, 0x6, 0x2, 0x2, 0xab, 0xac, 0x5, 0x1e, 0x10, 
       0x2, 0xac, 0xae, 0x3, 0x2, 0x2, 0x2, 0xad, 0xa8, 0x3, 0x2, 0x2, 0x2, 
       0xad, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xae, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xaf, 
       0xb0, 0x5, 0x2c, 0x17, 0x2, 0xb0, 0xb1, 0x7, 0x2a, 0x2, 0x2, 0xb1, 
       0xb2, 0x5, 0x26, 0x14, 0x2, 0xb2, 0xb3, 0x7, 0xa, 0x2, 0x2, 0xb3, 
       0xb4, 0x7, 0x2f, 0x2, 0x2, 0xb4, 0xb5, 0x5, 0x22, 0x12, 0x2, 0xb5, 
       0x21, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xba, 0x7, 0x3, 0x2, 0x2, 0xb7, 0xb9, 
       0x5, 0x4, 0x3, 0x2, 0xb8, 0xb7, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xbc, 0x3, 
       0x2, 0x2, 0x2, 0xba, 0xb8, 0x3, 0x2, 0x2, 0x2, 0xba, 0xbb, 0x3, 0x2, 
       0x2, 0x2, 0xbb, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xba, 0x3, 0x2, 0x2, 
       0x2, 0xbd, 0xbf, 0x5, 0x24, 0x13, 0x2, 0xbe, 0xbd, 0x3, 0x2, 0x2, 
       0x2, 0xbe, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xc0, 0x3, 0x2, 0x2, 0x2, 
       0xc0, 0xc1, 0x7, 0x4, 0x2, 0x2, 0xc1, 0x23, 0x3, 0x2, 0x2, 0x2, 0xc2, 
       0xc4, 0x7, 0x9, 0x2, 0x2, 0xc3, 0xc5, 0x5, 0xe, 0x8, 0x2, 0xc4, 0xc3, 
       0x3, 0x2, 0x2, 0x2, 0xc4, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xc5, 0xc6, 0x3, 
       0x2, 0x2, 0x2, 0xc6, 0xc7, 0x7, 0x2f, 0x2, 0x2, 0xc7, 0x25, 0x3, 
       0x2, 0x2, 0x2, 0xc8, 0xca, 0x7, 0xc, 0x2, 0x2, 0xc9, 0xcb, 0x5, 0x28, 
       0x15, 0x2, 0xca, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xca, 0xcb, 0x3, 0x2, 
       0x2, 0x2, 0xcb, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xcc, 0xcd, 0x7, 0xd, 0x2, 
       0x2, 0xcd, 0x27, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x5, 0x2c, 0x17, 
       0x2, 0xcf, 0xd0, 0x7, 0x2a, 0x2, 0x2, 0xd0, 0xd7, 0x3, 0x2, 0x2, 
       0x2, 0xd1, 0xd2, 0x5, 0x2c, 0x17, 0x2, 0xd2, 0xd3, 0x7, 0x2a, 0x2, 
       0x2, 0xd3, 0xd4, 0x7, 0x6, 0x2, 0x2, 0xd4, 0xd5, 0x5, 0x28, 0x15, 
       0x2, 0xd5, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xce, 0x3, 0x2, 0x2, 0x2, 
       0xd6, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xd7, 0x29, 0x3, 0x2, 0x2, 0x2, 0xd8, 
       0xdc, 0x7, 0x2a, 0x2, 0x2, 0xd9, 0xda, 0x7, 0xc, 0x2, 0x2, 0xda, 
       0xdd, 0x7, 0xd, 0x2, 0x2, 0xdb, 0xdd, 0x5, 0x1c, 0xf, 0x2, 0xdc, 
       0xd9, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xdd, 0x2b, 
       0x3, 0x2, 0x2, 0x2, 0xde, 0xe5, 0x7, 0x13, 0x2, 0x2, 0xdf, 0xe5, 
       0x7, 0x14, 0x2, 0x2, 0xe0, 0xe5, 0x7, 0x15, 0x2, 0x2, 0xe1, 0xe5, 
       0x5, 0x2e, 0x18, 0x2, 0xe2, 0xe5, 0x7, 0x16, 0x2, 0x2, 0xe3, 0xe5, 
       0x7, 0x17, 0x2, 0x2, 0xe4, 0xde, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xdf, 
       0x3, 0x2, 0x2, 0x2, 0xe4, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe1, 0x3, 
       0x2, 0x2, 0x2, 0xe4, 0xe2, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe3, 0x3, 0x2, 
       0x2, 0x2, 0xe5, 0x2d, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe7, 0x7, 0x18, 
       0x2, 0x2, 0xe7, 0xe8, 0x7, 0xc, 0x2, 0x2, 0xe8, 0xe9, 0x7, 0x2b, 
       0x2, 0x2, 0xe9, 0xea, 0x7, 0xd, 0x2, 0x2, 0xea, 0x2f, 0x3, 0x2, 0x2, 
       0x2, 0xeb, 0xec, 0x7, 0x22, 0x2, 0x2, 0xec, 0xed, 0x7, 0xc, 0x2, 
       0x2, 0xed, 0xee, 0x5, 0x12, 0xa, 0x2, 0xee, 0xef, 0x7, 0xd, 0x2, 
       0x2, 0xef, 0xf0, 0x7, 0xa, 0x2, 0x2, 0xf0, 0xf1, 0x7, 0x2f, 0x2, 
       0x2, 0xf1, 0xf2, 0x5, 0x22, 0x12, 0x2, 0xf2, 0x31, 0x3, 0x2, 0x2, 
       0x2, 0xf3, 0xf4, 0x7, 0x23, 0x2, 0x2, 0xf4, 0xf6, 0x7, 0xc, 0x2, 
       0x2, 0xf5, 0xf7, 0x5, 0x8, 0x5, 0x2, 0xf6, 0xf5, 0x3, 0x2, 0x2, 0x2, 
       0xf6, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xf8, 
       0xfa, 0x7, 0x7, 0x2, 0x2, 0xf9, 0xfb, 0x5, 0x12, 0xa, 0x2, 0xfa, 
       0xf9, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xfc, 
       0x3, 0x2, 0x2, 0x2, 0xfc, 0xfe, 0x7, 0x7, 0x2, 0x2, 0xfd, 0xff, 0x5, 
       0x8, 0x5, 0x2, 0xfe, 0xfd, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xff, 0x3, 0x2, 
       0x2, 0x2, 0xff, 0x100, 0x3, 0x2, 0x2, 0x2, 0x100, 0x101, 0x7, 0xd, 
       0x2, 0x2, 0x101, 0x102, 0x7, 0xa, 0x2, 0x2, 0x102, 0x103, 0x7, 0x2f, 
       0x2, 0x2, 0x103, 0x104, 0x5, 0x22, 0x12, 0x2, 0x104, 0x33, 0x3, 0x2, 
       0x2, 0x2, 0x105, 0x106, 0x7, 0x24, 0x2, 0x2, 0x106, 0x107, 0x7, 0xc, 
       0x2, 0x2, 0x107, 0x108, 0x7, 0x2a, 0x2, 0x2, 0x108, 0x109, 0x7, 0xd, 
       0x2, 0x2, 0x109, 0x10a, 0x7, 0xa, 0x2, 0x2, 0x10a, 0x10b, 0x7, 0x2f, 
       0x2, 0x2, 0x10b, 0x10f, 0x7, 0x3, 0x2, 0x2, 0x10c, 0x10e, 0x5, 0x36, 
       0x1c, 0x2, 0x10d, 0x10c, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x111, 0x3, 0x2, 
       0x2, 0x2, 0x10f, 0x10d, 0x3, 0x2, 0x2, 0x2, 0x10f, 0x110, 0x3, 0x2, 
       0x2, 0x2, 0x110, 0x112, 0x3, 0x2, 0x2, 0x2, 0x111, 0x10f, 0x3, 0x2, 
       0x2, 0x2, 0x112, 0x113, 0x5, 0x38, 0x1d, 0x2, 0x113, 0x114, 0x7, 
       0x4, 0x2, 0x2, 0x114, 0x35, 0x3, 0x2, 0x2, 0x2, 0x115, 0x118, 0x7, 
       0x25, 0x2, 0x2, 0x116, 0x119, 0x7, 0x2d, 0x2, 0x2, 0x117, 0x119, 
       0x5, 0xa, 0x6, 0x2, 0x118, 0x116, 0x3, 0x2, 0x2, 0x2, 0x118, 0x117, 
       0x3, 0x2, 0x2, 0x2, 0x119, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x11a, 0x11b, 
       0x7, 0xa, 0x2, 0x2, 0x11b, 0x11c, 0x7, 0x2f, 0x2, 0x2, 0x11c, 0x11d, 
       0x5, 0x22, 0x12, 0x2, 0x11d, 0x37, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11f, 
       0x7, 0x26, 0x2, 0x2, 0x11f, 0x120, 0x7, 0xa, 0x2, 0x2, 0x120, 0x121, 
       0x7, 0x2f, 0x2, 0x2, 0x121, 0x122, 0x5, 0x22, 0x12, 0x2, 0x122, 0x39, 
       0x3, 0x2, 0x2, 0x2, 0x123, 0x124, 0x7, 0x27, 0x2, 0x2, 0x124, 0x125, 
       0x7, 0xc, 0x2, 0x2, 0x125, 0x126, 0x5, 0x12, 0xa, 0x2, 0x126, 0x127, 
       0x7, 0xd, 0x2, 0x2, 0x127, 0x128, 0x7, 0xa, 0x2, 0x2, 0x128, 0x129, 
       0x7, 0x2f, 0x2, 0x2, 0x129, 0x12e, 0x5, 0x22, 0x12, 0x2, 0x12a, 0x12b, 
       0x7, 0x28, 0x2, 0x2, 0x12b, 0x12c, 0x7, 0xa, 0x2, 0x2, 0x12c, 0x12d, 
       0x7, 0x2f, 0x2, 0x2, 0x12d, 0x12f, 0x5, 0x22, 0x12, 0x2, 0x12e, 0x12a, 
       0x3, 0x2, 0x2, 0x2, 0x12e, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x3b, 
       0x3, 0x2, 0x2, 0x2, 0x20, 0x3e, 0x40, 0x4d, 0x50, 0x54, 0x5a, 0x5d, 
       0x60, 0x6e, 0x75, 0x77, 0x7c, 0x83, 0x85, 0x93, 0x9a, 0xad, 0xba, 
       0xbe, 0xc4, 0xca, 0xd6, 0xdc, 0xe4, 0xf6, 0xfa, 0xfe, 0x10f, 0x118, 
       0x12e, 
  };

  _serializedATN.insert(_serializedATN.end(), serializedATNSegment0,
    serializedATNSegment0 + sizeof(serializedATNSegment0) / sizeof(serializedATNSegment0[0]));


  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

RelScriptParser::Initializer RelScriptParser::_init;
