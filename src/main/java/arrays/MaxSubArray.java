package arrays;

import java.util.List;

public class MaxSubArray {

    public int maxSubArray(List<Integer> input) {

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < input.size(); i++) {
            currentSum = Math.max(0, currentSum + input.get(i));
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }


    public Result maxSubArrayWithIndex(List<Integer> input) {

        int currentSum = 0, maxSum = 0;
        int currentStartIndex = 0, maxStartIndex = 0, maxEndIndex = 0;

        for (int i = 0; i < input.size(); i++) {
            if (currentSum <= 0) {
                currentStartIndex = i;
                currentSum = input.get(i);
            }
            else {
                currentSum += input.get(i);
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
                maxStartIndex = currentStartIndex;
                maxEndIndex = i;
            }
        }
        return new Result(maxStartIndex, maxEndIndex, maxSum);
    }

    public static class Result {
        public int startIndex, endIndex, maxSum;

        public Result(int startIndex, int endIndex, int maxSum) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.maxSum = maxSum;
        }
    }

}
