package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EditDistanceTest {

    private EditDistance editDistance;

    @BeforeEach
    public void setup() {
        editDistance = new EditDistance();
    }

    @Test
    public void testEditDistance() {
        String str1 = "intrinsic";
        String str2 = "intrusive";

        int result = editDistance.editDistanceRecursive(str1, str2, str1.length(), str2.length());

        Assertions.assertEquals(6, result);
    }

    @Test
    public void testEditDistanceMemoized() {
        String str1 = "intrinsic";
        String str2 = "intrusive";

        int[][] memo = new int[str1.length() + 1][str2.length() + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        int result = editDistance.editDistanceMemoized(str1, str2, str1.length(), str2.length(), memo);

        Assertions.assertEquals(6, result);

        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testEditDistanceDP() {
        String str1 = "intrinsic";
        String str2 = "intrusive";

        int result = editDistance.editDistanceDP(str1, str2);

        Assertions.assertEquals(6, result);

    }


}
