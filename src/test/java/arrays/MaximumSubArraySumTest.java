package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MaximumSubArraySumTest {

    private MaximumSubArraySum maximumSubArraySum;

    @BeforeEach
    public void setup() {
        maximumSubArraySum = new MaximumSubArraySum();
    }

    @Test
    public void testMaxSubArraySum() {
        List<Integer> numbers = List.of(-2, 1, -3, 4, -1, 2, 1, -5, 4);

        int result = maximumSubArraySum.maximumSubArray(numbers);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void testMaxSubArrayIndexes() {
        List<Integer> numbers = List.of(-2, 1, -3, 4, -1, 2, 1, -5, 4);

        MaximumSubArraySum.MaximumSubArrayIndexes result = maximumSubArraySum.maximumSubArrayIndexes(numbers);

        Assertions.assertEquals(6, result.maxSum);
        Assertions.assertEquals(3, result.startIndex);
        Assertions.assertEquals(6, result.endIndex);
    }

}
