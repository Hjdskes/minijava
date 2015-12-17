package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;

/**
 * Every identifier represents a value with a type. The identifier data type is
 * a "placeholder" for that type: it enables the lookup of the type of the value it identifies.
 */
public class IdentifierType implements Type {
    private final String identifier;

    /**
     * Instantiates a new identifier data type.
     *
     * @param identifier The identifier whose value's type to represent.
     */
    public IdentifierType(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns the identifier whose value's type to represent.
     * @return The identifier whose value's type to represent.
     */
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
