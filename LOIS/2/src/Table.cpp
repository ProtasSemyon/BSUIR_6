#include "Table.hpp"

#include <algorithm>
#include <iterator>
#include <set>

std::vector<bool> Table::calculate(const LogicFormulaPtr& formula) {
    return calculate(formula, getAtomicsVector(formula));
}

std::vector<char> Table::getAtomicsVector(const LogicFormulaPtr& formula) {
    std::vector<char> atomics;
    for(auto& v: formula->getAtomics()){
        atomics.insert(atomics.begin(), v);
    }
    return atomics;
}

Table::ValuesTable Table::buildValuesTable(const std::vector<char>& atomics) {
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

std::vector<bool> Table::calculate(const LogicFormulaPtr& formula, const std::vector<char> &atomics) {
    std::vector<bool> result;
    for(int i = 0; i < 1 << atomics.size(); i++){
        auto valueVect = getBinary(i, atomics.size());
        std::map<char, bool> valueMap;
        for (int j = 0;j < atomics.size();j++) {
            valueMap.insert({atomics[j], valueVect[j]});
        }
        result.push_back(formula->calculate(valueMap));
    }
    return result;
}

std::vector<bool> Table::getBinary(int num, int size) {
    std::vector<bool> result;
    for(int i = 0; i < size; i++) {
        result.emplace_back(num & 1);
        num >>= 1;
    }
    return result;
}

std::vector<char> Table::detectFictionVariables(const LogicFormulaPtr& formula) {
    auto atomics = getAtomicsVector(formula);
    auto result = calculate(formula, atomics);

    std::vector<char> fictionVariables;

    for (int i = 0;i < atomics.size(); i++) {
        std::vector<bool> falseValues;
        std::vector<bool> trueValues;
        for (int j = 0; j < result.size(); j++) {
            auto tableRow = getBinary(j, atomics.size());
            if (tableRow[i]) {
                trueValues.emplace_back(result[j]);
            } else {
                falseValues.emplace_back(result[j]);
            }
        }
        if (falseValues == trueValues) {
            fictionVariables.emplace_back(atomics[i]);
        }
    }

    return fictionVariables;
}


