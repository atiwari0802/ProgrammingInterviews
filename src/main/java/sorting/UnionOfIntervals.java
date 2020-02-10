package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UnionOfIntervals {

    public List<Interval> mergeIntervals(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(interval -> interval.start));

        List<Interval> merged = new ArrayList<>();

        for (Interval interval : intervals) {
            int size = merged.size();
            if (merged.isEmpty() || merged.get(size - 1).end < interval.start) {
                merged.add(interval);
            } else {
                merged.get(size - 1).end = Math.max(interval.end, merged.get(size - 1).end);
            }
        }
        return merged;
    }

    public static class Interval {
        public Integer start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
