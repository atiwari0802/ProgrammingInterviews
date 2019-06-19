package strings;

public class ReverseWords {

    public void reverseWords(char[] input) {

        int length = input.length;
        reverse(input, 0, length - 1);

        int startIndex = 0, endIndex = 0;

        while (startIndex < length) {
            while ((startIndex < length && input[startIndex] == ' ')
                    || startIndex < endIndex) {
                startIndex++;
            }
            while ((endIndex < length && input[endIndex] != ' ')
                        || endIndex < startIndex) {
                endIndex++;
            }
            reverse(input, startIndex, endIndex - 1);
        }

        System.out.print(new String(input));
    }

    private void reverse(char[] array, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            char temp = array[startIndex];
            array[startIndex++] = array[endIndex];
            array[endIndex--] = temp;
        }
    }

}
