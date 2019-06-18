package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckPalindromeTest {

    private CheckPalindrome checkPalindrome;

    @BeforeEach
    public void setup() {
        checkPalindrome = new CheckPalindrome();
    }

    @Test
    public void testIfStringIsPalindrome() {

        String input = "A man, a plan, a canal,Panama";

        Assertions.assertTrue(checkPalindrome.isPalindrome(input));
    }
}
