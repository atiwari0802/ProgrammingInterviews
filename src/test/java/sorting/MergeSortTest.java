package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortTest {

    private MergeSort mergeSort;

    @BeforeEach
    public void setup() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testMergeSort() {

        List<Integer> input = Arrays.asList(6, 2, 1, 8, 4);

        List<Integer> result = mergeSort.mergeSort(input, 0, input.size() - 1);

        result.forEach(System.out::println);
    }

}
