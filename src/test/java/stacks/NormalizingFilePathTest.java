package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NormalizingFilePathTest {

    private NormalizingFilePath normalizingFilePath;

    @BeforeEach
    public void setup() {

        normalizingFilePath = new NormalizingFilePath();

    }

    @Test
    public void testNormalization() {

        String result = normalizingFilePath.normalizeFilePath("a01/apps/../covapp/authz");

        System.out.printf(" ---> %s", result);


    }
}
