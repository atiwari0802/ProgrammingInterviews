package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplyTwoArrays {

    List<Integer> multiplyTwoArrays(List<Integer> numOne, List<Integer> numTwo) {

        int sign = getSign(numOne, numTwo);
        List<Integer> result = new ArrayList<>(Collections.nCopies((numOne.size() + numTwo.size()), 0));

        for (int i = numOne.size() - 1; i >= 0; --i) {
            for (int j = numTwo.size() - 1; j >= 0; --j) {
                result.set(i + j + 1, result.get(i + j + 1) + numOne.get(i) * numTwo.get(j));
                result.set(i + j, result.get(i + j) + result.get(i + j + 1)/10);
                result.set((i + j + 1), result.get(i + j + 1)%10);
            }
        }

        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < result.size() && result.get(firstNonZeroIndex) == 0) {
            firstNonZeroIndex++;
        }

        result = result.subList(firstNonZeroIndex, result.size());
        result.set(0, result.get(0) * sign);

        return result;
    }

    private int getSign(List<Integer> numOne, List<Integer> numTwo) {

        final int sign = (numOne.get(0) < 0 ^ numTwo.get(0) < 0)? -1 : 1;
        numOne.set(0, Math.abs(numOne.get(0)));
        numTwo.set(0, Math.abs(numTwo.get(0)));
        return sign;
    }

}
