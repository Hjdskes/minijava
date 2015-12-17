package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.type.Type;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link VarDecl} node for the abstract syntax tree.
 */
public class VarDeclTest {
    private VarDecl var;
    @Mock
    private Type type;
    @Mock
    private Identifier identifier;
    @Mock
    private Visitor visitor;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        var = new VarDecl(type, identifier);
    }

    /**
     * Tests if the correct {@link Type} is returned.
     */
    @Test
    public void testGetType() {
        Type type = var.getType();
        assertSame(this.type, type);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetIdentifier() {
        Identifier identifier = var.getIdentifier();
        assertSame(this.identifier, identifier);
    }

    /**
     * Tests if the {@link VarDecl#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        var.accept(visitor);
        verify(visitor).visit(var);
    }
}
