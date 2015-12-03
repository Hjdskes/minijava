package org.hjdskes.id2202.ast.classes.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.classes.MethodDecl;
import org.hjdskes.id2202.ast.classes.VarDecl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;

/**
 * Test suite for the construction of a {@link ClassDeclExtends} node for the abstract syntax tree.
 */
public class ClassDeclExtendsTest {
    private ClassDeclExtends classDecl;
    @Mock
    private Identifier identifier;
    @Mock
    private Identifier extendee;
    @Mock
    private List<VarDecl> variableDeclarations;
    @Mock
    private List<MethodDecl> methodDeclarations;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        classDecl = new ClassDeclExtends(identifier, extendee, variableDeclarations,
                methodDeclarations);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetExtendee() {
        Identifier extendee = classDecl.getExtendee();
        assertSame(this.extendee, extendee);
    }
}
