package heap;

import heaps.AlmostSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlmostSortedArrayTest {

    private AlmostSortedArray almostSortedArray;

    @BeforeEach
    public void setup() {
        almostSortedArray = new AlmostSortedArray();
    }

    @Test
    public void testAlmostSortedArray() {

        List<Integer> input = List.of(1, 2, 0, 3, 5, 4, 7, 6);

        List<Integer> result = almostSortedArray.sortAlmostSortedArray(input.iterator(), 3);

        result.forEach(System.out::println);

    }
}
