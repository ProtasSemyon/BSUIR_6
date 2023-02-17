#include "Parser.hpp"
#include "LogicFormula.hpp"

#include <memory>
#include <stdexcept>
#include <string>

bool skipBraces(const std::string& str, size_t &position) {
    int lBr = 0;
    int rBr = 0;

    if (str.size() > position && str[position] == '(') {
        lBr++;
        position++;
    } else {
        return false;
    }

    while (lBr > rBr && position < str.size()) {
        switch(str[position]) {
        case '(':
            lBr++;
            break;
        case ')':
            rBr++;
            break;
        }
        position++;
    }

    return lBr == rBr;
}   


LogicFormulaPtr Parser::parse(const std::string& str) {
    if (str.size() == 1) {
        if (str[0] == TRUE || str[0] == FALSE) {
            return std::make_shared<LogicConstant>(str[0]);
        }
        if (str[0] >= 'A' && str[0] <= 'Z') {
            return std::make_shared<AtomicFormula>(str[0]);
        }

        throw std::invalid_argument("Invalid input: " + str);
    }

    size_t v = 0;
    if(!skipBraces(str, v) || v < str.size()) {
        throw std::invalid_argument("Invalid input: " + str);  
    }

    if (const auto formula = parseUnary(str.substr(1, str.size() - 2))) {
        return formula;
    }

    if (const auto formula = parseBinary(str.substr(1, str.size() - 2))) {
        return formula;
    }

    throw std::invalid_argument("Invalid input: " + str);
}

LogicFormulaPtr Parser::parseBinary(const std::string& str) {
    if (const auto formula = parseConjunction(str)) {
        return formula;
    }
    if (const auto formula = parseDisjunction(str)) {
        return formula;
    }
    if (const auto formula = parseImplication(str)) {
        return formula;
    }
    if (const auto formula = parseEquivalent(str)) {
        return formula;
    }
    return nullptr;
}

LogicFormulaPtr Parser::parseConjunction(const std::string& str) {
    size_t position = 0;
    if (!skipBraces(str, position)){
        position++;
    }
    if (str.find(CONJUNCTION, position) != position) {
        return nullptr;
    }

    auto lhs = parse(str.substr(0, position));
    auto rhs = parse(str.substr(position + CONJUNCTION.size(), str.size()));

    return std::make_shared<ConjunctionF>(lhs, rhs);
}

LogicFormulaPtr Parser::parseDisjunction(const std::string& str) {
    size_t position = 0;
    if (!skipBraces(str, position)){
        position++;
    }
    if (str.find(DISJUNCTION, position) != position) {
        return nullptr;
    }

    auto lhs = parse(str.substr(0, position));
    auto rhs = parse(str.substr(position + DISJUNCTION.size(), str.size()));

    return std::make_shared<DisjunctionF>(lhs, rhs);

}

LogicFormulaPtr Parser::parseImplication(const std::string& str) {
    size_t position = 0;
    if (!skipBraces(str, position)){
        position++;
    }
    if (str.find(IMPLICATION, position) != position) {
        return nullptr;
    }

    auto lhs = parse(str.substr(0, position));
    auto rhs = parse(str.substr(position + IMPLICATION.size(), str.size()));

    return std::make_shared<ImplicationF>(lhs, rhs);

}

LogicFormulaPtr Parser::parseEquivalent(const std::string& str) {
    size_t position = 0;
    if (!skipBraces(str, position)){
        position++;
    }
    if (str.find(EQUIVALENT, position) != position) {
        return nullptr;
    }

    auto lhs = parse(str.substr(0, position));
    auto rhs = parse(str.substr(position + EQUIVALENT.size(), str.size()));

    return std::make_shared<EquivalentF>(lhs, rhs);

}

LogicFormulaPtr Parser::parseUnary(const std::string& str) {
    return parseNegation(str);
}

LogicFormulaPtr Parser::parseNegation(const std::string& str) {
    if(str.empty() || str[0] != NEGATION) {
        return nullptr;
    }

    auto rhs = parse(str.substr(1, str.size()));

    return std::make_shared<NegationF>(rhs);
}

