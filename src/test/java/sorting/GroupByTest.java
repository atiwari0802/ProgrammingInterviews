package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static sorting.GroupBy.Person;

public class GroupByTest {

    private GroupBy groupBy;

    @BeforeEach
    public void setup() {
        groupBy = new GroupBy();
    }

    @Test
    public void testGroupBy() {
        List<Person> input = Arrays.asList(new Person("A5_1", 5),
                new Person("A4_1", 4),
                new Person("A3_1", 3),
                new Person("A5_2", 5),
                new Person("A6_1", 6),
                new Person("A5_3", 5),
                new Person("A5_4", 5));

        List<Person> result = groupBy.groupPersonsByAge(input);
        result.forEach( person -> System.out.printf("%1$d --> %2$s\n", person.age, person.name));
    }
}
