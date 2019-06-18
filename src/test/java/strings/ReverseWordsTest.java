package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseWordsTest {

    private ReverseWords reverseWords;

    @BeforeEach
    public void setup() {
        reverseWords = new ReverseWords();
    }

    @Test
    public void testReverseWords() {

        reverseWords.reverseWords("iPhone is costly".toCharArray());
    }
}
