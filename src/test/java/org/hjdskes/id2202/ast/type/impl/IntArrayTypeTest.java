package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link IntArrayType} node for the abstract syntax tree.
 */
public class IntArrayTypeTest {
    private IntArrayType type;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        type = new IntArrayType();
    }

    /**
     * Tests if the {@link IntArrayType#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        type.accept(visitor);
        verify(visitor).visit(type);
    }
}
