package hashes;

import java.util.HashSet;
import java.util.Set;

public class PalindromeFeasibility {

    public boolean canFormPalindrome(String input) {

        Set<Character> characters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (characters.contains(c)) {
                characters.remove(c);
            } else {
                characters.add(c);
            }
        }
        return characters.size() <= 1;
    }
}
