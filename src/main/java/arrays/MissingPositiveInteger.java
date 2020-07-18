package arrays;

import java.util.List;
import java.util.Collections;

public class MissingPositiveInteger {

    /**
     * In this approach, all integers that are either zero, negative or
     * greater than the size of the array are pushed towards the rear end of
     * the list.
     *
     * The segregation methods returns the right boundary of all the valid values.
     *
     * In the main method, the array is iterated until the right boundary and all the indexes that have a
     * corresponding entry in the list are updated to a negative value.
     *
     * In the next step, we iterate over the array and find the first value that is positive
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
    * */
    public int findMissingPositiveInteger(List<Integer> input) {
        int rightPeg = segregateList(input);

        for (int i = 0; i < rightPeg; i++) {
            int index = input.get(i);
            if (index -1 >= 0 && index -1 < rightPeg) {
                input.set(index - 1, -input.get(index));
            }
        }

        for (int i = 0; i < rightPeg; i++) {
            if (input.get(i) > 0) {
                return i + 1;
            }
        }

        return rightPeg + 1;
    }

    private int segregateList(List<Integer> input) {
        int size = input.size();
        int currentIndex = 0;
        int positiveIndex = 0;

        while (currentIndex < size) {
            if (input.get(currentIndex) > 0 && input.get(currentIndex) < size) {
               Collections.swap(input, currentIndex, positiveIndex++);
            }
            currentIndex++;
        }
        return positiveIndex;
    }
}
