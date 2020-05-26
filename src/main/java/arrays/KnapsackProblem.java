package arrays;

import java.util.Arrays;

public class KnapsackProblem {

    public int knapsackProblemRecursive(int itemLeft, int weightLeft, int[] weights, int[] values) {
        if (itemLeft == 0 || weightLeft == 0) {
            return 0;
        }
        if (weights[itemLeft - 1] > weightLeft) {
            return knapsackProblemRecursive(itemLeft - 1, weightLeft, weights, values);
        }

        return Math.max(knapsackProblemRecursive(itemLeft - 1, weightLeft, weights, values),
                values[itemLeft - 1] + knapsackProblemRecursive(itemLeft - 1, weightLeft - weights[itemLeft - 1], weights, values));
    }

    public int knapsackProblemMemoized(int itemsLeft, int weightLeft, int[] weights, int[] values, int[][] memo) {
        if (memo[itemsLeft][weightLeft] > -1) {
            System.out.printf("HIT For: %d --> %d\n", itemsLeft, weightLeft);
            return memo[itemsLeft][weightLeft];
        }
        if (itemsLeft == 0 || weightLeft == 0) {
            return 0;
        }
        if (weights[itemsLeft - 1] > weightLeft) {
            memo[itemsLeft][weightLeft] = knapsackProblemMemoized(itemsLeft - 1, weightLeft, weights, values, memo);
            return memo[itemsLeft - 1][weightLeft];
        }

        memo[itemsLeft][weightLeft] = Math.max(knapsackProblemMemoized(itemsLeft - 1, weightLeft, weights, values, memo),
                values[itemsLeft - 1] + knapsackProblemMemoized(itemsLeft - 1, weightLeft - weights[itemsLeft - 1], weights, values, memo));

        return memo[itemsLeft][weightLeft];
    }

    public int knapsackProblemDP(int totalWeight, int[] weights, int[] values) {
        int[][] table = new int[values.length + 1][totalWeight + 1];

        for (int i = 0; i <= values.length; i++) {
            for (int j = 0; j <= totalWeight; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                }
                else if (weights[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], values[i - 1] + table[i -1][j - weights[i - 1]]);
                }
            }
        }
        for (int[] row : table) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        return table[values.length][totalWeight];
    }
}
