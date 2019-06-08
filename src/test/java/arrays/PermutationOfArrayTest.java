package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PermutationOfArrayTest {

    private PermutateArray permutationOfArray;

    @BeforeEach
    public void setup() {
        permutationOfArray = new PermutateArray();
    }

    @Test
    public void testApplyPermutation() {
        permutationOfArray.applyPermutation(Arrays.asList(3, 2, 0, 1),
                Arrays.asList(8, 1, 4, 7));

    }
}
