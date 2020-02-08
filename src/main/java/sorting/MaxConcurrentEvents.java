package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxConcurrentEvents {

    public int maxConcurrentEvents(List<Event> events) {
        List<Endpoint> endpoints = events
                .stream()
                .map(e -> Arrays.asList(new Endpoint(e.start, true), new Endpoint(e.finish, false)))
                .flatMap(List::stream).collect(Collectors.toList());

        endpoints.sort((e1, e2) -> {
            if (e1.time != e2.time) {
                return Integer.compare(e1.time, e2.time);
            }
            return e1.isStart && !e2.isStart ? -1 : !e1.isStart && e2.isStart ? 1 : 0;
        });

        int maxConcurrentEvents = 0;
        int maxSoFar = 0;

        for (Endpoint endpoint : endpoints) {
            if (endpoint.isStart) {
                maxSoFar++;
                maxConcurrentEvents = Math.max(maxSoFar, maxConcurrentEvents);
            } else {
                maxSoFar--;
            }
        }

        return maxConcurrentEvents;
    }

    public static class Event {
        public int start, finish;

        public Event(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    static class Endpoint {
        public int time;
        public boolean isStart;

        public Endpoint(int time, boolean isStart) {
            this.time = time;
            this.isStart = isStart;
        }
    }
}
