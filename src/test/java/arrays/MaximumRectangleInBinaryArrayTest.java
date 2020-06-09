package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MaximumRectangleInBinaryArrayTest {

    private MaximumRectangleInBinaryArray maximumRectangleInBinaryArray;

    @BeforeEach
    public void setup () {
        maximumRectangleInBinaryArray = new MaximumRectangleInBinaryArray();
    }

    @Test
    public void testMaxRectangle() {
        List<List<Character>> input = new ArrayList<>();
        input.add(List.of('1','0','1','0','0'));
        input.add(List.of('1','0','1','1','1'));
        input.add(List.of('1','1','1','1','1'));
        input.add(List.of('1','0','0','1','0'));

        int result = maximumRectangleInBinaryArray.maximumRectangle(input);

        Assertions.assertEquals(6, result);
    }
}
