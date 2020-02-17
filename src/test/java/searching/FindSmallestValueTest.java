package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindSmallestValueTest {

    private FindSmallestValue findSmallestValue;

    @BeforeEach
    public void setup() {
        findSmallestValue = new FindSmallestValue();
    }

    @Test
    public void testFindSmallest() {

        List<Integer> input = Arrays.asList(74, 79, 80, 1, 2, 3, 4);

        int result = findSmallestValue.findSmallest(input);

        Assertions.assertEquals(3, result);
    }
}
