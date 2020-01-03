package hashes;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnonymousLetterConstruction {

    public boolean canLetterBeConstructedFromSource(String letter, String magazine) {

        Map<Character, Long> letterCharMap = letter
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (char c : magazine.toCharArray()) {
            letterCharMap.computeIfPresent(c, (k, v) -> v - 1);
            letterCharMap.remove(c, 0L);
            if (letterCharMap.isEmpty()) {
                break;
            }
        }
        return letterCharMap.isEmpty();
    }

}
