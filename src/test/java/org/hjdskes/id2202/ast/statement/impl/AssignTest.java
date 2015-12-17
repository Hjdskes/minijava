package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link Assign} node for the abstract syntax tree.
 */
public class AssignTest {
    private Assign array;
    @Mock
    private Identifier identifier;
    @Mock
    private Expression expression;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        array = new Assign(identifier, expression);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetIdentifier() {
        Identifier identifier = array.getIdentifier();
        assertSame(this.identifier, identifier);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetIndex() {
        Expression expression = array.getExpression();
        assertSame(this.expression, expression);
    }

    /**
     * Tests if the {@link Assign#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        array.accept(visitor);
        verify(visitor).visit(array);
    }
}
