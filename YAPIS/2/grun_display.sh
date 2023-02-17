#!/bin/zsh

antlr4 -o ./.antlr RelScript*.g4
javac -cp /usr/local/lib/antlr-4.11.1-complete.jar -d ./.antlr ./.antlr/RelScript*.java  
cd ./.antlr
grun RelScript program ../sample.rels -gui
cd ..