package strings;

public class WriteStringSinusoidally {

    public String writeSinusoidally(String input) {

        StringBuilder buffer = new StringBuilder();

        for (int i = 1; i < input.length(); i += 4) {
            buffer.append(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i += 2) {
            buffer.append(input.charAt(i));
        }
        for (int i = 3; i < input.length(); i += 4) {
            buffer.append(input.charAt(i));
        }
        return buffer.toString();
    }

}
