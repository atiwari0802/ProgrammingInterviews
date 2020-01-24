package sorting;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public List<Integer> performQuickSort(List<Integer> input, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partition = pivotAroundPartition(input, lowIndex, highIndex);
            performQuickSort(input, lowIndex, partition - 1);
            performQuickSort(input, partition + 1, highIndex);
        }
        return input;
    }

    private int pivotAroundPartition(List<Integer> input, int lowIndex, int highIndex) {
        int pivot = input.get(highIndex);
        int partition = lowIndex;
        for (int i = lowIndex; i < highIndex; i++) {
            if (input.get(i) < pivot) {
                Collections.swap(input, i, partition++);
            }
        }
        Collections.swap(input, partition, highIndex);
        return partition;
    }
}
