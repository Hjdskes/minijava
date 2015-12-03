package org.hjdskes.id2202.ast;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of an {@link Identifier}.
 */
public class IdentifierTest {
    private static final String IDENTIFIER_STRING = "foo";
    private Identifier identifier;
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
        identifier = new Identifier(IDENTIFIER_STRING);
    }

    /**
     * Tests if the correct identifier is returned.
     */
    @Test
    public void testGetIdentifier() {
        String identifierString = identifier.getIdentifier();
        assertSame(identifierString, IDENTIFIER_STRING);
    }

    /**
     * Tests if the {@link Identifier#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        identifier.accept(visitor);
        verify(visitor).visit(identifier);
    }

    /**
     * Tests if the {@link Identifier#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        identifier.accept(typeVisitor);
        verify(typeVisitor).visit(identifier);
    }
}
