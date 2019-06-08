package arrays;

import java.util.Collections;
import java.util.List;

public class PermutateArray {

    public void applyPermutation(List<Integer> permutations, List<Integer> input) {

        for (int i = 0; i < input.size(); i++) {
            int next = i;
            while (permutations.get(next) >= 0) {
                Collections.swap(input, i, permutations.get(next));
                int temp = permutations.get(next);
                permutations.set(next, permutations.get(next) - permutations.size());
                next = temp;
            }
        }
        input.forEach(str -> System.out.print(str + " : "));
    }


}
