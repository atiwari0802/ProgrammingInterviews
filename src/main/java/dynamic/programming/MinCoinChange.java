package dynamic.programming;

import java.util.Arrays;

public class MinCoinChange {

    public int minCoinsRecursive(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0 || coins.length == 0) {
            return Integer.MAX_VALUE;
        }
        int minCoins = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            minCoins = Math.min(minCoins, minCoinsRecursive(coins, amount - coins[i]));
        }

        return 1 + minCoins;
    }

    public int minCoinsMemoized(int[] coins, int amount, int[] memo) {
        if (amount < 0 || coins.length == 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[amount] != -1) {
            System.out.printf("Memo hit For: %d = %d\n", amount, memo[amount]);
            return memo[amount];
        }
        if (amount == 0) {
            memo[amount] = 0;
            return memo[amount];
        }

        int minCoins = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int result = minCoinsMemoized(coins, amount - coins[i], memo);
            if (amount - coins[i] > 0) {
                memo[amount - coins[i]] = result;
            }
            minCoins = Math.min(result, minCoins);
        }

        return 1 + minCoins;
    }

    public int minCoinsDP(int[] coins, int amount) {
        int[] table = new int[amount + 1];
        Arrays.fill(table, -1);

        table[0] = 0;

        for (int i = 1; i <= amount; i++) {
            int minSoFar = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minSoFar = Math.min(minSoFar, table[i - coins[j]]);
                }
            }
            table[i] = 1 + minSoFar;
        }

        return table[amount];
    }
}
