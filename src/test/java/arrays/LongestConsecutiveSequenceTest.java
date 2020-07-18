package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LongestConsecutiveSequenceTest {

    private LongestConsecutiveSequence longestConsecutiveSequence;

    @BeforeEach
    public void setup() {
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    public void testLongestConsecutiveSequence() {
        List<Integer> input = List.of(100, 4, 200, 1, 3, 2);

        int result = longestConsecutiveSequence.longestConsecutiveSequence(input);

        Assertions.assertEquals(4, result);
    }
}
