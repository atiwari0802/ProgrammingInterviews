package arrays;

import java.util.List;

public class MinimumJumpsRecursive {

    public int recuriveMinimumJumps(List<Integer> input, int lowerIndex, int higherIndex) {

        if (lowerIndex == higherIndex) {
            return 0;
        }
        if (input.get(lowerIndex) == 0) {
            return Integer.MAX_VALUE;
        }

        int minimumJumps = Integer.MAX_VALUE;

        for (int i = lowerIndex + 1; i <= higherIndex && i <= lowerIndex + input.get(lowerIndex); i++) {
            int jumps = recuriveMinimumJumps(input, i, higherIndex);
            if (jumps != Integer.MAX_VALUE  && minimumJumps > jumps + 1) {
                minimumJumps = jumps + 1;
            }
        }
        return minimumJumps;
    }

}
