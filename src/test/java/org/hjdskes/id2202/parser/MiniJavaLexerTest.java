package org.hjdskes.id2202.parser;

import org.hjdskes.id2202.generated.parser.MiniJavaParserTokenManager;
import org.hjdskes.id2202.generated.parser.MiniJavaParserConstants;
import org.hjdskes.id2202.generated.parser.SimpleCharStream;
import org.hjdskes.id2202.generated.parser.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

/**
 * Test suite for the generated lexer. Note that reserved keywords, operators and other symbols
 * (e.g., (square) brackets, curly braces et cetera) are not tested, because they are static strings
 * and are therefore correctly tokenized. It is more important to test the regular expressions
 * creating identifiers, for example. Test files containing these reserved keywords, operators  and
 * other symbols are nonetheless available in the `/lexer/` directory in the test resources.
 *
 * TODO: add tests that fail.
 */
@RunWith(Parameterized.class)
public class MiniJavaLexerTest {
    private final MiniJavaParserTokenManager lexer;
    private final int expectedTokenType;

    /**
     * Returns a {@link Collection} containing an array of the file names (as {@link String}s) to
     * the test data, together with the token type that is to be expected from analysing the file.
     * See {@link MiniJavaParserConstants} for the token types.
     *
     * Note that the `/lexer/` part of the file name is already provided for and that these files
     * should, therefore, only contain the file name plus a file type, if any.
     * Each item in this {@link Collection} will create an instance of this test via its
     * constructor, {@link MiniJavaLexerTest#MiniJavaLexerTest(String, int)}.
     *
     * @return A {@link Collection} containing the paths (as {@link String}s) to the test
     * data files, together with the token types that are to be expected from analysing those files.
     */
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> resources() {
        return Arrays.asList(new Object[][] {
                /* Use EOF to make sure that no other token is read. */
                { "c-comment.txt", MiniJavaParserConstants.EOF },
                /* Use EOF to make sure that no other token is read. */
                { "cpp-comment.txt", MiniJavaParserConstants.EOF },
                { "identifier.txt", MiniJavaParserConstants.IDENTIFIER },
                { "number.txt", MiniJavaParserConstants.INTEGER_LITERAL }
        });
    }

    /**
     * Constructs a new instance of {@link MiniJavaLexerTest}, using one of the entries
     * from {@link MiniJavaLexerTest#resources()}.
     * @param resource A path (optionally including a file type) to a test file inside the
     *                 `/lexer/` directory. This file should contain strings to test the lexer with.
     * @param tokenType The type of the token that is to be expected when analysing the given test
     *                  file.
     */
    public MiniJavaLexerTest(String resource, int tokenType) {
        InputStream inputStream = getClass().getResourceAsStream("/lexer/" + resource);
        SimpleCharStream charStream = new SimpleCharStream(inputStream);
        this.lexer = new MiniJavaParserTokenManager(charStream);
        this.expectedTokenType = tokenType;
    }

    /**
     * Tests the lexer by repeatedly asking for the next token. This token is then compared to the
     * expected token. When EOF is reached, the test passes. If the expected token type does not
     * match the returned token type, the test fails.
     */
    @Test
    public void testLexer() {
        for (;;) {
            Token t = lexer.getNextToken();
            if (t.kind != MiniJavaParserConstants.EOF) {
                assertEquals(expectedTokenType, t.kind);
            } else {
                break;
            }
        }
    }
}
