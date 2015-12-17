package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link ArrayLookup} node for the abstract syntax tree.
 */
public class ArrayLookupTest {
    private ArrayLookup arrayLookup;
    @Mock
    private Expression array;
    @Mock
    private Expression index;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        arrayLookup = new ArrayLookup(array, index);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetArray() {
        Expression array = arrayLookup.getArray();
        assertSame(this.array, array);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetIndex() {
        Expression index = arrayLookup.getIndex();
        assertSame(this.index, index);
    }

    /**
     * Tests if the {@link ArrayLookup#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        arrayLookup.accept(visitor);
        verify(visitor).visit(arrayLookup);
    }
}
