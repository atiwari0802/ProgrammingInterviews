package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;

public class MaximumSlidingWindow {

    /**
     * In this solution, we create a deque, which will hold the index of the maximum
     * element at the front of the queue. Any index that is outside the current sliding
     * window is removed.
     * Total number of sliding windows of size k in a list of length n is: n - k + 1
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n - k + 1)
     * */
    public List<Integer> findingSlidingWindowMaxDeque(List<Integer> input, int k) {
        int size = input.size();
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>(size - k + 1);

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && input.get(i) > input.get(deque.peekFirst())) {
                deque.pollLast();
            }
            deque.addLast(i);
        }

        output.add(input.get(deque.peekFirst()));

        for (int i = k; i < size; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && input.get(i) > input.get(deque.peekLast())) {
                deque.pollLast();
            }
            deque.addLast(i);
            output.add(input.get(deque.peekFirst()));
        }

        return output;
    }

    /**
     * In this approach, the list is divided into n/k + 1 sections
     * Two lists are maintained to keep tabs of left maximums and right maximums
     * for each segment.
     *
     * Boundaries of the left array are determined by the formula: i%k == 0, whereas
     * the boundaries of the right array are determined by j%k == k - 1
     *
     * For any element crossing between segment, the maximum is determined as
     * max = Math.max(left[i + k - 1], right[i])
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * */
    public List<Integer> findSlidingWindowMaximumDP(List<Integer> input, int k) {
        int size = input.size();
        List<Integer> leftMax = new ArrayList<>(Collections.nCopies(input.size(), -1));
        List<Integer> rightMax = new ArrayList<>(Collections.nCopies(input.size(), -1));
        List<Integer> max = new ArrayList<>(Collections.nCopies(size - k + 1, -1));

        for (int i = 0; i < input.size(); i++) {
            if (i % k == 0) {
                leftMax.set(i, input.get(i));
            } else {
                leftMax.set(i, Math.max(leftMax.get(i - 1), input.get(i)));
            }
        }

        for (int j = input.size() - 1; j >= 0; j--) {
            if (j == input.size() - 1 || j % k == k - 1) {
                rightMax.set(j, input.get(j));
            } else {
                rightMax.set(j, Math.max(rightMax.get(j + 1), input.get(j)));
            }
        }

        for (int i = 0; i < input.size() - k + 1; i++) {
            max.set(i, Math.max(leftMax.get(i + k - 1), rightMax.get(i)));
        }

        return max;
    }

}
