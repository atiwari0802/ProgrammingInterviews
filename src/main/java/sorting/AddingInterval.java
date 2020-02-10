package sorting;

import java.util.ArrayList;
import java.util.List;

public class AddingInterval {

    public List<Interval> addInterval(List<Interval> intervals, Interval newInterval) {
        int i = 0;
        List<Interval> result = new ArrayList<>();

        while (i < intervals.size() && newInterval.left > intervals.get(i).right) {
            result.add(intervals.get(i));
            i++;
        }

        while (i < intervals.size() && newInterval.right >= intervals.get(i).left) {
            newInterval = new Interval(Math.min(newInterval.left, intervals.get(i).left),
                    Math.max(newInterval.right, intervals.get(i).right));
            i++;
        }
        result.add(newInterval);

        if (i != intervals.size()) {
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
