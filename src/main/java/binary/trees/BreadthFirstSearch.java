package binary.trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class BreadthFirstSearch {

    public void breadthFirstSearch(Node root) {

        Deque<Node> queue = new ArrayDeque<>();
        queue.push(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.pop();

            if (currentNode.leftChild != null) {
                queue.push(currentNode.leftChild);
            }
            if (currentNode.rightChild != null) {
                queue.push(currentNode.rightChild);
            }
            System.out.printf("%s %n", currentNode.data);
        }
    }
}
