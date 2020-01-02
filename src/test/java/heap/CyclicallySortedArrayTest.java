package heap;

import heaps.CyclicallySortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CyclicallySortedArrayTest {

    private CyclicallySortedArray cyclicallySortedArray;

    @BeforeEach
    public void setup() {
        cyclicallySortedArray = new CyclicallySortedArray();
    }

    @Test
    public void testMergeCyclicallySortedArray() {

        List<Integer> list = Arrays.asList(60, 120, 180, 50, 40, 200, 300, 400);

        List<Integer> result = cyclicallySortedArray.mergeCyclicallySortedArray(list);

        result.forEach(System.out::println);
    }
}
