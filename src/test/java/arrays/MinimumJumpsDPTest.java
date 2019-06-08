package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MinimumJumpsDPTest {

    private MinimumJumpsDP minimumJumpsDP;
    private List<Integer> input;

    @BeforeEach
    public void setup() {
        minimumJumpsDP = new MinimumJumpsDP();
        input = Arrays.asList(21, 3, 1, 0, 4);
    }

    @Test
    public void findMinimumJumps() {

       int minimumJumps =  minimumJumpsDP.minimumJumpsToReachEnd(input);

       System.out.println("Minimum Jumps are: "+minimumJumps);

    }

}
