package hashes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SequentialMinimumWindowSubarrayTest {

    private SequentialMinimumWindowSubarray sequentialMinimumWindowSubarray;

    @BeforeEach
    public void setup() {
        sequentialMinimumWindowSubarray = new SequentialMinimumWindowSubarray();
    }

    @Test
    public void testMinimumWindow() {

        List<String> paragraph = List.of("apple", "banana", "orange", "orange", "cat", "dog", "apple", "orange");
        List<String> keywords = List.of("apple", "orange");

        SequentialMinimumWindowSubarray.Subarray result = sequentialMinimumWindowSubarray.minimumSequentialSubarray(paragraph, keywords);

        System.out.printf("Start: %s. End %s", result.startIndex, result.endIndex);

    }
}
