package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void setup() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSumLinearSpace() {
        List<Integer> input = List.of(2, 7, 11, 15);
        int desiredSum = 9;

        Assertions.assertTrue(twoSum.doesSumExistWithLinearSpace(input, desiredSum));
    }

    @Test
    public void testTwoSumConstantSpace() {
        List<Integer> input = Arrays.asList(7, 2, 48, 15, 11, 45);
        int desiredSum = 9;

        Assertions.assertTrue(twoSum.doesSumExistWithConstantSpace(input, desiredSum));
    }
}
