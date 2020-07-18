package arrays;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumSlidingWindowTest {

    private MaximumSlidingWindow maximumSlidingWindow;

    @BeforeEach
    public void setup() {
        maximumSlidingWindow = new MaximumSlidingWindow();
    }

    @Test
    public void testSlidingWindow() {
        List<Integer> input = List.of(1, 3, -1, -3, 5, 3, 6, 7);
        int k = 3;

        List<Integer> result = maximumSlidingWindow.findSlidingWindowMaximumDP(input, k);

        result.forEach(i -> System.out.printf(" %d ", i));
    }

    @Test
    public void testDequeSolution() {
        List<Integer> input = List.of(1, 3, -1, -3, 5, 3, 6, 7);
        int k = 3;

        List<Integer> result = maximumSlidingWindow.findingSlidingWindowMaxDeque(input, k);

        result.forEach(i -> System.out.printf(" %d ", i));
    }
}
