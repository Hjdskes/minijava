package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link NewObject} node for the abstract syntax tree.
 */
public class NewObjectTest {
    private NewObject object;
    @Mock
    private Identifier identifier;
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
        object = new NewObject(identifier);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetNewObject() {
        Identifier identifier = object.getIdentifier();
        assertSame(this.identifier, identifier);
    }

    /**
     * Tests if the {@link NewObject#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        object.accept(visitor);
        verify(visitor).visit(object);
    }

    /**
     * Tests if the {@link NewObject#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        object.accept(typeVisitor);
        verify(typeVisitor).visit(object);
    }
}
