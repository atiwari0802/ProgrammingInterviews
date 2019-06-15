package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToIntTest {

    private StringToInt stringToInt;

    @BeforeEach
    public void setup() {

        stringToInt = new StringToInt();
    }

    @Test
    public void convertStringToInt() {

        String str = "544414";

        Assertions.assertEquals(544414, stringToInt.convertStringToInt(str));

    }
}
