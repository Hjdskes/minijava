package org.hjdskes.id2202.ast.classes;

import org.hjdskes.id2202.ast.Identifier;
import org.hjdskes.id2202.ast.Visitor;
import org.hjdskes.id2202.ast.statement.Statement;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

/**
 * Test suite for the construction of a {@link MainClass} node for the abstract syntax tree.
 */
public class MainClassTest {
    private MainClass mainClass;
    @Mock
    private Identifier className;
    @Mock
    private Identifier mainArgumentName;
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
        mainClass = new MainClass(className, mainArgumentName, body);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetClassName() {
        Identifier className = mainClass.getClassName();
        assertSame(this.className, className);
    }

    /**
     * Tests if the correct {@link Identifier} is returned.
     */
    @Test
    public void testGetMainArgumentName() {
        Identifier mainArgumentName = mainClass.getMainArgumentName();
        assertSame(this.mainArgumentName, mainArgumentName);
    }

    /**
     * Tests if the correct {@link Statement} is returned.
     */
    @Test
    public void testGetBody() {
        Statement body = mainClass.getBody();
        assertSame(this.body, body);
    }

    /**
     * Tests if the {@link MainClass#accept(Visitor visitor)} method lets the {@link Visitor}
     * visit it.
     */
    @Test
    public void testAccept() {
        mainClass.accept(visitor);
        verify(visitor).visit(mainClass);
    }
}
