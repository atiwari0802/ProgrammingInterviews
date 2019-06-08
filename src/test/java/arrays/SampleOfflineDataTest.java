package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SampleOfflineDataTest {

    private SampleOfflineData sampleOfflineData;

    @BeforeEach
    public void setup() {
        sampleOfflineData = new SampleOfflineData();
    }

    @Test
    public void testRandomSampling() {

        List<Integer> input = IntStream.rangeClosed(1, 500)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < 10; i++){
            System.out.printf(":%s ", input.get(i));
        }
        System.out.println();
        sampleOfflineData.sampleRandomNumbers(input, 10);

        for (int i = 0; i < 10; i++){
            System.out.printf(":%s ", input.get(i));
        }
    }
}
