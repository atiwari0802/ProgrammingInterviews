package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntBiFunction;

public class ReversePolishNotations {

    private final static Map<String, ToIntBiFunction<Integer, Integer>>
                OPERATORS = new HashMap<>();

    static {
        OPERATORS.put("+", (y, x) -> x + y);
        OPERATORS.put("-", (y, x) -> x - y);
        OPERATORS.put("*", (y, x) -> x * y);
        OPERATORS.put("/", (y, x) -> x / y);
    }

    public int evaluate(String input) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String str : input.split(",")) {
            if (OPERATORS.get(str) != null) {
                int intermediateResult =  OPERATORS.get(str).applyAsInt(stack.removeFirst(),
                        stack.removeFirst());
                stack.addFirst(intermediateResult);
            } else {
                stack.addFirst(Integer.valueOf(str));
            }
        }
        return stack.removeFirst();
    }

}
