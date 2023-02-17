#include "Table.hpp"

#include <algorithm>
#include <iterator>
#include <set>

std::vector<bool> Table::calculate(const LogicFormulaPtr& formula) {
    return calculate(formula, buildAllValues(formula, getAtomicsVector(formula)));
}

std::vector<char> Table::getAtomicsVector(const LogicFormulaPtr& formula) {
    std::vector<char> atomics;
    for(auto& v: formula->getAtomics()){
        atomics.insert(atomics.begin(), v);
    }
    return atomics;
}

Table::ValuesTable Table::buildAllValues(const LogicFormulaPtr& formula, const std::vector<char>& atomics) {
    ValuesTable result;
    std::map<char, bool> values;
    for(int i = 0; i < 1 << atomics.size(); i++){
        int v = i;
        for(auto &value : atomics) {
            values[value] = v % 2 == 1;
            v = v >> 1;
        }
        result.emplace_back(values);
    }
    return result;
}

std::vector<bool> Table::calculate(const LogicFormulaPtr& formula, const ValuesTable &values) {
    std::vector<bool> result;
    for (auto& value : values) {
        result.emplace_back(formula->calculate(value));
    }
    return result;
}

std::vector<char> Table::detectFictionVariables(const LogicFormulaPtr& formula) {
    auto atomics = getAtomicsVector(formula);
    auto valuesTable = buildAllValues(formula, atomics);
    auto result = calculate(formula, valuesTable);

    std::vector<char> fictionVariables;

    for (const auto& v : atomics) {
        std::vector<bool> falseValues;
        std::vector<bool> trueValues;
        for (int i = 0; i < result.size(); i++) {
            if (valuesTable[i][v]) {
                trueValues.emplace_back(result[i]);
            } else {
                falseValues.emplace_back(result[i]);
            }
        }
        if (falseValues == trueValues) {
            fictionVariables.emplace_back(v);
        }
    }

    return fictionVariables;
}

