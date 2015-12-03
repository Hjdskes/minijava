package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;

/**
 * An {@link Expression} representing the Java keyword {@code this}.
 */
public class This implements Expression {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type accept(TypeVisitor visitor) {
        return visitor.visit(this);
    }
}
