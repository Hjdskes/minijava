package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitable;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;

/**
 * A formal parameter is a parameter referring to a variable as found in the method declaration.
 */
public class Formal implements Visitable {
    private final Type type;
    private final Identifier identifier;

    /**
     * Instantiates a new {@link Formal} node for the abstract syntax tree.
     *
     * @param type The {@link Type} of this formal parameter.
     * @param identifier The {@link Identifier} of this formal parameter.
     */
    public Formal(Type type, Identifier identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    /**
     * Returns the {@link Type} of this formal parameter.
     * @return The {@link Type} of this formal parameter.
     */
    public Type getType() {
        return type;
    }

    /**
     * Returns the {@link Identifier} of this formal parameter.
     * @return The {@link Identifier} of this formal parameter.
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
