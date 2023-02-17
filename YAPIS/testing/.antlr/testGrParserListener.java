// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testGrParser}.
 */
public interface testGrParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testGrParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(testGrParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(testGrParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testGrParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testGrParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(testGrParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(testGrParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testGrParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(testGrParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testGrParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(testGrParser.BlockStatementsContext ctx);
}