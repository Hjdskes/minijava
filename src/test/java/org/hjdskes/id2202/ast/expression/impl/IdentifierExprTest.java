package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link IdentifierExpr} node for the abstract syntax tree.
 */
public class IdentifierExprTest {
    private static final String IDENTIFIER = "foo";
    private IdentifierExpr identifierExpr;
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
        identifierExpr = new IdentifierExpr(IDENTIFIER);
    }

    /**
     * Tests if the correct identifier is returned.
     */
    @Test
    public void testGetIdentifier() {
        String identifier = identifierExpr.getIdentifier();
        assertSame(IDENTIFIER, identifier);
    }

    /**
     * Tests if the {@link IdentifierExpr#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        identifierExpr.accept(visitor);
        verify(visitor).visit(identifierExpr);
    }

    /**
     * Tests if the {@link IdentifierExpr#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        identifierExpr.accept(typeVisitor);
        verify(typeVisitor).visit(identifierExpr);
    }
}
