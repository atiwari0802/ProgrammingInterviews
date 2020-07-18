package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RotateMatrixByNinetyTest {

    private RotateMatrixByNinety rotateMatrixByNinety;

    private List<List<Integer>> matrix;

    @BeforeEach
    public void setup() {
        rotateMatrixByNinety = new RotateMatrixByNinety();

        matrix = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12),
                Arrays.asList(13, 14, 15, 16));
    }

    @Test
    public void testRotateMatrixByNinety() {

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.printf(":%s ", matrix.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();

        matrix = rotateMatrixByNinety.rotateMatrixByNinetyDegrees(matrix);

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                System.out.printf(":%s ", matrix.get(i).get(j));
            }
            System.out.println();
        }

    }

    @Test
    public void testDouble() {
        int i = 5;
        System.out.print((double) i / 2);

    }


}
