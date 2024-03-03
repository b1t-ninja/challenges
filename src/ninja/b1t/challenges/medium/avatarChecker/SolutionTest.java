package ninja.b1t.challenges.medium.avatarChecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is a test class for Solution class and specifically the avatarChecker method.
 * avatarChecker method is expected to return elemental emojis based on given input integer.
 */
public class SolutionTest {

    /**
     * Test case for first element with input 1.
     * Expect a 🔥 emoji as the result as it is the first iteration.
     */
    @Test
    public void testFirstElement() {
        String result = Solution.avatarChecker(1);
        assertEquals("🔥", result);
    }

    /**
     * Test case for second element with input 2.
     * Expect a 💧 emoji as the result as it is the second iteration.
     */
    @Test
    public void testSecondElement() {
        String result = Solution.avatarChecker(2);
        assertEquals("💧", result);
    }

    /**
     * Test case for third element with input 3.
     * Expect a 🌍 emoji as the result as it is the third iteration.
     */
    @Test
    public void testThirdElement() {
        String result = Solution.avatarChecker(3);
        assertEquals("🌍", result);
    }

    /**
     * Test case for fourth element with input 4.
     * Expect a 💨 emoji as the result as it is the fourth iteration.
     */
    @Test
    public void testFourthElement() {
        String result = Solution.avatarChecker(4);
        assertEquals("💨", result);
    }

    /**
     * Test case for input 5, which is a cycle back to the first element.
     * Expect a 🔥 emoji as the result since the input is greater than four (the size of the array)
     * and thus should loop back to the first element.
     */
    @Test
    public void testCycleBackElement() {
        String result = Solution.avatarChecker(5);
        assertEquals("🔥", result);
    }
}