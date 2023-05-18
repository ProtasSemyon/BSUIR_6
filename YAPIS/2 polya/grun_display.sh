#!/bin/zsh

antlr4 -o ./.antlr ExprParser*.g4
javac -cp /usr/lib/antlr-4.12.0-complete.jar -d ./.antlr ./.antlr/ExprParser*.java  
cd ./.antlr
grun ExprParser program ../sample.txt -gui
cd ..