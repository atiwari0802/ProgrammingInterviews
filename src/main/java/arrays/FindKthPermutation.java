package arrays;

import java.util.Collections;
import java.util.List;

public class FindKthPermutation {

    public List<Integer> findKthPermutation(List<Integer> permutation, int k) {

        while (k > 0) {
            int inversionPoint = permutation.size() - 2;
            while (inversionPoint >= 0
                    && permutation.get(inversionPoint) > permutation.get(inversionPoint + 1)) {
                inversionPoint--;
            }
            if (inversionPoint < 0) {
                return Collections.EMPTY_LIST;
            }
            for (int i = permutation.size() - 1; i > inversionPoint; i--) {
                if (permutation.get(i) > permutation.get(inversionPoint)) {
                    Collections.swap(permutation, inversionPoint, i);
                    break;
                }
            }
            Collections.reverse(permutation.subList(inversionPoint + 1, permutation.size()));
            k--;
        }
        return permutation;
    }
}
