package org.hjdskes.id2202;

import org.hjdskes.id2202.parser.MiniJavaLexerTest;
import org.hjdskes.id2202.parser.MiniJavaParserTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Driver to easily run all the tests.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MiniJavaLexerTest.class,
        MiniJavaParserTest.class,
})
public class AllTests {
}
