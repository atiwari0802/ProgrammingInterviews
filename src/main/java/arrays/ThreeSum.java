package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> findThreeSum(List<Integer> numbers) {
        numbers.sort(Comparator.naturalOrder());

        int size = numbers.size();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < size - 2; i++) {
            if (i > 0 && numbers.get(i).equals(numbers.get(i - 1))) {
                continue;
            } else {
                int lo = i + 1;
                int hi = size - 1;
                while (lo < hi) {
                    int sum = numbers.get(i) + numbers.get(lo) + numbers.get(hi);
                    if (sum < 0 || (lo > i + 1 && numbers.get(lo).equals(numbers.get(lo - 1)))) {
                        lo++;
                    } else if (sum > 0 || (hi < size - 1 && numbers.get(hi).equals(numbers.get(hi + 1)))) {
                        hi--;
                    } else {
                        result.add(List.of(i, lo++, hi--));
                    }
                }
            }
        }
        return result;
    }
}
