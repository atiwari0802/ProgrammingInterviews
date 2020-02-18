package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Search2DArrayTest {

    private Search2DArray search2DArray;

    @BeforeEach
    public void setup() {
        search2DArray = new Search2DArray();
    }

    @Test
    public void testSearch() {

        List<List<Integer>> matrix = new LinkedList<>();

        matrix.add(Arrays.asList(-1, 2, 4, 4, 6));
        matrix.add(Arrays.asList(1, 5, 5, 9, 21));
        matrix.add(Arrays.asList(3, 6, 6, 9, 22));
        matrix.add(Arrays.asList(6, 8, 9, 12, 25));
        matrix.add(Arrays.asList(8, 10, 12, 13, 40));

        Search2DArray.Position position = search2DArray.matrixSearch(matrix, 8);

        Assertions.assertEquals(3, position.row);
        Assertions.assertEquals(1, position.col);
    }
}
