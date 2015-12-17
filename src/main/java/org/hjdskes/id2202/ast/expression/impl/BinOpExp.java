package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.BinOp;
import org.hjdskes.id2202.ast.expression.Expression;

/**
 * An {@link Expression} representing a binary operation. See {@link BinOp} for all the
 * supported binary operators.
 */
public class BinOpExp implements Expression {
    private final BinOp op;
    private final Expression e1;
    private final Expression e2;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * a binary operation.
     *
     * @param op The binary operator, see {@link BinOp}.
     * @param e1 The first {@link Expression} to the binary operator.
     * @param e2 The second {@link Expression} to the binary operator.
     */
    public BinOpExp(BinOp op, Expression e1, Expression e2) {
        this.op = op;
        this.e1 = e1;
        this.e2 = e2;
    }

    /**
     * Returns the {@link BinOp} binary operator for this {@link BinOpExp}.
     * @return The {@link BinOp} binary operator for this {@link BinOpExp}.
     */
    public BinOp getOperator() {
        return op;
    }

    /**
     * Returns the first {@link Expression} to the binary operator.
     * @return The first {@link Expression} to the binary operator.
     */
    public Expression getFirst() {
        return e1;
    }

    /**
     * Returns the second {@link Expression} to the binary operator.
     * @return The second {@link Expression} to the binary operator.
     */
    public Expression getSecond() {
        return e2;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
