package stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationsTest {

    private ReversePolishNotations reversePolishNotations;

    @BeforeEach
    public void setup() {
        reversePolishNotations = new ReversePolishNotations();
    }

    @Test
    public void testRpn() {

        String input = "3,4,+,2,*,1,+";

        int result = reversePolishNotations.evaluate(input);

        Assertions.assertEquals(15, result);

    }
}
