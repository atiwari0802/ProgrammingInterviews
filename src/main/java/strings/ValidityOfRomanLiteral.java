package strings;

import java.util.Map;

public class ValidityOfRomanLiteral {

    public static Map<Character, Integer> MAPPING = Map.of('I', 1, 'V', 5
            , 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public boolean isValid(String romanLiteral) {

        int violationFlag = 0;

        for (int i = romanLiteral.length() - 2; i >= 0 && violationFlag < 2; i--) {
            if (MAPPING.get(romanLiteral.charAt(i))
                    < MAPPING.get(romanLiteral.charAt(i + 1))) {
                violationFlag++;
            } else {
                violationFlag = violationFlag > 0 ? --violationFlag : 0;
            }
        }

        return violationFlag <= 1;
    }
}
