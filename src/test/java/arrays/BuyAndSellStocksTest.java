package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BuyAndSellStocksTest {

    private BuyAndSellStocks buyAndSellStocks;

    @BeforeEach
    public void setup() {
        buyAndSellStocks = new BuyAndSellStocks();
    }

    @Test
    public void testMaxProfit() {
        List<Integer> listPrices = List.of(7, 1, 5, 3, 6, 4);

        int result = buyAndSellStocks.maxProfit(listPrices);

        Assertions.assertEquals(5, result);
    }

}
