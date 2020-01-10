package hashes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MinimumWindowSubarrayTest {

    private MinimumWindowSubarray minimumWindowSubarray;

    @BeforeEach
    public void setup() {

        minimumWindowSubarray = new MinimumWindowSubarray();

    }

    @Test
    public void testMinimumSubarray() {

        List<String> paragraph = List.of("apple", "banana", "orange", "cat", "dog", "apple", "orange");
        List<String> keywords = List.of("apple", "orange");

        MinimumWindowSubarray.Result result = minimumWindowSubarray.findMinimumWindowSubarray(paragraph, keywords);

        System.out.printf("Left Index: %s. Right Index: %s", result.leftIndex, result.rightIndex);
    }

}
