package sorting;

import java.util.ArrayList;
import java.util.List;

public class AddingInterval {

    public List<Interval> addInterval(List<Interval> intervals, Interval newInterval) {
        int i = 0;
        List<Interval> result = new ArrayList<>();

        while (i < intervals.size() && intervals.get(i).right < newInterval.left) {
            result.add(intervals.get(i));
            i++;
        }
        while (i < intervals.size() && intervals.get(i).left <= newInterval.right) {
            newInterval = new Interval(Math.min(intervals.get(i).left, newInterval.left),
                    Math.max(intervals.get(i).right, newInterval.right));
            i++;
        }
        result.add(newInterval);

        if (i < intervals.size()) {
            result.addAll(intervals.subList(i, intervals.size()));
        }

        return result;
    }

    public static class Interval {
        public Integer left, right;

        public Interval(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}
