package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {

    private SpiralMatrix spiralMatrix;

    @BeforeEach
    public void setup() {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    public void testPrintSpiral() {
        List<List<Integer>> matrix = Arrays.asList(List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8),
                List.of(9, 10, 11, 12),
                List.of(13, 14, 15, 16));

        List<Integer> result = spiralMatrix.spiralOrderMatrix(matrix);

        result.forEach(i -> System.out.printf("%d ", i));
    }

    @Test
    public void testPrint3X3Spiral() {
        List<List<Integer>> matrix = Arrays.asList(List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));

        List<Integer> result = spiralMatrix.spiralOrderMatrix(matrix);

        result.forEach(i -> System.out.printf("%d ", i));
    }
}
