package binary.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InOrderTraversalWithoutRecursion {

    public List<Node> performInOrderTraversal(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        List<Node> inOrderTraversal = new ArrayList<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.addFirst(current);
                current = current.leftChild;
            } else {
                current = stack.removeFirst();
                inOrderTraversal.add(current);
                current = current.rightChild;
            }
        }
        return inOrderTraversal;
    }

}
