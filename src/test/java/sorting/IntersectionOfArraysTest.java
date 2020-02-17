package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class IntersectionOfArraysTest {

    private IntersectionOfArrays intersectionOfArrays;

    @BeforeEach
    public void setup() {
        intersectionOfArrays = new IntersectionOfArrays();
    }

    @Test
    public void testIntersection() {
        List<Integer> firstList = Arrays.asList(1, 4, 5, 7, 8, 10);
        List<Integer> secondList = Arrays.asList(4, 5, 10, 20);

        List<Integer> result = intersectionOfArrays.findIntersection(firstList, secondList);

        result.forEach(System.out::println);

    }
}
