package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MinimumSumPathTriangleTest {

    private MinimumSumPathTriangle minimumSumPathTriangle;

    @BeforeEach
    public void setup() {
        minimumSumPathTriangle = new MinimumSumPathTriangle();
    }

    @Test
    public void testMinimumPathSum() {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 9),
                List.of(1, 6, 7)
        );

        int result = minimumSumPathTriangle.minimumSumPathTriangle(triangle);

        Assertions.assertEquals(6, result);
    }
}
