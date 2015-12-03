package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.expression.Expression;

/**
 * The array assignment statement assigns the value on the right hand side of the assignment
 * operator ({@code =}) to the location in the array on the left hand side of the assignment
 * operator.
 */
public class ArrayAssign extends Assign {
    private final Expression index;

    /**
     *
     * @param identifier The {@link Identifier} identifying the array to assign the value to.
     * @param index The {@link Expression} evaluating to the index into the array to assign the
     *              value to.
     * @param expression The {@link Expression} evaluating to the value to be assigned.
     */
    public ArrayAssign(Identifier identifier, Expression index, Expression expression) {
        super(identifier, expression);
        this.index = index;
    }

    /**
     * Returns the {@link Expression} evaluating to the index into the array to assign the value to.
     * @return The {@link Expression} evaluating to the index into the array to assign the value to.
     */
    public Expression getIndex() {
        return index;
    }
}
