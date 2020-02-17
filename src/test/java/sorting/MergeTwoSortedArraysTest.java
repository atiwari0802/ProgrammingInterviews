package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArraysTest {

    private MergeTwoSortedArrays mergeTwoSortedArrays;

    @BeforeEach
    public void setup() {
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }

    @Test
    public void testMerge() {
        List<Integer> first = Arrays.asList(3, 5, 7, 8, Integer.MAX_VALUE, Integer.MAX_VALUE);
        List<Integer> second = Arrays.asList(2, 4);

        mergeTwoSortedArrays.mergeTwoSortedArrays(first, 4, second, 2);

        first.forEach(System.out::println);

    }
}
