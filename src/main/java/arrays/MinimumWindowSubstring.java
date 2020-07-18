package arrays;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    /**
     * In this approach, we use the sliding window technique.
     * We first find a window that contains all the characters
     * with the desired count.
     * <p>
     * Then, the left peg of the window is slid towards right.
     * If the character was not part of the pattern being looked up,
     * then the minimum length of the window is updated to the reduced value.
     * If the character at the left flank was part of the pattern being
     * looked up, then, we break the inner loop and start moving the right
     * peg.
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public WindowDetails minimumWindowSubstring(String input, String pattern) {
        Map<Character, Integer> patternIndex = new HashMap<>();
        Map<Character, Integer> windowIndex = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            int count = patternIndex.getOrDefault(c, 0);
            patternIndex.put(c, count + 1);
        }

        int hitsSoFar = 0;
        int desiredLength = patternIndex.size();
        int minimumWindow = Integer.MAX_VALUE;
        int leftPeg = 0, rightPeg = 0;
        WindowDetails windowDetails = new WindowDetails(-1, 0, 0);

        while (rightPeg < input.length()) {
            char ch = input.charAt(rightPeg);
            int count = windowIndex.getOrDefault(ch, 0);
            windowIndex.put(ch, count + 1);

            if (patternIndex.containsKey(ch) && windowIndex.get(ch).equals(patternIndex.get(ch))) {
                hitsSoFar++;
            }

            while (leftPeg < rightPeg && hitsSoFar == desiredLength) {
                if (minimumWindow == Integer.MAX_VALUE || minimumWindow > rightPeg - leftPeg + 1) {
                    windowDetails.length = rightPeg - leftPeg + 1;
                    windowDetails.leftPeg = leftPeg;
                    windowDetails.rightPeg = rightPeg;
                    minimumWindow = rightPeg - leftPeg + 1;
                }
                char charAtLeft = input.charAt(leftPeg);
                windowIndex.put(charAtLeft, windowIndex.get(charAtLeft) - 1);

                if (patternIndex.containsKey(charAtLeft) && windowIndex.get(charAtLeft) < patternIndex.get(charAtLeft)) {
                    hitsSoFar--;
                }
                leftPeg++;
            }
            rightPeg++;
        }

        return windowDetails;
    }

    static class WindowDetails {
        public int length;
        public int leftPeg;
        public int rightPeg;

        public WindowDetails(int length, int leftPeg, int rightPeg) {
            this.length = length;
            this.leftPeg = leftPeg;
            this.rightPeg = rightPeg;
        }
    }

}
