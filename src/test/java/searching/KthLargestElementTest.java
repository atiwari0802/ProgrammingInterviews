package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class KthLargestElementTest {

    private KThLargestElement kThLargestElement;

    @BeforeEach
    private void setup() {
        kThLargestElement = new KThLargestElement();
    }

    @Test
    public void testKThLargestElement() {

        List<Integer> input = Arrays.asList(4, 6, 1, 0, 5, 10, 11, 55, 3);

        int thirdLargestElement = kThLargestElement.findKThLargestElement(input, 3);

        Assertions.assertEquals(3,  thirdLargestElement);

    }
}
