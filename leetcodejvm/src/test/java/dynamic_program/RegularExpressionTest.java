package dynamic_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegularExpressionTest {
    RegularExpression regularExpression;

    @Before
    public void setUp() throws Exception {
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isMatch() {
        assertTrue(regularExpression.isMatch("aaa", "a*a"));
        assertFalse(regularExpression.isMatch("ab", ".*c"));
        assertFalse(regularExpression.isMatch("abcd", "d*"));
        assertFalse(regularExpression.isMatch("mississippi", "mis*is*p*."));
        assertTrue(regularExpression.isMatch("mississippi", "mis*is*ip*."));
    }
}