#include "LogicFormula.hpp"


bool ConjunctionF::calculate(const std::map<char, bool> &values) const{
    const auto childs = getChildren();
    return childs[0]->calculate(values) && childs[1]->calculate(values);
}

bool DisjunctionF::calculate(const std::map<char, bool> &values) const{
    const auto childs = getChildren();
    return childs[0]->calculate(values) || childs[1]->calculate(values);
}

bool ImplicationF::calculate(const std::map<char, bool> &values) const{
    const auto childs = getChildren();
    return !childs[0]->calculate(values) || childs[1]->calculate(values);
}

bool EquivalentF::calculate(const std::map<char, bool> &values) const{
    const auto childs = getChildren();
    return childs[0]->calculate(values) == childs[1]->calculate(values);
}

bool NegationF::calculate(const std::map<char, bool> &values) const{
    return !getChildren()[0]->calculate(values);
}

bool AtomicFormula::calculate(const std::map<char, bool> &values) const{
    return values.at(value);
}

bool LogicConstant::calculate(const std::map<char, bool> &values) const{
    return value == TRUE;
}