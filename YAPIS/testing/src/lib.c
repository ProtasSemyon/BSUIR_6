#include "lib.h"
#include <stdio.h>

void print(void* data, char fmt) {
  switch (fmt) {
    case 't':
      print_table((Table*)data);
      break;
    case 'c':
      print_column((Column*)data);
      break;
    case 'r':
      print_row((Row*)data);
      break;
    case 's':
      printf("%s", (char*)data);
      break;
    case 'n':
      printf("%d", *(int*)data);
      break;
    case 'f':
      printf("%f", *(float*)data);
      break;
    default:
      printf("error");
  }
}

