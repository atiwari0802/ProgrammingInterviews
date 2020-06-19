package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchInSortedAndRotatedTest {

    private SearchInSortedAndRotated sortedAndRotated;

    @BeforeEach
    public void setup() {
        sortedAndRotated = new SearchInSortedAndRotated();
    }

    @Test
    public void testSearch() {
        List<Integer> input = List.of(4, 5, 1, 2, 3);

        int index = sortedAndRotated.searchInRotatedSortedArray(2, input);

        Assertions.assertEquals(3, index);
    }

    @Test
    public void testSearchSinglePass () {
        List<Integer> input = List.of(4, 5, 1, 2, 3);

        int index = sortedAndRotated.searchInRotatedSortedSinglePass(2, input);

        Assertions.assertEquals(3, index);
    }
}
