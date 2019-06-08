package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class AdvancingThroughArrayTest {

    private AdvancingThroughArray advancingThroughArray;

    @BeforeEach
    public void setup() {
        advancingThroughArray = new AdvancingThroughArray();
    }

    @Test
    public void testAdvancingThroughAReachableArray() {

        List<Integer> input = Arrays.asList(1,3,6,1,0,9);

        Assertions.assertTrue(advancingThroughArray.canReachEnd(input));

    }

    @Test
    public void testAdvancingThroughANonReachableArray() {

        List<Integer> input = Arrays.asList(1,1,0,0,3,9);

        Assertions.assertFalse(advancingThroughArray.canReachEnd(input));

    }
}
