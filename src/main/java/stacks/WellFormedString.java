package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class WellFormedString {

    public static final Map<Character, Character> LOOKUP = Map.of('(', ')', '{', '}',
            '[', ']');

    public boolean isStringWellFormed(String input) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (LOOKUP.get(input.charAt(i)) != null) {
                stack.addFirst(input.charAt(i));
            } else if (stack.isEmpty() ||
                    LOOKUP.get(stack.removeFirst()) != input.charAt(i)) {
                return false;
            }
        }

        return stack.isEmpty();
    }


}
