// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParserParser}.
 */
public interface ExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void enterMethodUsage(ExprParserParser.MethodUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void exitMethodUsage(ExprParserParser.MethodUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#fieldUsage}.
	 * @param ctx the parse tree
	 */
	void enterFieldUsage(ExprParserParser.FieldUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#fieldUsage}.
	 * @param ctx the parse tree
	 */
	void exitFieldUsage(ExprParserParser.FieldUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void enterFunctionUsage(ExprParserParser.FunctionUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void exitFunctionUsage(ExprParserParser.FunctionUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprParserParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprParserParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ExprParserParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ExprParserParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ExprParserParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ExprParserParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(ExprParserParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(ExprParserParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#brackets_expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets_expr(ExprParserParser.Brackets_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#brackets_expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets_expr(ExprParserParser.Brackets_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(ExprParserParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(ExprParserParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#asiignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsiignmentExpression(ExprParserParser.AsiignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#asiignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsiignmentExpression(ExprParserParser.AsiignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ExprParserParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ExprParserParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ExprParserParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ExprParserParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(ExprParserParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(ExprParserParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ExprParserParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ExprParserParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(ExprParserParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(ExprParserParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprParserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprParserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(ExprParserParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(ExprParserParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParserParser#switch_cond}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cond(ExprParserParser.Switch_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParserParser#switch_cond}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cond(ExprParserParser.Switch_condContext ctx);
}