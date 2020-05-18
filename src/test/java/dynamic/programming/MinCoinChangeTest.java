package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinCoinChangeTest {

    private MinCoinChange minCoinChange;

    @BeforeEach
    public void setup() {
        minCoinChange = new MinCoinChange();
    }

    @Test
    public void testRecursive() {
        int [] coins = {1, 5, 10};
        int amount = 11;

        int result = minCoinChange.minCoinsRecursive(coins, amount);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMemoized() {
        int [] coins = {1, 5, 10};
        int amount = 11;
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);

        int result = minCoinChange.minCoinsMemoized(coins, amount, memo);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDP() {
        int [] coins = {1, 5, 10};
        int amount = 11;

        int result = minCoinChange.minCoinsDP(coins, amount);

        Assertions.assertEquals(2, result);
    }

}
