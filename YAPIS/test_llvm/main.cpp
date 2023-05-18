#include "llvm/ADT/ArrayRef.h"
#include "llvm/IR/Constants.h"
#include "llvm/IR/Function.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LegacyPassManager.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/Verifier.h"
#include "llvm/Support/TargetSelect.h"
#include "llvm/Support/raw_ostream.h"
#include "llvm/IRReader/IRReader.h"
#include "llvm/Support/SourceMgr.h"
#include <iostream>

using namespace llvm;

int main() {
  InitializeNativeTarget();
  InitializeNativeTargetAsmPrinter();

  llvm::SMDiagnostic err;
  LLVMContext context;
  std::unique_ptr<Module> module = parseIRFile("/home/smn/BSUIR_6/YAPIS/test_llvm/data.bc", err, context);
  llvm::IRBuilder<> builder(context);

  FunctionType * mainFnTy = FunctionType::get(Type::getVoidTy(context), false);
  Function *mainFn = Function::Create(mainFnTy, Function::ExternalLinkage, "main", module.get());
  BasicBlock * BB = BasicBlock::Create(context, "entry", mainFn);
  builder.SetInsertPoint(BB);

  Type * myPrinterTy;
  auto allSctructs = module->getIdentifiedStructTypes();
  for (auto& t : allSctructs) {
    if (t->getName() == "class.Printer") {
      myPrinterTy = t;
    }
  }
  if (!myPrinterTy) {
    return 1;
  }
  Function* printerConstrFn = module->getFunction("printerInit");
  AllocaInst* printerVar = builder.CreateAlloca(myPrinterTy, nullptr, "printer");
  builder.CreateCall(printerConstrFn, {printerVar});

  Function* printFn = module->getFunction("print");


  Constant* myConstant = ConstantDataArray::getString(module->getContext(), "Hello, world!");
  llvm::GlobalVariable* myGlobalVar = new GlobalVariable(*module, myConstant->getType(), true, GlobalValue::PrivateLinkage, myConstant, "myGlobalString");

  builder.CreateCall(printFn, {printerVar, myGlobalVar});
  builder.CreateRetVoid();
  // Print the generated LLVM IR code to standard output
  module->print(outs(), nullptr);

  return 0;
}
