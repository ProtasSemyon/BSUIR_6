#include <iostream>

#include "src/Parser.hpp"
#include "src/Validator.hpp"

int main() {
    auto parseResult = Parser::parse("(((((P/\\Q)/\\R)\\/((P/\\(!Q))/\\R))\\/(((P/\\(!Q))/\\(!R))\\/(((!P)/\\Q)/\\(!R))))\\/(((!P)/\\(!Q))/\\(!R)))");
    std::cout << parseResult->toString() << std::endl;
    Validator validator;
    if (validator.isFormulaPDNF(parseResult)) {
        std::cout << "Valid\n";
    } else {
        std::cout << "Invalid\n";
    }
}