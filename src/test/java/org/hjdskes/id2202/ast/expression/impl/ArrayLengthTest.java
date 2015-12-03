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
 * Test suite for the construction of an {@link ArrayLength} node for the abstract syntax tree.
 */
public class ArrayLengthTest {
    private ArrayLength arrayLength;
    @Mock
    private Expression array;
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
        arrayLength = new ArrayLength(array);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetArray() {
        Expression array = arrayLength.getArray();
        assertSame(this.array, array);
    }

    /**
     * Tests if the {@link ArrayLength#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        arrayLength.accept(visitor);
        verify(visitor).visit(arrayLength);
    }

    /**
     * Tests if the {@link ArrayLength#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        arrayLength.accept(typeVisitor);
        verify(typeVisitor).visit(arrayLength);
    }
}
