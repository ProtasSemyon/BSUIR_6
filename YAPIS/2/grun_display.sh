#!/bin/zsh

antlr4 -o ./.antlr ExprGrammar*.g4
javac -cp /usr/lib/antlr-4.12.0-complete.jar -d ./.antlr ./.antlr/ExprGrammar*.java  
cd ./.antlr
grun ExprGrammar program ../sample.rels -gui
cd ..