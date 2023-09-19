// Generated from /home/jakobe/Documents/GitHub/Custom-Language/src/NewSpeak/grammar/NewSpeak.g4 by ANTLR 4.13.1
package NewSpeak.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NewSpeakParser}.
 */
public interface NewSpeakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(NewSpeakParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(NewSpeakParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(NewSpeakParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(NewSpeakParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NewSpeakParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NewSpeakParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(NewSpeakParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(NewSpeakParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(NewSpeakParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(NewSpeakParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(NewSpeakParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(NewSpeakParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#whilecondition}.
	 * @param ctx the parse tree
	 */
	void enterWhilecondition(NewSpeakParser.WhileconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#whilecondition}.
	 * @param ctx the parse tree
	 */
	void exitWhilecondition(NewSpeakParser.WhileconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(NewSpeakParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(NewSpeakParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(NewSpeakParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(NewSpeakParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(NewSpeakParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(NewSpeakParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(NewSpeakParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(NewSpeakParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(NewSpeakParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(NewSpeakParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewSpeakParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NewSpeakParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewSpeakParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NewSpeakParser.ExprContext ctx);
}