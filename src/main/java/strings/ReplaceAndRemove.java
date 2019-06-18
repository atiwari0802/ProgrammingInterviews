package strings;

public class ReplaceAndRemove {

    public int replaceAndRemove(int size, char[] input) {

        int writeIndex = 0, currentIndex = 0, aCount = 0;

        for (int i = 0; i < size; i++) {
            if (input[i] != 'b') {
                input[writeIndex++] = input[i];
            }
            if (input[i] == 'a') {
                aCount++;
            }
        }

        currentIndex = writeIndex - 1;
        writeIndex += aCount - 1;
        final int finalSize = writeIndex + 1;

        while (currentIndex >= 0) {

            if (input[currentIndex] == 'a') {
                input[writeIndex--] = 'd';
                input[writeIndex--] = 'd';
            } else {
                input[writeIndex--] = input[currentIndex];
            }
            currentIndex--;
        }

        return finalSize;
    }

}
