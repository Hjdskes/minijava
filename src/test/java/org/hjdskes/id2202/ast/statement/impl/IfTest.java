package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.hjdskes.id2202.ast.statement.Statement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link If} node for the abstract syntax tree.
 */
public class IfTest {
    private If i;
    @Mock
    private Expression condition;
    @Mock
    private Statement then;
    @Mock
    private Statement els;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        i = new If(condition, then, els);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetCondition() {
        Expression condition = i.getCondition();
        assertSame(this.condition, condition);
    }

    /**
     * Tests if the correct {@link Statement} is returned.
     */
    @Test
    public void testGetThen() {
        Statement then = i.getThen();
        assertSame(this.then, then);
    }

    /**
     * Tests if the correct {@link Statement} is returned.
     */
    @Test
    public void testGetElse() {
        Statement els = i.getElse();
        assertSame(this.els, els);
    }

    /**
     * Tests if the {@link If#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        i.accept(visitor);
        verify(visitor).visit(i);
    }
}
