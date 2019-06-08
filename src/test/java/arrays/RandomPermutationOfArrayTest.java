package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomPermutationOfArrayTest {

    private RandomPermutationOfArray randomPermutationOfArray;

    @BeforeEach
    public void setup() {
        randomPermutationOfArray = new RandomPermutationOfArray();
    }

    @Test
    public void testComputeRandomPermutationOfArray() {

        List<Integer> input = IntStream.rangeClosed(0, 20).boxed().collect(Collectors.toList());

        input = randomPermutationOfArray.computeRandomPermutation(input);

        input.forEach(i -> System.out.printf(":%s ", i));
    }


}
