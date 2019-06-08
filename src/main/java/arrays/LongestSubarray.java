package arrays;

import java.util.List;

public class LongestSubarray {

    public int findLongestSubarray(List<Integer> input) {

        if (input.size() == 0 || input.size() == 1) {
            return 0;
        }

        int maximumLength = 0, counter = 1;
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i - 1) == input.get(i)) {
                counter++;
            } else {
                maximumLength = Math.max(maximumLength, counter);
                counter = 1;
            }
        }
        return maximumLength;
    }

}
