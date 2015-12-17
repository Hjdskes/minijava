package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitable;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;

/**
 * A variable declaration, of the form {@code type identifier;}, for example: {@code int foo;}.
 */
public class VarDecl implements Visitable {
    private final Type type;
    private final Identifier identifier;

    /**
     * Instantiates a new {@link VarDecl} node for the abstract syntax tree.
     *
     * @param type The {@link Type} of this variable declaration.
     * @param identifier The {@link Identifier} of this variable declaration.
     */
    public VarDecl(Type type, Identifier identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    /**
     * Returns the {@link Type} of this variable declaration.
     * @return The {@link Type} of this variable declaration.
     */
    public Type getType() {
        return type;
    }

    /**
     * Returns the {@link Identifier} of this variable declaration.
     * @return The {@link Identifier} of this variable declaration.
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
