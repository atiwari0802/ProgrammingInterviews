package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntToStringTest {

    private IntToString intToString;

    @BeforeEach
    public void setup() {
        intToString = new IntToString();
    }

    @Test
    public void intToStringTest() {

        String str = intToString.intToString(1212310);

        Assertions.assertEquals("1212310", str);
    }
}
