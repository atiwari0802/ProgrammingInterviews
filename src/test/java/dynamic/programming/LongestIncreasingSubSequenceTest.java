package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSequenceTest {

    private LongestIncreasingSubSequence longestIncreasingSubSequence;

    @BeforeEach
    public void setup() {
        longestIncreasingSubSequence = new LongestIncreasingSubSequence();
    }

    @Test
    public void testRecursive() {
        List<Integer> input = List.of(6, 3, 5, 2, 7, 8, 1);

        int result = longestIncreasingSubSequence.longestIncreasingSubSequenceRecursive(input);

        Assertions.assertEquals(4, result);

    }

    @Test
    public void testMemoized() {
        List<Integer> input = List.of(6, 3, 5, 2, 7, 8, 1);

        int result = longestIncreasingSubSequence.longestIncreasingSubSequenceMemoized(input);

        Assertions.assertEquals(4, result);

        System.out.println(result);
    }

    @Test
    public void testDP() {
        List<Integer> input = List.of(6, 3, 5, 2, 7, 8, 1);

        int result = longestIncreasingSubSequence.longestIncreasingSubSequenceDP(input);

        Assertions.assertEquals(4, result);
    }

}
