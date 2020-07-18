package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

    private MinimumWindowSubstring minimumWindowSubstring;

    @BeforeEach
    public void setup() {
        minimumWindowSubstring = new MinimumWindowSubstring();
    }

    @Test
    public void testMinimumWindowSubstring() {
        String input = "ADOBECODEBANC";
        String text = "ABC";

        MinimumWindowSubstring.WindowDetails windowDetails = minimumWindowSubstring.minimumWindowSubstring(input, text);

        System.out.printf("Length: %d, left: %d, right: %d", windowDetails.length, windowDetails.leftPeg, windowDetails.rightPeg);
    }

}
