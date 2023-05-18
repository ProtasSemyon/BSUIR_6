
// Generated from /home/smn/BSUIR_6/YAPIS/2/PolyaGramParser.g4 by ANTLR 4.9.2



#include "PolyaGramParserParser.h"


using namespace antlrcpp;
using namespace antlr4;

PolyaGramParserParser::PolyaGramParserParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

PolyaGramParserParser::~PolyaGramParserParser() {
  delete _interpreter;
}

std::string PolyaGramParserParser::getGrammarFileName() const {
  return "PolyaGramParser.g4";
}

const std::vector<std::string>& PolyaGramParserParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& PolyaGramParserParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgramContext ------------------------------------------------------------------

PolyaGramParserParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::ProgramContext::EOF() {
  return getToken(PolyaGramParserParser::EOF, 0);
}

std::vector<PolyaGramParserParser::StatementContext *> PolyaGramParserParser::ProgramContext::statement() {
  return getRuleContexts<PolyaGramParserParser::StatementContext>();
}

PolyaGramParserParser::StatementContext* PolyaGramParserParser::ProgramContext::statement(size_t i) {
  return getRuleContext<PolyaGramParserParser::StatementContext>(i);
}


size_t PolyaGramParserParser::ProgramContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleProgram;
}


PolyaGramParserParser::ProgramContext* PolyaGramParserParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 0, PolyaGramParserParser::RuleProgram);
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
    setState(43); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(42);
      statement();
      setState(45); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PolyaGramParserParser::T__0)
      | (1ULL << PolyaGramParserParser::T__1)
      | (1ULL << PolyaGramParserParser::T__8)
      | (1ULL << PolyaGramParserParser::T__12)
      | (1ULL << PolyaGramParserParser::STRING)
      | (1ULL << PolyaGramParserParser::TYPE)
      | (1ULL << PolyaGramParserParser::INT)
      | (1ULL << PolyaGramParserParser::ID)
      | (1ULL << PolyaGramParserParser::EQ)
      | (1ULL << PolyaGramParserParser::LEFT_BR)
      | (1ULL << PolyaGramParserParser::FUNCTION)
      | (1ULL << PolyaGramParserParser::FOR)
      | (1ULL << PolyaGramParserParser::WHILE))) != 0));
    setState(47);
    match(PolyaGramParserParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

PolyaGramParserParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PolyaGramParserParser::FuncContext* PolyaGramParserParser::StatementContext::func() {
  return getRuleContext<PolyaGramParserParser::FuncContext>(0);
}

PolyaGramParserParser::LoopContext* PolyaGramParserParser::StatementContext::loop() {
  return getRuleContext<PolyaGramParserParser::LoopContext>(0);
}

PolyaGramParserParser::ConditionContext* PolyaGramParserParser::StatementContext::condition() {
  return getRuleContext<PolyaGramParserParser::ConditionContext>(0);
}

PolyaGramParserParser::AsiignmentExpressionContext* PolyaGramParserParser::StatementContext::asiignmentExpression() {
  return getRuleContext<PolyaGramParserParser::AsiignmentExpressionContext>(0);
}

tree::TerminalNode* PolyaGramParserParser::StatementContext::SEMI() {
  return getToken(PolyaGramParserParser::SEMI, 0);
}

PolyaGramParserParser::UnaryExprContext* PolyaGramParserParser::StatementContext::unaryExpr() {
  return getRuleContext<PolyaGramParserParser::UnaryExprContext>(0);
}

PolyaGramParserParser::MethodUsageContext* PolyaGramParserParser::StatementContext::methodUsage() {
  return getRuleContext<PolyaGramParserParser::MethodUsageContext>(0);
}


size_t PolyaGramParserParser::StatementContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleStatement;
}


PolyaGramParserParser::StatementContext* PolyaGramParserParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 2, PolyaGramParserParser::RuleStatement);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(59);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(49);
      func();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(50);
      loop();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(51);
      condition();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(52);
      asiignmentExpression();
      setState(53);
      match(PolyaGramParserParser::SEMI);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(55);
      unaryExpr();
      setState(56);
      match(PolyaGramParserParser::SEMI);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(58);
      methodUsage();
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

PolyaGramParserParser::MethodUsageContext::MethodUsageContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::MethodUsageContext::ID() {
  return getToken(PolyaGramParserParser::ID, 0);
}

std::vector<PolyaGramParserParser::FunctionUsageContext *> PolyaGramParserParser::MethodUsageContext::functionUsage() {
  return getRuleContexts<PolyaGramParserParser::FunctionUsageContext>();
}

PolyaGramParserParser::FunctionUsageContext* PolyaGramParserParser::MethodUsageContext::functionUsage(size_t i) {
  return getRuleContext<PolyaGramParserParser::FunctionUsageContext>(i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::MethodUsageContext::Point() {
  return getTokens(PolyaGramParserParser::Point);
}

tree::TerminalNode* PolyaGramParserParser::MethodUsageContext::Point(size_t i) {
  return getToken(PolyaGramParserParser::Point, i);
}


size_t PolyaGramParserParser::MethodUsageContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleMethodUsage;
}


PolyaGramParserParser::MethodUsageContext* PolyaGramParserParser::methodUsage() {
  MethodUsageContext *_localctx = _tracker.createInstance<MethodUsageContext>(_ctx, getState());
  enterRule(_localctx, 4, PolyaGramParserParser::RuleMethodUsage);
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
    setState(63);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      setState(61);
      match(PolyaGramParserParser::ID);
      break;
    }

    case 2: {
      setState(62);
      functionUsage();
      break;
    }

    default:
      break;
    }
    setState(67); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(65);
      match(PolyaGramParserParser::Point);
      setState(66);
      functionUsage();
      setState(69); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == PolyaGramParserParser::Point);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldUsageContext ------------------------------------------------------------------

PolyaGramParserParser::FieldUsageContext::FieldUsageContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FieldUsageContext::ID() {
  return getTokens(PolyaGramParserParser::ID);
}

tree::TerminalNode* PolyaGramParserParser::FieldUsageContext::ID(size_t i) {
  return getToken(PolyaGramParserParser::ID, i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FieldUsageContext::Point() {
  return getTokens(PolyaGramParserParser::Point);
}

tree::TerminalNode* PolyaGramParserParser::FieldUsageContext::Point(size_t i) {
  return getToken(PolyaGramParserParser::Point, i);
}


size_t PolyaGramParserParser::FieldUsageContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleFieldUsage;
}


PolyaGramParserParser::FieldUsageContext* PolyaGramParserParser::fieldUsage() {
  FieldUsageContext *_localctx = _tracker.createInstance<FieldUsageContext>(_ctx, getState());
  enterRule(_localctx, 6, PolyaGramParserParser::RuleFieldUsage);
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
    setState(71);
    match(PolyaGramParserParser::ID);
    setState(74); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(72);
      match(PolyaGramParserParser::Point);
      setState(73);
      match(PolyaGramParserParser::ID);
      setState(76); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == PolyaGramParserParser::Point);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionUsageContext ------------------------------------------------------------------

PolyaGramParserParser::FunctionUsageContext::FunctionUsageContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FunctionUsageContext::ID() {
  return getTokens(PolyaGramParserParser::ID);
}

tree::TerminalNode* PolyaGramParserParser::FunctionUsageContext::ID(size_t i) {
  return getToken(PolyaGramParserParser::ID, i);
}

tree::TerminalNode* PolyaGramParserParser::FunctionUsageContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

tree::TerminalNode* PolyaGramParserParser::FunctionUsageContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}

std::vector<PolyaGramParserParser::FieldUsageContext *> PolyaGramParserParser::FunctionUsageContext::fieldUsage() {
  return getRuleContexts<PolyaGramParserParser::FieldUsageContext>();
}

