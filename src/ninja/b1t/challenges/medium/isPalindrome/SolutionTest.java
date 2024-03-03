package ninja.b1t.challenges.medium.isPalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Class SolutionTest is used to test the method isPalindrome of the Solution Class
 * It follows the guideline to focus each test on a single use case
 * No @BeforeEach methods are used, instead all necessary initialization is done
 * within each test method.
 */
public class SolutionTest {

    /**
     * Method to test the isPalindrome method when input is palindrome
     */
    @Test
    public void testIsPalindromeWhenPalindrome() {
        // Test case: "racecar" is a palindrome
        String word = "racecar";
        boolean expected = true;
        boolean actual = Solution.isPalindrome(word);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Method to test the isPalindrome method when input is not a palindrome
     */
    @Test
    public void testIsPalindromeWhenNotPalindrome() {
        // Test case: "hello" is not a palindrome
        String word = "hello";
        boolean expected = false;
        boolean actual = Solution.isPalindrome(word);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Method to test the isPalindrome method when input is empty String
     */
    @Test
    public void testIsPalindromeWhenEmpty() {
        // Test case: "" is a palindrome
        String word = "";
        boolean expected = true;
        boolean actual = Solution.isPalindrome(word);
        Assertions.assertEquals(expected, actual);
    }
}