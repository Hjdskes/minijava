package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.statement.Statement;

/**
 * A block is a group of zero or more {@link Statement}s between balanced braces and can be used
 * anywhere a single {@link Statement} is allowed.
 */
public class Block implements Statement {
    private final List<Statement> statements;

    /**
     * Instantiates a new block {@link Statement} node for the abstract syntax tree.
     *
     * @param statements A {@link List} of zero or more {@link Statement}s contained within this
     *                   {@link Block}.
     */
    public Block(List<Statement> statements) {
        this.statements = statements;
    }

    /**
     * Returns the {@link List} of zero or more {@link Statement}s contained within this
     * {@link Block}.
     *
     * @return The {@link List} of zero or more {@link Statement}s contained within this
     *         {@link Block}.
     */
    public List<Statement> getStatements() {
        return statements;
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
