package hashes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeFeasibilityTest {

    private PalindromeFeasibility palindromeFeasibility;

    @BeforeEach
    public void setup() {
        palindromeFeasibility = new PalindromeFeasibility();
    }

    @Test
    public void testPalindromeCondition() {

        Assertions.assertTrue(palindromeFeasibility
                .canFormPalindrome("edified"));
    }
}
