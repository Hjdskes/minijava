package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.statement.Statement;

/**
 * The {@code if-then-else} statement executes the {@code then} part only if its condition evaluates
 * to {@code true}. If its condition evaluates to {@code false}, the {@code else} part is executed.
 */
public class If implements Statement {
    private final Expression condition;
    private final Statement then;
    private final Statement els;

    /**
     * Instantiates a new {@code if} {@link Statement} node for the abstract syntax tree.
     *
     * @param condition The condition to evaluate.
     * @param then The {@link Statement} that is executed when the condition evaluates to
     *             {@code true}.
     * @param els The {@link Statement} that is executed when the condition evaluates to
     *            {@code false}.
     */
    public If(Expression condition, Statement then, Statement els) {
        this.condition = condition;
        this.then = then;
        this.els = els;
    }

    /**
     * Returns the condition to evaluate.
     * @return The condition to evaluate.
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Returns the {@link Statement} that is executed when the condition evaluates to {@code true}.
     * @return The {@link Statement} that is executed when the condition evaluates to {@code true}.
     */
    public Statement getThen() {
        return then;
    }

    /**
     * Returns the {@link Statement} that is executed when the condition evaluates to {@code false}.
     * @return The {@link Statement} that is executed when the condition evaluates to {@code false}.
     */
    public Statement getElse() {
        return els;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
