#include "src/lib.h"

int main() {
  Column col1 = createColumn("Bh1");
  Column col2 = createColumn("Bruh2");
  Column col3 = createColumn("B");
  Column cols[3] = {col1, col2, col3};
  Table t = createTable(cols, 3);

  char * row[] = {"tefffffxt", "teffdfdfxt", "teasdfasdfasdfxt"};
  Row r = createRow(row, 3);
  insertRow(&t, r);
  print(&t, 't');
  print(&r, 'r');
  float n = 10.0;
  print(&n, 'f');

  return 0;
}