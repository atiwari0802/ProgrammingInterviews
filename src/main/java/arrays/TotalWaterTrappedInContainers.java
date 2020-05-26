package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TotalWaterTrappedInContainers {

    public int trappedWaterExtraSpace(List<Integer> heights) {
        int size = heights.size();
        int totalWater = 0;
        List<Integer> leftMaximas = new ArrayList<>(Collections.nCopies(size, -1));
        List<Integer> rightMaximas = new ArrayList<>(Collections.nCopies(size, -1));

        leftMaximas.set(0, heights.get(0));
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i) > leftMaximas.get(i - 1)) {
                leftMaximas.set(i, heights.get(i));
            } else {
                leftMaximas.set(i, leftMaximas.get(i - 1));
            }
        }

        rightMaximas.set(size - 1, heights.get(size - 1));
        for (int i = size - 2; i >= 0; i--) {
            if (heights.get(i) > rightMaximas.get(i + 1)) {
                rightMaximas.set(i, heights.get(i));
            } else {
                rightMaximas.set(i, rightMaximas.get(i + 1));
            }
        }

        for (int i = 0; i < size; i++) {
            totalWater += Math.min(leftMaximas.get(i), rightMaximas.get(i))
                    - heights.get(i);
        }
        return totalWater;
    }

    /*
    * The idea is to find the inversion point: the point that divides the array in two sectors of increasing and decreasing values, respectively.
    *  We iterate over the first (increasing) sector, scanning the array from left to right and adding up the water that will be stored based on the max height that has been witnessed so far.
    * We then iterate over the second (decreasing) sector from right to left and use the same logic to summate the water that will be stored for each entry.
     */
    public int totalRainWaterConstantSpace(List<Integer> heights) {
        int inversionPoint = -1;
        int maxSoFar = Integer.MIN_VALUE;
        int totalWater = 0;
        for (int i = 0; i < heights.size(); i++ ) {
            if (heights.get(i) >= maxSoFar) {
                inversionPoint = i;
                maxSoFar = heights.get(i);
            }
        }
        maxSoFar = Integer.MIN_VALUE; // reset value of maxSoFar
        for (int i = 0; i <= inversionPoint; i++) {
            if (heights.get(i) >= maxSoFar) {
                maxSoFar = heights.get(i);
            } else {
                totalWater += maxSoFar - heights.get(i);
            }
        }
        maxSoFar = Integer.MIN_VALUE; // reset value of maxSoFar
        for (int i = heights.size() - 1; i >= inversionPoint; i--) {
            if (heights.get(i) >= maxSoFar) {
                maxSoFar = heights.get(i);
            } else {
                totalWater += maxSoFar - heights.get(i);
            }
        }
        return totalWater;
    }



}
