package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskScheduling {

    /**
     * In this approach,
     * 1.) we create a frequency array, that stores the
     * total count of each character(task).
     * 2.) The frequency array is sorted.
     * 3.) The maximum idle time will be (max_frequency - 1) * wait_time (max_frequency - 1 because the
     * we won't have to wait after the last element)
     * 4.) After this step, we will loop through the array subtracting the count of each element.
     * For the corner case where two or elements have count equal to the max_frequency, we choose
     * max_frequency - 1 because there is no need to wait for the last element
     * 5.) Total Time = idleTime + length of the input
     *
     * Time Complexity: O(n), not O(nLog(n)) because the size of the frequencies array is fixed to 26.
     * Space Complexity: O(1), again because the size of the frequencies array is fixed to 26
     * */
    public int minimumWaitTime(char[] input, int coolingTime) {
        List<Integer> frequencies = new ArrayList<>(Collections.nCopies(26, 0));

        for (char ch : input) {
            int characterNum = ch - 'A';
            frequencies.set(characterNum, frequencies.get(characterNum) + 1);
        }

        frequencies.sort((a, b) -> Integer.compare(a, b));

        int maxFrequency = frequencies.get(frequencies.size() - 1);
        int idleTime = (maxFrequency - 1) * coolingTime;

        for (int i = frequencies.size() - 2; i >= 0 && idleTime > 0; i--) {
            idleTime -= Math.min(frequencies.get(i), maxFrequency - 1);
        }

        idleTime = Math.max(0, idleTime);

        return (idleTime + input.length);
    }

}
