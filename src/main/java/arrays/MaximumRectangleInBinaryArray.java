package arrays;

import java.util.*;

public class MaximumRectangleInBinaryArray {

    /**
     * In this solution, the idea is to convert the
    */
    public int maximumRectangle(List<List<Character>> input) {
        int rowCount = input.size();
        int columnCount = input.get(0).size();
        List<Integer> heights = new ArrayList<>(Collections.nCopies(columnCount, 0));
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                heights.set(j, input.get(i).get(j) == '1' ? 1 + heights.get(j) : 0);
            }
            maxArea = Math.max(maxArea, findMaximumRectangleArea(heights));
        }
        return maxArea;
    }

    private int findMaximumRectangleArea(List<Integer> heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        while (i < heights.size()) {
            if (stack.isEmpty() || heights.get(stack.peekLast()) <= heights.get(i)) {
                stack.addLast(i++);
            } else {
                int currentHeightIndex = stack.pollLast();
                int width = stack.isEmpty() ? i : i - 1 - stack.peekLast();
                maxArea = Math.max(maxArea, heights.get(currentHeightIndex) * width);
            }
        }

        while (!stack.isEmpty()) {
            int currentHeight = heights.get(stack.removeLast());
            int currentWidth = stack.isEmpty() ? heights.size() : heights.size() - 1 - stack.peekLast();
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }
        return maxArea;
    }

}
