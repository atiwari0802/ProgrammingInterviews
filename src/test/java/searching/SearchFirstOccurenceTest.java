package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SearchFirstOccurenceTest {

    private SearchFirstOccurence searchFirstOccurence;

    @BeforeEach
    public void setup() {
        searchFirstOccurence = new SearchFirstOccurence();
    }

    @Test
    public void testFirstOccurrence() {
        List<Integer> input = Arrays.asList(10, 20, 20, 30, 35, 45, 55);

        int result = searchFirstOccurence.searchForFirstOccurence(input, 20);

        Assertions.assertEquals(1, result);
    }
}
