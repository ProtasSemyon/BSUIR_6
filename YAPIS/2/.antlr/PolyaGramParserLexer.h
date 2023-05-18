
// Generated from /home/smn/BSUIR_6/YAPIS/2/PolyaGramParser.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"




class  PolyaGramParserLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, 
    T__14 = 15, STRING = 16, SEMI = 17, TYPE = 18, INT = 19, OP = 20, OPERATOR_ID = 21, 
    ID = 22, EQ = 23, WS = 24, Point = 25, LEFT_BR = 26, RIGHT_BR = 27, 
    LEFT_FIG = 28, RIGHT_FIG = 29, COMMA = 30, AMPERSANT = 31, RETURN = 32, 
    FUNCTION = 33, FOR = 34, COLON = 35, WHILE = 36
  };

  explicit PolyaGramParserLexer(antlr4::CharStream *input);
  ~PolyaGramParserLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

