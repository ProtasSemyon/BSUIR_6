#!/bin/zsh

antlr4 -o ./.antlr testGr*.g4
javac -cp /usr/local/lib/antlr-4.11.1-complete.jar -d ./.antlr ./.antlr/testGr*.java  
cd ./.antlr
grun testGr script ../sample.txt -gui
cd ..