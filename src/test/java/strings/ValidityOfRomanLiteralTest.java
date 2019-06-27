package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidityOfRomanLiteralTest {

    private ValidityOfRomanLiteral validityOfRomanLiteral;

    @BeforeEach
    public void setup() {
        validityOfRomanLiteral = new ValidityOfRomanLiteral();
    }

    @Test
    public void testRomanLiteralValidity() {

        boolean result = validityOfRomanLiteral.isValid("LXIX");

        Assertions.assertTrue(result);
    }

    @Test
    public void testInvalidRomanLiteralValidity() {

        boolean result = validityOfRomanLiteral.isValid("IXC");

        Assertions.assertFalse(result);
    }
}
