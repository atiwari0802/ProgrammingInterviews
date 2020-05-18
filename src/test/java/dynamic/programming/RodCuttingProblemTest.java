package dynamic.programming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RodCuttingProblemTest {

    private RodCuttingProblem rodCuttingProblem;

    @BeforeEach
    public void setup() {
        rodCuttingProblem = new RodCuttingProblem();
    }

    @Test
    public void testRodCuttingRecursive() {
        int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};

        int maxValue = rodCuttingProblem.maxValueRecursive(prices, 8);

        System.out.printf("max value: %d", maxValue);
    }

    @Test
    public void testRodCuttingMemoized() {
        int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};
        int[] memo = new int[prices.length];
        Arrays.fill(memo, Integer.MIN_VALUE);

        int maxValue = rodCuttingProblem.maxValueMemoization(prices, 8, memo);

        System.out.printf("max value: %d", maxValue);
    }

    @Test
    public void testRodCuttingTabulated() {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};

        int maxValue = rodCuttingProblem.maxValueTabulation(prices, 8);

        System.out.printf("max value: %d", maxValue);
    }
}
