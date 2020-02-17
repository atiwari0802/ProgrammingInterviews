package searching;

import java.util.List;

public class SearchFirstOccurence {

    public int searchForFirstOccurence(List<Integer> input, int key) {
        int lowerBound = 0;
        int upperBound = input.size() - 1;
        int result = -1;

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if (input.get(mid) > key) {
                upperBound = mid - 1;
            } else if (input.get(mid) == key) {
                result = mid;
                upperBound = mid - 1;
            } else {
                lowerBound = mid + 1;
            }
        }
        return result;
    }

}
