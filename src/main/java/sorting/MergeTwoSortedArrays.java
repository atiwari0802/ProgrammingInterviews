package sorting;

import java.util.List;

public class MergeTwoSortedArrays {

    public void mergeTwoSortedArrays(List<Integer> first, int m,
                                     List<Integer> second, int n) {
        int i = m - 1;
        int j = n - 1;
        int writeIndex = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (first.get(i) >= second.get(j)) {
                first.set(writeIndex, first.get(i));
                writeIndex--;
                i--;
            } else {
                first.set(writeIndex, second.get(j));
                writeIndex--;
                j--;
            }
        }

        while (j >= 0) {
            first.set(writeIndex, second.get(j));
            writeIndex--;
            j--;
        }
    }

}
