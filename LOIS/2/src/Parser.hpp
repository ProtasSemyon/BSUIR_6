#pragma once

#include "LogicFormula.hpp"

class Parser {
public:
    static LogicFormulaPtr parse(const std::string& str);
private:
    static LogicFormulaPtr parseFormula(const std::string& str);

    static LogicFormulaPtr parseBinary(const std::string& str);

    static LogicFormulaPtr parseConjunction(const std::string& str);

    static LogicFormulaPtr parseDisjunction(const std::string& str);

    static LogicFormulaPtr parseImplication(const std::string& str);
    
    static LogicFormulaPtr parseEquivalent(const std::string& str);
    
    static LogicFormulaPtr parseUnary(const std::string& str);

    static LogicFormulaPtr parseNegation(const std::string& str);

};