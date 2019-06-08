package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BuyAndSellStocksTest {

    private BuyAndSellStocks buyAndSellStocks;

    @BeforeEach
    public void setup() {
        buyAndSellStocks = new BuyAndSellStocks();
    }

    @Test
    public void testBruteForce() {

        List<Integer> integers = Arrays.asList(10, 20, 15, 25, 5);
        int maxProfit = buyAndSellStocks.computeMaxProfitBruteForce(integers);

        Assertions.assertEquals(15, maxProfit);
    }

    @Test
    public void testComputeMaxProfit() {

        List<Integer> integers = Arrays.asList(10, 20, 15, 25, 5);
        int maxProfit = buyAndSellStocks.computeMaxProfit(integers);

        Assertions.assertEquals(15, maxProfit);
    }

}
