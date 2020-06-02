package arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     **/
    public boolean doesSumExistWithLinearSpace(List<Integer> input, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.size(); i++) {
            if (map.containsKey(sum - input.get(i))) {
                return true;
            } else {
                map.put(input.get(i), i);
            }
        }
        return false;
    }

    /*
    * Time Complexity: O(n*log(n))
    * Space Complexity: O(1)
    **/
    public boolean doesSumExistWithConstantSpace(List<Integer> input, int sum) {
        int leftPointer = 0, rightPointer = input.size() - 1;

        input.sort(Comparator.naturalOrder());

        while (leftPointer < rightPointer) {
            int currentSum = input.get(leftPointer) + input.get(rightPointer);
            if (currentSum == sum) {
                return true;
            } else if (currentSum < sum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return false;
    }
}
