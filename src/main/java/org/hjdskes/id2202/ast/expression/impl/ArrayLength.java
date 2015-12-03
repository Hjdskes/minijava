package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;

/**
 * An {@link Expression} representing the Java {@code length} keyword.
 */
public class ArrayLength implements Expression {
    private final Expression array;

    /**
     * Instatiates a new {@code length} {@link Expression} node for the abstract syntax tree,
     * representing the Java {@code length} keyword.
     *
     * @param array The {@link Expression} evaluating to the array whose length to return.
     */
    public ArrayLength(Expression array) {
        this.array = array;
    }

    /**
     * Returns the {@link Expression} evaluating to the array whose length to return.
     * @return The {@link Expression} evaluating to the array whose length to return.
     */
    public Expression getArray() {
        return array;
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
