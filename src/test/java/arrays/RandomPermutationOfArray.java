package arrays;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomPermutationOfArray {

    public List<Integer> computeRandomPermutation(List<Integer> input) {

        Random random = new Random();

        for (int i = 0; i < input.size(); i++) {
            int randomIndex = random.nextInt(input.size() - i) + i;
            Collections.swap(input, i, randomIndex);
        }
        
        return input;
    }

}
