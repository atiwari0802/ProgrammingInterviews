package strings;

public class IntToString {

    public String intToString(int number) {
        boolean isNegative = number < 0;
        StringBuffer buffer = new StringBuffer();

        while (number != 0) {
            buffer.append((char)('0' + Math.abs(number % 10)));
            number /= 10;
        }

        if (isNegative) {
            buffer.append('-');
        }
        return buffer.reverse().toString();
    }
}
