#include "utils.h"
#include <string.h>

void strAlign(char * str, const char * addStr, int size) {
  strcat(str, addStr);
  int addSpaces = size - strlen(addStr);
  for (int j = 0; j < addSpaces; j++) {
    strcat(str, " ");
  }
}

int getTableMaxLen(Table* t) {
  int maxLen = 0;
  for (int i = 0;i < t->columnCount;i++) {
    if (strlen(t->columns[i].name) > maxLen) {
      maxLen = strlen(t->columns[i].name);
    }
  }

  for (int i = 0; i < t->rowCount;i++) {
    for (int j = 0; j < t->columnCount;j++) {
      if (strlen(t->rows[i].data[j]) > maxLen) {
        maxLen = strlen(t->rows[i].data[j]);
      }
    }
  }

  return maxLen;
}

int getRowMaxLen(Row *row) {
  int maxLen = 0;
  for (int i = 0;i < row->rowSize;i++) {
    if (strlen(row->data[i]) > maxLen) {
      maxLen = strlen(row->data[i]);
    }
  }
  return maxLen;
}