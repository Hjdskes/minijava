package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link BooleanType} node for the abstract syntax tree.
 */
public class BooleanTypeTest {
    private BooleanType type;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        type = new BooleanType();
    }

    /**
     * Tests if the {@link BooleanType#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        type.accept(visitor);
        verify(visitor).visit(type);
    }
}
