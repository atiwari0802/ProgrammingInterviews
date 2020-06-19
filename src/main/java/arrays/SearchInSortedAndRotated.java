package arrays;

import java.util.List;

public class SearchInSortedAndRotated {

    public int searchInRotatedSortedSinglePass(int target, List<Integer> numbers) {
        int lo = 0, high = numbers.size() - 1;
        int mid;
        while (lo < high) {
            mid = (lo + high) / 2;
            if (target == numbers.get(mid)) {
                return mid;
            } else if (numbers.get(lo) < numbers.get(mid)) {
                if (target > numbers.get(lo) && target < numbers.get(mid)) {
                    high = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target < numbers.get(high) && target > numbers.get(mid)) {
                    lo = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * Time Complexity: O(log(n))
     * Space Complexity: O(1)
    * */
    public int searchInRotatedSortedArray(int target, List<Integer> input) {
        int pivotIndex = findPivot(input);
        if (pivotIndex < 0) {
            return binarySearch(input, 0, input.size() - 1, target);
        }  else if (input.get(pivotIndex) == target) {
            return pivotIndex;
        } else if (input.get(input.size() - 1) > target) {
            return binarySearch(input, 0, pivotIndex -1, target);
        } else {
            return binarySearch(input, pivotIndex + 1, input.size() - 1, target);
        }
    }

    private int findPivot(List<Integer> input) {
        int lo = 0, high = input.size() - 1;

        while (lo < high) {
            int pivot = (lo + high) / 2;
            if (input.get(pivot) > input.get(pivot + 1)) {
                return pivot + 1;
            } else if (input.get(lo) > input.get(pivot)) {
                high = pivot - 1;
            } else {
                lo = pivot + 1;
            }
        }
        return Integer.MIN_VALUE;
    }

    private int binarySearch(List<Integer> input, int lo, int high, int target) {
        while (lo < high) {
            int mid = (lo + high) / 2;
            if (target == input.get(mid)) {
                return mid;
            } else if (target > input.get(mid)) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return Integer.MIN_VALUE;
    }


}
