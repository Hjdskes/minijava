package org.hjdskes.id2202.ast.expression.impl;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.List;
import org.hjdskes.id2202.ast.TypeVisitor;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.expression.Expression;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link Call} node for the abstract syntax tree.
 */
public class CallTest {
    private Call call;
    @Mock
    private Expression object;
    @Mock
    private Identifier identifier;
    @Mock
    private List<Expression> args;
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
        call = new Call(object, identifier, args);
    }

    /**
     * Tests if the correct {@link Expression} is returned.
     */
    @Test
    public void testGetObject() {
        Expression object = call.getObject();
        assertSame(this.object, object);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetIdentifier() {
        Identifier identifier = call.getIdentifier();
        assertSame(this.identifier, identifier);
    }

    /**
     * Tests if the correct {@link List} is returned.
     */
    @Test
    public void testGetArguments() {
        List<Expression> args = call.getArguments();
        assertSame(this.args, args);
    }

    /**
     * Tests if the {@link Call#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        call.accept(visitor);
        verify(visitor).visit(call);
    }

    /**
     * Tests if the {@link Call#accept(TypeVisitor visitor)} method lets the
     * {@link TypeVisitor} visit it.
     */
    @Test
    public void testTypeAccept() {
        call.accept(typeVisitor);
        verify(typeVisitor).visit(call);
    }
}
