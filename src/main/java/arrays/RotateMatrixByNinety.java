package arrays;

import java.util.List;

public class RotateMatrixByNinety {

    public List<List<Integer>> rotateMatrixByNinetyDegrees(List<List<Integer>> matrix) {

        int size = matrix.size() - 1;

        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = i; j < size - i; j++) {
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(size - j).get(i));
                matrix.get(size - j).set(i, matrix.get(size - i).get(size - j));
                matrix.get(size - i).set(size - j, matrix.get(j).get(size - i));
                matrix.get(j).set(size - i, temp);
            }
        }

        return matrix;
    }
}
