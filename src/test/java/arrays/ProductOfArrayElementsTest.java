package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ProductOfArrayElementsTest {

    private ProductOfArrayElements productOfArrayElements;

    @BeforeEach
    public void setup() {
        productOfArrayElements = new ProductOfArrayElements();
    }

    @Test
    public void testProduct() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);

        List<Integer> output = productOfArrayElements.productExceptSelf(input);

        output.forEach(n -> System.out.printf(" %d ", n));
    }
}
