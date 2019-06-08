package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SudokuValidity {

    public boolean checkSudokuValidity(List<List<Integer>> sudokuMatrix) {

        for (int i = 0; i < sudokuMatrix.size(); i++) {
            if (hasDuplicates(sudokuMatrix, i, i + 1, 0, sudokuMatrix.size())) {
                return false;
            }
        }

        for (int j = 0; j < sudokuMatrix.size(); j++) {
            if (hasDuplicates(sudokuMatrix, 0, sudokuMatrix.size(),
                    j, j + 1)) {
                return false;
            }
        }

        int cubeSize = (int) Math.sqrt(sudokuMatrix.size());

        for (int i = 0; i < cubeSize; i++) {
            for (int j = 0; j < cubeSize; j++) {
                if (hasDuplicates(sudokuMatrix, i * cubeSize, (i + 1) * cubeSize,
                        j * cubeSize, (j + 1) * cubeSize)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasDuplicates(List<List<Integer>> sudokuMatrix,
                                  int startRow, int endRow,
                                  int startCol, int endCol) {
        List<Boolean> isPresent = new ArrayList<>(Collections.nCopies(sudokuMatrix.size() + 1, false));

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                if (sudokuMatrix.get(i).get(j) != 0 &&
                        isPresent.get(sudokuMatrix.get(i).get(j))) {
                    return true;
                }
                isPresent.set(sudokuMatrix.get(i).get(j), true);
            }
        }
        return false;
    }

}
