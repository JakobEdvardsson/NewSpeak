package NewSpeak;

import NewSpeak.grammar.NewSpeakBaseListener;
import NewSpeak.grammar.NewSpeakParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;

public class CompileNewSpeak extends NewSpeakBaseListener {
    StringBuilder compiled = new StringBuilder();
    private int loopCounter = 0;
    private LinkedList<Integer> loopStack = new LinkedList<>();


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFile(NewSpeakParser.FileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFile(NewSpeakParser.FileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCode(NewSpeakParser.CodeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCode(NewSpeakParser.CodeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(NewSpeakParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(NewSpeakParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDecl(NewSpeakParser.DeclContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDecl(NewSpeakParser.DeclContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssign(NewSpeakParser.AssignContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssign(NewSpeakParser.AssignContext ctx) {
        compileNewline("pop "+ctx.ID().getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhile(NewSpeakParser.WhileContext ctx) {
        loopCounter++;
        loopStack.push(loopCounter);
        compileNewline("label enterLoop"+ loopCounter);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhile(NewSpeakParser.WhileContext ctx) {
        int stackIndex = loopStack.pop();
        compileNewline("goto enterLoop" + stackIndex);
        compileNewline("label exitLoop" + stackIndex);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhilecondition(NewSpeakParser.WhileconditionContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhilecondition(NewSpeakParser.WhileconditionContext ctx) {
        String operation = "";
        switch (ctx.condition().getText()){
            case "greater" -> operation="gt";
            case "ungreater" -> operation="lt";
            case "equals" -> operation="eq";
        }
        compileNewline(operation);
        compileNewline("not");
        compileNewline("if-goto " + "exitLoop" + loopCounter);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCondition(NewSpeakParser.ConditionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCondition(NewSpeakParser.ConditionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAdd(NewSpeakParser.AddContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAdd(NewSpeakParser.AddContext ctx) {
        compileNewline("add");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSub(NewSpeakParser.SubContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSub(NewSpeakParser.SubContext ctx) {
        compileNewline("sub");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterUnaryExpression(NewSpeakParser.UnaryExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryExpression(NewSpeakParser.UnaryExpressionContext ctx) {
        String value = "";
        if (ctx.ID() == null){
            value = ctx.INT().getText();
        }else {
            value = ctx.ID().getText();
        }
        compiled.append("push ");
        compileNewline(value);
    }
    @Override public void enterPrint(NewSpeakParser.PrintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrint(NewSpeakParser.PrintContext ctx) {
        String value = "";

        if (ctx.ID() == null){
            value = ctx.INT().getText();
        }else {
            value = ctx.ID().getText();
        }
        compileNewline("print " + value);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr(NewSpeakParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr(NewSpeakParser.ExprContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }



    private void compileNewline(String input){
        compiled.append(input).append("\n");
    }

    public String getCompiled() {
        return compiled.toString();
    }
}