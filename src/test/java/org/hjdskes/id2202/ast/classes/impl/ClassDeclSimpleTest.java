package org.hjdskes.id2202.ast.classes.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.classes.MethodDecl;
import org.hjdskes.id2202.ast.classes.VarDecl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link ClassDeclSimple} node for the abstract syntax tree.
 */
public class ClassDeclSimpleTest {
    private ClassDeclSimple classDecl;
    @Mock
    private Identifier identifier;
    @Mock
    private List<VarDecl> variableDeclarations;
    @Mock
    private List<MethodDecl> methodDeclarations;
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
        classDecl = new ClassDeclSimple(identifier, variableDeclarations, methodDeclarations);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetIdentifier() {
        Identifier identifier = classDecl.getIdentifier();
        assertSame(this.identifier, identifier);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetVariableDeclarations() {
        List<VarDecl> variableDeclarations = classDecl.getVariableDeclarations();
        assertSame(this.variableDeclarations, variableDeclarations);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetMethodDeclarations() {
        List<MethodDecl> methodDeclarations = classDecl.getMethodDeclarations();
        assertSame(this.methodDeclarations, methodDeclarations);
    }

    /**
     * Tests if the {@link ClassDeclSimple#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        classDecl.accept(visitor);
        verify(visitor).visit(classDecl);
    }

    /**
     * Tests if the {@link ClassDeclSimple#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        classDecl.accept(typeVisitor);
        verify(typeVisitor).visit(classDecl);
    }
}
