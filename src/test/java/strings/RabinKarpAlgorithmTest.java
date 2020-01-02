package strings;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RabinKarpAlgorithmTest {

    private RabinKarpAlgorithm rabinKarpAlgorithm;

    @BeforeEach
    public void setup() {
        rabinKarpAlgorithm = new RabinKarpAlgorithm();
    }

    @Test
    public void testPatternSearch() {

        int result = rabinKarpAlgorithm.searchPattern("gacgcca", "cgc");

        Assertions.assertEquals(2, result);
    }

}
