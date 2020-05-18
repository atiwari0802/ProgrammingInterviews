package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CountingPairsTest {

    private CountingPairs countingPairs;

    @BeforeEach
    public void setup() {
        countingPairs = new CountingPairs();
    }

    @Test
    public void testCountingPairs() {
        int result = countingPairs.countPairs(Arrays.asList( 1, 1, 2, 2, 3, 3), 1);

        System.out.println(result);
    }
}
