package sorting;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {

    public List<Integer> findIntersection(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstList.size() && j < secondList.size()) {
            if (firstList.get(i).equals(secondList.get(j)) &&
                    (i == 0 || !firstList.get(i).equals(firstList.get(i - 1)))) {
                result.add(firstList.get(i));
                i++;
                j++;
            } else if (firstList.get(i) < secondList.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }

}
