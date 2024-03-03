package ninja.b1t.challenges.medium.integerMultiplication;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


// This class contains unit tests for the Solution class.
public class SolutionTest {

    @Test
    // This test checks the integerMultiplication method by multiplying 0 with another number.
    public void testIntegerMultiplicationWithZero() {
        assertEquals(0, Solution.integerMultiplication(0, 5));
    }

    @Test
    // This test checks the integerMultiplication method by multiplying two positive integers.
    public void testIntegerMultiplicationPositiveIntegers() {
        assertEquals(30, Solution.integerMultiplication(5, 6));
    }
}