package ninja.b1t.challenges.medium.twoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    /* Test method for 'ninja.b1t.challenges.medium.twoSum.Solution.twoSum()' */
    @Test
    void testTwoSum() {
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
    
    @Test
    void testTwoSumWithoutTargetInArray() {
        Solution solution = new Solution();
        int[] numbers = {3, 4, 6, 8};
        int target = 10;
        int[] result = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }
    
    @Test
    void testTwoSumWithEmptyArray() {
        Solution solution = new Solution();
        int[] numbers = {};
        int target = 10;
        int[] result = solution.twoSum(numbers, target);
        assertArrayEquals(new int[]{-1}, result);
    }
}