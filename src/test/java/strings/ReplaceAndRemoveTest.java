package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReplaceAndRemoveTest {

    private ReplaceAndRemove replaceAndRemove;

    @BeforeEach
    public void setup() {
        replaceAndRemove = new ReplaceAndRemove();
    }

    @Test
    public void testReplaceAndRemove() {

        char[] input = new char[100];
        String str = "acdbbca";

        for (int i = 0; i < 7; i++) {
            input[i] = str.charAt(i);
        }

        int finalSize = replaceAndRemove.replaceAndRemove(7, input);

        for (int i = 0; i < finalSize; i++) {
            System.out.printf(":%s", input[i]);
        }
    }
}
