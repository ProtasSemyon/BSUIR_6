#!/bin/zsh

antlr4 -o ./.antlr practicLesson_2*.g4
javac -cp /usr/local/lib/antlr-4.11.1-complete.jar -d ./.antlr ./.antlr/practicLesson_2*.java  
cd ./.antlr
grun practicLesson_2 s ../sample.txt -gui
cd ..