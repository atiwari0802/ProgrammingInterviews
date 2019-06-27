package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanToDecimalTest {

    private RomanToDecimal romanToDecimal;

    @BeforeEach
    public void setup() {
        romanToDecimal = new RomanToDecimal();
    }

    @Test
    public void testRomanToDecimal() {
        int decimal = romanToDecimal.romanToDecimal("XIX");

        Assertions.assertEquals(19, decimal);
    }
}
