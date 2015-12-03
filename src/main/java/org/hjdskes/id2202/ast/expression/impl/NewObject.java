package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;

/**
 * An {@link Expression} representing the Java keyword {@code new}, when used to create a new
 * object.
 */
public class NewObject implements Expression {
    private final Identifier identifier;

    /**
     * Instantiates a new {@code new} {@link Expression} node for the abstract syntax tree,
     * representing the Java {@code new} keyword when used on an object.
     *
     * @param identifier The {@link Identifier} for the created object.
     */
    public NewObject(Identifier identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns the {@link Identifier} for the created object.
     * @return The {@link Identifier} for the created object.
     */
    public Identifier getIdentifier() {
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
