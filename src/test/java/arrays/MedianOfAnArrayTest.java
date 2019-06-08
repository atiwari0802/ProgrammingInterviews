package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MedianOfAnArrayTest {

    private MedianOfAnArray medianOfAnArray;

    @BeforeEach
    public void setup () {
        medianOfAnArray = new MedianOfAnArray();
    }

    @Test
    public void findMedianOfAnArrayForOddSet(){

        List<Integer> input = Arrays.asList(-1, 6, 2, 3, 8);
        double median =  medianOfAnArray.findMedian(input);

        Assertions.assertEquals(3, median);
    }

    @Test
    public void findMedianOfAnArrayForEvenSet(){

        List<Integer> input = Arrays.asList(-1, 6, 2, 3, 8, 14);
        System.out.printf("Size=%s%n", input.size());
        double median =  medianOfAnArray.findMedian(input);

        Assertions.assertEquals(4.5, median);
    }

    @Test
    public void test() {
        double a = 4, b =5;
        double average = (a + b)/2;
        System.out.println("Average="+average );

    }
}
