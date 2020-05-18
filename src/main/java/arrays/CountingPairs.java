package arrays;

import java.util.Comparator;
import java.util.List;

public class CountingPairs {

    public int countPairs(List<Integer> numbers, int k) {
        int leftIndex = 0, rightIndex = numbers.size() - 1;
        int counter = 0;
        numbers.sort(Comparator.naturalOrder());

        while (leftIndex < rightIndex) {
            if (numbers.get(leftIndex) +  k == numbers.get(rightIndex)) {
                counter++;
                leftIndex++;
                rightIndex--;
            }
            else if (numbers.get(leftIndex) +  k < numbers.get(rightIndex)) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return counter;
    }

}
