// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprGrammarParser}.
 */
public interface ExprGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void enterMethodUsage(ExprGrammarParser.MethodUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void exitMethodUsage(ExprGrammarParser.MethodUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#fieldUsage}.
	 * @param ctx the parse tree
	 */
	void enterFieldUsage(ExprGrammarParser.FieldUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#fieldUsage}.
	 * @param ctx the parse tree
	 */
	void exitFieldUsage(ExprGrammarParser.FieldUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void enterFunctionUsage(ExprGrammarParser.FunctionUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void exitFunctionUsage(ExprGrammarParser.FunctionUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprGrammarParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprGrammarParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ExprGrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ExprGrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ExprGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ExprGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(ExprGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(ExprGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#brackets_expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets_expr(ExprGrammarParser.Brackets_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#brackets_expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets_expr(ExprGrammarParser.Brackets_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(ExprGrammarParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(ExprGrammarParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#asiignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsiignmentExpression(ExprGrammarParser.AsiignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#asiignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsiignmentExpression(ExprGrammarParser.AsiignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ExprGrammarParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ExprGrammarParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ExprGrammarParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ExprGrammarParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(ExprGrammarParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(ExprGrammarParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ExprGrammarParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ExprGrammarParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(ExprGrammarParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(ExprGrammarParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(ExprGrammarParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(ExprGrammarParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprGrammarParser#switch_cond}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cond(ExprGrammarParser.Switch_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprGrammarParser#switch_cond}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cond(ExprGrammarParser.Switch_condContext ctx);
}