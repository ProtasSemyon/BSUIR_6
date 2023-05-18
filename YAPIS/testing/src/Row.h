#ifndef ROW_H
#define ROW_H

#include <string.h>

typedef struct {
  char * data[1000];
  size_t rowSize;
} Row;

Row createRow(char* data[], size_t size);

void addElementToRow(Row *row, char *elem);

void print_row(Row *row);

#endif // !ROW_H

