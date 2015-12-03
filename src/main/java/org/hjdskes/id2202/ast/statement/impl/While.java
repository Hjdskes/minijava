package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.statement.Statement;

/**
 * The {@code while} statement continually executes its body as long as the condition is
 * {@code true}.
 *
 * It evaluates {@code condition}, which must return a {@code boolean} value. If the returned value
 * is {@code true}, the {@code while} statement executes all the statements in its body. The
 * {@code while} statement continues testing the {@code condition} and executing its body until the
 * condition evaluates to {@code false}.
 */
public class While implements Statement {
    private final Expression condition;
    private final Statement body;

    /**
     * Instantiates a new {@code while} {@link Statement} node for the abstract syntax tree.
     *
     * @param condition The condition to evaluate.
     * @param body The body to execute if {@code condition} evaluates to {@code true}.
     */
    public While(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    /**
     * Returns the condition to test.
     * @return The condition to test.
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Returns the body to execute if the {@code condition} evaluates to {@code true}.
     * @return The body to execute if the {@code condition} evaluates to {@code true}.
     */
    public Statement getBody() {
        return body;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type accept(TypeVisitor visitor) {
        return visitor.visit(this);
    }
}
