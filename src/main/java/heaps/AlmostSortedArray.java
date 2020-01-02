package heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class AlmostSortedArray {

    public List<Integer> sortAlmostSortedArray(Iterator<Integer> input, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            minHeap.add(input.next());
        }

        while (input.hasNext()) {
            minHeap.add(input.next());
            int smallestElementInHeap = minHeap.poll();
            result.add(smallestElementInHeap);
        }

        result.addAll(minHeap.stream().collect(Collectors.toList()));
        return result;
    }

}
