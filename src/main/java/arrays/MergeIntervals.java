package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public List<Interval> mergeIntervals(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(interval -> interval.left));
        List<Interval> output = new ArrayList<>();
        int size = 0;
        for (Interval interval : intervals) {
            if (output.isEmpty() || output.get(size - 1).right < interval.left) {
                output.add(interval);
                size++;
            } else {
                output.get(size - 1).right = Math.max(output.get(size - 1).right, interval.right);
            }
        }
        return output;
    }

    public static class Interval {
        public int left;
        public int right;

        public Interval(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

}
