package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;

/**
 * An {@link Expression} representing an identifier.
 */
public class IdentifierExpr implements Expression {
    private final String identifier;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * an identifier.
     *
     * @param identifier The identifier to represent.
     */
    public IdentifierExpr(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns the identifier to represent.
     * @return The identifier to represent.
     */
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
