package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MaxSubArrayTest {

    private MaxSubArray maxSubArray;

    @BeforeEach
    public void setup() {
        maxSubArray = new MaxSubArray();
    }

    @Test
    public void testMaxSubArray() {

        List<Integer> input = List.of(-1, 4, 2, -4, 6, -3);

        int result = maxSubArray.maxSubArray(input);

        Assertions.assertEquals(8, result);

    }

    public void testMaxSubArrayWithIndex() {

        List<Integer> input = List.of(-1, 4, 2, -4, 6, -3);

        MaxSubArray.Result result = maxSubArray.maxSubArrayWithIndex(input);

        Assertions.assertEquals(1, result.startIndex);
        Assertions.assertEquals(4, result.endIndex);
    }

}
