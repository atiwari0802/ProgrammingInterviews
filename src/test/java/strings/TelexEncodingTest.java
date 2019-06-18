package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TelexEncodingTest {

    private TelexEncoding telexEncoding;

    @BeforeEach
    public void setup() {
        telexEncoding = new TelexEncoding();
    }

    @Test
    public void testTelexEncoding() {

        char[] input = new char[100];
        String str = "ab,c.e,";

        for (int i = 0; i < str.length(); i++) {
            input[i] = str.charAt(i);
        }

        int finalSize = telexEncoding.telexEncoding(input, str.length());

        for (int i = 0; i < finalSize; i++) {
            System.out.printf(" %s", input[i]);
        }


    }
}
