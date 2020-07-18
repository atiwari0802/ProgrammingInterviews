package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MajorityElementTest {
    private MajorityElement majorityElement;

    @BeforeEach
    public void setup() {
        majorityElement = new MajorityElement();
    }

    @Test
    public void testMajorityElement() {
        List<Integer> input = Arrays.asList(2, 2, 1, 1, 1, 2, 2);
        Map.Entry<Integer, Integer> keyValue = majorityElement.findMajorityElement(input);

        Assertions.assertEquals(2, keyValue.getKey());
        Assertions.assertEquals(4, keyValue.getValue());
    }
}
