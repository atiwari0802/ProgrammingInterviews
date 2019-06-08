package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListPrimeNumbersTest {

    private ListPrimeNumbers listPrimeNumbers;

    @BeforeEach
    public void setup() {
        listPrimeNumbers = new ListPrimeNumbers();
    }

    @Test
    public void testListPrimeNumbers() {

        List<Integer> primes = listPrimeNumbers.findPrimes(9);

        Assertions.assertEquals(4, primes.size());
    }
}
