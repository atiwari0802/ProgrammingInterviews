package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GameOfLifeTest {

    private GameOfLife gameOfLife;

    @BeforeEach
    public void setup() {
        gameOfLife = new GameOfLife();
    }

    @Test
    public void testGameOfLife() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(0, 1, 0),
                Arrays.asList(0, 0, 1),
                Arrays.asList(1, 1, 1),
                Arrays.asList(0, 0, 0)
        );

        List<List<Integer>> output = gameOfLife.gameOfLife(matrix);

        output.forEach( list -> {
            list.forEach(n -> System.out.printf(" %d", n));
            System.out.println();
        } );
    }
}
