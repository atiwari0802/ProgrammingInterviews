package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.MergeIntervals.Interval;

public class MergeIntervalsTest {

    private MergeIntervals mergeIntervals;

    @BeforeEach
    public void setup() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    public void testMergeIntervals() {
        List<Interval> input = Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18));

        List<Interval> result = mergeIntervals.mergeIntervals(input);

        result.forEach(interval -> System.out.printf("%d -- %d\n", interval.left, interval.right));
    }
}
