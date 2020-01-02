package heap;

import heaps.TopKElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TopKElementsTest {

    private TopKElements topKElements;

    @BeforeEach
    public void setup() {
        topKElements = new TopKElements();
    }

    @Test
    public void testGetTopKElements() {

        List<String> list = List.of("aa", "aaaaaaa", "aaa", "aaaa", "a");

        List<String> result = topKElements.getTopKElements(3, list.iterator());

        result.forEach(System.out::println);
    }

    @Test
    public void testSortingOrder() {

        List<Integer> list = Arrays.asList(15, 1, 112, 9, 55, 73, 998);

        list.sort((a, b) -> Integer.compare(a, b));

        list.forEach(System.out::println);
    }

}
