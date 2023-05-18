#ifndef TABLE_H
#define TABLE_H

#include <stdlib.h>

#include "Column.h"
#include "Row.h"
 
typedef struct {
  Column columns[1000];
  Row rows[1000];
  size_t rowCount;
  size_t columnCount;
} Table;

Table createTable(Column columns[], size_t size);

void insertRow(Table *table, Row row);

void insertColumn(Table *table, Column column);

void insertElement(Table *table, Column column, size_t rowIndex, char * data);

void print_table(Table* table);

#endif // !TABLE_H