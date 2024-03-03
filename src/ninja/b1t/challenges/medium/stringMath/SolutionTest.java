package ninja.b1t.challenges.medium.stringMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    // This class is used for testing the stringMath method of class Solution.
    // The stringMath method takes a string that represents groups of integers separated by "\n\n".
    // Within each group, integers are separated by "\n". It sums up the integers in each group,
    // then returns the maximum sum among the groups.

    @Test
    public void testStringMath() {
        String input1 = "1\n2\n3\n\n4\n5\n6\n\n7\n8\n9";
        int expectedOutput1 = 24;
        assertEquals(expectedOutput1, Solution.stringMath(input1),
                "Expected the maximum sum among groups of integers to be " + expectedOutput1);

        String input2 = "10\n20\n30\n\n40\n50\n60\n\n70\n80\n90";
        int expectedOutput2 = 240;
        assertEquals(expectedOutput2, Solution.stringMath(input2),
                "Expected the maximum sum among groups of integers to be " + expectedOutput2);
    }
}