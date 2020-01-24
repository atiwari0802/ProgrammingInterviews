package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class QuickSortTest {

    private QuickSort quickSort;

    @BeforeEach
    public void setup() {
        quickSort = new QuickSort();
    }

    @Test
    public void testQuickSort() {
        List<Integer> input = Arrays.asList(6, 2, 1, 8, 4);

        List<Integer> result = quickSort.performQuickSort(input, 0, input.size() - 1);

        result.forEach(System.out::println);
    }
}
