package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.statement.Statement;
import org.hjdskes.id2202.ast.type.Type;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link MethodDecl} node for the abstract syntax tree.
 */
public class MethodDeclTest {
    private MethodDecl method;
    @Mock
    private Type type;
    @Mock
    private Identifier identifier;
    @Mock
    private List<Formal> formals;
    @Mock
    private List<VarDecl> variableDeclarations;
    @Mock
    private List<Statement> body;
    @Mock
    private Expression returnStatement;
    @Mock
    private Visitor visitor;
    @Mock
    private TypeVisitor typeVisitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        method = new MethodDecl(type, identifier, formals, variableDeclarations, body,
                returnStatement);
    }

    /**
     * Tests if the correct {@link Type} is returned.
     */
    @Test
    public void testGetType() {
        Type type = method.getType();
        assertSame(this.type, type);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetIdentifier() {
        Identifier identifier = method.getIdentifier();
        assertSame(this.identifier, identifier);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetFormals() {
        List<Formal> formals = method.getFormals();
        assertSame(this.formals, formals);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetVariableDeclarations() {
        List<VarDecl> variableDeclarations = method.getVariableDeclarations();
        assertSame(this.variableDeclarations, variableDeclarations);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetBody() {
        List<Statement> body = method.getBody();
        assertSame(this.body, body);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetReturnStatement() {
        Expression returnStatement = method.getReturnStatement();
        assertSame(this.returnStatement, returnStatement);
    }

    /**
     * Tests if the {@link MethodDecl#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        method.accept(visitor);
        verify(visitor).visit(method);
    }

    /**
     * Tests if the {@link MethodDecl#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        method.accept(typeVisitor);
        verify(typeVisitor).visit(method);
    }
}