PolyaGramParserParser::FieldUsageContext* PolyaGramParserParser::FunctionUsageContext::fieldUsage(size_t i) {
  return getRuleContext<PolyaGramParserParser::FieldUsageContext>(i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FunctionUsageContext::STRING() {
  return getTokens(PolyaGramParserParser::STRING);
}

tree::TerminalNode* PolyaGramParserParser::FunctionUsageContext::STRING(size_t i) {
  return getToken(PolyaGramParserParser::STRING, i);
}

std::vector<PolyaGramParserParser::FunctionUsageContext *> PolyaGramParserParser::FunctionUsageContext::functionUsage() {
  return getRuleContexts<PolyaGramParserParser::FunctionUsageContext>();
}

PolyaGramParserParser::FunctionUsageContext* PolyaGramParserParser::FunctionUsageContext::functionUsage(size_t i) {
  return getRuleContext<PolyaGramParserParser::FunctionUsageContext>(i);
}

std::vector<PolyaGramParserParser::BaseExprContext *> PolyaGramParserParser::FunctionUsageContext::baseExpr() {
  return getRuleContexts<PolyaGramParserParser::BaseExprContext>();
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::FunctionUsageContext::baseExpr(size_t i) {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FunctionUsageContext::AMPERSANT() {
  return getTokens(PolyaGramParserParser::AMPERSANT);
}

tree::TerminalNode* PolyaGramParserParser::FunctionUsageContext::AMPERSANT(size_t i) {
  return getToken(PolyaGramParserParser::AMPERSANT, i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FunctionUsageContext::COMMA() {
  return getTokens(PolyaGramParserParser::COMMA);
}

tree::TerminalNode* PolyaGramParserParser::FunctionUsageContext::COMMA(size_t i) {
  return getToken(PolyaGramParserParser::COMMA, i);
}


size_t PolyaGramParserParser::FunctionUsageContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleFunctionUsage;
}


PolyaGramParserParser::FunctionUsageContext* PolyaGramParserParser::functionUsage() {
  FunctionUsageContext *_localctx = _tracker.createInstance<FunctionUsageContext>(_ctx, getState());
  enterRule(_localctx, 8, PolyaGramParserParser::RuleFunctionUsage);
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
    setState(78);
    match(PolyaGramParserParser::ID);
    setState(79);
    match(PolyaGramParserParser::LEFT_BR);
    setState(106);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PolyaGramParserParser::T__0)
      | (1ULL << PolyaGramParserParser::T__1)
      | (1ULL << PolyaGramParserParser::STRING)
      | (1ULL << PolyaGramParserParser::TYPE)
      | (1ULL << PolyaGramParserParser::INT)
      | (1ULL << PolyaGramParserParser::ID)
      | (1ULL << PolyaGramParserParser::LEFT_BR)
      | (1ULL << PolyaGramParserParser::AMPERSANT))) != 0)) {
      setState(81);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PolyaGramParserParser::AMPERSANT) {
        setState(80);
        match(PolyaGramParserParser::AMPERSANT);
      }
      setState(88);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
      case 1: {
        setState(83);
        match(PolyaGramParserParser::ID);
        break;
      }

      case 2: {
        setState(84);
        fieldUsage();
        break;
      }

      case 3: {
        setState(85);
        match(PolyaGramParserParser::STRING);
        break;
      }

      case 4: {
        setState(86);
        functionUsage();
        break;
      }

      case 5: {
        setState(87);
        baseExpr();
        break;
      }

      default:
        break;
      }
      setState(103);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PolyaGramParserParser::COMMA) {
        setState(90);
        match(PolyaGramParserParser::COMMA);
        setState(92);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == PolyaGramParserParser::AMPERSANT) {
          setState(91);
          match(PolyaGramParserParser::AMPERSANT);
        }
        setState(99);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
        case 1: {
          setState(94);
          match(PolyaGramParserParser::ID);
          break;
        }

        case 2: {
          setState(95);
          fieldUsage();
          break;
        }

        case 3: {
          setState(96);
          match(PolyaGramParserParser::STRING);
          break;
        }

        case 4: {
          setState(97);
          functionUsage();
          break;
        }

        case 5: {
          setState(98);
          baseExpr();
          break;
        }

        default:
          break;
        }
        setState(105);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
    }
    setState(108);
    match(PolyaGramParserParser::RIGHT_BR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

PolyaGramParserParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::BlockContext::LEFT_FIG() {
  return getToken(PolyaGramParserParser::LEFT_FIG, 0);
}

tree::TerminalNode* PolyaGramParserParser::BlockContext::RIGHT_FIG() {
  return getToken(PolyaGramParserParser::RIGHT_FIG, 0);
}

std::vector<PolyaGramParserParser::StatementContext *> PolyaGramParserParser::BlockContext::statement() {
  return getRuleContexts<PolyaGramParserParser::StatementContext>();
}

PolyaGramParserParser::StatementContext* PolyaGramParserParser::BlockContext::statement(size_t i) {
  return getRuleContext<PolyaGramParserParser::StatementContext>(i);
}

tree::TerminalNode* PolyaGramParserParser::BlockContext::SEMI() {
  return getToken(PolyaGramParserParser::SEMI, 0);
}

tree::TerminalNode* PolyaGramParserParser::BlockContext::RETURN() {
  return getToken(PolyaGramParserParser::RETURN, 0);
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::BlockContext::baseExpr() {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(0);
}


size_t PolyaGramParserParser::BlockContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleBlock;
}


PolyaGramParserParser::BlockContext* PolyaGramParserParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 10, PolyaGramParserParser::RuleBlock);
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
    setState(110);
    match(PolyaGramParserParser::LEFT_FIG);
    setState(114);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PolyaGramParserParser::T__0)
      | (1ULL << PolyaGramParserParser::T__1)
      | (1ULL << PolyaGramParserParser::T__8)
      | (1ULL << PolyaGramParserParser::T__12)
      | (1ULL << PolyaGramParserParser::STRING)
      | (1ULL << PolyaGramParserParser::TYPE)
      | (1ULL << PolyaGramParserParser::INT)
      | (1ULL << PolyaGramParserParser::ID)
      | (1ULL << PolyaGramParserParser::EQ)
      | (1ULL << PolyaGramParserParser::LEFT_BR)
      | (1ULL << PolyaGramParserParser::FUNCTION)
      | (1ULL << PolyaGramParserParser::FOR)
      | (1ULL << PolyaGramParserParser::WHILE))) != 0)) {
      setState(111);
      statement();
      setState(116);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(122);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PolyaGramParserParser::RETURN) {
      setState(117);
      match(PolyaGramParserParser::RETURN);
      setState(118);
      baseExpr();
      setState(120);
      match(PolyaGramParserParser::SEMI);
    }
    setState(124);
    match(PolyaGramParserParser::RIGHT_FIG);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FuncContext ------------------------------------------------------------------

PolyaGramParserParser::FuncContext::FuncContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}

