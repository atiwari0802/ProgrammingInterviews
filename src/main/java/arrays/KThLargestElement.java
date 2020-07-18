package arrays;


import java.util.Collections;
import java.util.List;
import java.util.Random;

public class KThLargestElement {

    public int findKthLargestElement(List<Integer> input, int k) {
        int lo = 0;
        int high = input.size() - 1;
        k = input.size() - k;
        Random random = new Random();
        int pivotIndex;

        while (lo <= high) {
            pivotIndex = random.nextInt(high - lo + 1) + lo;
            int newPivotIndex = partitionAroundPivot(input, lo, high, pivotIndex);
            if (newPivotIndex == k) {
                return input.get(newPivotIndex);
            } else if (newPivotIndex > k) {
                high = newPivotIndex - 1;
            } else {
                lo = newPivotIndex + 1;
            }
        }

        return Integer.MIN_VALUE;
    }

    private int partitionAroundPivot(List<Integer> numbers, int lo, int high, int pivotIndex) {
        int n = high;
        Collections.swap(numbers, pivotIndex, n);
        pivotIndex = lo;
        int pivot = numbers.get(n);

        for (int i = lo; i < n; i++) {
            if (numbers.get(i) < pivot) {
                Collections.swap(numbers, pivotIndex, i);
                pivotIndex++;
            }
        }
        Collections.swap(numbers, pivotIndex, n);
        return pivotIndex;
    }
}
