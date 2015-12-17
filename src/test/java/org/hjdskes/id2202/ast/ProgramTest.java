package org.hjdskes.id2202.ast;

import org.hjdskes.id2202.ast.classes.ClassDecl;
import org.hjdskes.id2202.ast.classes.MainClass;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link Program} node for the abstract syntax tree.
 */
public class ProgramTest {
    private Program program;
    @Mock
    private MainClass mainClass;
    @Mock
    private List<ClassDecl> classDeclarations;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        program = new Program(mainClass, classDeclarations);
    }

    /**
     * Tests if the correct {@link MainClass} is returned.
     */
    @Test
    public void testGetMainClass() {
        MainClass mainClass = program.getMainClass();
        assertSame(this.mainClass, mainClass);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetClassDeclarations() {
        List<ClassDecl> classDeclarations = program.getClassDeclarations();
        assertSame(this.classDeclarations, classDeclarations);
    }

    /**
     * Tests if the {@link Program#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        program.accept(visitor);
        verify(visitor).visit(program);
    }
}
