package strings;

public class TelexEncoding {

    public int telexEncoding(char[] input, int size) {

        int dotCount = 0, commaCount = 0;

        for (int i = 0; i < size; i++) {
            if (input[i] == '.') {
                dotCount++;
            } else if (input[i] == ',') {
                commaCount++;
            }
        }

        int currentIndex = size - 1;
        int writeIndex = size + dotCount * 2 + commaCount * 4 - 1;
        final int finalSize = writeIndex + 1;
        while (currentIndex >= 0) {
            if (input[currentIndex] == ',') {
                input[writeIndex--] = 'A';
                input[writeIndex--] = 'M';
                input[writeIndex--] = 'M';
                input[writeIndex--] = 'O';
                input[writeIndex--] = 'C';
            } else if (input[currentIndex] == '.') {
                input[writeIndex--] = 'T';
                input[writeIndex--] = 'O';
                input[writeIndex--] = 'D';
            } else {
                input[writeIndex--] = input[currentIndex];
            }
            currentIndex--;
        }
        return finalSize;
    }
}
