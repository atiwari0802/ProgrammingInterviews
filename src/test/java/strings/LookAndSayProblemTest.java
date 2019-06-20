package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LookAndSayProblemTest {

    private LookAndSayProblem lookAndSayProblem;

    @BeforeEach
    public void setup() {
        lookAndSayProblem = new LookAndSayProblem();
    }

    @Test
    public void testLookAndSay() {
        String nThNumber = lookAndSayProblem.lookAndSay(4);

        Assertions.assertEquals("111221", nThNumber);
    }
}
