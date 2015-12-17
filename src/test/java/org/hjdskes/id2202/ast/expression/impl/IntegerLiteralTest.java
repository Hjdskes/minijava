package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link IntegerLiteral} node for the abstract syntax tree.
 */
public class IntegerLiteralTest {
    private static final int INTEGER = 42;
    private IntegerLiteral integerLiteral;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        integerLiteral = new IntegerLiteral(INTEGER);
    }

    /**
     * Tests if the correct integer is returned.
     */
    @Test
    public void testGetIdentifier() {
        int integer = integerLiteral.getLiteral();
        assertSame(INTEGER, integer);
    }

    /**
     * Tests if the {@link IntegerLiteral#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        integerLiteral.accept(visitor);
        verify(visitor).visit(integerLiteral);
    }
}
