package arrays;

import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DutchFlagProblemTest {

    private DutchFlagProblem dutchFlagProblem;

    @BeforeEach
    public void setup() {
        dutchFlagProblem = new DutchFlagProblem();
    }

    @Test
    public void testThreeWaySort() {

        List<Integer> input = Arrays.asList(1, 0, 0, 1, 1, 1, 2, 0, 1, 2, 1, 1);

        List<Integer> output = dutchFlagProblem.threeWaySort(input);

        output.forEach(i -> System.out.printf(" %d ", i));


    }
}
