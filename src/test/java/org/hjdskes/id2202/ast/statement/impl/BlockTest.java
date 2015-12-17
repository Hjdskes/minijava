package org.hjdskes.id2202.ast.statement.impl;

import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.statement.Statement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link Block} node for the abstract syntax tree.
 */
public class BlockTest {
    private Block block;
    @Mock
    private List<Statement> statements;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        block = new Block(statements);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetStatement() {
        List<Statement> statements = block.getStatements();
        assertSame(this.statements, statements);
    }

    /**
     * Tests if the {@link Block#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        block.accept(visitor);
        verify(visitor).visit(block);
    }
}
