package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MinimumJumpsTest {

    private MinimumJumpsRecursive minimumJumps;

    private List<Integer> input;

    @BeforeEach
    public void setup() {
        minimumJumps = new MinimumJumpsRecursive();
        input = Arrays.asList(1, 3, 6, 3, 2, 3, 6, 8, 9, 5);
    }

    @Test
    public void testMinimumJumps() {

        int jumps = minimumJumps.recuriveMinimumJumps(input, 0, input.size()-1);
        System.out.println(":::::::::: JUMPS ===="+ jumps);
        Assertions.assertEquals(4, jumps);
    }
}
