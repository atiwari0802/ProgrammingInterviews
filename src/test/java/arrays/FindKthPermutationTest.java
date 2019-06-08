package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindKthPermutationTest {

    private FindKthPermutation findKthPermutation;

    @BeforeEach
    public void setup() {
        findKthPermutation = new FindKthPermutation();
    }

    @Test
    public void testFindKthPermutation() {

        List<Integer> permutation = Arrays.asList(2, 1, 0, 5, 4, 3);

        List<Integer> output = findKthPermutation.findKthPermutation(permutation, 2);

        output.forEach(i -> System.out.printf(":%s ", i));
    }

}
