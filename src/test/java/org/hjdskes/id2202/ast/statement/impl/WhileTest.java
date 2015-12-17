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
 * Test suite for the construction of a {@link While} node for the abstract syntax tree.
 */
public class WhileTest {
    private While w;
    @Mock
    private Expression condition;
    @Mock
    private Statement body;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        w = new While(condition, body);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetCondition() {
        Expression condition = w.getCondition();
        assertSame(this.condition, condition);
    }

    /**
     * Tests if the correct {@link Statement} is returned.
     */
    @Test
    public void testGetBody() {
        Statement body = w.getBody();
        assertSame(this.body, body);
    }

    /**
     * Tests if the {@link While#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        w.accept(visitor);
        verify(visitor).visit(w);
    }
}
