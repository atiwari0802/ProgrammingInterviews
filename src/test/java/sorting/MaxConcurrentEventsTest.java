package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static sorting.MaxConcurrentEvents.Event;

public class MaxConcurrentEventsTest {

    private MaxConcurrentEvents maxConcurrentEvents;

    @BeforeEach
    public void setup() {
        maxConcurrentEvents = new MaxConcurrentEvents();
    }

    @Test
    public void testMaxConcurrentEvents() {
        Event e1 = new Event(1, 4);
        Event e2 = new Event(3, 5);
        Event e3 = new Event(4, 6);
        Event e4 = new Event(5, 6);

        List<MaxConcurrentEvents.Event> events = Arrays.asList(e1, e2, e3, e4);

        int result = maxConcurrentEvents.maxConcurrentEvents(events);

        Assertions.assertEquals(3, result);
    }
}
