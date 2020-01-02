package heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedArrays {

    public List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays) {

        List<Iterator<Integer>> iterators = new ArrayList<>();

        for (List<Integer> sortedArray : sortedArrays) {
            iterators.add(sortedArray.iterator());
        }

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a.value, b.value);
        });

        for (int i = 0; i < iterators.size(); i++) {
            minHeap.add(new ArrayEntry(iterators.get(i).next(), i));
        }

        List<Integer> result = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            ArrayEntry arrayEntry = minHeap.poll();
            result.add(arrayEntry.value);
            if (iterators.get(arrayEntry.arrayID).hasNext()) {
                minHeap.add(new ArrayEntry(iterators.get(arrayEntry.arrayID).next(),
                        arrayEntry.arrayID));
            }
        }

        return result;
    }

    class ArrayEntry {
        Integer value;
        Integer arrayID;

        public ArrayEntry(int value, int arrayID) {
            this.value = value;
            this.arrayID = arrayID;
        }
    }

}
