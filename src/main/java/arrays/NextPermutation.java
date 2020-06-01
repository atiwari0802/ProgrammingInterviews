package arrays;

import java.util.Collections;
import java.util.List;

public class NextPermutation {

    public List<Integer> findNextPermutation(List<Integer> numbers) {
        int inversionPoint = 0;
        for (int i = numbers.size() - 1; i > 1; i--) {
            if (numbers.get(i - 1) < numbers.get(i)) {
                inversionPoint = i - 1;
                break;
            }
        }
        for (int i = numbers.size() - 1; i > inversionPoint; i--) {
            if (numbers.get(i) > numbers.get(inversionPoint)) {
                Collections.swap(numbers, inversionPoint, i);
                break;
            }
        }

        List<Integer> subList = numbers.subList(inversionPoint + 1, numbers.size());
        Collections.reverse(subList);
        return numbers;
    }

}
