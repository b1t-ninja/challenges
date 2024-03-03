package ninja.b1t.challenges.medium.medianTwoSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testMedianTwoSortedArrays() {
        Solution solution = new Solution();

        int[] n = {1, 3, 5};
        int[] m = {2, 4, 6};
        double expected = 3.5;
        double actual = Solution.medianTwoSortedArrays(n, m);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMedianTwoSortedArrays_singleElementArrays() {
        Solution solution = new Solution();

        int[] n = {1};
        int[] m = {2};
        double expected = 1.5;
        double actual = Solution.medianTwoSortedArrays(n, m);
        assertEquals(expected, actual);
    }

    @Test
    public void testMedianTwoSortedArrays_oddMergedArray() {
        Solution solution = new Solution();

        int[] n = {1, 3, 5};
        int[] m = {2};
        double expected = 2.5;
        double actual = Solution.medianTwoSortedArrays(n, m);
        assertEquals(expected, actual);
    }
}