package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitable;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.statement.Statement;

/**
 * Every MiniJava program should have one main class. That is, one class containing the typical
 * {@code public static void main(String[] args)} method.
 */
public class MainClass implements Visitable {
    private final Identifier className;
    private final Identifier mainArgumentName;
    private final Statement body;

    /**
     * Instantiates a new {@link MainClass} node for the abstract syntax tree.
     *
     * @param className The {@link Identifier} to use for this class.
     * @param mainArgumentName The {@link Identifier} to use for the main method's argument.
     * @param body The body of this class.
     */
    public MainClass(Identifier className, Identifier mainArgumentName, Statement body) {
        this.className = className;
        this.mainArgumentName = mainArgumentName;
        this.body = body;
    }

    /**
     * Returns the {@link Identifier} of this class.
     * @return The {@link Identifier} of this class.
     */
    public Identifier getClassName() {
        return className;
    }

    /**
     * Returns the {@link Identifier} of the main method's argument.
     * @return The {@link Identifier} of the main method's argument.
     */
    public Identifier getMainArgumentName() {
        return mainArgumentName;
    }

    /**
     * Returns the body of this class.
     * @return The body of this class.
     */
    public Statement getBody() {
        return body;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
