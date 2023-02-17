// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelScriptParser}.
 */
public interface RelScriptListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link RelScriptParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(RelScriptParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelScriptParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(RelScriptParser.AssignExpressionContext ctx);
}