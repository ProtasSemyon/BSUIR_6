if(EXISTS "/home/smn/BSUIR/6/LOIS/2/build/tests/LOIS_2_tests[1]_tests.cmake")
  include("/home/smn/BSUIR/6/LOIS/2/build/tests/LOIS_2_tests[1]_tests.cmake")
else()
  add_test(LOIS_2_tests_NOT_BUILT LOIS_2_tests_NOT_BUILT)
endif()