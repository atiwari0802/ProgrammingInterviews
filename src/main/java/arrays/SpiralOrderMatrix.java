package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {

    public List<Integer> matrixInSpiralOrder(List<List<Integer>> matrix) {

        List<Integer> spiralOrder = new ArrayList<>();
        /*
        Offset represent the number of Square Rings that could be drawn in the
        matrix
         */
        for (int offset = 0; offset < matrix.size()/2; offset++) {
            addSquaredRing(spiralOrder, matrix, offset);
        }

        if (matrix.size() % 2 != 0) {
            int center = matrix.size() / 2;
            spiralOrder.add(matrix.get(center).get(center));
        }
        return spiralOrder;
    }

    private void addSquaredRing(List<Integer> spiralOrder,
                                List<List<Integer>> matrix, int offset) {

        for (int i = offset; i < matrix.size() - offset - 1; i++) {
            spiralOrder.add(matrix.get(offset).get(i));
        }

        for (int j = offset; j < matrix.size() - offset - 1; j++) {
            spiralOrder.add(matrix.get(j).get(matrix.size() - offset - 1));
        }

        for (int i = matrix.size() - offset - 1; i > offset; i--) {
            spiralOrder.add(matrix.get(matrix.size() - offset - 1).get(i));
        }

        for (int j = matrix.size() - offset - 1; j > offset; j--) {
            spiralOrder.add(matrix.get(j).get(offset));
        }
    }

}
