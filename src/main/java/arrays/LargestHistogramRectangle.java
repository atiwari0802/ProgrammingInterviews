package arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class LargestHistogramRectangle {

    /**
     * The basic idea is to maintain a stack of all the entries that are in ascending order.
     * Once an entry not in the ascending order is encountered, elements are popped until an element
     * that's smaller than the current entry is found or the stack becomes empty. As each entry is popped, the total
     * area that it covered is calculated as follows:
     * area = height_of_entry X width.
     * The width is calculated as follows: [(i - 1) - index of next smaller element];
     * (since i is one position ahead, that's why i - 1)
     * or if the stack is empty, then,
     * the entire length of i, as area spans the entire length until this element (not i - 1 because we count from 0,
     * so there are i elements).
     *
     * Once the entire array is traversed once, and there are elements still left in the stack, we start popping
     * elements until the stack is empty, while calculating the area for each pop operation. For the last element
     * in the stack (which is also the smallest), the width will span the entire length of the array.
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     * */
    public int largestRectangleArea(List<Integer> heights) {
        int maxArea = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        int size = heights.size();
        int i = 0;
        while (i < heights.size()) {
            if (stack.isEmpty() || heights.get(stack.peekLast()) <= heights.get(i)) {
                stack.addLast(i++);
            } else {
                int barIndex = stack.pollLast();
                int width = stack.isEmpty() ? i : i - 1 - stack.peekLast();
                maxArea = Math.max(maxArea, heights.get(barIndex) * width);
            }
        }

        while (!stack.isEmpty()) {
            int barIndex = stack.pollLast();
            int width = stack.isEmpty() ? size : size - 1 - stack.peekLast();
            maxArea = Math.max(maxArea, heights.get(barIndex) * width);
        }

        return maxArea;
    }

}
