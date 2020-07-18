package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class MoveZeroes {

    public List<Integer> moveZeroes(List<Integer> input) {
        int nonZeroIndex = 0;
        int currentIndex = 0;

        while (currentIndex < input.size()) {
            if (input.get(currentIndex) != 0) {
                Collections.swap(input, nonZeroIndex++, currentIndex);
            }
            currentIndex++;
        }

        return input;
    }

    public void moveZeroes(int[] nums) {
        List<Integer> input = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int currentIndex = 0;
        int nonZeroIndex = 0;

        while (currentIndex < input.size()) {
            if (input.get(currentIndex) != 0) {
                Collections.swap(input, currentIndex, nonZeroIndex++);
            }
            currentIndex++;
        }
        nums = input.stream().mapToInt(i -> i).toArray();
        for (int i : nums) {
            System.out.printf("%d ", i);
        }
    }
}
