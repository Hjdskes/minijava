package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.expression.Expression;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;

/**
 * Test suite for the construction of an {@link ArrayAssign} node for the abstract syntax tree.
 */
public class ArrayAssignTest {
    private ArrayAssign array;
    @Mock
    private Identifier identifier;
    @Mock
    private Expression index;
    @Mock
    private Expression expression;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        array = new ArrayAssign(identifier, index, expression);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetIndex() {
        Expression index = array.getIndex();
        assertSame(this.index, index);
    }
}
