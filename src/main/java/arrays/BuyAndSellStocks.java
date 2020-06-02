package arrays;

import java.util.List;

public class BuyAndSellStocks {

    public int maxProfit(List<Integer> listPrices) {
        int minimumSoFar = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < listPrices.size(); i ++) {
            minimumSoFar = Math.min(minimumSoFar, listPrices.get(i));
            maxProfit = Math.max(maxProfit, listPrices.get(i) - minimumSoFar);
        }
        return maxProfit;
    }

}
