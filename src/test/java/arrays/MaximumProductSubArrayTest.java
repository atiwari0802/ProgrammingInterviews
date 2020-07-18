package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MaximumProductSubArrayTest {

    private MaximumProductSubArray maximumProductSubArray;

    @BeforeEach
    public void setup() {
        maximumProductSubArray = new MaximumProductSubArray();
    }

    @Test
    public void testMaxProductSubArray() {
        List<Integer> input = Arrays.asList(-6, 4, -5, 8, -10, 0, 8);

        int result = maximumProductSubArray.findMaximumSubArrayProduct(input);

        Assertions.assertEquals(1600, result);
    }
}
