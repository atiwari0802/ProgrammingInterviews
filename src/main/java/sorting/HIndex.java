package sorting;

import java.util.Comparator;
import java.util.List;

public class HIndex {

    public long computeHIndex(List<Integer> citations) {

        citations.sort(Comparator.reverseOrder());

        for (int i = 0; i < citations.size(); i++) {
            if (citations.get(i) < i) {
                return i;
            }
        }
        return citations.size();
    }
}
