package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;

/**
 * The boolean data type has only two possible values: {@code true} and {@code false}.
 */
public class BooleanType implements Type {
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
