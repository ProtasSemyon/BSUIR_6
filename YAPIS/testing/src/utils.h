#ifndef UTILS_H
#define UTILS_H

#include "Table.h"

void strAlign(char * str, const char * addStr, int size);

int getTableMaxLen(Table* t);

int getRowMaxLen(Row *row);

#endif // !UTILS_H
