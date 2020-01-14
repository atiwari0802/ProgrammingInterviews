package hashes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LongestSubArrayWithDistinctEntriesTest {

    private LongestSubArrayWithDistinctEntries longestSubArrayWithDistinctEntries;

    @BeforeEach
    public void setup() {
        longestSubArrayWithDistinctEntries = new LongestSubArrayWithDistinctEntries();
    }

    @Test
    public void testLongestSubArray() {

        List<Integer> input = List.of(1, 2, 3, 4, 1, 26, 25, 24, 2, 4, 5);

        int result = longestSubArrayWithDistinctEntries.findLongestDistinctSubArray(input);

        Assertions.assertEquals(7, result);
    }

}
