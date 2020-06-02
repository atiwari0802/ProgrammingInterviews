package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NextPermutationTest {

    private NextPermutation nextPermutation;

    @BeforeEach
    public void setup() {
        nextPermutation = new NextPermutation();
    }

    @Test
    public void testNextPermutation() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7, 1);

        numbers = nextPermutation.findNextPermutation(numbers);

        numbers.forEach(num -> System.out.printf(" %d ", num));
    }
}
