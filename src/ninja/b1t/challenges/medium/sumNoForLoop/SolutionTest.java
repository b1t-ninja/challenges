package ninja.b1t.challenges.medium.sumNoForLoop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This class is a test class for the Solution class.
 * Specifically, it tests the sumNoForLoop method in the Solution class.
 */
public class SolutionTest {

    /**
     * Tests sumNoForLoop with a non-empty array.
     */
    @Test
    void testSumNoForLoop_nonEmptyArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int actualResult = Solution.sumNoForLoop(nums);
        int expectedResult = 15;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * Tests sumNoForLoop with empty array.
     */
    @Test
    void testSumNoForLoop_emptyArray() {
        int[] nums = {};
        int actualResult = Solution.sumNoForLoop(nums);
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * Tests sumNoForLoop with negative numbers in the array.
     */
    @Test
    void testSumNoForLoop_negativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int actualResult = Solution.sumNoForLoop(nums);
        int expectedResult = -15;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}