package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class  NormalizingFilePath {

    public String normalizeFilePath(String input) {

        Deque<String> stack = new ArrayDeque<>();
        if (input.startsWith("/")) {
            stack.addFirst("/");
        }

        for (String str : input.split("/")) {
            if (str.equals("..")) {
                if (stack.isEmpty() || stack.peekFirst().equals("..")) {
                    stack.addFirst(str);
                } else {
                    if (stack.peekFirst().equals("/")) {
                        throw new IllegalArgumentException();
                    }
                    stack.removeFirst();
                }
            } else if (!str.isEmpty() && !str.equals(".")) {
                stack.addFirst(str);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            StringBuilder lastEntry = new StringBuilder(stack.removeFirst());
            result.append(lastEntry.reverse());
            if (!lastEntry.toString().equals("/")) {
                result.append("/");
            }
        }
        return result.reverse().toString();
    }

}
