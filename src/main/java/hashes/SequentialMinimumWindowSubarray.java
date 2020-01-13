package hashes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequentialMinimumWindowSubarray {

    public Subarray minimumSequentialSubarray(List<String> paragraph, List<String> keywords) {

        Map<String, Integer> keywordIndex = new HashMap<>();

        List<Integer> latestOccurrence = new ArrayList<>();
        List<Integer> minimumDistance = new ArrayList<>();
        int minimumDistanceSoFar = Integer.MAX_VALUE;
        Subarray result = new Subarray(-1, -1);

        for (int i = 0; i < keywords.size(); i++) {
            keywordIndex.put(keywords.get(i), i);
            latestOccurrence.add(-1);
            minimumDistance.add(Integer.MAX_VALUE);
        }

        for (int i = 0; i < paragraph.size(); i++) {
            if (keywordIndex.containsKey(paragraph.get(i))) {
                int index = keywordIndex.get(paragraph.get(i));
                latestOccurrence.set(index, i);
                if (index == 0) {
                    minimumDistance.set(index, 1);
                } else {
                    if (minimumDistance.get(index - 1) != Integer.MAX_VALUE) {
                        int distanceFromLastIndex = i - latestOccurrence.get(index - 1);
                        minimumDistance.set(index, distanceFromLastIndex + minimumDistance.get(index - 1));
                    }
                }

                if (index == keywords.size() - 1 && minimumDistance.get(index) < minimumDistanceSoFar) {
                    minimumDistanceSoFar = minimumDistance.get(index);
                    result.startIndex = i - minimumDistance.get(index) + 1;
                    result.endIndex = i;
                }
            }
        }
        return result;
    }

    public static class Subarray {
        public int startIndex, endIndex;

        public Subarray(int start, int end) {
            this.startIndex = start;
            this.endIndex = end;
        }
    }
}
