package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrderMatrixTest {

    private SpiralOrderMatrix spiralOrderMatrix;

    private List<List<Integer>> matrix;

    @BeforeEach
    public void setup() {
        spiralOrderMatrix = new SpiralOrderMatrix();

        matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1, 2, 3, 4));
        matrix.add(Arrays.asList(5, 6, 7, 8));
        matrix.add(Arrays.asList(9, 10, 11, 12));
        matrix.add(Arrays.asList(13, 14, 15, 16));
    }

    @Test
    public void testSpiralOrder() {

        List<Integer> spiralMatrix = spiralOrderMatrix.matrixInSpiralOrder(matrix);

        spiralMatrix.forEach(i -> System.out.printf(" :%s", i));
    }
}
