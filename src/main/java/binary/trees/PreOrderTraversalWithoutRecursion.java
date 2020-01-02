package binary.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PreOrderTraversalWithoutRecursion {

    public List<Node> performPreOrderTraversal(Node root) {

        Deque<Node> stack = new ArrayDeque<>();
        List<Node> result = new ArrayList<>();
        stack.addFirst(root);

        while (!stack.isEmpty()) {
            Node current = stack.removeFirst();
            result.add(current);

            if (current.rightChild != null) {
                stack.addFirst(current.rightChild);
            }
            if (current.leftChild != null) {
                stack.addFirst(current.leftChild);
            }
        }
        return result;
    }
}
