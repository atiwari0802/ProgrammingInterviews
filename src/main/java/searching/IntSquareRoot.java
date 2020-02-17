package searching;

public class IntSquareRoot {

    public int squareRoot(int key) {
        int lowerBound = 0, upperBound = key;

        while (lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if (Math.pow(mid, 2) <= key) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }
        }
        return lowerBound - 1;
    }


}
