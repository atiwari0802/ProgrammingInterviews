package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConvertBetweenBasesTest {

    private ConvertBetweenBases convertBetweenBases;


    @BeforeEach
    public void setup() {

        convertBetweenBases = new ConvertBetweenBases();
    }

    @Test
    public void testConvertBetweenBases() {

        String convertedNumber = convertBetweenBases.convertBetweenBases("10", 10, 16);

        System.out.printf(" ============ Converted Number ======%s", convertedNumber);

    }
}
