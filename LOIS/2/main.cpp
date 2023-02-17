#include <iostream>

#include "src/Table.hpp"
#include "src/Parser.hpp"
#include "src/LogicFormula.hpp"

int main() {
    auto formula = Parser::parse("((A->B)\\/1)");
    auto calculateResult = Table::calculate(formula);
    auto fiction = Table::detectFictionVariables(formula);
    return 0;
}