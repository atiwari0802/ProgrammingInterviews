package arrays;

import java.util.List;

public class BuyAndSellStocks {

    public int computeMaxProfitBruteForce(List<Integer> integers) {

        int maxProfit = Integer.MIN_VALUE, difference;

        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                difference = integers.get(j) - integers.get(i);
                maxProfit = Math.max(maxProfit, difference);
            }
        }
        System.out.println("Maximum profit that can be made="+ maxProfit);
        return maxProfit;
    }

    public int computeMaxProfit(List<Integer> integers) {

        int maximumProfit = 0, minimumValue = Integer.MAX_VALUE;
        for (int i = 0; i < integers.size(); i++) {
            minimumValue = Math.min(minimumValue, integers.get(i));
            maximumProfit = Math.max(maximumProfit, integers.get(i) - minimumValue);
        }
        System.out.println("Maximum profit that can be made="+maximumProfit);
        return maximumProfit;
    }

}
