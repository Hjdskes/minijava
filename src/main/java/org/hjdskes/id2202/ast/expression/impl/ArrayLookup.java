package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;

/**
 * An {@link Expression} representing a lookup into an array.
 */
public class ArrayLookup implements Expression {
    private final Expression array;
    private final Expression index;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * a lookup into an array.
     *
     * @param array The {@link Expression} evaluating to the array to index.
     * @param index The {@link Expression} evaluating to the index to use.
     */
    public ArrayLookup(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    /**
     * Returns the {@link Expression} evaluating to the array to index.
     * @return The {@link Expression} evaluating to the array to index.
     */
    public Expression getArray() {
        return array;
    }

    /**
     * Returns the {@link Expression} evaluating to the index to use.
     * @return The {@link Expression} evaluating to the index to use.
     */
    public Expression getIndex() {
        return index;
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
