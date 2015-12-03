package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link NewArray} node for the abstract syntax tree.
 */
public class NewArrayTest {
    private NewArray array;
    @Mock
    private Expression size;
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
        array = new NewArray(size);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetIdentifier() {
        Expression size = array.getSize();
        assertSame(this.size, size);
    }

    /**
     * Tests if the {@link NewArray#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        array.accept(visitor);
        verify(visitor).visit(array);
    }

    /**
     * Tests if the {@link NewArray#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        array.accept(typeVisitor);
        verify(typeVisitor).visit(array);
    }
}
