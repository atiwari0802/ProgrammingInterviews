package arrays;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MultiplyTwoArraysTest {

    private MultiplyTwoArrays multiplyTwoArrays;

    @BeforeEach
    public void setup() {

        multiplyTwoArrays = new MultiplyTwoArrays();
    }

    @Test
    public void testMultiplyTwoArrays() {

        List<Integer> numOne = Arrays.asList(1,2,3);

        numOne.forEach(System.out::print);

        List<Integer> numTwo = Arrays.asList(-9,8,7);

        numTwo.forEach(System.out::print);

        List<Integer> result = multiplyTwoArrays.multiplyTwoArrays(numOne,numTwo);

        System.out.println();

        result.forEach(System.out::println);

    }

}
