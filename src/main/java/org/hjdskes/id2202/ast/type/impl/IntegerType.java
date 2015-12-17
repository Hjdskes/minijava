package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;

/**
 * The integer data type represents integer numbers: positive and negative counting (whole) numbers,
 * including zero.
 */
public class IntegerType implements Type {
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
