#include "Column.h"
#include <stdio.h>

Column createColumn(char* name) {
  Column column;
  column.name = name;
  return column;
}

void print_column(Column* column) {
  printf("%s\n", column->name);
}
