package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOneTest {

    private PlusOne plusOne;

    @BeforeEach
    public void setup() {
        plusOne = new PlusOne();
    }

    @Test
    public void testAddOne() {
        List<Integer> input = Arrays.asList(1, 2, 3);

        List<Integer> result = plusOne.addOne(input);

        result.forEach(num -> System.out.printf(" %d ", num));
    }

    @Test
    public void testAddExtraDigit() {
        List<Integer> input = new ArrayList<>(Arrays.asList(9, 9, 9));

        List<Integer> result = plusOne.addOne(input);

        result.forEach(num -> System.out.printf(" %d ", num));
    }
}
