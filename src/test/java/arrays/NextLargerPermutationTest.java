package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NextLargerPermutationTest {

    private NextLargerPermutation nextLargerPermutation;

    @BeforeEach
    public void setup() {
        nextLargerPermutation = new NextLargerPermutation();
    }

    @Test
    public void testNextLargerPermutation() {

        List<Integer> permutation = Arrays.asList(2, 1, 0, 5, 4, 3);

        List<Integer> nextPermutation = nextLargerPermutation.nextLargerPermutation(permutation);

        nextPermutation.forEach(i -> System.out.printf(" :%s ", i));
    }

}
