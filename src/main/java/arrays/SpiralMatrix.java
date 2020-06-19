package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    /**
     * m = rows and n = columns
     * Time Complexity: O(mXn),
     * Space Complexity: O(mXn)
     * */
    List<Integer> spiralOrderMatrix(List<List<Integer>> matrix) {
        int startRow = 0, endRow = matrix.size() - 1;
        int startColumn = 0, endColumn = matrix.get(0).size() - 1;

        List<Integer> result = new ArrayList<>();

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int c = startColumn; c <= endColumn; c++) {
                result.add(matrix.get(startRow).get(c));
            }
            for (int r = startRow + 1; r <= endRow; r++) {
                result.add(matrix.get(r).get(endColumn));
            }
            for (int c = endColumn - 1; c >= startColumn; c--) {
                result.add(matrix.get(endRow).get(c));
            }
            for (int r = endRow - 1; r > startRow; r--) {
                result.add(matrix.get(r).get(startColumn));
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }

        return result;
    }
}
