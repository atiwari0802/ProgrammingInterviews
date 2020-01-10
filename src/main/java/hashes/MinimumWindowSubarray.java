package hashes;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinimumWindowSubarray {


    public Result findMinimumWindowSubarray(List<String> paragraph, List<String> keywords) {

        Map<String, Long> keywordIndex = keywords.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int left = 0, right, keywordLeft = keywords.size();
        Result result = new Result(Integer.MIN_VALUE, Integer.MAX_VALUE);

        for (right = 0; right < paragraph.size(); right++) {
            if (keywordIndex.containsKey(paragraph.get(right)) && keywordIndex.get(paragraph.get(right)) >= 1) {
                keywordLeft--;
                keywordIndex.put(paragraph.get(right), keywordIndex.get(paragraph.get(right)) - 1);
            }

            while (keywordLeft == 0) {
                if ((result.leftIndex == Integer.MIN_VALUE && result.rightIndex == Integer.MAX_VALUE)
                        || right - left < result.rightIndex - result.leftIndex) {
                    result.leftIndex = left;
                    result.rightIndex = right;
                }

                if (keywordIndex.containsKey(paragraph.get(left)) && keywordIndex.get(paragraph.get(left)) == 0) {
                    keywordLeft++;
                    keywordIndex.put(paragraph.get(left), keywordIndex.get(paragraph.get(left)) + 1);
                }
                left++;
            }
        }

        return result;
    }

    public static class Result {
        public int leftIndex;
        public int rightIndex;

        public Result(int leftIndex, int rightIndex) {
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
        }
    }

}
