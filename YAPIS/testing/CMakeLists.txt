cmake_minimum_required(VERSION 3.0.0)
project(Tables VERSION 0.1.0)


file(
  GLOB_RECURSE
  SOURCES
  CONFIGURE_DEPENDS
  "src/*.c"
  )

add_executable(${PROJECT_NAME} ${SOURCES} main.c)





