package searching;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class KThLargestElement {

    public int findKThLargestElement(List<Integer> input, int k) {
        int left = 0, right = input.size() - 1;
        Random random = new Random(0);
        int pivot = random.nextInt(right - left + 1) + left;

        while (left <= right) {
            int newPivotIndex = partitionAroundPivot(input, left, right, pivot);

            if (newPivotIndex == k - 1) {
                return input.get(newPivotIndex);
            } else if (newPivotIndex > k - 1) {
                right = newPivotIndex - 1;
            } else {
                left = newPivotIndex + 1;
            }
        }
        return Integer.MIN_VALUE;
    }

    private int partitionAroundPivot(List<Integer> input, int left, int right, int pivot) {
        int pivotValue = input.get(pivot);
        int newPivotIndex = left;

        Collections.swap(input, pivot, right);

        for (int i = left; i < right; i++) {
            if (input.get(i).compareTo(pivotValue) < 0) {
                Collections.swap(input, i, newPivotIndex++);
            }
        }
        Collections.swap(input, newPivotIndex, right);

        return newPivotIndex;
    }

}
