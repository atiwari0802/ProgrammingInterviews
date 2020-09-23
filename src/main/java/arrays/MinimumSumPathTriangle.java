package arrays;

import java.util.List;
import java.util.ArrayList;

public class MinimumSumPathTriangle {

    /**
     * In this solution, we maintain an 1-D array/list that keeps track of
     * the minimum path in a bottom up fashion.
     *
     * We start from the bottom and add all the elements in the last
     * row of the triangle.
     * From their on, we start iterating from bottom to top, calculating the
     * minimum path from each entry in the row. The adjacent elements of an index
     * in the row below are [i+1][j] and [i+1][j+1].
     * The minimum path sum will be stored in the first element minimum path array.
     *
     * Time Complexity: O(m X n)
     * Space Complexity: O(K : size of the largest row)
     * */
    public int minimumSumPathTriangle(List<List<Integer>> triangle) {
        List<Integer> minimumPath = new ArrayList<>();
        int size = triangle.size() - 1;

        minimumPath.addAll(triangle.get(size));

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                minimumPath.set(j, triangle.get(i).get(j) +
                        Math.min(minimumPath.get(j), minimumPath.get(j + 1)));
            }
        }
        return minimumPath.get(0);
    }

}
