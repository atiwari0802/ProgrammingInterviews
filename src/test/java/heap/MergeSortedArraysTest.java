package heap;

import heaps.MergeSortedArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MergeSortedArraysTest {

    private MergeSortedArrays mergeSortedArrays;

    @BeforeEach
    public void setup() {
        mergeSortedArrays = new MergeSortedArrays();
    }

    @Test
    public void testMergeSortedArrays() {

        List<Integer> listOne = List.of(3, 5, 7);
        List<Integer> listTwo = List.of(1, 6);
        List<Integer> listThree = List.of(0, 4, 9);
        List<List<Integer>> sortedLists = List.of(listOne, listTwo, listThree);

        List<Integer> sortedArray = mergeSortedArrays.mergeSortedArrays(sortedLists);

        sortedArray.forEach(System.out::println);
    }
}
