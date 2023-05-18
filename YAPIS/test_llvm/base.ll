; ModuleID = 'example'
source_filename = "example"

define void @main() {
  call void @_ZN7Printer5printEi(i32 152)
  ret void
}

declare void @_ZN7Printer5printEi(i32)
