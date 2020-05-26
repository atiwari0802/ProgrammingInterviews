package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TotalWaterTrappedInContainersTest {

    private TotalWaterTrappedInContainers totalWaterTrappedInContainers;

    @BeforeEach
    public void setup() {
        totalWaterTrappedInContainers = new TotalWaterTrappedInContainers();
    }

    @Test
    public void testExtraSpaceSolution() {
        List<Integer> heights = List.of(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1);

        int result = totalWaterTrappedInContainers.trappedWaterExtraSpace(heights);

        Assertions.assertEquals(6, result);
    }

    @Test
    public void testSolutionWithConstantSpace() {
        List<Integer> heights = List.of(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1);

        int result = totalWaterTrappedInContainers.totalRainWaterConstantSpace(heights);

        Assertions.assertEquals(6, result);
    }
}
