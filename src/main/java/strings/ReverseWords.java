package strings;

public class ReverseWords {

    public void reverseWords(char[] input) {

        int length = input.length;

        reverse(input, 0, length - 1);

        int startingIndex = 0, endingIndex = 0;

        while (startingIndex < length) {
            while (startingIndex < endingIndex || (startingIndex < length
                    && input[startingIndex] == ' '))
            {
                startingIndex++;
            }
            while (endingIndex < startingIndex || (endingIndex < length
                    && input[endingIndex] != ' ')) {
                endingIndex++;
            }

            reverse(input, startingIndex, endingIndex - 1);
        }

        for (int i = 0; i < length; i++ ) {
            System.out.print(input[i]);
        }
    }

    private void reverse(char[] array, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            char temp = array[startIndex];
            array[startIndex++] = array[endIndex];
            array[endIndex--] = temp;
        }
    }

}
