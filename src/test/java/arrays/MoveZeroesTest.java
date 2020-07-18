package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MoveZeroesTest {

    private MoveZeroes moveZeroes;

    @BeforeEach
    public void setup() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void testMoveZeroes() {
        List<Integer> input = Arrays.asList(0, 1, 0, 3, 12);

        input = moveZeroes.moveZeroes(input);

        input.forEach(n -> System.out.printf("%d ", n));

    }

    @Test
    public void testArr() {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(arr);

    }
}
