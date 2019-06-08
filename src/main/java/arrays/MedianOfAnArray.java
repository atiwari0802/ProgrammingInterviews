package arrays;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MedianOfAnArray {

    public double findMedian(List<Integer> input) {

        if (input == null || input.size() == 0) {
            return Integer.MIN_VALUE;
        }
        if (input.size() == 1) {
            return input.get(0);
        }

        double median = findMedian(input, input.size()/2);

        if(input.size()%2 != 0){
            return median;
        }else {
            System.out.printf("First Median Is -->%s", median);
            double secondMedian = findMedian(input, input.size()/2 - 1);
            System.out.printf("Second Median Is -->%s", secondMedian);
            median+=secondMedian;
            return median/2;
        }
    }

    private int findMedian(List<Integer> input, int midPoint) {

        int leftIndex = 0, rightIndex = input.size() - 1;
        Random random = new Random();

        while (leftIndex <= rightIndex) {
            int pivotIndex = random.nextInt(rightIndex - leftIndex + 1) + leftIndex;

            int newPivotIndex = findMedianPartition(input, leftIndex, rightIndex, pivotIndex);

            if (newPivotIndex == midPoint) {
                return input.get(newPivotIndex);
            } else if (newPivotIndex > midPoint) {
                rightIndex = newPivotIndex - 1;
            } else {
                leftIndex = newPivotIndex + 1;
            }
        }
        return Integer.MIN_VALUE;
    }

    private int findMedianPartition(List<Integer> input, int leftIndex, int rightIndex,
                                    int pivotIndex) {

        int pivotValue = input.get(pivotIndex);
        int newPivot = leftIndex;

        Collections.swap(input, pivotIndex, rightIndex);
        for (int i = leftIndex; i < rightIndex; i++) {
            if (input.get(i) < pivotValue) {
                Collections.swap(input, i, newPivot++);
            }
        }
        Collections.swap(input, newPivot, rightIndex);
        return newPivot;
    }
}
