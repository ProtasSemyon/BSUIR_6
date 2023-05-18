
// Generated from /home/smn/BSUIR_6/YAPIS/2/PolyaGramParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"




class  PolyaGramParserParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, 
    T__14 = 15, STRING = 16, SEMI = 17, TYPE = 18, INT = 19, OP = 20, OPERATOR_ID = 21, 
    ID = 22, EQ = 23, WS = 24, Point = 25, LEFT_BR = 26, RIGHT_BR = 27, 
    LEFT_FIG = 28, RIGHT_FIG = 29, COMMA = 30, AMPERSANT = 31, RETURN = 32, 
    FUNCTION = 33, FOR = 34, COLON = 35, WHILE = 36, INDENT = 1, DEDENT = 2, 
    Assign = 3, Comma = 4, Semi = 5, Quot = 6, Return = 7, BlockStart = 8, 
    LParen = 10, RParen = 11, LCurly = 12, RCurly = 13, LSquare = 14, RSquare = 15, 
    Const = 16, TableType = 17, ColumnTupe = 18, RowType = 19, NumberType = 20, 
    TupleType = 21, StringWord = 22, Plus = 23, Minus = 24, Divide = 25, 
    Multiplication = 26, Less = 27, Equal = 28, More = 29, LessEqual = 30, 
    MoreEqual = 31, While = 32, For = 33, Switch = 34, Case = 35, Default = 36, 
    If = 37, Else = 38, Break = 39, IntNumber = 41, FloatNumber = 42, StringLiteral = 43, 
    UnterminatedStringLiteral = 44, NEWLINE = 45, BlockComment = 47, LineComment = 48
  };

  enum {
    RuleProgram = 0, RuleStatement = 1, RuleMethodUsage = 2, RuleFieldUsage = 3, 
    RuleFunctionUsage = 4, RuleBlock = 5, RuleFunc = 6, RuleLoop = 7, RuleFor_loop = 8, 
    RuleWhile_loop = 9, RuleBrackets_expr = 10, RuleBaseExpr = 11, RuleAsiignmentExpression = 12, 
    RuleUnaryExpr = 13, RuleAtomExpr = 14, RuleBinaryExpr = 15, RuleMulExpr = 16, 
    RuleLogicExpression = 17, RuleCondition = 18, RuleIf_cond = 19, RuleSwitch_cond = 20
  };

  explicit PolyaGramParserParser(antlr4::TokenStream *input);
  ~PolyaGramParserParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class ProgramContext;
  class StatementContext;
  class MethodUsageContext;
  class FieldUsageContext;
  class FunctionUsageContext;
  class BlockContext;
  class FuncContext;
  class LoopContext;
  class For_loopContext;
  class While_loopContext;
  class Brackets_exprContext;
  class BaseExprContext;
  class AsiignmentExpressionContext;
  class UnaryExprContext;
  class AtomExprContext;
  class BinaryExprContext;
  class MulExprContext;
  class LogicExpressionContext;
  class ConditionContext;
  class If_condContext;
  class Switch_condContext; 

  class  ProgramContext : public antlr4::ParserRuleContext {
  public:
    ProgramContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EOF();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);

   
  };

  ProgramContext* program();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FuncContext *func();
    LoopContext *loop();
    ConditionContext *condition();
    AsiignmentExpressionContext *asiignmentExpression();
    antlr4::tree::TerminalNode *SEMI();
    UnaryExprContext *unaryExpr();
    MethodUsageContext *methodUsage();

   
  };

  StatementContext* statement();

  class  MethodUsageContext : public antlr4::ParserRuleContext {
  public:
    MethodUsageContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    std::vector<FunctionUsageContext *> functionUsage();
    FunctionUsageContext* functionUsage(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Point();
    antlr4::tree::TerminalNode* Point(size_t i);

   
  };

  MethodUsageContext* methodUsage();

  class  FieldUsageContext : public antlr4::ParserRuleContext {
  public:
    FieldUsageContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Point();
    antlr4::tree::TerminalNode* Point(size_t i);

   
  };

  FieldUsageContext* fieldUsage();

  class  FunctionUsageContext : public antlr4::ParserRuleContext {
  public:
    FunctionUsageContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    antlr4::tree::TerminalNode *LEFT_BR();
    antlr4::tree::TerminalNode *RIGHT_BR();
    std::vector<FieldUsageContext *> fieldUsage();
    FieldUsageContext* fieldUsage(size_t i);
    std::vector<antlr4::tree::TerminalNode *> STRING();
    antlr4::tree::TerminalNode* STRING(size_t i);
    std::vector<FunctionUsageContext *> functionUsage();
    FunctionUsageContext* functionUsage(size_t i);
    std::vector<BaseExprContext *> baseExpr();
    BaseExprContext* baseExpr(size_t i);
    std::vector<antlr4::tree::TerminalNode *> AMPERSANT();
    antlr4::tree::TerminalNode* AMPERSANT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

   
  };

  FunctionUsageContext* functionUsage();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LEFT_FIG();
    antlr4::tree::TerminalNode *RIGHT_FIG();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);
    antlr4::tree::TerminalNode *SEMI();
    antlr4::tree::TerminalNode *RETURN();
    BaseExprContext *baseExpr();

   
  };

  BlockContext* block();

  class  FuncContext : public antlr4::ParserRuleContext {
  public:
    FuncContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LEFT_BR();
    antlr4::tree::TerminalNode *RIGHT_BR();
    BlockContext *block();
    std::vector<antlr4::tree::TerminalNode *> TYPE();
    antlr4::tree::TerminalNode* TYPE(size_t i);
    antlr4::tree::TerminalNode *FUNCTION();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    antlr4::tree::TerminalNode *OPERATOR_ID();
    std::vector<antlr4::tree::TerminalNode *> AMPERSANT();
    antlr4::tree::TerminalNode* AMPERSANT(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);

   
  };

  FuncContext* func();

  class  LoopContext : public antlr4::ParserRuleContext {
  public:
    LoopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    For_loopContext *for_loop();
    While_loopContext *while_loop();

   
  };

  LoopContext* loop();

  class  For_loopContext : public antlr4::ParserRuleContext {
  public:
    For_loopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FOR();
    antlr4::tree::TerminalNode *LEFT_BR();
    antlr4::tree::TerminalNode *TYPE();
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *COLON();
    BaseExprContext *baseExpr();
    antlr4::tree::TerminalNode *RIGHT_BR();
    BlockContext *block();

   
  };

  For_loopContext* for_loop();

  class  While_loopContext : public antlr4::ParserRuleContext {
  public:
    While_loopContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WHILE();
    antlr4::tree::TerminalNode *LEFT_BR();
    BaseExprContext *baseExpr();
    antlr4::tree::TerminalNode *RIGHT_BR();
    BlockContext *block();

   
  };

  While_loopContext* while_loop();

  class  Brackets_exprContext : public antlr4::ParserRuleContext {
  public:
    Brackets_exprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LEFT_BR();
    BaseExprContext *baseExpr();
    antlr4::tree::TerminalNode *RIGHT_BR();

   
  };

  Brackets_exprContext* brackets_expr();

  class  BaseExprContext : public antlr4::ParserRuleContext {
  public:
    BaseExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnaryExprContext *unaryExpr();
    Brackets_exprContext *brackets_expr();
    LogicExpressionContext *logicExpression();

   
  };

  BaseExprContext* baseExpr();

  class  AsiignmentExpressionContext : public antlr4::ParserRuleContext {
  public:
    AsiignmentExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EQ();
    BaseExprContext *baseExpr();
    antlr4::tree::TerminalNode *TYPE();
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<FieldUsageContext *> fieldUsage();
    FieldUsageContext* fieldUsage(size_t i);

   
  };

  AsiignmentExpressionContext* asiignmentExpression();

  class  UnaryExprContext : public antlr4::ParserRuleContext {
  public:
    UnaryExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BinaryExprContext *binaryExpr();

   
  };

  UnaryExprContext* unaryExpr();

  class  AtomExprContext : public antlr4::ParserRuleContext {
  public:
    AtomExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *TYPE();
    antlr4::tree::TerminalNode *INT();
    antlr4::tree::TerminalNode *STRING();
    MethodUsageContext *methodUsage();
    FieldUsageContext *fieldUsage();
    FunctionUsageContext *functionUsage();
    Brackets_exprContext *brackets_expr();

   
  };

  AtomExprContext* atomExpr();

  class  BinaryExprContext : public antlr4::ParserRuleContext {
  public:
    BinaryExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<MulExprContext *> mulExpr();
    MulExprContext* mulExpr(size_t i);

   
  };

  BinaryExprContext* binaryExpr();

  class  MulExprContext : public antlr4::ParserRuleContext {
  public:
    MulExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AtomExprContext *> atomExpr();
    AtomExprContext* atomExpr(size_t i);

   
  };

  MulExprContext* mulExpr();

  class  LogicExpressionContext : public antlr4::ParserRuleContext {
  public:
    LogicExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AtomExprContext *> atomExpr();
    AtomExprContext* atomExpr(size_t i);

   
  };

  LogicExpressionContext* logicExpression();

  class  ConditionContext : public antlr4::ParserRuleContext {
  public:
    ConditionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    If_condContext *if_cond();
    Switch_condContext *switch_cond();

   
  };

  ConditionContext* condition();

  class  If_condContext : public antlr4::ParserRuleContext {
  public:
    If_condContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LEFT_BR();
    antlr4::tree::TerminalNode *RIGHT_BR();
    std::vector<BlockContext *> block();
    BlockContext* block(size_t i);
    std::vector<BaseExprContext *> baseExpr();
    BaseExprContext* baseExpr(size_t i);

   
  };

  If_condContext* if_cond();

  class  Switch_condContext : public antlr4::ParserRuleContext {
  public:
    Switch_condContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LEFT_BR();
    BaseExprContext *baseExpr();
    antlr4::tree::TerminalNode *RIGHT_BR();
    antlr4::tree::TerminalNode *COLON();
    std::vector<BlockContext *> block();
    BlockContext* block(size_t i);
    std::vector<antlr4::tree::TerminalNode *> ID();
    antlr4::tree::TerminalNode* ID(size_t i);
    std::vector<antlr4::tree::TerminalNode *> INT();
    antlr4::tree::TerminalNode* INT(size_t i);

   
  };

  Switch_condContext* switch_cond();


private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

