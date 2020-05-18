package dynamic.programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubSequence {

    public int longestIncreasingSubSequenceRecursive(List<Integer> input) {
        if (input.size() == 0 || input.size() == 1) {
            return input.size();
        }
        int lisLength = 1;
        for (int i = 1; i < input.size(); i++) {
            lisLength = Math.max(lisLength, lisRecursiveUtil(input, i));
        }
        return lisLength;
    }

    private int lisRecursiveUtil(List<Integer> input, int endIndex) {
        if (endIndex == 0) {
            return 1;
        }
        int maxLis = 1;
        for (int i = 0; i < endIndex; i++) {
            if (input.get(i) < input.get(endIndex)) {
                maxLis = Math.max(maxLis, 1 + lisRecursiveUtil(input, i));
            }
        }
        return maxLis;
    }

    public int longestIncreasingSubSequenceMemoized(List<Integer> input) {
        if (input.size() == 0 || input.size() == 1) {
            return input.size();
        }
        int lisLength = 1;
        List<Integer> memo = new ArrayList<>(Collections.nCopies(input.size(), -1));
        for (int i = 1; i < input.size(); i++) {
            lisLength = Math.max(lisLength, listMemoUtil(input, i, memo));
        }

        return lisLength;
    }

    private int listMemoUtil(List<Integer> input, int endIndex, List<Integer> memo) {
        if (memo.get(endIndex) != -1) {
            System.out.printf("Memo Hit for %d = %d \n....", endIndex, memo.get(endIndex));
            return memo.get(endIndex);
        }
        if (endIndex == 0) {
            memo.set(endIndex, 1);
            return memo.get(endIndex);
        }

        int maxLis = 1;

        for (int i = 0; i < endIndex; i++) {
            if (input.get(i) < input.get(endIndex)) {
                maxLis = Math.max(maxLis, 1 + listMemoUtil(input, i, memo));
            }
        }
        memo.set(endIndex, maxLis);
        return maxLis;
    }


    public int longestIncreasingSubSequenceDP(List<Integer> input) {
        int[] lisArr = new int[input.size() + 1];
        lisArr[0] = 0;
        lisArr[1] = 1;

        for (int i = 2; i < input.size(); i++) {
            int maxSoFar = 1;
            for (int j = 0; j < i; j++) {
                if (input.get(j) < input.get(i)) {
                    maxSoFar = Math.max(maxSoFar, 1 + lisArr[j]);
                    lisArr[i] = maxSoFar;
                }
            }
        }

        int maxLis = Integer.MIN_VALUE;
        for (int i = 0; i < lisArr.length; i++) {
            System.out.print(lisArr[i] + "  ");
            maxLis = Math.max(maxLis, lisArr[i]);
        }

        return maxLis;
    }

}
