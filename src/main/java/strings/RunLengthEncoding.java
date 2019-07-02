package strings;

public class RunLengthEncoding {

    public String decode(String input) {

        StringBuilder buffer = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count = count * 10 + input.charAt(i) - '0';
            } else {
                while (count > 0) {
                    buffer.append(input.charAt(i));
                    count--;
                }
            }
        }
        return buffer.toString();
    }

    public String encode(String input) {

        StringBuffer buffer = new StringBuffer();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) != input.charAt(i - 1)) {
                buffer.append(count).append(input.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        return buffer.toString();
    }
}
