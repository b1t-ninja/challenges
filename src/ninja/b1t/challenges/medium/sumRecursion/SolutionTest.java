package ninja.b1t.challenges.medium.sumRecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    /*
    Test class for Solution.java which contains method sumRecursion, 
    which recurssively sums an array of integers.
    */

    @Test
    public void testSumRecursion() {
        // Testing array with positive numbers 
        int[] nums1 = {1, 2, 3, 4, 5};
        int expected1 = 15;
        Assertions.assertEquals(expected1, Solution.sumRecursion(nums1));
        
        // Testing empty array
        int[] nums2 = {};
        int expected2 = 0;
        Assertions.assertEquals(expected2, Solution.sumRecursion(nums2));

        // Testing array with negative numbers
        int[] nums3 = {-1, -1, -1, -1, -1};
        int expected3 = -5;
        Assertions.assertEquals(expected3, Solution.sumRecursion(nums3));
        
        // Testing array with mixed numbers
        int[] nums4 = {1, -2, 3, -4, 5};
        int expected4 = 3;
        Assertions.assertEquals(expected4, Solution.sumRecursion(nums4));
    }
}