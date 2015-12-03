package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.expression.UnOp;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;

/**
 * An {@link Expression} representing a unary operation. See {@link UnOp} for all the
 * supported unary operators.
 */
public class UnOpExp implements Expression {
    private final UnOp op;
    private final Expression e;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * a unary operation.
     *
     * @param op The unary operator, see {@link UnOp}.
     * @param e The {@link Expression} to the operator.
     */
    public UnOpExp(UnOp op, Expression e) {
        this.op = op;
        this.e = e;
    }

    /**
     * Returns the {@link UnOp} unary operator for this {@link UnOpExp}.
     * @return The {@link UnOp} unary operator for this {@link UnOpExp}.
     */
    public UnOp getOperator() {
        return op;
    }

    /**
     * Returns the {@link Expression} to the operator.
     * @return The {@link Expression} to the operator.
     */
    public Expression getExpression() {
        return e;
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
