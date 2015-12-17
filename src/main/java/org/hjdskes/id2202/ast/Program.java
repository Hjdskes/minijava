package org.hjdskes.id2202.ast;

import org.hjdskes.id2202.ast.classes.ClassDecl;
import org.hjdskes.id2202.ast.classes.MainClass;

/**
 * The {@link Program} class represent a MiniJava program.
 *
 * Every MiniJava program should have one main class. That is, one class containing the typical
 * {@code public static void main(String[] args)} method. This main class also has to be the first
 * class in the program source file. Hereafter many other classes may follow, but none may have a
 * main method.
 */
public class Program implements Visitable {
    private final MainClass mainClass;
    private final List<ClassDecl> classDeclarations;

    /**
     * Instantiates a new {@link Program} node for the abstract syntax tree.
     *
     * @param mainClass The {@link MainClass} of this MiniJava program.
     * @param classDeclarations A {@link List} of zero or more {@link ClassDecl}arations.
     */
    public Program(MainClass mainClass, List<ClassDecl> classDeclarations) {
        this.mainClass = mainClass;
        this.classDeclarations = classDeclarations;
    }

    /**
     * Returns the {@link MainClass} for this MiniJava program.
     * @return The {@link MainClass} for this MiniJava program.
     */
    public MainClass getMainClass() {
        return mainClass;
    }

    /**
     * Returns the {@link List} of zero or more {@link ClassDecl}arations.
     * @return The {@link List} of zero or more {@link ClassDecl}arations.
     */
    public List<ClassDecl> getClassDeclarations() {
        return classDeclarations;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
