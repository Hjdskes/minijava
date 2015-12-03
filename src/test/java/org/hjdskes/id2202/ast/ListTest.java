package org.hjdskes.id2202.ast;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * Test suite for {@link List}.
 */
public class ListTest {
    private static final String FOO = "foo";
    private static final String BAR = "bar";
    private static final String BAZ = "baz";
    private List<String> list;

    /**
     * Sets up the test environment.
     */
    @Before
    public void setup() {
        list = new List<>();
        list.add(FOO);
        list.add(BAR);
        list.add(BAZ);
    }

    /**
     * Tests adding an element to the list.
     */
    @Test
    public void testAdd() {
        // CHECKSTYLE.OFF: MagicNumber
        int expectedSize = 4;
        // CHECKSTYLE.ON: MagicNumber
        String conan = "conan o'brien";

        list.add(conan);
        assertEquals(expectedSize, list.size());
        // CHECKSTYLE.OFF: MagicNumber
        assertSame(conan, list.get(3));
        // CHECKSTYLE.ON: MagicNumber
    }

    /**
     * Tests getting an element from the list.
     */
    @Test
    public void testGet() {
        assertSame(FOO, list.get(0));
        assertSame(BAR, list.get(1));
        assertSame(BAZ, list.get(2));
    }

    /**
     * Tests if the size of the list is updated correctly.
     */
    @Test
    public void testSize() {
        // CHECKSTYLE.OFF: MagicNumber
        int expectedSize = 3;
        // CHECKSTYLE.ON: MagicNumber
        assertEquals(expectedSize, list.size());

        list.add("conan o'brien");
        assertEquals(++expectedSize, list.size());
    }

    /**
     * Tests if an iterator is returned correctly.
     */
    @Test
    public void testIterator() {
        int i = 0;

        Iterator<String> iterator = list.iterator();
        assertNotNull(iterator);

        while (iterator.hasNext()) {
            assertEquals(list.get(i), iterator.next());
            i++;
        }
    }
}
