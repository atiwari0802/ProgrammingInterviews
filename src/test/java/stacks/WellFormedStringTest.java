package stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WellFormedStringTest {

    private WellFormedString wellFormedString;

    @BeforeEach
    public void setup() {
        wellFormedString = new WellFormedString();
    }

    @Test
    public void testWellFormedString() {

        String input = "[{()}]";

        Assertions.assertTrue(wellFormedString.isStringWellFormed(input));

    }

    @Test
    public void testArrayRotation() {

        List<Integer> list = Arrays.asList(5, 10, 15, 20);

        Collections.rotate(list, 3);

        list.forEach(System.out::println);

    }
}
