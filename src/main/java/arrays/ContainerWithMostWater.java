package arrays;

import java.util.List;

public class ContainerWithMostWater {

    public int maxAreaBruteForce(List<Integer> input) {
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                maxArea = Math.max(maxArea, Math.min(input.get(i), input.get(j)) * (j - i));
            }
        }
        return maxArea;
    }

    /*
     * This approaches uses Sliding window technique
     * Two pointers are set on either end of the array/list
     * Area is limited by the height of the pair of entries.
     * Moving the entry which is shorter of the two might improve
     * the area.
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public int maxAreaTwoPointer(List<Integer> input) {
        int left = 0;
        int right = input.size() - 1;
        int maxArea = Integer.MIN_VALUE;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(input.get(left), input.get(right)) * (right - left));
            if (input.get(left) < input.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
