package heaps;

import java.util.*;

public class TopKElements {

    public List<String> getTopKElements(int k, Iterator<String> iterator) {

        PriorityQueue<String> minHeap = new PriorityQueue<>(k, Comparator.comparingInt(String::length));

        while (iterator.hasNext()) {
            minHeap.add(iterator.next());
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}
