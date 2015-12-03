package org.hjdskes.id2202.ast.statement.impl;

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
 * Test suite for the construction of a {@link Print} node for the abstract syntax tree.
 */
public class PrintTest {
    private Print print;
    @Mock
    private Expression expression;
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
        print = new Print(expression);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetExpression() {
        Expression expression = print.getExpression();
        assertSame(this.expression, expression);
    }

    /**
     * Tests if the {@link Print#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        print.accept(visitor);
        verify(visitor).visit(print);
    }

    /**
     * Tests if the {@link Print#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        print.accept(typeVisitor);
        verify(typeVisitor).visit(print);
    }
}
