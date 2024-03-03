package ninja.b1t.challenges.medium.brackets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SolutionTest {

    @Test
    public void testBracketsWithEmptyString() {
        // Testing if the brackets method behaves correctly for an empty string
        assertTrue(Solution.brackets(""));
    }

    @Test
    public void testBracketsWithValidBrackets() {
        // Testing if the brackets method behaves correctly for a string with valid brackets
        assertTrue(Solution.brackets("()()()"));
    }

    @Test
    public void testBracketsWithInvalidBrackets() {
        // Testing if the brackets method behaves correctly for a string with invalid brackets
        assertFalse(Solution.brackets("(()"));
    }

    @Test
    public void testBracketsWithNonBracketCharacters() {
        // Testing if the brackets method behaves correctly for a string with non-bracket characters
        assertFalse(Solution.brackets("abc"));
    }
}