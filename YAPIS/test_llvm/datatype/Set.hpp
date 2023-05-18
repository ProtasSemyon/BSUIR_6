#include <iostream>
#include <string>

class Printer {
public:
  Printer();
  void print(const char * data);

  const char * get_text();
private:
 int filename;
 std::string info;
};
