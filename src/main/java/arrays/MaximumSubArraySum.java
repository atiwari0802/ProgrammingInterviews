package arrays;

import java.util.List;

public class MaximumSubArraySum {

    public int maximumSubArray(List<Integer> numbers) {
        int maxSum = 0;
        int currentSum = 0;

        for (int num : numbers) {
            currentSum = Math.max(0, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public MaximumSubArrayIndexes maximumSubArrayIndexes(List<Integer> numbers) {
        int currentSum = 0;
        int maxSum = 0;
        int startIndex = 0, endIndex = 0;

        for (int i = 0; i < numbers.size(); i++) {
            currentSum += numbers.get(i);
            if (currentSum <= 0) {
                startIndex = i + 1;
                endIndex = i;
                currentSum = 0;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                endIndex = i;
            }
        }
        return new MaximumSubArrayIndexes(startIndex, endIndex, maxSum);
    }


    public static class MaximumSubArrayIndexes {
        public int startIndex;
        public int endIndex;
        public int maxSum;

        public MaximumSubArrayIndexes(int start, int end, int maxSum) {
            this.startIndex = start;
            this.endIndex = end;
            this.maxSum = maxSum;
        }
    }

}
