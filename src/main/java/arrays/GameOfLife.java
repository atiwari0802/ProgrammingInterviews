package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameOfLife {

    /**
     * Time Complexity: O(m X n)
     * Space Complexity: O(m X n)
     * */
    public List<List<Integer>> gameOfLife(List<List<Integer>> matrix) {
        int row = matrix.size() - 1;
        int col = matrix.get(0).size() - 1;
        List<Integer> neighbours = Arrays.asList(0, 1, -1);

        List<List<Integer>> matrixCopy = new ArrayList<>();
        for (int i = 0; i <= row; i++) {
            List<Integer> rowArray = new ArrayList<>();
            for (int j = 0; j <= col; j++) {
                rowArray.add(matrix.get(i).get(j));
            }
            matrixCopy.add(rowArray);
        }

        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <= col; c++) {
                int liveNeighbours = 0;
                for (int i : neighbours) {
                    for (int j : neighbours) {
                        if (!(i == 0 && j == 0)) {
                            int neighbourRow = r + i;
                            int neighbourColumn = c + j;
                            if (neighbourRow >= 0 && neighbourRow <= row && neighbourColumn >= 0 && neighbourColumn <= col) {
                                if (matrix.get(neighbourRow).get(neighbourColumn) == 1) {
                                    liveNeighbours++;
                                }
                            }
                        }
                    }
                }
                if (matrix.get(r).get(c) == 1) {
                    if (liveNeighbours < 2 || liveNeighbours > 3) {
                        matrixCopy.get(r).set(c, 0);
                    }
                }
                else if (matrix.get(r).get(c) ==  0 && liveNeighbours == 3) {
                    matrixCopy.get(r).set(c, 1);
                }
            }
        }
        return matrixCopy;
    }

}
