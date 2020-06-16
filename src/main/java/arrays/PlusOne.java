package arrays;

import java.util.List;
import java.util.Collections;

public class PlusOne {

    public List<Integer> addOne(List<Integer> input) {
        int carry = 0;

        Collections.reverse(input);

        input.set(0, input.get(0) + 1);
        int i = 0;
        while (i < input.size()){
            if (input.get(i) == 10) {
                input.set(i, 0);
                carry = 1;
                i++;
            } else {
                input.set(i, input.get(i) + carry);
                if (input.get(i) < 10) {
                    i++;
                    carry = 0;
                }
            }
        }

        if (carry == 1) {
            input.add(1);
        }

        Collections.reverse(input);
        return input;
    }
}
