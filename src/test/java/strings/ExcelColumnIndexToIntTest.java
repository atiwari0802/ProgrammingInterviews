package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcelColumnIndexToIntTest {

    private ExcelColumnIndexToInt excelColumnIndexToInt;

    @BeforeEach
    public void setup() {
        excelColumnIndexToInt = new ExcelColumnIndexToInt();
    }

    @Test
    public void testColumnIndexToInt() {

        int numericIndex = excelColumnIndexToInt.columnIndexToInt("AB");

        Assertions.assertEquals(28, numericIndex);
    }


}
