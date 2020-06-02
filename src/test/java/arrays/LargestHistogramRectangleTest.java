package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LargestHistogramRectangleTest {

    private LargestHistogramRectangle largestHistogramRectangle;

    @BeforeEach
    public void setup() {
        largestHistogramRectangle = new LargestHistogramRectangle();
    }

    @Test
    public void testLargestRectangle() {
        List<Integer> heights = List.of(2, 1, 5, 6, 2, 3);

        int result = largestHistogramRectangle.largestRectangleArea(heights);

        System.out.println(result);

        heights = List.of(6, 2, 5, 4, 5, 1, 6);

        result = largestHistogramRectangle.largestRectangleArea(heights);

        System.out.println(result);
    }
}
