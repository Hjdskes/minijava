package org.hjdskes.id2202.ast;

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
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
