package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MissingPositiveIntegerTest {

    private MissingPositiveInteger missingPositiveInteger;

    @BeforeEach
    public void setup() {
        missingPositiveInteger = new MissingPositiveInteger();
    }

    @Test
    public void testMissingPositiveInteger() {
        List<Integer> input = Arrays.asList(3, 4, -1, 1);

        int index = missingPositiveInteger.findMissingPositiveInteger(input);

        System.out.println(index);
    }

    @Test
    public void testMissingPositiveInteger1() {
        List<Integer> input = Arrays.asList(1, 2, 0);

        int index = missingPositiveInteger.findMissingPositiveInteger(input);

        System.out.println(index);
    }
}
