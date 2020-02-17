package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    public void setup() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void testBinarySearch() {
        List<Integer> input = Arrays.asList(4, 6, 8, 11, 20, 44, 50);

        int result = binarySearch.binarySearch(input, 11);

        Assertions.assertEquals(3, result);

    }
}
