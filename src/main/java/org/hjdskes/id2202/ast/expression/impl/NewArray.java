package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;

/**
 * An {@link Expression} representing an array to be created.
 */
public class NewArray implements Expression {
    private final Expression size;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * an array to be created.
     *
     * @param size The {@link Expression} evaluating to the size of the array to be created.
     */
    public NewArray(Expression size) {
        this.size = size;
    }

    /**
     * Returns the {@link Expression} evaluating the size of the array to be created.
     * @return The {@link Expression} evaluating the size of the array to be created.
     */
    public Expression getSize() {
        return size;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
