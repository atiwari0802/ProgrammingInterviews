package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductOfArrayElements {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * */
    public List<Integer> productExceptSelf(List<Integer> numbers) {
        List<Integer> output = new ArrayList<>(Collections.nCopies(numbers.size(), 1));

        for (int i = 1; i < numbers.size(); i++) {
            output.set(i, numbers.get(i - 1) * output.get(i - 1));
        }

        int rightProduct = 1;

        for (int i = numbers.size() - 1; i >= 0; i--) {
            output.set(i, output.get(i) * rightProduct);
            rightProduct *= numbers.get(i);
        }
        return output;
    }
}