PolyaGramParserParser::BlockContext* PolyaGramParserParser::FuncContext::block() {
  return getRuleContext<PolyaGramParserParser::BlockContext>(0);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FuncContext::TYPE() {
  return getTokens(PolyaGramParserParser::TYPE);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::TYPE(size_t i) {
  return getToken(PolyaGramParserParser::TYPE, i);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::FUNCTION() {
  return getToken(PolyaGramParserParser::FUNCTION, 0);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FuncContext::ID() {
  return getTokens(PolyaGramParserParser::ID);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::ID(size_t i) {
  return getToken(PolyaGramParserParser::ID, i);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::OPERATOR_ID() {
  return getToken(PolyaGramParserParser::OPERATOR_ID, 0);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FuncContext::AMPERSANT() {
  return getTokens(PolyaGramParserParser::AMPERSANT);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::AMPERSANT(size_t i) {
  return getToken(PolyaGramParserParser::AMPERSANT, i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::FuncContext::COMMA() {
  return getTokens(PolyaGramParserParser::COMMA);
}

tree::TerminalNode* PolyaGramParserParser::FuncContext::COMMA(size_t i) {
  return getToken(PolyaGramParserParser::COMMA, i);
}


size_t PolyaGramParserParser::FuncContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleFunc;
}


PolyaGramParserParser::FuncContext* PolyaGramParserParser::func() {
  FuncContext *_localctx = _tracker.createInstance<FuncContext>(_ctx, getState());
  enterRule(_localctx, 12, PolyaGramParserParser::RuleFunc);
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
    setState(126);
    _la = _input->LA(1);
    if (!(_la == PolyaGramParserParser::TYPE

    || _la == PolyaGramParserParser::FUNCTION)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(127);
    _la = _input->LA(1);
    if (!(_la == PolyaGramParserParser::OPERATOR_ID

    || _la == PolyaGramParserParser::ID)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(128);
    match(PolyaGramParserParser::LEFT_BR);
    setState(145);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PolyaGramParserParser::TYPE) {
      setState(129);
      match(PolyaGramParserParser::TYPE);
      setState(131);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PolyaGramParserParser::AMPERSANT) {
        setState(130);
        match(PolyaGramParserParser::AMPERSANT);
      }
      setState(133);
      match(PolyaGramParserParser::ID);
      setState(142);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PolyaGramParserParser::COMMA) {
        setState(134);
        match(PolyaGramParserParser::COMMA);
        setState(135);
        match(PolyaGramParserParser::TYPE);
        setState(137);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == PolyaGramParserParser::AMPERSANT) {
          setState(136);
          match(PolyaGramParserParser::AMPERSANT);
        }
        setState(139);
        match(PolyaGramParserParser::ID);
        setState(144);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
    }
    setState(147);
    match(PolyaGramParserParser::RIGHT_BR);
    setState(148);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LoopContext ------------------------------------------------------------------

PolyaGramParserParser::LoopContext::LoopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PolyaGramParserParser::For_loopContext* PolyaGramParserParser::LoopContext::for_loop() {
  return getRuleContext<PolyaGramParserParser::For_loopContext>(0);
}

PolyaGramParserParser::While_loopContext* PolyaGramParserParser::LoopContext::while_loop() {
  return getRuleContext<PolyaGramParserParser::While_loopContext>(0);
}


size_t PolyaGramParserParser::LoopContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleLoop;
}


PolyaGramParserParser::LoopContext* PolyaGramParserParser::loop() {
  LoopContext *_localctx = _tracker.createInstance<LoopContext>(_ctx, getState());
  enterRule(_localctx, 14, PolyaGramParserParser::RuleLoop);

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
      case PolyaGramParserParser::FOR: {
        enterOuterAlt(_localctx, 1);
        setState(150);
        for_loop();
        break;
      }

      case PolyaGramParserParser::WHILE: {
        enterOuterAlt(_localctx, 2);
        setState(151);
        while_loop();
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

//----------------- For_loopContext ------------------------------------------------------------------

PolyaGramParserParser::For_loopContext::For_loopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::For_loopContext::FOR() {
  return getToken(PolyaGramParserParser::FOR, 0);
}

tree::TerminalNode* PolyaGramParserParser::For_loopContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

tree::TerminalNode* PolyaGramParserParser::For_loopContext::TYPE() {
  return getToken(PolyaGramParserParser::TYPE, 0);
}

tree::TerminalNode* PolyaGramParserParser::For_loopContext::ID() {
  return getToken(PolyaGramParserParser::ID, 0);
}

tree::TerminalNode* PolyaGramParserParser::For_loopContext::COLON() {
  return getToken(PolyaGramParserParser::COLON, 0);
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::For_loopContext::baseExpr() {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(0);
}

tree::TerminalNode* PolyaGramParserParser::For_loopContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}

PolyaGramParserParser::BlockContext* PolyaGramParserParser::For_loopContext::block() {
  return getRuleContext<PolyaGramParserParser::BlockContext>(0);
}


size_t PolyaGramParserParser::For_loopContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleFor_loop;
}


PolyaGramParserParser::For_loopContext* PolyaGramParserParser::for_loop() {
  For_loopContext *_localctx = _tracker.createInstance<For_loopContext>(_ctx, getState());
  enterRule(_localctx, 16, PolyaGramParserParser::RuleFor_loop);

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
    match(PolyaGramParserParser::FOR);
    setState(155);
    match(PolyaGramParserParser::LEFT_BR);
    setState(156);
    match(PolyaGramParserParser::TYPE);
    setState(157);
    match(PolyaGramParserParser::ID);
    setState(158);
    match(PolyaGramParserParser::COLON);
    setState(159);
    baseExpr();
    setState(160);
    match(PolyaGramParserParser::RIGHT_BR);
    setState(161);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- While_loopContext ------------------------------------------------------------------

PolyaGramParserParser::While_loopContext::While_loopContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::While_loopContext::WHILE() {
  return getToken(PolyaGramParserParser::WHILE, 0);
}

tree::TerminalNode* PolyaGramParserParser::While_loopContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::While_loopContext::baseExpr() {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(0);
}

tree::TerminalNode* PolyaGramParserParser::While_loopContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}

PolyaGramParserParser::BlockContext* PolyaGramParserParser::While_loopContext::block() {
  return getRuleContext<PolyaGramParserParser::BlockContext>(0);
}


size_t PolyaGramParserParser::While_loopContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleWhile_loop;
}


PolyaGramParserParser::While_loopContext* PolyaGramParserParser::while_loop() {
  While_loopContext *_localctx = _tracker.createInstance<While_loopContext>(_ctx, getState());
  enterRule(_localctx, 18, PolyaGramParserParser::RuleWhile_loop);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(163);
    match(PolyaGramParserParser::WHILE);
    setState(164);
    match(PolyaGramParserParser::LEFT_BR);
    setState(165);
    baseExpr();
    setState(166);
    match(PolyaGramParserParser::RIGHT_BR);
    setState(167);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Brackets_exprContext ------------------------------------------------------------------

PolyaGramParserParser::Brackets_exprContext::Brackets_exprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::Brackets_exprContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::Brackets_exprContext::baseExpr() {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(0);
}

tree::TerminalNode* PolyaGramParserParser::Brackets_exprContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}


size_t PolyaGramParserParser::Brackets_exprContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleBrackets_expr;
}


PolyaGramParserParser::Brackets_exprContext* PolyaGramParserParser::brackets_expr() {
  Brackets_exprContext *_localctx = _tracker.createInstance<Brackets_exprContext>(_ctx, getState());
  enterRule(_localctx, 20, PolyaGramParserParser::RuleBrackets_expr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(169);
    match(PolyaGramParserParser::LEFT_BR);
    setState(170);
    baseExpr();
    setState(171);
    match(PolyaGramParserParser::RIGHT_BR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BaseExprContext ------------------------------------------------------------------

PolyaGramParserParser::BaseExprContext::BaseExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PolyaGramParserParser::UnaryExprContext* PolyaGramParserParser::BaseExprContext::unaryExpr() {
  return getRuleContext<PolyaGramParserParser::UnaryExprContext>(0);
}

PolyaGramParserParser::Brackets_exprContext* PolyaGramParserParser::BaseExprContext::brackets_expr() {
  return getRuleContext<PolyaGramParserParser::Brackets_exprContext>(0);
}

PolyaGramParserParser::LogicExpressionContext* PolyaGramParserParser::BaseExprContext::logicExpression() {
  return getRuleContext<PolyaGramParserParser::LogicExpressionContext>(0);
}


size_t PolyaGramParserParser::BaseExprContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleBaseExpr;
}


PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::baseExpr() {
  BaseExprContext *_localctx = _tracker.createInstance<BaseExprContext>(_ctx, getState());
  enterRule(_localctx, 22, PolyaGramParserParser::RuleBaseExpr);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(176);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(173);
      unaryExpr();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(174);
      brackets_expr();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(175);
      logicExpression();
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

//----------------- AsiignmentExpressionContext ------------------------------------------------------------------

PolyaGramParserParser::AsiignmentExpressionContext::AsiignmentExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::AsiignmentExpressionContext::EQ() {
  return getToken(PolyaGramParserParser::EQ, 0);
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::AsiignmentExpressionContext::baseExpr() {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(0);
}

tree::TerminalNode* PolyaGramParserParser::AsiignmentExpressionContext::TYPE() {
  return getToken(PolyaGramParserParser::TYPE, 0);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::AsiignmentExpressionContext::ID() {
  return getTokens(PolyaGramParserParser::ID);
}

tree::TerminalNode* PolyaGramParserParser::AsiignmentExpressionContext::ID(size_t i) {
  return getToken(PolyaGramParserParser::ID, i);
}

std::vector<PolyaGramParserParser::FieldUsageContext *> PolyaGramParserParser::AsiignmentExpressionContext::fieldUsage() {
  return getRuleContexts<PolyaGramParserParser::FieldUsageContext>();
}

PolyaGramParserParser::FieldUsageContext* PolyaGramParserParser::AsiignmentExpressionContext::fieldUsage(size_t i) {
  return getRuleContext<PolyaGramParserParser::FieldUsageContext>(i);
}


size_t PolyaGramParserParser::AsiignmentExpressionContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleAsiignmentExpression;
}


PolyaGramParserParser::AsiignmentExpressionContext* PolyaGramParserParser::asiignmentExpression() {
  AsiignmentExpressionContext *_localctx = _tracker.createInstance<AsiignmentExpressionContext>(_ctx, getState());
  enterRule(_localctx, 24, PolyaGramParserParser::RuleAsiignmentExpression);
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
    setState(179);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PolyaGramParserParser::TYPE) {
      setState(178);
      match(PolyaGramParserParser::TYPE);
    }
    setState(185);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PolyaGramParserParser::ID) {
      setState(183);
      _errHandler->sync(this);
      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx)) {
      case 1: {
        setState(181);
        match(PolyaGramParserParser::ID);
        break;
      }

      case 2: {
        setState(182);
        fieldUsage();
        break;
      }

      default:
        break;
      }
      setState(187);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(188);
    match(PolyaGramParserParser::EQ);
    setState(189);
    baseExpr();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UnaryExprContext ------------------------------------------------------------------

PolyaGramParserParser::UnaryExprContext::UnaryExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PolyaGramParserParser::BinaryExprContext* PolyaGramParserParser::UnaryExprContext::binaryExpr() {
  return getRuleContext<PolyaGramParserParser::BinaryExprContext>(0);
}


size_t PolyaGramParserParser::UnaryExprContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleUnaryExpr;
}


PolyaGramParserParser::UnaryExprContext* PolyaGramParserParser::unaryExpr() {
  UnaryExprContext *_localctx = _tracker.createInstance<UnaryExprContext>(_ctx, getState());
  enterRule(_localctx, 26, PolyaGramParserParser::RuleUnaryExpr);
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
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PolyaGramParserParser::T__0

    || _la == PolyaGramParserParser::T__1) {
      setState(191);
      _la = _input->LA(1);
      if (!(_la == PolyaGramParserParser::T__0

      || _la == PolyaGramParserParser::T__1)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
    }
    setState(194);
    binaryExpr();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AtomExprContext ------------------------------------------------------------------

PolyaGramParserParser::AtomExprContext::AtomExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::AtomExprContext::ID() {
  return getToken(PolyaGramParserParser::ID, 0);
}

tree::TerminalNode* PolyaGramParserParser::AtomExprContext::TYPE() {
  return getToken(PolyaGramParserParser::TYPE, 0);
}

tree::TerminalNode* PolyaGramParserParser::AtomExprContext::INT() {
  return getToken(PolyaGramParserParser::INT, 0);
}

tree::TerminalNode* PolyaGramParserParser::AtomExprContext::STRING() {
  return getToken(PolyaGramParserParser::STRING, 0);
}

PolyaGramParserParser::MethodUsageContext* PolyaGramParserParser::AtomExprContext::methodUsage() {
  return getRuleContext<PolyaGramParserParser::MethodUsageContext>(0);
}

PolyaGramParserParser::FieldUsageContext* PolyaGramParserParser::AtomExprContext::fieldUsage() {
  return getRuleContext<PolyaGramParserParser::FieldUsageContext>(0);
}

PolyaGramParserParser::FunctionUsageContext* PolyaGramParserParser::AtomExprContext::functionUsage() {
  return getRuleContext<PolyaGramParserParser::FunctionUsageContext>(0);
}

PolyaGramParserParser::Brackets_exprContext* PolyaGramParserParser::AtomExprContext::brackets_expr() {
  return getRuleContext<PolyaGramParserParser::Brackets_exprContext>(0);
}


size_t PolyaGramParserParser::AtomExprContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleAtomExpr;
}


PolyaGramParserParser::AtomExprContext* PolyaGramParserParser::atomExpr() {
  AtomExprContext *_localctx = _tracker.createInstance<AtomExprContext>(_ctx, getState());
  enterRule(_localctx, 28, PolyaGramParserParser::RuleAtomExpr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(206);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(197);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PolyaGramParserParser::TYPE) {
        setState(196);
        match(PolyaGramParserParser::TYPE);
      }
      setState(199);
      match(PolyaGramParserParser::ID);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(200);
      match(PolyaGramParserParser::INT);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(201);
      match(PolyaGramParserParser::STRING);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(202);
      methodUsage();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(203);
      fieldUsage();
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(204);
      functionUsage();
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(205);
      brackets_expr();
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

//----------------- BinaryExprContext ------------------------------------------------------------------

PolyaGramParserParser::BinaryExprContext::BinaryExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PolyaGramParserParser::MulExprContext *> PolyaGramParserParser::BinaryExprContext::mulExpr() {
  return getRuleContexts<PolyaGramParserParser::MulExprContext>();
}

PolyaGramParserParser::MulExprContext* PolyaGramParserParser::BinaryExprContext::mulExpr(size_t i) {
  return getRuleContext<PolyaGramParserParser::MulExprContext>(i);
}


size_t PolyaGramParserParser::BinaryExprContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleBinaryExpr;
}


PolyaGramParserParser::BinaryExprContext* PolyaGramParserParser::binaryExpr() {
  BinaryExprContext *_localctx = _tracker.createInstance<BinaryExprContext>(_ctx, getState());
  enterRule(_localctx, 30, PolyaGramParserParser::RuleBinaryExpr);
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
    setState(208);
    mulExpr();
    setState(215);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PolyaGramParserParser::T__1

    || _la == PolyaGramParserParser::T__2) {
      setState(213);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case PolyaGramParserParser::T__2: {
          setState(209);
          match(PolyaGramParserParser::T__2);
          setState(210);
          mulExpr();
          break;
        }

        case PolyaGramParserParser::T__1: {
          setState(211);
          match(PolyaGramParserParser::T__1);
          setState(212);
          mulExpr();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(217);
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

//----------------- MulExprContext ------------------------------------------------------------------

PolyaGramParserParser::MulExprContext::MulExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PolyaGramParserParser::AtomExprContext *> PolyaGramParserParser::MulExprContext::atomExpr() {
  return getRuleContexts<PolyaGramParserParser::AtomExprContext>();
}

PolyaGramParserParser::AtomExprContext* PolyaGramParserParser::MulExprContext::atomExpr(size_t i) {
  return getRuleContext<PolyaGramParserParser::AtomExprContext>(i);
}


size_t PolyaGramParserParser::MulExprContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleMulExpr;
}


PolyaGramParserParser::MulExprContext* PolyaGramParserParser::mulExpr() {
  MulExprContext *_localctx = _tracker.createInstance<MulExprContext>(_ctx, getState());
  enterRule(_localctx, 32, PolyaGramParserParser::RuleMulExpr);
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
    setState(218);
    atomExpr();
    setState(225);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PolyaGramParserParser::T__3

    || _la == PolyaGramParserParser::T__4) {
      setState(223);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case PolyaGramParserParser::T__3: {
          setState(219);
          match(PolyaGramParserParser::T__3);
          setState(220);
          atomExpr();
          break;
        }

        case PolyaGramParserParser::T__4: {
          setState(221);
          match(PolyaGramParserParser::T__4);
          setState(222);
          atomExpr();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(227);
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

PolyaGramParserParser::LogicExpressionContext::LogicExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PolyaGramParserParser::AtomExprContext *> PolyaGramParserParser::LogicExpressionContext::atomExpr() {
  return getRuleContexts<PolyaGramParserParser::AtomExprContext>();
}

PolyaGramParserParser::AtomExprContext* PolyaGramParserParser::LogicExpressionContext::atomExpr(size_t i) {
  return getRuleContext<PolyaGramParserParser::AtomExprContext>(i);
}


size_t PolyaGramParserParser::LogicExpressionContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleLogicExpression;
}


PolyaGramParserParser::LogicExpressionContext* PolyaGramParserParser::logicExpression() {
  LogicExpressionContext *_localctx = _tracker.createInstance<LogicExpressionContext>(_ctx, getState());
  enterRule(_localctx, 34, PolyaGramParserParser::RuleLogicExpression);

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
    atomExpr();
    setState(235);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PolyaGramParserParser::T__5: {
        setState(229);
        match(PolyaGramParserParser::T__5);
        setState(230);
        atomExpr();
        break;
      }

      case PolyaGramParserParser::T__6: {
        setState(231);
        match(PolyaGramParserParser::T__6);
        setState(232);
        atomExpr();
        break;
      }

      case PolyaGramParserParser::T__7: {
        setState(233);
        match(PolyaGramParserParser::T__7);
        setState(234);
        atomExpr();
        break;
      }

      case PolyaGramParserParser::T__9:
      case PolyaGramParserParser::T__10:
      case PolyaGramParserParser::SEMI:
      case PolyaGramParserParser::RIGHT_BR:
      case PolyaGramParserParser::COMMA: {
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

//----------------- ConditionContext ------------------------------------------------------------------

PolyaGramParserParser::ConditionContext::ConditionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PolyaGramParserParser::If_condContext* PolyaGramParserParser::ConditionContext::if_cond() {
  return getRuleContext<PolyaGramParserParser::If_condContext>(0);
}

PolyaGramParserParser::Switch_condContext* PolyaGramParserParser::ConditionContext::switch_cond() {
  return getRuleContext<PolyaGramParserParser::Switch_condContext>(0);
}


size_t PolyaGramParserParser::ConditionContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleCondition;
}


PolyaGramParserParser::ConditionContext* PolyaGramParserParser::condition() {
  ConditionContext *_localctx = _tracker.createInstance<ConditionContext>(_ctx, getState());
  enterRule(_localctx, 36, PolyaGramParserParser::RuleCondition);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(239);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PolyaGramParserParser::T__8: {
        enterOuterAlt(_localctx, 1);
        setState(237);
        if_cond();
        break;
      }

      case PolyaGramParserParser::T__12: {
        enterOuterAlt(_localctx, 2);
        setState(238);
        switch_cond();
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

//----------------- If_condContext ------------------------------------------------------------------

PolyaGramParserParser::If_condContext::If_condContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::If_condContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

tree::TerminalNode* PolyaGramParserParser::If_condContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}

std::vector<PolyaGramParserParser::BlockContext *> PolyaGramParserParser::If_condContext::block() {
  return getRuleContexts<PolyaGramParserParser::BlockContext>();
}

PolyaGramParserParser::BlockContext* PolyaGramParserParser::If_condContext::block(size_t i) {
  return getRuleContext<PolyaGramParserParser::BlockContext>(i);
}

std::vector<PolyaGramParserParser::BaseExprContext *> PolyaGramParserParser::If_condContext::baseExpr() {
  return getRuleContexts<PolyaGramParserParser::BaseExprContext>();
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::If_condContext::baseExpr(size_t i) {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(i);
}


size_t PolyaGramParserParser::If_condContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleIf_cond;
}


PolyaGramParserParser::If_condContext* PolyaGramParserParser::if_cond() {
  If_condContext *_localctx = _tracker.createInstance<If_condContext>(_ctx, getState());
  enterRule(_localctx, 38, PolyaGramParserParser::RuleIf_cond);
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
    match(PolyaGramParserParser::T__8);
    setState(242);
    match(PolyaGramParserParser::LEFT_BR);

    setState(243);
    baseExpr();
    setState(248);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PolyaGramParserParser::T__9

    || _la == PolyaGramParserParser::T__10) {
      setState(244);
      _la = _input->LA(1);
      if (!(_la == PolyaGramParserParser::T__9

      || _la == PolyaGramParserParser::T__10)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(245);
      baseExpr();
      setState(250);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(251);
    match(PolyaGramParserParser::RIGHT_BR);
    setState(252);
    block();
    setState(255);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PolyaGramParserParser::T__11) {
      setState(253);
      match(PolyaGramParserParser::T__11);
      setState(254);
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

//----------------- Switch_condContext ------------------------------------------------------------------

PolyaGramParserParser::Switch_condContext::Switch_condContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PolyaGramParserParser::Switch_condContext::LEFT_BR() {
  return getToken(PolyaGramParserParser::LEFT_BR, 0);
}

PolyaGramParserParser::BaseExprContext* PolyaGramParserParser::Switch_condContext::baseExpr() {
  return getRuleContext<PolyaGramParserParser::BaseExprContext>(0);
}

tree::TerminalNode* PolyaGramParserParser::Switch_condContext::RIGHT_BR() {
  return getToken(PolyaGramParserParser::RIGHT_BR, 0);
}

tree::TerminalNode* PolyaGramParserParser::Switch_condContext::COLON() {
  return getToken(PolyaGramParserParser::COLON, 0);
}

std::vector<PolyaGramParserParser::BlockContext *> PolyaGramParserParser::Switch_condContext::block() {
  return getRuleContexts<PolyaGramParserParser::BlockContext>();
}

PolyaGramParserParser::BlockContext* PolyaGramParserParser::Switch_condContext::block(size_t i) {
  return getRuleContext<PolyaGramParserParser::BlockContext>(i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::Switch_condContext::ID() {
  return getTokens(PolyaGramParserParser::ID);
}

tree::TerminalNode* PolyaGramParserParser::Switch_condContext::ID(size_t i) {
  return getToken(PolyaGramParserParser::ID, i);
}

std::vector<tree::TerminalNode *> PolyaGramParserParser::Switch_condContext::INT() {
  return getTokens(PolyaGramParserParser::INT);
}

tree::TerminalNode* PolyaGramParserParser::Switch_condContext::INT(size_t i) {
  return getToken(PolyaGramParserParser::INT, i);
}


size_t PolyaGramParserParser::Switch_condContext::getRuleIndex() const {
  return PolyaGramParserParser::RuleSwitch_cond;
}


PolyaGramParserParser::Switch_condContext* PolyaGramParserParser::switch_cond() {
  Switch_condContext *_localctx = _tracker.createInstance<Switch_condContext>(_ctx, getState());
  enterRule(_localctx, 40, PolyaGramParserParser::RuleSwitch_cond);
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
    setState(257);
    match(PolyaGramParserParser::T__12);
    setState(258);
    match(PolyaGramParserParser::LEFT_BR);
    setState(259);
    baseExpr();
    setState(260);
    match(PolyaGramParserParser::RIGHT_BR);
    setState(261);
    match(PolyaGramParserParser::COLON);
    setState(265); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(262);
      match(PolyaGramParserParser::T__13);
      setState(263);
      _la = _input->LA(1);
      if (!(_la == PolyaGramParserParser::INT

      || _la == PolyaGramParserParser::ID)) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(264);
      block();
      setState(267); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == PolyaGramParserParser::T__13);
    setState(271);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PolyaGramParserParser::T__14) {
      setState(269);
      match(PolyaGramParserParser::T__14);
      setState(270);
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
std::vector<dfa::DFA> PolyaGramParserParser::_decisionToDFA;
atn::PredictionContextCache PolyaGramParserParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN PolyaGramParserParser::_atn;
std::vector<uint16_t> PolyaGramParserParser::_serializedATN;

std::vector<std::string> PolyaGramParserParser::_ruleNames = {
  "program", "statement", "methodUsage", "fieldUsage", "functionUsage", 
  "block", "func", "loop", "for_loop", "while_loop", "brackets_expr", "baseExpr", 
  "asiignmentExpression", "unaryExpr", "atomExpr", "binaryExpr", "mulExpr", 
  "logicExpression", "condition", "if_cond", "switch_cond"
};

std::vector<std::string> PolyaGramParserParser::_literalNames = {
  "", "'!'", "'-'", "'is'", "'*'", "'/'", "'\"'", "'<<'", "'>>'", "'if'", 
  "'and'", "'or'", "'else'", "'switch'", "'['", "']'", "'const'", "'table'", 
  "'column'", "'row'", "'number'", "'tuple'", "'string'", "'='", "", "'.'", 
  "'('", "'less'", "'equal'", "'more'", "'lessEqual'", "'moreEqual'", "'return'", 
  "'func'", "'for'", "':'", "'while'", "", "", "'break'"
};

std::vector<std::string> PolyaGramParserParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "STRING", 
  "SEMI", "TYPE", "INT", "OP", "OPERATOR_ID", "ID", "EQ", "WS", "Point", 
  "LEFT_BR", "RIGHT_BR", "LEFT_FIG", "RIGHT_FIG", "COMMA", "AMPERSANT", 
  "RETURN", "FUNCTION", "FOR", "COLON", "WHILE", "If", "Else", "Break", 
  "", "IntNumber", "FloatNumber", "StringLiteral", "UnterminatedStringLiteral", 
  "NEWLINE", "", "BlockComment", "LineComment"
};

dfa::Vocabulary PolyaGramParserParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> PolyaGramParserParser::_tokenNames;

PolyaGramParserParser::Initializer::Initializer() {
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
       0x3, 0x32, 0x114, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x3, 0x2, 
       0x6, 0x2, 0x2e, 0xa, 0x2, 0xd, 0x2, 0xe, 0x2, 0x2f, 0x3, 0x2, 0x3, 
       0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x3e, 0xa, 0x3, 
       0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x42, 0xa, 0x4, 0x3, 0x4, 0x3, 0x4, 
       0x6, 0x4, 0x46, 0xa, 0x4, 0xd, 0x4, 0xe, 0x4, 0x47, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x6, 0x5, 0x4d, 0xa, 0x5, 0xd, 0x5, 0xe, 0x5, 0x4e, 
       0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 0x54, 0xa, 0x6, 0x3, 0x6, 
       0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 0x5b, 0xa, 0x6, 
       0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 0x5f, 0xa, 0x6, 0x3, 0x6, 0x3, 0x6, 
       0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 0x66, 0xa, 0x6, 0x7, 0x6, 
       0x68, 0xa, 0x6, 0xc, 0x6, 0xe, 0x6, 0x6b, 0xb, 0x6, 0x5, 0x6, 0x6d, 
       0xa, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x7, 0x7, 0x73, 
       0xa, 0x7, 0xc, 0x7, 0xe, 0x7, 0x76, 0xb, 0x7, 0x3, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x7d, 0xa, 0x7, 0x3, 0x7, 
       0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 
       0x8, 0x86, 0xa, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 
       0x8, 0x8c, 0xa, 0x8, 0x3, 0x8, 0x7, 0x8, 0x8f, 0xa, 0x8, 0xc, 0x8, 
       0xe, 0x8, 0x92, 0xb, 0x8, 0x5, 0x8, 0x94, 0xa, 0x8, 0x3, 0x8, 0x3, 
       0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x9b, 0xa, 0x9, 0x3, 
       0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
       0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xd, 
       0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0xb3, 0xa, 0xd, 0x3, 0xe, 0x5, 0xe, 
       0xb6, 0xa, 0xe, 0x3, 0xe, 0x3, 0xe, 0x7, 0xe, 0xba, 0xa, 0xe, 0xc, 
       0xe, 0xe, 0xe, 0xbd, 0xb, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xf, 0x5, 0xf, 0xc3, 0xa, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x5, 
       0x10, 0xc8, 0xa, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
       0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x5, 0x10, 0xd1, 0xa, 0x10, 0x3, 
       0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x7, 0x11, 0xd8, 
       0xa, 0x11, 0xc, 0x11, 0xe, 0x11, 0xdb, 0xb, 0x11, 0x3, 0x12, 0x3, 
       0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x7, 0x12, 0xe2, 0xa, 0x12, 
       0xc, 0x12, 0xe, 0x12, 0xe5, 0xb, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 
       0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0xee, 
       0xa, 0x13, 0x3, 0x14, 0x3, 0x14, 0x5, 0x14, 0xf2, 0xa, 0x14, 0x3, 
       0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x3, 0x15, 0x7, 0x15, 0xf9, 
       0xa, 0x15, 0xc, 0x15, 0xe, 0x15, 0xfc, 0xb, 0x15, 0x3, 0x15, 0x3, 
       0x15, 0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0x102, 0xa, 0x15, 0x3, 0x16, 
       0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 
       0x3, 0x16, 0x6, 0x16, 0x10c, 0xa, 0x16, 0xd, 0x16, 0xe, 0x16, 0x10d, 
       0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0x112, 0xa, 0x16, 0x3, 0x16, 0x2, 
       0x2, 0x17, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 
       0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 0x26, 0x28, 0x2a, 0x2, 
       0x7, 0x4, 0x2, 0x14, 0x14, 0x23, 0x23, 0x3, 0x2, 0x17, 0x18, 0x3, 
       0x2, 0x3, 0x4, 0x3, 0x2, 0xc, 0xd, 0x4, 0x2, 0x15, 0x15, 0x18, 0x18, 
       0x2, 0x133, 0x2, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x4, 0x3d, 0x3, 0x2, 0x2, 
       0x2, 0x6, 0x41, 0x3, 0x2, 0x2, 0x2, 0x8, 0x49, 0x3, 0x2, 0x2, 0x2, 
       0xa, 0x50, 0x3, 0x2, 0x2, 0x2, 0xc, 0x70, 0x3, 0x2, 0x2, 0x2, 0xe, 
       0x80, 0x3, 0x2, 0x2, 0x2, 0x10, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x12, 0x9c, 
       0x3, 0x2, 0x2, 0x2, 0x14, 0xa5, 0x3, 0x2, 0x2, 0x2, 0x16, 0xab, 0x3, 
       0x2, 0x2, 0x2, 0x18, 0xb2, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xb5, 0x3, 0x2, 
       0x2, 0x2, 0x1c, 0xc2, 0x3, 0x2, 0x2, 0x2, 0x1e, 0xd0, 0x3, 0x2, 0x2, 
       0x2, 0x20, 0xd2, 0x3, 0x2, 0x2, 0x2, 0x22, 0xdc, 0x3, 0x2, 0x2, 0x2, 
       0x24, 0xe6, 0x3, 0x2, 0x2, 0x2, 0x26, 0xf1, 0x3, 0x2, 0x2, 0x2, 0x28, 
       0xf3, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x103, 0x3, 0x2, 0x2, 0x2, 0x2c, 
       0x2e, 0x5, 0x4, 0x3, 0x2, 0x2d, 0x2c, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x2f, 
       0x3, 0x2, 0x2, 0x2, 0x2f, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x2f, 0x30, 0x3, 
       0x2, 0x2, 0x2, 0x30, 0x31, 0x3, 0x2, 0x2, 0x2, 0x31, 0x32, 0x7, 0x2, 
       0x2, 0x3, 0x32, 0x3, 0x3, 0x2, 0x2, 0x2, 0x33, 0x3e, 0x5, 0xe, 0x8, 
       0x2, 0x34, 0x3e, 0x5, 0x10, 0x9, 0x2, 0x35, 0x3e, 0x5, 0x26, 0x14, 
       0x2, 0x36, 0x37, 0x5, 0x1a, 0xe, 0x2, 0x37, 0x38, 0x7, 0x13, 0x2, 
       0x2, 0x38, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x39, 0x3a, 0x5, 0x1c, 0xf, 
       0x2, 0x3a, 0x3b, 0x7, 0x13, 0x2, 0x2, 0x3b, 0x3e, 0x3, 0x2, 0x2, 
       0x2, 0x3c, 0x3e, 0x5, 0x6, 0x4, 0x2, 0x3d, 0x33, 0x3, 0x2, 0x2, 0x2, 
       0x3d, 0x34, 0x3, 0x2, 0x2, 0x2, 0x3d, 0x35, 0x3, 0x2, 0x2, 0x2, 0x3d, 
       0x36, 0x3, 0x2, 0x2, 0x2, 0x3d, 0x39, 0x3, 0x2, 0x2, 0x2, 0x3d, 0x3c, 
       0x3, 0x2, 0x2, 0x2, 0x3e, 0x5, 0x3, 0x2, 0x2, 0x2, 0x3f, 0x42, 0x7, 
       0x18, 0x2, 0x2, 0x40, 0x42, 0x5, 0xa, 0x6, 0x2, 0x41, 0x3f, 0x3, 
       0x2, 0x2, 0x2, 0x41, 0x40, 0x3, 0x2, 0x2, 0x2, 0x42, 0x45, 0x3, 0x2, 
       0x2, 0x2, 0x43, 0x44, 0x7, 0x1b, 0x2, 0x2, 0x44, 0x46, 0x5, 0xa, 
       0x6, 0x2, 0x45, 0x43, 0x3, 0x2, 0x2, 0x2, 0x46, 0x47, 0x3, 0x2, 0x2, 
       0x2, 0x47, 0x45, 0x3, 0x2, 0x2, 0x2, 0x47, 0x48, 0x3, 0x2, 0x2, 0x2, 
       0x48, 0x7, 0x3, 0x2, 0x2, 0x2, 0x49, 0x4c, 0x7, 0x18, 0x2, 0x2, 0x4a, 
       0x4b, 0x7, 0x1b, 0x2, 0x2, 0x4b, 0x4d, 0x7, 0x18, 0x2, 0x2, 0x4c, 
       0x4a, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x4e, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x4c, 
       0x3, 0x2, 0x2, 0x2, 0x4e, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x9, 0x3, 
       0x2, 0x2, 0x2, 0x50, 0x51, 0x7, 0x18, 0x2, 0x2, 0x51, 0x6c, 0x7, 
       0x1c, 0x2, 0x2, 0x52, 0x54, 0x7, 0x21, 0x2, 0x2, 0x53, 0x52, 0x3, 
       0x2, 0x2, 0x2, 0x53, 0x54, 0x3, 0x2, 0x2, 0x2, 0x54, 0x5a, 0x3, 0x2, 
       0x2, 0x2, 0x55, 0x5b, 0x7, 0x18, 0x2, 0x2, 0x56, 0x5b, 0x5, 0x8, 
       0x5, 0x2, 0x57, 0x5b, 0x7, 0x12, 0x2, 0x2, 0x58, 0x5b, 0x5, 0xa, 
       0x6, 0x2, 0x59, 0x5b, 0x5, 0x18, 0xd, 0x2, 0x5a, 0x55, 0x3, 0x2, 
       0x2, 0x2, 0x5a, 0x56, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x57, 0x3, 0x2, 0x2, 
       0x2, 0x5a, 0x58, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x59, 0x3, 0x2, 0x2, 0x2, 
       0x5b, 0x69, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x5e, 0x7, 0x20, 0x2, 0x2, 
       0x5d, 0x5f, 0x7, 0x21, 0x2, 0x2, 0x5e, 0x5d, 0x3, 0x2, 0x2, 0x2, 
       0x5e, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x65, 0x3, 0x2, 0x2, 0x2, 0x60, 
       0x66, 0x7, 0x18, 0x2, 0x2, 0x61, 0x66, 0x5, 0x8, 0x5, 0x2, 0x62, 
       0x66, 0x7, 0x12, 0x2, 0x2, 0x63, 0x66, 0x5, 0xa, 0x6, 0x2, 0x64, 
       0x66, 0x5, 0x18, 0xd, 0x2, 0x65, 0x60, 0x3, 0x2, 0x2, 0x2, 0x65, 
       0x61, 0x3, 0x2, 0x2, 0x2, 0x65, 0x62, 0x3, 0x2, 0x2, 0x2, 0x65, 0x63, 
       0x3, 0x2, 0x2, 0x2, 0x65, 0x64, 0x3, 0x2, 0x2, 0x2, 0x66, 0x68, 0x3, 
       0x2, 0x2, 0x2, 0x67, 0x5c, 0x3, 0x2, 0x2, 0x2, 0x68, 0x6b, 0x3, 0x2, 
       0x2, 0x2, 0x69, 0x67, 0x3, 0x2, 0x2, 0x2, 0x69, 0x6a, 0x3, 0x2, 0x2, 
       0x2, 0x6a, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x69, 0x3, 0x2, 0x2, 0x2, 
       0x6c, 0x53, 0x3, 0x2, 0x2, 0x2, 0x6c, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x6d, 
       0x6e, 0x3, 0x2, 0x2, 0x2, 0x6e, 0x6f, 0x7, 0x1d, 0x2, 0x2, 0x6f, 
       0xb, 0x3, 0x2, 0x2, 0x2, 0x70, 0x74, 0x7, 0x1e, 0x2, 0x2, 0x71, 0x73, 
       0x5, 0x4, 0x3, 0x2, 0x72, 0x71, 0x3, 0x2, 0x2, 0x2, 0x73, 0x76, 0x3, 
       0x2, 0x2, 0x2, 0x74, 0x72, 0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x3, 0x2, 
       0x2, 0x2, 0x75, 0x7c, 0x3, 0x2, 0x2, 0x2, 0x76, 0x74, 0x3, 0x2, 0x2, 
       0x2, 0x77, 0x78, 0x7, 0x22, 0x2, 0x2, 0x78, 0x79, 0x5, 0x18, 0xd, 
       0x2, 0x79, 0x7a, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7b, 0x7, 0x13, 0x2, 
       0x2, 0x7b, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x77, 0x3, 0x2, 0x2, 0x2, 
       0x7c, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7e, 0x3, 0x2, 0x2, 0x2, 0x7e, 
       0x7f, 0x7, 0x1f, 0x2, 0x2, 0x7f, 0xd, 0x3, 0x2, 0x2, 0x2, 0x80, 0x81, 
       0x9, 0x2, 0x2, 0x2, 0x81, 0x82, 0x9, 0x3, 0x2, 0x2, 0x82, 0x93, 0x7, 
       0x1c, 0x2, 0x2, 0x83, 0x85, 0x7, 0x14, 0x2, 0x2, 0x84, 0x86, 0x7, 
       0x21, 0x2, 0x2, 0x85, 0x84, 0x3, 0x2, 0x2, 0x2, 0x85, 0x86, 0x3, 
       0x2, 0x2, 0x2, 0x86, 0x87, 0x3, 0x2, 0x2, 0x2, 0x87, 0x90, 0x7, 0x18, 
       0x2, 0x2, 0x88, 0x89, 0x7, 0x20, 0x2, 0x2, 0x89, 0x8b, 0x7, 0x14, 
       0x2, 0x2, 0x8a, 0x8c, 0x7, 0x21, 0x2, 0x2, 0x8b, 0x8a, 0x3, 0x2, 
       0x2, 0x2, 0x8b, 0x8c, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x8d, 0x3, 0x2, 0x2, 
       0x2, 0x8d, 0x8f, 0x7, 0x18, 0x2, 0x2, 0x8e, 0x88, 0x3, 0x2, 0x2, 
       0x2, 0x8f, 0x92, 0x3, 0x2, 0x2, 0x2, 0x90, 0x8e, 0x3, 0x2, 0x2, 0x2, 
       0x90, 0x91, 0x3, 0x2, 0x2, 0x2, 0x91, 0x94, 0x3, 0x2, 0x2, 0x2, 0x92, 
       0x90, 0x3, 0x2, 0x2, 0x2, 0x93, 0x83, 0x3, 0x2, 0x2, 0x2, 0x93, 0x94, 
       0x3, 0x2, 0x2, 0x2, 0x94, 0x95, 0x3, 0x2, 0x2, 0x2, 0x95, 0x96, 0x7, 
       0x1d, 0x2, 0x2, 0x96, 0x97, 0x5, 0xc, 0x7, 0x2, 0x97, 0xf, 0x3, 0x2, 
       0x2, 0x2, 0x98, 0x9b, 0x5, 0x12, 0xa, 0x2, 0x99, 0x9b, 0x5, 0x14, 
       0xb, 0x2, 0x9a, 0x98, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x99, 0x3, 0x2, 0x2, 
       0x2, 0x9b, 0x11, 0x3, 0x2, 0x2, 0x2, 0x9c, 0x9d, 0x7, 0x24, 0x2, 
       0x2, 0x9d, 0x9e, 0x7, 0x1c, 0x2, 0x2, 0x9e, 0x9f, 0x7, 0x14, 0x2, 
       0x2, 0x9f, 0xa0, 0x7, 0x18, 0x2, 0x2, 0xa0, 0xa1, 0x7, 0x25, 0x2, 
       0x2, 0xa1, 0xa2, 0x5, 0x18, 0xd, 0x2, 0xa2, 0xa3, 0x7, 0x1d, 0x2, 
       0x2, 0xa3, 0xa4, 0x5, 0xc, 0x7, 0x2, 0xa4, 0x13, 0x3, 0x2, 0x2, 0x2, 
       0xa5, 0xa6, 0x7, 0x26, 0x2, 0x2, 0xa6, 0xa7, 0x7, 0x1c, 0x2, 0x2, 
       0xa7, 0xa8, 0x5, 0x18, 0xd, 0x2, 0xa8, 0xa9, 0x7, 0x1d, 0x2, 0x2, 
       0xa9, 0xaa, 0x5, 0xc, 0x7, 0x2, 0xaa, 0x15, 0x3, 0x2, 0x2, 0x2, 0xab, 
       0xac, 0x7, 0x1c, 0x2, 0x2, 0xac, 0xad, 0x5, 0x18, 0xd, 0x2, 0xad, 
       0xae, 0x7, 0x1d, 0x2, 0x2, 0xae, 0x17, 0x3, 0x2, 0x2, 0x2, 0xaf, 
       0xb3, 0x5, 0x1c, 0xf, 0x2, 0xb0, 0xb3, 0x5, 0x16, 0xc, 0x2, 0xb1, 
       0xb3, 0x5, 0x24, 0x13, 0x2, 0xb2, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xb2, 
       0xb0, 0x3, 0x2, 0x2, 0x2, 0xb2, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xb3, 0x19, 
       0x3, 0x2, 0x2, 0x2, 0xb4, 0xb6, 0x7, 0x14, 0x2, 0x2, 0xb5, 0xb4, 
       0x3, 0x2, 0x2, 0x2, 0xb5, 0xb6, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xbb, 0x3, 
       0x2, 0x2, 0x2, 0xb7, 0xba, 0x7, 0x18, 0x2, 0x2, 0xb8, 0xba, 0x5, 
       0x8, 0x5, 0x2, 0xb9, 0xb7, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xb8, 0x3, 0x2, 
       0x2, 0x2, 0xba, 0xbd, 0x3, 0x2, 0x2, 0x2, 0xbb, 0xb9, 0x3, 0x2, 0x2, 
       0x2, 0xbb, 0xbc, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xbe, 0x3, 0x2, 0x2, 0x2, 
       0xbd, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xbe, 0xbf, 0x7, 0x19, 0x2, 0x2, 
       0xbf, 0xc0, 0x5, 0x18, 0xd, 0x2, 0xc0, 0x1b, 0x3, 0x2, 0x2, 0x2, 
       0xc1, 0xc3, 0x9, 0x4, 0x2, 0x2, 0xc2, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xc2, 
       0xc3, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc4, 0x3, 0x2, 0x2, 0x2, 0xc4, 0xc5, 
       0x5, 0x20, 0x11, 0x2, 0xc5, 0x1d, 0x3, 0x2, 0x2, 0x2, 0xc6, 0xc8, 
       0x7, 0x14, 0x2, 0x2, 0xc7, 0xc6, 0x3, 0x2, 0x2, 0x2, 0xc7, 0xc8, 
       0x3, 0x2, 0x2, 0x2, 0xc8, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xc9, 0xd1, 0x7, 
       0x18, 0x2, 0x2, 0xca, 0xd1, 0x7, 0x15, 0x2, 0x2, 0xcb, 0xd1, 0x7, 
       0x12, 0x2, 0x2, 0xcc, 0xd1, 0x5, 0x6, 0x4, 0x2, 0xcd, 0xd1, 0x5, 
       0x8, 0x5, 0x2, 0xce, 0xd1, 0x5, 0xa, 0x6, 0x2, 0xcf, 0xd1, 0x5, 0x16, 
       0xc, 0x2, 0xd0, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xca, 0x3, 0x2, 0x2, 
       0x2, 0xd0, 0xcb, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xcc, 0x3, 0x2, 0x2, 0x2, 
       0xd0, 0xcd, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xce, 0x3, 0x2, 0x2, 0x2, 0xd0, 
       0xcf, 0x3, 0x2, 0x2, 0x2, 0xd1, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xd9, 
       0x5, 0x22, 0x12, 0x2, 0xd3, 0xd4, 0x7, 0x5, 0x2, 0x2, 0xd4, 0xd8, 
       0x5, 0x22, 0x12, 0x2, 0xd5, 0xd6, 0x7, 0x4, 0x2, 0x2, 0xd6, 0xd8, 
       0x5, 0x22, 0x12, 0x2, 0xd7, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xd7, 0xd5, 
       0x3, 0x2, 0x2, 0x2, 0xd8, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xd7, 0x3, 
       0x2, 0x2, 0x2, 0xd9, 0xda, 0x3, 0x2, 0x2, 0x2, 0xda, 0x21, 0x3, 0x2, 
       0x2, 0x2, 0xdb, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xe3, 0x5, 0x1e, 
       0x10, 0x2, 0xdd, 0xde, 0x7, 0x6, 0x2, 0x2, 0xde, 0xe2, 0x5, 0x1e, 
       0x10, 0x2, 0xdf, 0xe0, 0x7, 0x7, 0x2, 0x2, 0xe0, 0xe2, 0x5, 0x1e, 
       0x10, 0x2, 0xe1, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xe1, 0xdf, 0x3, 0x2, 
       0x2, 0x2, 0xe2, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe1, 0x3, 0x2, 0x2, 
       0x2, 0xe3, 0xe4, 0x3, 0x2, 0x2, 0x2, 0xe4, 0x23, 0x3, 0x2, 0x2, 0x2, 
       0xe5, 0xe3, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xed, 0x5, 0x1e, 0x10, 0x2, 
       0xe7, 0xe8, 0x7, 0x8, 0x2, 0x2, 0xe8, 0xee, 0x5, 0x1e, 0x10, 0x2, 
       0xe9, 0xea, 0x7, 0x9, 0x2, 0x2, 0xea, 0xee, 0x5, 0x1e, 0x10, 0x2, 
       0xeb, 0xec, 0x7, 0xa, 0x2, 0x2, 0xec, 0xee, 0x5, 0x1e, 0x10, 0x2, 
       0xed, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xed, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xed, 
       0xeb, 0x3, 0x2, 0x2, 0x2, 0xed, 0xee, 0x3, 0x2, 0x2, 0x2, 0xee, 0x25, 
       0x3, 0x2, 0x2, 0x2, 0xef, 0xf2, 0x5, 0x28, 0x15, 0x2, 0xf0, 0xf2, 
       0x5, 0x2a, 0x16, 0x2, 0xf1, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xf0, 
       0x3, 0x2, 0x2, 0x2, 0xf2, 0x27, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf4, 0x7, 
       0xb, 0x2, 0x2, 0xf4, 0xf5, 0x7, 0x1c, 0x2, 0x2, 0xf5, 0xfa, 0x5, 
       0x18, 0xd, 0x2, 0xf6, 0xf7, 0x9, 0x5, 0x2, 0x2, 0xf7, 0xf9, 0x5, 
       0x18, 0xd, 0x2, 0xf8, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xfc, 0x3, 
       0x2, 0x2, 0x2, 0xfa, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xfa, 0xfb, 0x3, 0x2, 
       0x2, 0x2, 0xfb, 0xfd, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfa, 0x3, 0x2, 0x2, 
       0x2, 0xfd, 0xfe, 0x7, 0x1d, 0x2, 0x2, 0xfe, 0x101, 0x5, 0xc, 0x7, 
       0x2, 0xff, 0x100, 0x7, 0xe, 0x2, 0x2, 0x100, 0x102, 0x5, 0xc, 0x7, 
       0x2, 0x101, 0xff, 0x3, 0x2, 0x2, 0x2, 0x101, 0x102, 0x3, 0x2, 0x2, 
       0x2, 0x102, 0x29, 0x3, 0x2, 0x2, 0x2, 0x103, 0x104, 0x7, 0xf, 0x2, 
       0x2, 0x104, 0x105, 0x7, 0x1c, 0x2, 0x2, 0x105, 0x106, 0x5, 0x18, 
       0xd, 0x2, 0x106, 0x107, 0x7, 0x1d, 0x2, 0x2, 0x107, 0x10b, 0x7, 0x25, 
       0x2, 0x2, 0x108, 0x109, 0x7, 0x10, 0x2, 0x2, 0x109, 0x10a, 0x9, 0x6, 
       0x2, 0x2, 0x10a, 0x10c, 0x5, 0xc, 0x7, 0x2, 0x10b, 0x108, 0x3, 0x2, 
       0x2, 0x2, 0x10c, 0x10d, 0x3, 0x2, 0x2, 0x2, 0x10d, 0x10b, 0x3, 0x2, 
       0x2, 0x2, 0x10d, 0x10e, 0x3, 0x2, 0x2, 0x2, 0x10e, 0x111, 0x3, 0x2, 
       0x2, 0x2, 0x10f, 0x110, 0x7, 0x11, 0x2, 0x2, 0x110, 0x112, 0x5, 0xc, 
       0x7, 0x2, 0x111, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x111, 0x112, 0x3, 0x2, 
       0x2, 0x2, 0x112, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x25, 0x2f, 0x3d, 0x41, 
       0x47, 0x4e, 0x53, 0x5a, 0x5e, 0x65, 0x69, 0x6c, 0x74, 0x7c, 0x85, 
       0x8b, 0x90, 0x93, 0x9a, 0xb2, 0xb5, 0xb9, 0xbb, 0xc2, 0xc7, 0xd0, 
       0xd7, 0xd9, 0xe1, 0xe3, 0xed, 0xf1, 0xfa, 0x101, 0x10d, 0x111, 
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

PolyaGramParserParser::Initializer PolyaGramParserParser::_init;
