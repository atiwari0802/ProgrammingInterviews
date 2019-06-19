package strings;

import java.util.ArrayList;
import java.util.List;

public class ComputeAllMnemonics {

    public static final String[] MAPPING = {"0", "1", "ABC", "DEF", "GHI",
            "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    public List<String> computeAllMnemonics(String phoneNumber) {

        List<String> mnemonics = new ArrayList<>();
        computeAllMnemonicsHelper(phoneNumber, 0, new char[phoneNumber.length()], mnemonics);
        return mnemonics;
    }

    private void computeAllMnemonicsHelper(String phoneNumber, int position,
                                           char[] partialMnenomic,
                                           List<String> mnemonics) {
        if (position == phoneNumber.length()) {
            mnemonics.add(new String(partialMnenomic));
        } else {
            for (int i = 0; i < MAPPING[phoneNumber.charAt(position) - '0'].length(); i++) {
                char c = MAPPING[phoneNumber.charAt(position) - '0'].charAt(i);
                partialMnenomic[position] = c;
                computeAllMnemonicsHelper(phoneNumber, position + 1,
                        partialMnenomic, mnemonics);
            }
        }
    }
}
