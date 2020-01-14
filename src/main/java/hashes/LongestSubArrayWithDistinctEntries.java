package hashes;

import java.util.*;

public class LongestSubArrayWithDistinctEntries {

    public int findLongestDistinctSubArray(List<Integer> input) {
        Map<Integer, Integer> index = new HashMap<>();
        Integer maxSoFar = 0, startIdx = 0, duplicateIdx = 0;

        for (int i = 0; i < input.size(); i++) {
            duplicateIdx = index.get(input.get(i));
            if (duplicateIdx != null && duplicateIdx >= startIdx) {
                maxSoFar = Math.max(maxSoFar, i - startIdx);
                startIdx = duplicateIdx + 1;
            }
            index.put(input.get(i), i);
        }
        return Math.max(maxSoFar, input.size() - startIdx);
    }

}
