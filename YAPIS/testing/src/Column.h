#ifndef COLUMN_H
#define COLUMN_H

#include <string.h>

typedef struct {
  char * name;
} Column;

Column createColumn(char* name);

void print_column(Column* column);

#endif // !COLUMN_H

