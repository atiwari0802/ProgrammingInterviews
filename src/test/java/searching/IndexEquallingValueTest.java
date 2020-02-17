package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class IndexEquallingValueTest {

    private IndexEquallingValue indexEquallingValue;

    @BeforeEach
    public void setup() {
        indexEquallingValue = new IndexEquallingValue();
    }

    @Test
    public void testIndexEquallingValue() {
        List<Integer> input = Arrays.asList(-1, 0, 1, 3, 5, 77, 90);

        int result = indexEquallingValue.findIndexEqualToValue(input);

        Assertions.assertEquals(3, result);
    }
}
