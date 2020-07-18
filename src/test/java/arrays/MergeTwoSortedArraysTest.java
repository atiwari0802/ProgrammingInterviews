package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedArraysTest {

    private MergeTwoSortedArrays mergeTwoSortedArrays;

    @BeforeEach
    public void setup() {
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }

    @Test
    public void testMergingTwoSortedArrays() {
        List<Integer> first = new ArrayList<>(Collections.nCopies(5, 0));
        first.set(0, 3);
        first.set(1, 8);
        first.set(2, 11);

        List<Integer> second = Arrays.asList(4, 9);

        List<Integer> result = mergeTwoSortedArrays.mergeSortedArrays(first, second, 3);

        result.forEach(i -> System.out.printf("%d ", i));
    }
}
