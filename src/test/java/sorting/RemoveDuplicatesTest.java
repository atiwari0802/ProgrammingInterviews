package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static sorting.RemoveDuplicates.Name;

public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    public void setup() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    public void testRemoveDuplicates() {
        List<Name> input = new ArrayList<>(Arrays.asList(new Name("Ian", "Botham"), new Name("David", "Gower"),
                new Name("Ian", "Bell"), new Name("Ian", "Chappell")));

       List<Name> result = removeDuplicates.removeDuplicates(input);

       result.forEach(name -> System.out.printf("%s --> %s\n", name.firstName, name.lastName));
    }
}
