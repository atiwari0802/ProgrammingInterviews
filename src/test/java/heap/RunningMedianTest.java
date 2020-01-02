package heap;

import heaps.RunningMedian;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RunningMedianTest {

    private RunningMedian runningMedian;

    @BeforeEach
    private void setup() {
        runningMedian = new RunningMedian();
    }

    @Test
    public void testRunningMedian() {

        List<Double> results = runningMedian
                .computeRunningMedian(List.of(1, 0, 3, 5, 2, 0, 1).iterator());

        results.forEach(System.out::println);
    }
}
