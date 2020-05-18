package dynamic.programming;

public class EditDistance {

    public int editDistanceRecursive(String strOne, String strTwo, int i, int j) {
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i;
        }

        if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
            return editDistanceRecursive(strOne, strTwo, i - 1, j - 1);
        }

        return findMin(1 + editDistanceRecursive(strOne, strTwo, i, j - 1),
                1 + editDistanceRecursive(strOne, strTwo, i - 1, j),
                2 + editDistanceRecursive(strOne, strTwo, i - 1, j - 1));
    }

    public int editDistanceMemoized(String strOne, String strTwo, int i, int j, int[][] memo) {
        if (memo[i][j] > -1) {
            return memo[i][j];
        }
        if (i == 0) {
            memo[i][j] = j;
            return memo[i][j];
        }
        if (j == 0) {
            memo[i][j] = i;
            return memo[i][j];
        }

        if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
            memo[i][j] = editDistanceMemoized(strOne, strTwo, i - 1, j - 1, memo);
            return memo[i][j];
        }

        memo[i][j] = findMin(1 + editDistanceMemoized(strOne, strTwo, i, j - 1, memo),
                1 + editDistanceMemoized(strOne, strTwo, i - 1, j, memo),
                2 + editDistanceMemoized(strOne, strTwo, i - 1, j - 1, memo));

        return memo[i][j];
    }

    public int editDistanceDP(String strOne, String strTwo) {
        int[][] table = new int[strOne.length() + 1][strTwo.length() + 1];

        for (int i = 0; i <= strOne.length(); i++) {
            for (int j = 0; j <= strTwo.length(); j++) {
                if (i == 0) {
                    table[i][j] = j;
                } else if (j == 0) {
                    table[i][j] = i;
                } else if (strOne.charAt(i - 1) == strTwo.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1];
                } else {
                    table[i][j] = findMin(1 + table[i][j - 1], 1 + table[i - 1][j], 2 + table[i - 1][j - 1]);
                }
            }
        }
        for (int i = 0; i <= strOne.length(); i++) {
            for (int j = 0; j <= strTwo.length(); j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        return table[strOne.length()][strTwo.length()];
    }

    private int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

}
