package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.Visitable;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.statement.Statement;
import org.hjdskes.id2202.ast.type.Type;

/**
 * A method declaration specifies a method. In the MiniJava programming language, methods are
 * specified as follows:
 *
 * {@code public int foo(int bar) {
 *     int baz;
 *
 *     // do some stuff with bar and baz
 *
 *     return baz;
 * }}
 */
public class MethodDecl implements Visitable {
    private final Type type;
    private final Identifier identifier;
    private final List<Formal> formals;
    private final List<VarDecl> variableDeclarations;
    private final List<Statement> body;
    private final Expression returnStatement;

    /**
     * Instantiates a new {@link MethodDecl} node for the abstract syntax tree.
     *
     * @param type The return {@link Type} of this method.
     * @param identifier The {@link Identifier} of this method.
     * @param formals The {@link Formal} parameters of this method.
     * @param variableDeclarations The variable used within this method.
     * @param body The body of this method.
     * @param returnStatement The return statement of this method.
     */
    public MethodDecl(Type type, Identifier identifier, List<Formal> formals,
                      List<VarDecl> variableDeclarations, List<Statement> body,
                      Expression returnStatement) {
        this.type = type;
        this.identifier = identifier;
        this.formals = formals;
        this.variableDeclarations = variableDeclarations;
        this.body = body;
        this.returnStatement = returnStatement;
    }

    /**
     * Returns the return {@link Type} of this method.
     * @return The return {@link Type} of this method.
     */
    public Type getType() {
        return type;
    }

    /**
     * Return the {@link Identifier} of this method.
     * @return The {@link Identifier} of this method.
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Returns the {@link Formal} parameters of this method.
     * @return The {@link Formal} parameters of this method.
     */
    public List<Formal> getFormals() {
        return formals;
    }

    /**
     * Returns the variables used within this method.
     * @return The variables used within this method.
     */
    public List<VarDecl> getVariableDeclarations() {
        return variableDeclarations;
    }

    /**
     * Returns the body of this method.
     * @return The body of this method.
     */
    public List<Statement> getBody() {
        return body;
    }

    /**
     * Returns the return statement of this method.
     * @return The return statement of this method.
     */
    public Expression getReturnStatement() {
        return returnStatement;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
