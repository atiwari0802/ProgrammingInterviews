package searching;

import java.util.List;

public class IndexEquallingValue {

    public int findIndexEqualToValue(List<Integer> input) {
        int lowerBound = 0, upperBound = input.size() - 1;
        int result = -1;

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if (input.get(mid) == mid) {
                return mid;
            } else if (input.get(mid) > mid) {
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }
        return result;
    }
}
