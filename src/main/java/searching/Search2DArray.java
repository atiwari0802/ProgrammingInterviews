package searching;

import java.util.List;


public class Search2DArray {

    public Position matrixSearch(List<List<Integer>> matrix, int key) {
        int row = 0, col = matrix.get(0).size() - 1;

        while (row < matrix.size() && col >= 0) {
            if (matrix.get(row).get(col).equals(key)) {
                return new Position(row, col);
            } else if (matrix.get(row).get(col) < key) {
                row++;
            } else {
                col--;
            }
        }
        return new Position(-1, -1);
    }

    public static class Position {
        public int row, col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
