package searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntSquareRootTest {

    private IntSquareRoot intSquareRoot;

    @BeforeEach
    public void setup() {
        intSquareRoot = new IntSquareRoot();
    }

    @Test
    public void testIntSquareRoot() {
        int result = intSquareRoot.squareRoot(17);

        Assertions.assertEquals(4, result);
    }
}
