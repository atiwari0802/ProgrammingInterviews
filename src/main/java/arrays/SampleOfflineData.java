package arrays;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SampleOfflineData {

    public void sampleRandomNumbers(List<Integer> input, int k) {
        Random random = new Random();

        for (int i = 0; i < k; i++) {
            int randomIndex = random.nextInt(input.size() - i) + i;
            Collections.swap(input, i, randomIndex);
        }
    }

}
