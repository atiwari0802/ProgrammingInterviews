package hashes;

import java.util.*;

public class NearestRepeatedEntries {

    public int findNearestRepeatedEntries(List<String> input) {
        Map<String, Integer> keywordIndex = new HashMap<>();
        Integer nearestSoFar = Integer.MAX_VALUE;

        for (int i = 0; i < input.size(); i++) {
            if (keywordIndex.containsKey(input.get(i))) {
                nearestSoFar = Math.min(nearestSoFar, i - keywordIndex.get(input.get(i)));
            }
            keywordIndex.put(input.get(i), i);
        }
        return nearestSoFar;
    }

}
