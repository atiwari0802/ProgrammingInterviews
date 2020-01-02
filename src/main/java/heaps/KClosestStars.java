package heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KClosestStars {

    public List<Star> getKNearestStar(Iterator<Star> iterator, int k) {

        PriorityQueue<Star> maxHeap = new PriorityQueue<>((s1, s2) -> Double.compare(s2.distance(), s1.distance()));
        List<Star> result = new ArrayList<>();

        while (iterator.hasNext()) {
            maxHeap.add(iterator.next());
            if (maxHeap.size() >= k + 1) {
                maxHeap.poll();
            }
        }

        result.addAll(maxHeap.stream().collect(Collectors.toList()));
        return result;
    }

    public static class Star {
        public double x, y, z;

        public Star(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance() {
            return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
        }
    }
}
