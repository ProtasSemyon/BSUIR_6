; ModuleID = 'example'
source_filename = "example"

@formatStr = private unnamed_addr constant [15 x i8] c"Hello, world!\0A\00", align 1

define i32 @main() {
  call void @print(ptr @formatStr)
}

declare void @print(ptr)
