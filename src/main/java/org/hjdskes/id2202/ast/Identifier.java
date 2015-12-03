package org.hjdskes.id2202.ast;

import org.hjdskes.id2202.ast.type.Type;

/**
 * An identifier is the name of a variable, a method or a class. They are nothing themselves, but
 * just refer to what they represent.
 */
public class Identifier implements Visitable {
    private final String identifier;

    /**
     * Instantiates a new {@link Identifier} node for the abstract syntax tree.
     *
     * @param identifier The name of this identifier.
     */
    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns the name of this identifier.
     * @return The name of this identifier.
     */
    public String getIdentifier() {
        return identifier;
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
