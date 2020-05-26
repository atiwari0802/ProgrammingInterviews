package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    public void setup() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void testBruteForce() {
        List<Integer> input = List.of(1,8,6,2,5,4,8,3,7);

        int result = containerWithMostWater.maxAreaBruteForce(input);

        Assertions.assertEquals(49, result);
    }

    @Test
    public void testMaxAreaTwoPointer() {
        List<Integer> input = List.of(1,8,6,2,5,4,8,3,7);

        int result = containerWithMostWater.maxAreaTwoPointer(input);

        Assertions.assertEquals(49, result);
    }
}
