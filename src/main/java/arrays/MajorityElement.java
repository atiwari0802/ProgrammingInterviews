package arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

    public Map.Entry<Integer, Integer> findMajorityElement(List<Integer> input) {
        Map<Integer, Integer> elementIndex = new HashMap<>();

        for (int i : input) {
            if (elementIndex.containsKey(i)) {
                elementIndex.put(i, elementIndex.get(i) + 1);
            } else {
                elementIndex.put(i, 1);
            }
        }

        return elementIndex.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue)).get();
    }
}
