package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorting.UnionOfIntervals.Interval;

import java.util.Arrays;
import java.util.List;

public class UnionOfIntervalsTest {

    private UnionOfIntervals unionOfIntervals;

    @BeforeEach
    public void setup() {
        unionOfIntervals = new UnionOfIntervals();
    }

    @Test
    public void testUnionOfIntervals() {
        List<Interval> intervals = Arrays.asList(new Interval(0, 3),
                new Interval(0, 1), new Interval(1, 9), new Interval(10, 11), new Interval(12, 30));

        List<Interval> result = unionOfIntervals.mergeIntervals(intervals);

        result.forEach(interval -> System.out.printf("%1$s -> %2$s\n", interval.start, interval.end));
    }

}
