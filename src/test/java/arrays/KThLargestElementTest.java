package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class KThLargestElementTest {

    private KThLargestElement kThLargestElement;

    @BeforeEach
    public void setup() {
        kThLargestElement = new KThLargestElement();
    }

    @Test
    public void testKThLargestElement() {

        List<Integer> input = Arrays.asList(4, 6, 1, 0, 5, 10, 11, 55, 3);

        int thirdLargestElement = kThLargestElement.findKthLargestElement(input, 3);

        Assertions.assertEquals(10,  thirdLargestElement);

    }
}
