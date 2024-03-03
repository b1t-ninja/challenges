package ninja.b1t.challenges.medium.reverseInt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * SolutionTest.java - JUnit test cases for Solution.java.
 * 
 * This class contains various test cases to verify the functionality of the
 * reverseInteger method in the Solution class. The tests includes positive, negative and zero value scenarios.
 */        

public class SolutionTest {

    /**
     * Tests reverseInteger with a positive value.
     */
    @Test
    public void testReverseInteger_PositiveValue() {
        int input = 123;
        int expected = 321;
        
        assertEquals(expected, Solution.reverseInteger(input));
    }

    /**
     * Tests reverseInteger with a negative value.
     */
    @Test
    public void testReverseInteger_NegativeValue() {
        int input = -123;
        int expected = -321;
        
        assertEquals(expected, Solution.reverseInteger(input));
    }
    
    /**
     * Tests reverseInteger with zero as value.
     */
    @Test
    public void testReverseInteger_ZeroValue() {
        int input = 0;
        int expected = 0;
        
        assertEquals(expected, Solution.reverseInteger(input));
    }

    /**
     * Tests reverseInteger with a single digit value.
     */
    @Test
    public void testReverseInteger_SingleDigitValue() {
        int input = 1;
        int expected = 1;
        
        assertEquals(expected, Solution.reverseInteger(input));
    }
}