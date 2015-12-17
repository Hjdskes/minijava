package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;

/**
 * The integer array data type is an array of {@link IntegerType}s.
 */
public class IntArrayType implements Type {
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
