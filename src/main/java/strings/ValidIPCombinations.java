package strings;

import java.util.ArrayList;
import java.util.List;

public class ValidIPCombinations {

    public List<String> listAllValidIPs(String input) {

        List<String> validIPs = new ArrayList<>();

        for (int i = 1; i < input.length() && i < 4; i++) {
            String firstSegment = input.substring(0, i);
            if (isSegmentValid(firstSegment)) {
                for (int j = 1; i + j < input.length() && j < 4; j++) {
                    String secondSegment = input.substring(i, i + j);
                    if (isSegmentValid(secondSegment)) {
                        for (int k = 1; i + j + k < input.length() && k < 4; k++) {
                            String thirdSegment = input.substring(i + j, i + j + k);
                            String fourthSegment = input.substring(i + j + k);
                            if (isSegmentValid(thirdSegment)
                                && isSegmentValid(fourthSegment)) {
                                validIPs.add(firstSegment + "." + secondSegment
                                    + "." + thirdSegment + "." + fourthSegment);
                            }
                        }
                    }
                }
            }
        }
        return validIPs;
    }

    private boolean isSegmentValid(String segment) {

        if (segment.length() > 3) {
            return false;
        }
        if (segment.startsWith("0") && segment.length() > 1) {
            return false;
        }

        int value = Integer.valueOf(segment);

        return value >= 0 && value < 255;
    }
}
