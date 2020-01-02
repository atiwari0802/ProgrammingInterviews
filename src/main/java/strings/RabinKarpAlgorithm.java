package strings;

public class RabinKarpAlgorithm {

    public static final int BASE = 26;

    public int searchPattern(String text, String pattern) {
        if (pattern.length() > text.length()) {
            return Integer.MIN_VALUE;
        }

        int textHash = 0, patternHash = 0;
        int power = 1;

        for (int i = 0; i < pattern.length(); i++) {
            power = i > 0 ? power * BASE : 1;
            textHash = textHash * BASE + text.charAt(i);
            patternHash = patternHash * BASE + pattern.charAt(i);
        }

        for (int i = pattern.length(); i < text.length(); i++) {
            if (textHash == patternHash && text.substring(i - pattern.length(), i).equals(pattern)) {
                return i - pattern.length();
            }
            textHash -= text.charAt(i - pattern.length()) * power;
            textHash = textHash * BASE + text.charAt(i);
        }

        if (textHash == patternHash && text.substring(text.length() - pattern.length()).equals(pattern)) {
            return text.length() - pattern.length();
        }
        return Integer.MIN_VALUE;
    }
}
