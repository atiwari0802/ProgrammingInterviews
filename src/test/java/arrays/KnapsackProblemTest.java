package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KnapsackProblemTest {

    private KnapsackProblem knapsackProblem;

    @BeforeEach
    public void setup() {
        knapsackProblem = new KnapsackProblem();
    }

    @Test
    public void testRecursive() {
        int[] weights = {1, 1, 1};
        int[] values = {10, 20, 30};

        int totalKnapsackWeight = 2;

        int result =
                knapsackProblem.knapsackProblemRecursive(values.length, totalKnapsackWeight, weights, values);

        Assertions.assertEquals(50, result);
    }

    @Test
    public void testMemoized() {
        int[] weights = {1, 1, 1};
        int[] values = {10, 20, 30};
        int totalKnapsackWeight = 2;
        int[][] memo = new int[weights.length + 1][totalKnapsackWeight + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int result =
                knapsackProblem.knapsackProblemMemoized(values.length, totalKnapsackWeight, weights, values, memo);

        Assertions.assertEquals(50, result);

        for (int[] row : memo) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testDP() {
        int[] weights = {1, 1, 1};
        int[] values = {10, 20, 30};
        int totalKnapsackWeight = 2;

        int result = knapsackProblem.knapsackProblemDP(totalKnapsackWeight, weights, values);

        Assertions.assertEquals(50, result);
    }
}
