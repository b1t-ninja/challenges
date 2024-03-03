package ninja.b1t.challenges.medium.pianoKeyColor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    
    /* SolutionTest class is a test class for the `pianoKeyColor` method in the `Solution` class.
     * The `pianoKeyColor` method is used for getting the color of piano key by its number.
     */
  
    @Test
    void testPianoKeyColor1() {
        int keyNumber = 1;
        String expected = "W";

        String result = Solution.pianoKeyColor(keyNumber);

        assertEquals(expected, result);
    }

    @Test
    void testPianoKeyColor2() {
        int keyNumber = 2;
        String expected = "B";

        String result = Solution.pianoKeyColor(keyNumber);

        assertEquals(expected, result);
    }

    @Test
    void testPianoKeyColor12() {
        int keyNumber = 12;
        String expected = "W";

        String result = Solution.pianoKeyColor(keyNumber);

        assertEquals(expected, result);
    }

    @Test
    void testPianoKeyColor13() {
        int keyNumber = 13;
        String expected = "W";

        String result = Solution.pianoKeyColor(keyNumber);

        assertEquals(expected, result);
    }
}