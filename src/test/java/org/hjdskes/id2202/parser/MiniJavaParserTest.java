package org.hjdskes.id2202.parser;

import org.hjdskes.id2202.generated.parser.MiniJavaParser;
import org.hjdskes.id2202.generated.parser.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.fail;

/**
 * Test suite for the generated parser.
 *
 * TODO: add tests that fail.
 */
@RunWith(Parameterized.class)
public class MiniJavaParserTest {
    private final MiniJavaParser parser;

    /**
     * Returns a {@link Collection} containing the file names (as {@link String}s) to the test
     * programs.
     *
     * Note that the `/` part of the file name is already provided for and that these
     * files should, therefore, only contain the file name plus a file type, if any.
     * Each item in this {@link Collection} will create an instance of this test via its
     * constructor, {@link MiniJavaParserTest#MiniJavaParserTest(String)}.
     *
     * @return A {@link Collection} containing the paths (as {@link String}s) to the test
     * program files.
     */
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<String> resources() {
        return Arrays.asList(
                "BinarySearch.minijava",
                "BinaryTree.minijava",
                "BubbleSort.minijava",
                "Factorial.minijava",
                "LinkedList.minijava",
                "NestedOp.minijava",
                "QuickSort.minijava",
                "TreeVisitor.minijava"
        );
    }

    /**
     * Constructs a new instance of {@link MiniJavaParserTest}, using one of the entries
     * from {@link MiniJavaParserTest#resources()}.
     * @param resource A path (optionally including a file type) to a MiniJava program inside the
     *                 root resources directory.
     */
    public MiniJavaParserTest(String resource) {
        this.parser = new MiniJavaParser(getClass().getResourceAsStream("/" + resource));
    }

    /**
     * Tests the parser by telling it to parse the current program file. If all goes well,
     * no exceptions will be thrown and the test succeeds. If exceptions are thrown, the test fails.
     */
    @Test
    public void testParser() {
        try {
            parser.Program();
        } catch (ParseException e) {
            fail(e.toString());
        }
    }
}
