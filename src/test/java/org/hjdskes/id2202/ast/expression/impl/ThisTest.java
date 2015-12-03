package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link This} node for the abstract syntax tree.
 */
public class ThisTest {
    private This t;
    @Mock
    private Visitor visitor;
    @Mock
    private TypeVisitor fVisitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        t = new This();
    }

    /**
     * Tests if the {@link This#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        t.accept(visitor);
        verify(visitor).visit(t);
    }

    /**
     * Tests if the {@link This#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        t.accept(fVisitor);
        verify(fVisitor).visit(t);
    }
}
