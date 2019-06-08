package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class LongestSubarrayTest {

    LongestSubarray longestSubarray;

    @BeforeEach
    public void setup() {
        longestSubarray = new LongestSubarray();
    }

    @Test
    public void testLongestSubarray() {

        List<Integer> input = Arrays.asList(0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3);

        int maximumLength = longestSubarray.findLongestSubarray(input);

        Assertions.assertEquals(8, maximumLength);

    }
}
