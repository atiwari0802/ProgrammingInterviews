package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static sorting.AddingInterval.Interval;

public class AddingIntervalTest {

    private AddingInterval addingInterval;

    @BeforeEach
    public void setup() {
        addingInterval = new AddingInterval();
    }

    @Test
    public void testAddingInterval() {
        List<Interval> intervals = new LinkedList<>();
        intervals.add(new Interval(-2, -1));
        intervals.add(new Interval(0, 2));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(7, 9));
        intervals.add(new Interval(11, 12));
        intervals.add(new Interval(14, 17));

        List<Interval> result = addingInterval
                .addInterval(intervals, new Interval(1, 8));

        result.forEach(interval -> System.out.printf("%1$s --> %2$s%n", interval.left, interval.right));
    }
}
