package arrays;

import java.util.Collections;
import java.util.List;

public class DutchFlagProblem {

    public List<Integer> threeWaySort(List<Integer> input) {

        int zeroIndex = 0, oneIndex = 0, twoIndex = input.size() - 1;

        while (oneIndex <= twoIndex) {
            int element = input.get(oneIndex);

            switch (element) {
                case 0: {
                    Collections.swap(input, zeroIndex, oneIndex);
                    zeroIndex++;
                    oneIndex++;
                    break;
                }
                case 1: {
                    oneIndex++;
                    break;
                }
                case 2: {
                    Collections.swap(input, oneIndex, twoIndex);
                    twoIndex--;
                    break;
                }
            }
        }
        return input;
    }

}
