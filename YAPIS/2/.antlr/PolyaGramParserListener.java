// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolyaGramParser}.
 */
public interface PolyaGramParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PolyaGramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PolyaGramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PolyaGramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PolyaGramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void enterMethodUsage(PolyaGramParser.MethodUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void exitMethodUsage(PolyaGramParser.MethodUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#fieldUsage}.
	 * @param ctx the parse tree
	 */
	void enterFieldUsage(PolyaGramParser.FieldUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#fieldUsage}.
	 * @param ctx the parse tree
	 */
	void exitFieldUsage(PolyaGramParser.FieldUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void enterFunctionUsage(PolyaGramParser.FunctionUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void exitFunctionUsage(PolyaGramParser.FunctionUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PolyaGramParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PolyaGramParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(PolyaGramParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(PolyaGramParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PolyaGramParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PolyaGramParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(PolyaGramParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(PolyaGramParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(PolyaGramParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(PolyaGramParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#brackets_expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets_expr(PolyaGramParser.Brackets_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#brackets_expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets_expr(PolyaGramParser.Brackets_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(PolyaGramParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(PolyaGramParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#asiignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsiignmentExpression(PolyaGramParser.AsiignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#asiignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsiignmentExpression(PolyaGramParser.AsiignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(PolyaGramParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(PolyaGramParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PolyaGramParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PolyaGramParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(PolyaGramParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(PolyaGramParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(PolyaGramParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(PolyaGramParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(PolyaGramParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(PolyaGramParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PolyaGramParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PolyaGramParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(PolyaGramParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(PolyaGramParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolyaGramParser#switch_cond}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cond(PolyaGramParser.Switch_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolyaGramParser#switch_cond}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cond(PolyaGramParser.Switch_condContext ctx);
}