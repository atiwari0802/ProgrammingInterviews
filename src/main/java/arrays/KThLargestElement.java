package arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class KThLargestElement {

    public int findKthLargestElement(List<Integer> input, int k) {

        if(k > input.size() || input.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return findKThLargestElement(input, k , (a,b) -> Integer.compare(b,a));
    }

    private int findKThLargestElement(List<Integer> input, int k, Comparator<Integer> comparator) {

        int left = 0, right = input.size() - 1;
        Random random = new Random();

        while (left <= right) {
            int pivotIndex = random.nextInt(right - left + 1) + left;
            System.out.printf("Random Pivot Is: %s%n", pivotIndex);
            int newPivotIndex = partitionAroundPivot(input, left, right, pivotIndex, comparator);

            if (newPivotIndex == k - 1) {
                return input.get(newPivotIndex);
            }
            else if (newPivotIndex > k -1) {
                right = newPivotIndex -1;
            }
            else {
                left = newPivotIndex+1;
            }
        }
        return Integer.MIN_VALUE;
    }

    private int partitionAroundPivot(List<Integer> input, int leftIndex, int rightIndex,
                                     int pivotIndex, Comparator<Integer> comparator) {

        System.out.printf("Left: %s & Right: %s%n", leftIndex, rightIndex);
        int pivotValue = input.get(pivotIndex);
        int newPivot = leftIndex;

        Collections.swap(input, pivotIndex, rightIndex);
        for (int i = leftIndex; i < rightIndex; i++) {
            if (comparator.compare(input.get(i), pivotValue) < 0) {
                Collections.swap(input, i, newPivot++);
            }
        }
        System.out.printf("New Pivot Index: %s%n", newPivot);
        Collections.swap(input, rightIndex, newPivot );
        return newPivot;
    }


}
