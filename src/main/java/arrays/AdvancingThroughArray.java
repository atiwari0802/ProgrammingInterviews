package arrays;

import java.util.List;

public class AdvancingThroughArray {

    public boolean canReachEnd(List<Integer> input) {

        int farthestIndexSoFar = 0, lastIndex = input.size()-1;

        for (int i = 0; i <= lastIndex && i <= farthestIndexSoFar; i++) {
            farthestIndexSoFar = Math.max(farthestIndexSoFar, i + input.get(i));
        }

        return farthestIndexSoFar >= input.size();
    }

}
