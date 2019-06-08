package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SampleOnlineDataTest {

    SampleOnlineData sampleOnlineData;

    @BeforeEach
    public void setup() {
        sampleOnlineData = new SampleOnlineData();
    }

    @Test
    public void testSampleOnlineData() {

        List<Integer> input = IntStream.rangeClosed(0, 500).boxed().collect(Collectors.toList());

        List<Integer> sampleList = sampleOnlineData.sampleOnlineData(input.iterator(), 50);

        sampleList.forEach(i -> System.out.printf(":%s", i));
    }
}
