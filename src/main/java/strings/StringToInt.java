package strings;

public class StringToInt {

    public int convertStringToInt(String number) {

        boolean isNegative = number.charAt(0) == '-';

        int integer = (isNegative? -1: 1) * number.substring(isNegative ? 1 : 0)
                .chars()
                .reduce(0, (sum, c) -> sum * 10 + (c - '0'));

        return integer;
    }
}
