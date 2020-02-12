package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HIndexTest {

    private HIndex hIndex;

    @BeforeEach
    public void setup() {
        hIndex = new HIndex();
    }

    @Test
    public void testHIndex() {
        List<Integer> input = Arrays.asList(3, 10, 5, 8, 4);

        long result = hIndex.computeHIndex(input);

        Assertions.assertEquals(4, result);
    }

}
