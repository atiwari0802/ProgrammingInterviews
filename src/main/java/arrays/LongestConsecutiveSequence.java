package arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(List<Integer> input) {
        Set<Integer> index = new HashSet<>(input);

        int currentStreak, longestSoFar = Integer.MIN_VALUE;

        for (int i : input) {
            if (!index.contains(i - 1)) {
                currentStreak = 1;
                int currentNum = i;

                while (index.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak++;
                }
                longestSoFar = Math.max(longestSoFar, currentStreak);
            }
        }
        return longestSoFar;
    }

}
