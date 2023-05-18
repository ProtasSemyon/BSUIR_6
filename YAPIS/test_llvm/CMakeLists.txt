cmake_minimum_required(VERSION 3.0.0)
project(GigachadCompiler VERSION 0.1.0)
set(CMAKE_CXX_STANDARD 17)

file(
  GLOB_RECURSE
  DATATYPE_DEPENDS
  CONFIGURE_DEPENDS
  "datatype/*.cpp"
  "datatype/*.hpp"
  )

add_executable(GigachadCompiler main.cpp)

# Find LLVM package
find_package(LLVM REQUIRED CONFIG)

# Set up include directories and compile options for LLVM
include_directories(${LLVM_INCLUDE_DIRS})
add_definitions(${LLVM_DEFINITIONS})

set(LLVM_LIBS LLVM-15)

target_link_libraries(${PROJECT_NAME} ${LLVM_LIBS})

