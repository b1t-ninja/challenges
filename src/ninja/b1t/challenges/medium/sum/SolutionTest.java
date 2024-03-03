package ninja.b1t.challenges.medium.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testSum_emptyArray() {
        int[] nums = {};
        assertEquals(0, Solution.sum(nums),
                "Expected sum of empty array to be 0");
    }

    @Test
    void testSum_singleElement() {
        int[] nums = {5};
        assertEquals(5, Solution.sum(nums),
                "Expected sum of single-element array to be the same as the element itself");
    }

    @Test
    void testSum_multipleElements() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(15, Solution.sum(nums),
                "Expected sum of an array from 1 to 5 to be 15");
    }

    @Test
    void testSum_negativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertEquals(-15, Solution.sum(nums),
                "Expected sum of an array from -1 to -5 to be -15");
    }
}