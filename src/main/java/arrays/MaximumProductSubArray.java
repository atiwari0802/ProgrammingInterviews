package arrays;

import java.util.List;

public class MaximumProductSubArray {

    public int findMaximumSubArrayProduct(List<Integer> input) {
        int globalMax = 0;
        int maximumUntilHere = 0;
        int minimumUntilHere = 0;

        for (int i = 0; i < input.size(); i++) {
            int temp = maximumUntilHere;

            maximumUntilHere = Math.max(input.get(i), Math.max(input.get(i) * maximumUntilHere,
                    input.get(i) * minimumUntilHere));

            minimumUntilHere = Math.min(input.get(i), Math.min(input.get(i) * temp,
                    input.get(i) * minimumUntilHere));

            globalMax = Math.max(maximumUntilHere, globalMax);
        }

        return globalMax;
    }
}
