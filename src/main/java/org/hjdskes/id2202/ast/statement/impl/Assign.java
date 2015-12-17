package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.statement.Statement;

/**
 * The assignment statement assigns the value on the right hand side of the assignment operator
 * ({@code =}) to the {@link Identifier} on the left hand side of the assignment operator.
 */
public class Assign implements Statement {
    private final Identifier identifier;
    private final Expression expression;

    /**
     * Instantiates a new assignment {@link Statement} node for the abstract syntax tree.
     *
     * @param identifier The {@link Identifier} identifying the value of the given
     *                   {@link Expression}.
     * @param expression The {@link Expression} evaluating to the value to be assigned.
     */
    public Assign(Identifier identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    /**
     * Returns the {@link Identifier} identifying the value of the given {@link Expression}.
     * @return The {@link Identifier} identifying the value of the given {@link Expression}.
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Returns the {@link Expression} evaluating to the value to be assigned.
     * @return The {@link Expression} evaluating to the value to be assigned.
     */
    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
