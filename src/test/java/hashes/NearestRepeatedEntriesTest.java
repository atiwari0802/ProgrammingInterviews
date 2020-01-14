package hashes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NearestRepeatedEntriesTest {

    private NearestRepeatedEntries nearestRepeatedEntries;

    @BeforeEach
    public void setup() {
        nearestRepeatedEntries = new NearestRepeatedEntries();
    }

    @Test
    public void testNearestRepeatedEntries() {

        List<String> input = List.of("and", "so", "hi", "hello", "and", "yes", "and", "no");

        int result = nearestRepeatedEntries.findNearestRepeatedEntries(input);

        Assertions.assertEquals(2, result);

    }
}
