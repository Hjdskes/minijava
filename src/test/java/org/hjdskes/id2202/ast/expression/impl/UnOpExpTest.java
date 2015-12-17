package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.UnOp;
import org.hjdskes.id2202.ast.expression.Expression;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link UnOpExp} node for the abstract syntax tree.
 */
@RunWith(Parameterized.class)
public class UnOpExpTest {
    private UnOp op;
    private UnOpExp unOp;
    @Mock
    private Expression e1;
    @Mock
    private Visitor visitor;

    /**
     * Returns a {@link Collection} containing all the available operators found in {@link UnOp}.
     * @return A {@link Collection} containing all the available operators found in {@link UnOp}.
     */
    @Parameterized.Parameters
    public static Collection<UnOp> resources() {
        return Arrays.asList(UnOp.values());
    }

    /**
     * Constructs a new instance of {@link UnOpExpTest}, using one of the operators
     * from {@link UnOpExpTest#resources()}.
     * @param op The operator from {@link UnOp} to test.
     */
    public UnOpExpTest(UnOp op) {
        this.op = op;
    }

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        unOp = new UnOpExp(op, e1);
    }

    /**
     * Tests if the correct {@link UnOp} is returned.
     */
    @Test
    public void testGetOperator() {
        UnOp op = unOp.getOperator();
        assertEquals(this.op, op);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetFirst() {
        Expression e1 = unOp.getExpression();
        assertSame(this.e1, e1);
    }

    /**
     * Tests if the {@link UnOpExp#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        unOp.accept(visitor);
        verify(visitor).visit(unOp);
    }
}
