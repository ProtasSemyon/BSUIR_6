#include "Set.hpp"

Printer::Printer() {
  filename = 12;
  info = "bruh";
}

void Printer::print(const char * data) {
  std::cout << data << ' ' << filename << std::endl;
}

const char * Printer::get_text() {
  return info.c_str();
}

extern "C" {
  void print(Printer *printer, const char * data) {
    printer->print(data);
  }

  void printerInit(Printer *&printer) {
    printer = new Printer();
  }
}
