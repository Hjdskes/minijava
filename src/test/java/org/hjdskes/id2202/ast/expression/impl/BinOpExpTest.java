package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.BinOp;
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
 * Test suite for the construction of a {@link BinOpExp} node for the abstract syntax tree.
 */
@RunWith(Parameterized.class)
public class BinOpExpTest {
    private BinOp op;
    private BinOpExp binOp;
    @Mock
    private Expression e1;
    @Mock
    private Expression e2;
    @Mock
    private Visitor visitor;

    /**
     * Returns a {@link Collection} containing all the available operators found in {@link BinOp}.
     * @return A {@link Collection} containing all the available operators found in {@link BinOp}.
     */
    @Parameterized.Parameters
    public static Collection<BinOp> resources() {
        return Arrays.asList(BinOp.values());
    }

    /**
     * Constructs a new instance of {@link BinOpExpTest}, using one of the operators
     * from {@link BinOpExpTest#resources()}.
     * @param op The operator from {@link BinOp} to test.
     */
    public BinOpExpTest(BinOp op) {
        this.op = op;
    }

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        binOp = new BinOpExp(op, e1, e2);
    }

    /**
     * Tests if the correct {@link BinOp} is returned.
     */
    @Test
    public void testGetOperator() {
        BinOp op = binOp.getOperator();
        assertEquals(this.op, op);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetFirst() {
        Expression e1 = binOp.getFirst();
        assertSame(this.e1, e1);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetSecond() {
        Expression e2 = binOp.getSecond();
        assertSame(this.e2, e2);
    }

    /**
     * Tests if the {@link BinOpExp#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        binOp.accept(visitor);
        verify(visitor).visit(binOp);
    }
}
