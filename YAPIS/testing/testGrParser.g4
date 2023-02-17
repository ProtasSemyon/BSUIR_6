parser grammar testGrParser;

options { tokenVocab=testGrLexer; }

script : ( NEWLINE | statement )* EOF ;

statement
    :   simpleStatement
    |   blockStatements
    ;

simpleStatement : LEGIT+ NEWLINE ;

blockStatements : LEGIT+ NEWLINE INDENT statement+ DEDENT ;
