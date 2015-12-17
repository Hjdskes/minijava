package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;

/**
 * An {@link Expression} representing an integer literal.
 */
public class IntegerLiteral implements Expression {
    private final int literal;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * an integer literal.
     *
     * @param literal The integer literal to represent.
     */
    public IntegerLiteral(int literal) {
        this.literal = literal;
    }

    /**
     * Returns the integer literal to represent.
     * @return The integer literal to represent.
     */
    public int getLiteral() {
        return literal;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
