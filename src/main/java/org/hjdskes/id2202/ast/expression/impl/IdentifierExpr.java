package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;

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
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type accept(TypeVisitor visitor) {
        return visitor.visit(this);
    }
}
