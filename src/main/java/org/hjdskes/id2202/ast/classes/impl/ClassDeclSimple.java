package org.hjdskes.id2202.ast.classes.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.classes.ClassDecl;
import org.hjdskes.id2202.ast.classes.MethodDecl;
import org.hjdskes.id2202.ast.classes.VarDecl;

/**
 * A simple class declaration. Classes are specified in the MiniJava programming language as
 * follows:
 *
 * {@code class MyClass {
 *     // instance variables,
 *     // constructor,
 *     // method declarations
 * }}
 */
public class ClassDeclSimple implements ClassDecl {
    private final Identifier identifier;
    private final List<VarDecl> variableDeclarations;
    private final List<MethodDecl> methodDeclarations;

    /**
     * Instantiates a new {@link ClassDeclSimple} node for the abstract syntax tree.
     *
     * @param identifier The name of this class.
     * @param variableDeclarations The instance variables of this class.
     * @param methodDeclarations The methods of this class.
     */
    public ClassDeclSimple(Identifier identifier, List<VarDecl> variableDeclarations,
                           List<MethodDecl> methodDeclarations) {
        this.identifier = identifier;
        this.variableDeclarations = variableDeclarations;
        this.methodDeclarations = methodDeclarations;
    }

    /**
     * Returns the {@link Identifier} of this class.
     * @return The {@link Identifier} of this class.
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Returns this class' instance variables.
     * @return This class' instance variables.
     */
    public List<VarDecl> getVariableDeclarations() {
        return variableDeclarations;
    }

    /**
     * Returns this class' method declarations.
     * @return This class' method declarations.
     */
    public List<MethodDecl> getMethodDeclarations() {
        return methodDeclarations;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
