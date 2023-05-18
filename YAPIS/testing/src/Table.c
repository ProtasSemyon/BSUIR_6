#include "Table.h"
#include "utils.h"
#include <stdio.h>

Table createTable(Column columns[], size_t size) {
  Table table;
  table.columnCount = 0;
  table.rowCount = 0;
  for(int i = 0;i < size; i++) {
    insertColumn(&table, columns[i]);
  }
  return table;
}

void insertRow(Table *table, Row row) {
  Row tmpRow;
  tmpRow.rowSize = 0;
  for (int i = 0;i < table->columnCount;i++) {
    addElementToRow(&tmpRow, row.data[i]);
  }
  table->rows[table->rowCount] = tmpRow;
  table->rowCount++;

}

void insertColumn(Table *table, Column column) {
  table->columns[table->columnCount] = column;
  table->columnCount++;

  for (int i = 0; i < table->rowCount; i++) {
    addElementToRow(&table->rows[i], "");
  }
}

void insertElement(Table *table, Column column, size_t rowIndex, char * data) {
  int index = -1;
  for (int i = 0; i < table->columnCount; i++) {
    if (*table->columns[i].name == *column.name) {
      index = i;
    }
  }

  if (index == -1 || rowIndex >= table->rowCount) {
    return;
  }

  table->rows[rowIndex].data[index] = data;
}

void print_table(Table* table) {
  char columns[100000] = " | ";

  int cellSize = getTableMaxLen(table);
  
  for (int i = 0;i < table->columnCount;i++) {
    strAlign(columns, table->columns[i].name, cellSize);
    strcat(columns, " | ");
  }

  printf("%s\n", columns);

  char delimiter[strlen(columns) + 1];
  memset(delimiter, '-', strlen(columns));
  delimiter[strlen(columns)] = '\0';

  printf("%s\n", delimiter);

  for (int i = 0; i < table->rowCount; i++) {
    char row[100000] = " | ";

    for (int j = 0; j < table->columnCount; j++) {
      strAlign(row, table->rows[i].data[j], cellSize);
      strcat(row, " | ");
    }
    printf("%s\n", row);
    printf("%s\n", delimiter);
  }
}
