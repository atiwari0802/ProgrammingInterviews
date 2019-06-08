package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenerateNonUniformRandomNumbers {

    public int generateNonUniformRandomNumbers(List<Integer> values, List<Double> probabilities) {

        List<Double> probabilityIntervals = new ArrayList<>();

        probabilities.forEach(p -> {
            if (probabilityIntervals.isEmpty()) {
                probabilityIntervals.add(p);
            } else {
                probabilityIntervals.add(
                        probabilityIntervals.get(probabilityIntervals.size() - 1) + p);
            }
        });

        probabilityIntervals.forEach(d -> System.out.printf(" :%s ", d));

        Random random = new Random();
        double randomInput = random.nextDouble();
        System.out.println("Random Number Is="+ randomInput);
        int discreteIndex = Collections.binarySearch(probabilityIntervals, randomInput);

        if (discreteIndex < 0) {
            System.out.println("Binary Search Results="+discreteIndex);
            discreteIndex = Math.abs(discreteIndex) - 1;
        }
        return values.get(discreteIndex);
    }

}
