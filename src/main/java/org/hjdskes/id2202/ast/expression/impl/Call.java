package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;

/**
 * An {@link Expression} representing a method call on an object.
 */
public class Call implements Expression {
    private final Expression object;
    private final Identifier id;
    private final List<Expression> args;

    /**
     * Instantiates a new {@link Expression} node for the abstract syntax tree, representing
     * a method call on an object.
     *
     * @param object The {@link Expression} evaluating to the object to call.
     * @param id The identifier of the function to call.
     * @param args The arguments to the function to call.
     */
    public Call(Expression object, Identifier id, List<Expression> args) {
        this.object = object;
        this.id = id;
        this.args = args;
    }

    /**
     * Returns the {@link Expression} evaluating to the object to call.
     * @return The {@link Expression} evaluating to the object to call.
     */
    public Expression getObject() {
        return object;
    }

    /**
     * Returns the identifier of the function to call.
     * @return The {@link Identifier} identifying the function to call.
     */
    public Identifier getIdentifier() {
        return id;
    }

    /**
     * Returns the arguments to the function to call.
     * @return The arguments to the function to call.
     */
    public List<Expression> getArguments() {
        return args;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
