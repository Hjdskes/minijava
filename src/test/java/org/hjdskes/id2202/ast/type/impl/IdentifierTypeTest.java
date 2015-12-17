package org.hjdskes.id2202.ast.type.impl;

import org.hjdskes.id2202.ast.Visitor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link IdentifierType} node for the abstract syntax tree.
 */
public class IdentifierTypeTest {
    private static final String IDENTIFIER_STRING = "foo";
    private IdentifierType identifier;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        identifier = new IdentifierType(IDENTIFIER_STRING);
    }

    /**
     * Tests if the correct identifier is returned.
     */
    @Test
    public void testGetIdentifierType() {
        String identifierString = identifier.getIdentifier();
        assertSame(identifierString, IDENTIFIER_STRING);
    }

    /**
     * Tests if the {@link IdentifierType#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        identifier.accept(visitor);
        verify(visitor).visit(identifier);
    }
}
