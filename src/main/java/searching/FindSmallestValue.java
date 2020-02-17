package searching;

import java.util.List;

public class FindSmallestValue {

    public int findSmallest(List<Integer> input) {
        int lowerBound = 0, upperBound = input.size() - 1;

        while (lowerBound < upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if (input.get(mid) > input.get(upperBound)) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid;
            }
        }
        return lowerBound;
    }
}
