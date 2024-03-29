// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelScriptParser}.
 */
public interface RelScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RelScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RelScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RelScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RelScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void enterMethodUsage(RelScriptParser.MethodUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#methodUsage}.
	 * @param ctx the parse tree
	 */
	void exitMethodUsage(RelScriptParser.MethodUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(RelScriptParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(RelScriptParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(RelScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(RelScriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(RelScriptParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(RelScriptParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RelScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RelScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(RelScriptParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(RelScriptParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(RelScriptParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(RelScriptParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#binarySign}.
	 * @param ctx the parse tree
	 */
	void enterBinarySign(RelScriptParser.BinarySignContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#binarySign}.
	 * @param ctx the parse tree
	 */
	void exitBinarySign(RelScriptParser.BinarySignContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#inBracesExpression}.
	 * @param ctx the parse tree
	 */
	void enterInBracesExpression(RelScriptParser.InBracesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#inBracesExpression}.
	 * @param ctx the parse tree
	 */
	void exitInBracesExpression(RelScriptParser.InBracesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#inCurlyExpression}.
	 * @param ctx the parse tree
	 */
	void enterInCurlyExpression(RelScriptParser.InCurlyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#inCurlyExpression}.
	 * @param ctx the parse tree
	 */
	void exitInCurlyExpression(RelScriptParser.InCurlyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#inSquareExpression}.
	 * @param ctx the parse tree
	 */
	void enterInSquareExpression(RelScriptParser.InSquareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#inSquareExpression}.
	 * @param ctx the parse tree
	 */
	void exitInSquareExpression(RelScriptParser.InSquareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#inParenExpression}.
	 * @param ctx the parse tree
	 */
	void enterInParenExpression(RelScriptParser.InParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#inParenExpression}.
	 * @param ctx the parse tree
	 */
	void exitInParenExpression(RelScriptParser.InParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#expressionInsideBraces}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInsideBraces(RelScriptParser.ExpressionInsideBracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#expressionInsideBraces}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInsideBraces(RelScriptParser.ExpressionInsideBracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(RelScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(RelScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RelScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RelScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(RelScriptParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(RelScriptParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#functionDeclarationBraces}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationBraces(RelScriptParser.FunctionDeclarationBracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#functionDeclarationBraces}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationBraces(RelScriptParser.FunctionDeclarationBracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#functionDeclarationArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationArgs(RelScriptParser.FunctionDeclarationArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#functionDeclarationArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationArgs(RelScriptParser.FunctionDeclarationArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void enterFunctionUsage(RelScriptParser.FunctionUsageContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#functionUsage}.
	 * @param ctx the parse tree
	 */
	void exitFunctionUsage(RelScriptParser.FunctionUsageContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RelScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RelScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(RelScriptParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(RelScriptParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(RelScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(RelScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(RelScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(RelScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(RelScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(RelScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(RelScriptParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(RelScriptParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(RelScriptParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(RelScriptParser.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(RelScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(RelScriptParser.IfStatementContext ctx);
}