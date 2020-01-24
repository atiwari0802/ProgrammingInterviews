package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(List<Integer> input, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int mid = (leftIndex + rightIndex) / 2; // Divide Phase
            mergeSort(input, leftIndex, mid); // Conquer
            mergeSort(input, mid + 1, rightIndex); // Conquer
            merge(input, leftIndex, mid, rightIndex);
            return input;
        }
        return null;
    }

    private void merge(List<Integer> input, int leftIndex, int mid, int rightIndex) {

        int leftSize = mid - leftIndex + 1;
        int rightSize = rightIndex - mid;

        List<Integer> leftArray = new ArrayList<>(leftSize);
        List<Integer> rightArray = new ArrayList<>(rightSize);

        for (int i = 0; i < leftSize; i++) {
            leftArray.add(input.get(leftIndex + i));
        }

        for (int i = 0; i < rightSize; i++) {
            rightArray.add(input.get(mid + 1 + i));
        }

        int i = 0, j = 0, k = leftIndex;

        while (i < leftSize && j < rightSize) {
            if (leftArray.get(i) < rightArray.get(j)) {
                input.set(k++, leftArray.get(i++));
            } else {
                input.set(k++, rightArray.get(j++));
            }
        }

        while (i < leftSize) {
            input.set(k++, leftArray.get(i++));
        }

        while (j < rightSize) {
            input.set(k++, rightArray.get(j++));
        }
    }

}

