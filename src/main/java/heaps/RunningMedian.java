package heaps;

import java.util.*;

public class RunningMedian {

    public List<Double> computeRunningMedian(Iterator<Integer> sequence) {

        PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> upperHalf = new PriorityQueue<>();
        List<Double> result = new ArrayList<>();

        while (sequence.hasNext()) {
            int currentNumber = sequence.next();
            if (lowerHalf.isEmpty() || currentNumber < lowerHalf.peek()) {
                lowerHalf.add(currentNumber);
            } else {
                upperHalf.add(currentNumber);
            }
            reBalanceHeaps(lowerHalf, upperHalf);
            double median = updateMedian(lowerHalf, upperHalf);
            result.add(median);
        }
        return result;
    }

    private void reBalanceHeaps(PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf) {

        if (lowerHalf.size() - upperHalf.size() >= 2) {
            upperHalf.add(lowerHalf.poll());
        } else if (upperHalf.size() - lowerHalf.size() >= 2) {
            lowerHalf.add(upperHalf.poll());
        }
    }

    private Double updateMedian(PriorityQueue<Integer> lowerHalf, PriorityQueue<Integer> upperHalf) {

        if (lowerHalf.size() == upperHalf.size()) {
            return (double) (lowerHalf.peek() + upperHalf.peek()) / 2;
        } else if (lowerHalf.size() > upperHalf.size()) {
            return (double) lowerHalf.peek();
        } else {
            return (double) upperHalf.peek();
        }
    }

}
