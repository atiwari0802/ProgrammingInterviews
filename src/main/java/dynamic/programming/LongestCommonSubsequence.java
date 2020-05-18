package dynamic.programming;

public class LongestCommonSubsequence {

    public int longestCommonSubSequenceRecursive(String strOne, String strTwo, int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
            return 1 + longestCommonSubSequenceRecursive(strOne, strTwo, i - 1, j - 1);
        }
        return Math.max(longestCommonSubSequenceRecursive(strOne, strTwo, i - 1, j),
                longestCommonSubSequenceRecursive(strOne, strTwo, i, j - 1));
    }

    public int longestCommonSubSequenceMemo(String strOne, String strTwo, int i, int j, int[][] memo) {
        if (memo[i][j] > -1) {
            return memo[i][j];
        }

        if (i == 0 || j == 0) {
            memo[i][j] = 0;
            return memo[i][j];
        }

        if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
            memo[i][j] = 1 + longestCommonSubSequenceMemo(strOne, strTwo, i - 1, j - 1, memo);
            return memo[i][j];
        }

        memo[i][j] = Math.max(longestCommonSubSequenceMemo(strOne, strTwo, i - 1, j, memo),
                longestCommonSubSequenceMemo(strOne, strTwo, i, j - 1, memo));
        return memo[i][j];
    }

    public int longestCommonSubSequenceDP(String strOne, String strTwo) {
        int[][] table = new int[strOne.length() + 1][strTwo.length() + 1];

        for (int i = 0; i <= strOne.length(); i++) {
            for (int j = 0; j <= strTwo.length(); j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
                    table[i][j] = 1 + table[i - 1][j - 1];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }

        return table[strOne.length()][strTwo.length()];
    }
}
