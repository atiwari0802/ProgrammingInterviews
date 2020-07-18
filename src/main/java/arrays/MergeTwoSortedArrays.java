package arrays;

import java.util.List;

public class MergeTwoSortedArrays {

    public List<Integer> mergeSortedArrays(List<Integer> first, List<Integer> second, int firstOccupancy) {
        int firstSize = firstOccupancy;
        int secondSize = second.size();
        int lastIndex = firstSize + secondSize - 1;
        int firstIndex = firstSize - 1;
        int secondIndex = secondSize - 1;

        while (firstIndex >= 0 && secondIndex >= 0) {
            if (first.get(firstIndex) > second.get(secondIndex)) {
                first.set(lastIndex--, first.get(firstIndex--));
            } else {
                first.set(lastIndex--, second.get(secondIndex--));
            }
        }
        while (firstIndex >= 0) {
            first.set(lastIndex--, first.get(firstIndex--));
        }
        while (secondIndex >= 0) {
            first.set(lastIndex--, second.get(secondIndex--));
        }

        return first;
    }

}
