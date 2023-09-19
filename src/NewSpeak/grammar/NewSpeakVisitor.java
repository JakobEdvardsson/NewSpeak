// Generated from /home/jakobe/Documents/GitHub/Custom-Language/src/NewSpeak/grammar/NewSpeak.g4 by ANTLR 4.13.1
package NewSpeak.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NewSpeakParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NewSpeakVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(NewSpeakParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(NewSpeakParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NewSpeakParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(NewSpeakParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(NewSpeakParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(NewSpeakParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#whilecondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilecondition(NewSpeakParser.WhileconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(NewSpeakParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(NewSpeakParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(NewSpeakParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(NewSpeakParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(NewSpeakParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewSpeakParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NewSpeakParser.ExprContext ctx);
}