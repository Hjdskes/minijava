package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.statement.Statement;

/**
 * The {@code print} statement prints the {@link Expression} it contains, similar to Java's
 * {@link java.io.PrintStream#println}.
 */
public class Print implements Statement {
    private final Expression expression;

    /**
     * Instantiates a new {@code print} {@link Statement} node for the abstract syntax tree.
     *
     * @param expression The {@link Expression} to print.
     */
    public Print(Expression expression) {
        this.expression = expression;
    }

    /**
     * Returns the {@link Expression} to print.
     * @return The {@link Expression} to print.
     */
    public Expression getExpression() {
        return expression;
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
