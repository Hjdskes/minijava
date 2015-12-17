package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link False} node for the abstract syntax tree.
 */
public class FalseTest {
    private False f;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        f = new False();
    }

    /**
     * Tests if the {@link False#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        f.accept(visitor);
        verify(visitor).visit(f);
    }
}
