package strings;

import java.util.Map;

public class RomanToDecimal {

    public static Map<Character, Integer> MAPPING = Map.of('I', 1, 'V', 5
            , 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public int romanToDecimal(String romanLiteral) {

        int length = romanLiteral.length() - 1;

        int sum = MAPPING.get(romanLiteral.charAt(length));

        for (int i = length - 1; i >= 0; i--) {
            if (MAPPING.get(romanLiteral.charAt(i)) < MAPPING.get(romanLiteral.charAt(i + 1))) {
                sum -= MAPPING.get(romanLiteral.charAt(i));
            } else {
                sum += MAPPING.get(romanLiteral.charAt(i));
            }
        }
        return sum;
    }
}
