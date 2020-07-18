package arrays;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public void quickSort(List<Integer> numbers, int lo, int high) {
        if (lo < high) {
            int pivotIndex = partitionAroundPivot(numbers, lo, high);
            quickSort(numbers, lo, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

    private int partitionAroundPivot(List<Integer> numbers, int lo, int high) {
        int n = high;
        int pivot = numbers.get(n);
        int pivotIndex = lo;

        for (int i = lo; i < n; i++) {
            if (numbers.get(i) < pivot) {
                Collections.swap(numbers, i, pivotIndex);
                pivotIndex++;
            }
        }
        Collections.swap(numbers, pivotIndex, n);
        return pivotIndex;
    }
}
