// Лабораторная работа 2 по дисциплине ЛОИС
// Выполнена студентом группы 021701
// БГУИР Протас С.А.
// Вариант 7 - Перечислить фиктивные пропозициональные переменные в формуле сокращённого языка логики высказываний
// 01ю03.2023

#include <iostream>
#include <limits>

#include "src/Table.hpp"
#include "src/Parser.hpp"
#include "src/LogicFormula.hpp"

int main() {
    while (true) {
        std::cout << "1. Check formula\n2. Exit program\n";
        std::string option;
        std::cin >> option;
        std::cin.ignore( std::numeric_limits<std::streamsize>::max(), '\n' );
        if (option == "2") {
            break;
        }
        if (option != "1") {
            continue;
        }
        
        std::cout << "Enter formula\n";
        std::string formula;
        std::getline(std::cin, formula);
        LogicFormulaPtr logicFormula;
        try {
            logicFormula = Parser::parse(formula);
        } catch (const std::invalid_argument& e) {
            std::cout << e.what() << std::endl;
            continue;
        }

        auto vars = Table::detectFictionVariables(logicFormula);
        std::cout << "Fiction variables:\n";
        if (vars.empty()) {
            std::cout << "None";
        }
        for (const auto& c:vars){
            std::cout << c << ' ';
        }
        std::cout << "\n\n";
    }
    return 0;
}