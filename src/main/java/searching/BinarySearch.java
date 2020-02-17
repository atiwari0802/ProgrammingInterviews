package searching;

import java.util.List;

public class BinarySearch {

    public int binarySearch(List<Integer> input, int key) {
        int lowerBound = 0, upperBound = input.size() - 1;
        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if (input.get(mid) == key) {
                return mid;
            } else if (input.get(mid) < key) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        return -1;
    }
}
