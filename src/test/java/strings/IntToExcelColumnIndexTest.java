package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntToExcelColumnIndexTest {

    private IntToExcelColumnIndex intToExcelColumnIndex;

    @BeforeEach
    public void setup() {
        intToExcelColumnIndex = new IntToExcelColumnIndex();
    }

    @Test
    public void convertIntToExcelIndexTest() {

        String index = intToExcelColumnIndex.intToExcelColumnIndex(28);

        System.out.println("::::::::"+index);

        Assertions.assertEquals("AB", index);
    }

}
