package ninja.b1t.challenges.medium.sumHOF;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void testSumHOF_ifNumbersArePositive() {
        int[] numbers = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = Solution.sumHOF(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testSumHOF_ifNumbersAreNegative() {
        int[] numbers = {-1, -2, -3, -4, -5};
        int expectedSum = -15;
        int actualSum = Solution.sumHOF(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testSumHOF_ifNumbersAreMixed() {
        int[] numbers = {-1, 2, -3, 4, -5};
        int expectedSum = -3;
        int actualSum = Solution.sumHOF(numbers);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    void testSumHOF_ifArrayIsEmpty() {
        int[] numbers = {};
        int expectedSum = 0;
        int actualSum = Solution.sumHOF(numbers);
        assertEquals(expectedSum, actualSum);
    }
}