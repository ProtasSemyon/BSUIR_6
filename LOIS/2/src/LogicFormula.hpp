#pragma once

#include <memory>
#include <set>
#include <string>
#include <vector>
#include <map>

enum Types {
    Conjunction,
    Disjunction,
    Implication,
    Equivalent,
    Negation,
    Atomic,
    Constant
};

const char TRUE = '1';
const char FALSE = '0';

const std::string CONJUNCTION = "/\\";
const std::string DISJUNCTION = "\\/";
const std::string IMPLICATION = "->";
const std::string EQUIVALENT = "~";
const char NEGATION = '!';

class LogicFormula;
using LogicFormulaPtr = std::shared_ptr<LogicFormula>;


class LogicFormula {
public:
    virtual Types getType() const = 0;
    virtual std::string toString() const = 0;
    virtual std::vector<LogicFormulaPtr> getChildren() const {
        return {};
    }
    virtual std::set<char> getAtomics() const = 0;
    virtual bool calculate(const std::map<char, bool> &values) const = 0;
};

class BinaryFormula : public LogicFormula {
public:
    BinaryFormula(const LogicFormulaPtr &left, const LogicFormulaPtr &right) : leftF(left), rightF(right) {}
    std::string toString() const final{
        return "(" + leftF->toString() + getSign() + rightF->toString() + ")";
    }
    std::vector<LogicFormulaPtr> getChildren() const override {
        return {leftF, rightF};
    }
    std::set<char> getAtomics() const override {
        auto result = leftF->getAtomics();
        for(auto& c : rightF->getAtomics()) {
            result.insert(c);
        }
        return result;
    }

private:
    LogicFormulaPtr leftF;
    LogicFormulaPtr rightF;

    virtual std::string getSign() const = 0;
};

class ConjunctionF : public BinaryFormula {
public:
    ConjunctionF(const LogicFormulaPtr &left, const LogicFormulaPtr &right) : BinaryFormula(left, right) {}
    Types getType() const override {
        return Types::Conjunction;
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    std::string getSign() const override{
        return "/\\";
    }
};

class DisjunctionF : public BinaryFormula {
public:
    DisjunctionF(const LogicFormulaPtr &left, const LogicFormulaPtr &right) : BinaryFormula(left, right) {}
    Types getType() const override {
        return Types::Disjunction;
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    std::string getSign() const override{
        return "\\/";
    }
};

class ImplicationF : public BinaryFormula { 
public:
    ImplicationF(const LogicFormulaPtr &left, const LogicFormulaPtr &right) : BinaryFormula(left, right) {}
    Types getType() const override {
        return Types::Implication;
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    std::string getSign() const override{
        return "->";
    }
};

class EquivalentF : public BinaryFormula {
public:
    EquivalentF(const LogicFormulaPtr &left, const LogicFormulaPtr &right) : BinaryFormula(left, right) {}
    Types getType() const override {
        return Types::Equivalent;
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    std::string getSign() const override{
        return "~";
    }
};

class UnaryFormula : public LogicFormula { 
public:
    UnaryFormula(const LogicFormulaPtr &child) : child(child) {}
    std::string toString() const override { 
        return  "(" + getSign() + child->toString() + ")";
    }
    std::vector<LogicFormulaPtr> getChildren() const override {
        return {child};
    }
    std::set<char> getAtomics() const override {
        return child->getAtomics();
    }


private:
    LogicFormulaPtr child;

    virtual std::string getSign() const = 0;
};

class NegationF : public UnaryFormula {
public:
    NegationF(const LogicFormulaPtr &child) : UnaryFormula(child) {}
    Types getType() const override {
        return Types::Negation;
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    std::string getSign() const override{
        return "!";
    }
};

class AtomicFormula : public LogicFormula { 
public:
    AtomicFormula(char value) : value(value) {}
    Types getType() const override {
        return Types::Atomic;
    }
    std::string toString() const override {
        return {value};
    }
    std::set<char> getAtomics() const override {
        return {value};
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    char value;
};

class LogicConstant : public LogicFormula {
public:
    LogicConstant(char value) : value(value) {}
    Types getType() const override {
        return Types::Constant;
    }
    std::string toString() const override {
        return {value};
    }
    std::set<char> getAtomics() const override {
        return {};
    }
    bool calculate(const std::map<char, bool> &values) const override;

private:
    char value;
};