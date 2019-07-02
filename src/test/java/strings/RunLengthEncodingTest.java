package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunLengthEncodingTest {

    private RunLengthEncoding runLengthEncoding;

    @BeforeEach
    public void setup() {
        runLengthEncoding = new RunLengthEncoding();
    }

    @Test
    public void testDecodingString() {

        String decodedString = runLengthEncoding.decode("4a3b2c1d");

        Assertions.assertEquals("aaaabbbccd", decodedString );
    }

    @Test
    public void testEncodingString() {

        String encodedString = runLengthEncoding.encode("aaaabbbccd");

        Assertions.assertEquals("4a3b2c1d", encodedString);
    }
}
