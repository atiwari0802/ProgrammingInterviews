package arrays;

import java.util.Collections;
import java.util.List;

public class NextLargerPermutation {

    public List<Integer> nextLargerPermutation(List<Integer> permutation) {
        int inversion = permutation.size() - 2;
        while (inversion >= 0 && permutation.get(inversion) > permutation.get(inversion + 1)) {
                inversion--;
        }

        System.out.println("Inversion Point ="+inversion);
        if (inversion < 0) {
            return Collections.EMPTY_LIST;
        }

        for (int i = permutation.size() - 1; i > inversion; i--) {
            if (permutation.get(i) > permutation.get(inversion)) {
                Collections.swap(permutation, inversion, i);
                break;
            }
        }

        Collections.reverse(permutation.subList(inversion + 1, permutation.size()));
        return permutation;
    }

}
