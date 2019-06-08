package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumJumpsDP {

    public int minimumJumpsToReachEnd(List<Integer> input) {

        int maxIndex = input.size() - 1;
        List<Integer> jumps = new ArrayList<>(Collections.nCopies(input.size(), Integer.MAX_VALUE));
        jumps.set(maxIndex, 0);

        for (int i = maxIndex - 2; i >= 0; i--) {
            if (input.get(i) == 0) {
                jumps.set(i, Integer.MAX_VALUE);
            } else {
                int minimum = Integer.MAX_VALUE;
                for (int j = i + 1; j <= maxIndex && j <= i + input.get(i); j++) {
                    minimum = Math.min(minimum, input.get(j));
                }
                if (minimum < Integer.MAX_VALUE) {
                    jumps.set(i, minimum + 1);
                }
            }
        }
        jumps.forEach(System.out::println);
        return jumps.get(0);
    }

}
