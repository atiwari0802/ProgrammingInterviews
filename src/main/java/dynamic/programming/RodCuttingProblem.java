package dynamic.programming;

public class RodCuttingProblem {

    public int maxValueRecursive(int[] prices, int length) {
        if (length <= 0) {
            return 0;
        }
        System.out.println("Length Is: " + length);
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= length; i++) {
            maxValue = Math.max(maxValue, prices[i] + maxValueRecursive(prices, length - i));
        }
        return maxValue;
    }

    public int maxValueMemoization(int[] prices, int length, int[] memo) {
        if (memo[length] >= 0) {
            return memo[length];
        }

        System.out.println("Result not found in lookup for length: " + length);

        int maxValue = Integer.MIN_VALUE;

        if (length == 0) {
            maxValue = 0;
        } else {
            for (int i = 1; i <= length; i++) {
                maxValue = Math.max(maxValue, prices[i] + maxValueMemoization(prices, length - i, memo));
            }
        }
        memo[length] = maxValue;
        return maxValue;
    }

    public int maxValueTabulation(int[] prices, int length) {
        int[] values = new int[prices.length + 1];
        values[0] = 0;

        for (int i = 1; i <= length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                maxValue = Math.max(maxValue, prices[j] + values[i - j - 1]);
            }
            values[i] = maxValue;
        }
        return values[length];
    }


}
