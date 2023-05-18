#pragma once

#include "LogicFormula.hpp"

class Table {
public:
    static std::vector<bool> calculate(const LogicFormulaPtr& formula);
    static std::vector<char> detectFictionVariables(const LogicFormulaPtr& formula);
private:
    using ValuesTable = std::vector<std::map<char, bool> >;
    static std::vector<char> getAtomicsVector(const LogicFormulaPtr& formula);
    static ValuesTable buildValuesTable(const std::vector<char>& atomics);
    static std::vector<bool> calculate(const LogicFormulaPtr& formula, const std::vector<char> &atomics);
    static std::vector<bool> getBinary(int num, int size);
};