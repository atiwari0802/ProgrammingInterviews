package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ValidIPCombinationsTest {

    private ValidIPCombinations validIPCombinations;

    @BeforeEach
    public void setup() {

        validIPCombinations = new ValidIPCombinations();
    }

    @Test
    public void testValidIPCombinations() {

        List<String> validIPs = validIPCombinations.listAllValidIPs("19216811");

        validIPs.forEach(System.out::println);
    }
}
