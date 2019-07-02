package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WriteStringSinusoidallyTest {

    private WriteStringSinusoidally writeStringSinusoidally;

    @BeforeEach
    public void setup() {
        writeStringSinusoidally = new WriteStringSinusoidally();
    }

    @Test
    public void testWritingString() {

        String result = writeStringSinusoidally.writeSinusoidally("Hello_World!");

        System.out.printf("%s", result);
    }
}
