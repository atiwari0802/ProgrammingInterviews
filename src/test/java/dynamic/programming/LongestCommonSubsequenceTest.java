package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LongestCommonSubsequenceTest {

    private LongestCommonSubsequence longestCommonSubsequence;

    @BeforeEach
    public void setup() {
        longestCommonSubsequence = new LongestCommonSubsequence();
    }

    @Test
    public void testLcsRecursive() {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int result = longestCommonSubsequence.longestCommonSubSequenceRecursive(s1, s2, s1.length(), s2.length());

        Assertions.assertEquals(4, result);
    }

    @Test
    public void testLcsMemo() {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int[][] memo = new int[s1.length() + 1][s2.length() + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int result = longestCommonSubsequence.longestCommonSubSequenceMemo(s1, s2, s1.length(), s2.length(), memo);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void testLcsDP() {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int result = longestCommonSubsequence.longestCommonSubSequenceDP(s1, s2);

        Assertions.assertEquals(4, result);
    }
}
