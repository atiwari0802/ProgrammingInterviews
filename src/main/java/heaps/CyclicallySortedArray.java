package heaps;

import java.util.*;

public class CyclicallySortedArray {

    public List<Integer> mergeCyclicallySortedArray(List<Integer> input) {

        List<List<Integer>> sortedLists = new ArrayList<>();
        int startIndex = 0;
        Ordering ordering = Ordering.INCREASING;

        for (int i = 1; i <= input.size(); i++) {
            if (i == input.size() ||
                    (input.get(i) < input.get(i - 1) && ordering == Ordering.INCREASING)
                    || (input.get(i) > input.get(i - 1) && ordering == Ordering.DECREASING)) {
                List<Integer> subArray = input.subList(startIndex, i);
                if (ordering == Ordering.DECREASING) {
                    Collections.reverse(subArray);
                }
                sortedLists.add(subArray);
                startIndex = i;
                ordering = ordering == Ordering.INCREASING ? Ordering.DECREASING : Ordering.DECREASING;
            }
        }
        return mergeSortedArrays(sortedLists);
    }

    private List<Integer> mergeSortedArrays(List<List<Integer>> sortedLists) {

        List<Iterator<Integer>> iterators = new ArrayList<>();

        for (List<Integer> list : sortedLists) {
            iterators.add(list.iterator());
        }

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));

        for (int i = 0; i < iterators.size(); i++) {
            minHeap.add(new ArrayEntry(iterators.get(i).next(), i));
        }

        List<Integer> result = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            ArrayEntry entry = minHeap.poll();
            result.add(entry.value);
            if (iterators.get(entry.iteratorID).hasNext()) {
                minHeap.add(new ArrayEntry(iterators.get(entry.iteratorID).next(),
                        entry.iteratorID));
            }
        }

        return result;
    }

    enum Ordering {
        INCREASING,
        DECREASING
    }

    class ArrayEntry {

        public Integer value;
        public Integer iteratorID;

        public ArrayEntry(int value, int iteratorID) {
            this.value = value;
            this.iteratorID = iteratorID;
        }
    }
}
