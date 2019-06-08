package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GenerateNonUniformRandomNumbersTest {

    private GenerateNonUniformRandomNumbers generateNonUniformRandomNumbers;

    @BeforeEach
    public void setup() {
        generateNonUniformRandomNumbers = new GenerateNonUniformRandomNumbers();
    }

    @Test
    public void test() {

        List<Integer> values = Arrays.asList(3, 5, 7, 11);
        List<Double> probabilities = Arrays.asList(0.5, 0.333, 0.111, 0.055);

        System.out.println(
                generateNonUniformRandomNumbers
                        .generateNonUniformRandomNumbers(values, probabilities));

    }
}
