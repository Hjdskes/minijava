package org.hjdskes.id2202.ast.classes.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.classes.MethodDecl;
import org.hjdskes.id2202.ast.classes.VarDecl;

/**
 * In the MiniJava programming language, classes can extend other classes {@link ClassDeclExtends}
 * represents such classes. They are specified as follows:
 *
 * {@code class MyClass extends SuperClass {
 *     // instance variables,
 *     // constructor,
 *     // method declarations
 * }}
 */
public class ClassDeclExtends extends ClassDeclSimple {
    private final Identifier extendee;

    /**
     * Instantiates a new {@link ClassDeclExtends} node for the abstract syntax tree.
     *
     * @param identifier The name of this class.
     * @param extendee The name of this class' superclass.
     * @param variableDeclarations The instance variables of this class.
     * @param methodDeclarations The methods of this class.
     */
    public ClassDeclExtends(Identifier identifier, Identifier extendee,
                            List<VarDecl> variableDeclarations,
                            List<MethodDecl> methodDeclarations) {
        super(identifier, variableDeclarations, methodDeclarations);
        this.extendee = extendee;
    }

    /**
     * Returns the {@link Identifier} of this class' superclass.
     * @return The {@link Identifier} of this class' superclass.
     */
    public Identifier getExtendee() {
        return extendee;
    }
}
