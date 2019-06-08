package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SudokuValidityTest {

    private SudokuValidity sudokuValidity;

    private List<List<Integer>> matrix;

    @BeforeEach
    public void setup() {
        sudokuValidity = new SudokuValidity();
        matrix = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(9, 0));
            matrix.add(row);
        }

        matrix.get(0).set(0,5);
        matrix.get(0).set(1,3);
        matrix.get(0).set(4,7);
        matrix.get(1).set(0,6);
        matrix.get(1).set(3,1);
        matrix.get(1).set(4,9);
        matrix.get(1).set(5,5);
        matrix.get(2).set(1,9);
        matrix.get(2).set(2,8);
        matrix.get(2).set(7,6);
        matrix.get(3).set(0,8);
        matrix.get(3).set(4,6);
        matrix.get(3).set(8,3);
        matrix.get(4).set(0,4);
        matrix.get(4).set(3,8);
        matrix.get(4).set(5,3);
        matrix.get(4).set(8,1);
        matrix.get(5).set(0,7);
        matrix.get(5).set(4,2);
        matrix.get(5).set(8,6);
        matrix.get(6).set(1,6);
        matrix.get(6).set(6,2);
        matrix.get(6).set(7,8);
        matrix.get(7).set(3,4);
        matrix.get(7).set(4,1);
        matrix.get(7).set(5,9);
        matrix.get(7).set(8,5);
        matrix.get(8).set(4,8);
        matrix.get(8).set(7,7);
        matrix.get(8).set(8,9);

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.printf(" :%s ", matrix.get(i).get(j));
            }
            System.out.println();
        }
    }

    @Test
    public void testSudokuValidity() {

        Assertions.assertTrue(sudokuValidity.checkSudokuValidity(matrix));

    }

    @Test
    public void test2DArray() {

        List<List> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.printf(" :%s ", matrix.get(i).get(j));
            }
            System.out.println();
        }
    }

}
