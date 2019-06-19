package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ComputeAllMnemonicsTest {

    private ComputeAllMnemonics computeAllMnemonics;

    private String phoneNumber;

    @BeforeEach
    public void setup() {
        computeAllMnemonics = new ComputeAllMnemonics();
        phoneNumber = "5187636283";
    }

    @Test
    public void testComputeAllMnemonics() {

        List<String> mnemonics = computeAllMnemonics.computeAllMnemonics(phoneNumber);

        System.out.println(mnemonics.size());
    }
}
