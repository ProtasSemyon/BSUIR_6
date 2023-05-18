#include "Row.h"
#include "utils.h"
#include <stdio.h>

void addElementToRow(Row *row, char *elem) {
  row->data[row->rowSize] = elem;
  row->rowSize++;
}

Row createRow(char* data[], size_t size) {
  Row row;
  row.rowSize = size;
  for (int i = 0;i < size;i++) {
    row.data[i] = data[i];
  }
  return row;
}

void print_row(Row *row) {
  char rows[100000] = " | ";
 
  int cellSize = getRowMaxLen(row);

  for (int i = 0;i < row->rowSize;i++) {
    strAlign(rows, row->data[i], cellSize);
    strcat(rows, " | ");
  }

  printf("%s\n", rows);
}

