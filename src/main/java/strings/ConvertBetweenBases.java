package strings;

public class ConvertBetweenBases {

    public String convertBetweenBases(String input, int fromBase, int toBase) {

        boolean isNegative = input.charAt(0) == '-';

        int number = (isNegative ? -1 : 1) * convertToInt(input, fromBase, isNegative);

        String translatedNumber = convertBase(number, toBase);

        return translatedNumber;
    }

    private int convertToInt(String input, int fromBase, boolean isNegative) {

        int number = input.substring(isNegative ? 1 : 0)
                .chars()
                .reduce(0, (sum, c) -> sum * fromBase + (Character.isDigit(c) ? c - '0' : c - 'A' + 10));

        return number;
    }

    private String convertBase(int number, int toBase) {

        StringBuffer buffer = new StringBuffer();

        while (number != 0) {
            int remainder = Math.abs(number % toBase);
            buffer.append((char) (remainder >= 10 ? 'A' + remainder - 10 : remainder + '0'));
            number /= toBase;
        }

        if (number < 0) {
            buffer.append('-');
        }

        return buffer.reverse().toString();
    }

}
