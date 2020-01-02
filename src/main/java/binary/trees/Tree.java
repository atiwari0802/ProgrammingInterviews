package binary.trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tree {

    public Node root;

    public Node findNode(int data) {
        return null;
    }

    public void insertNodeBst(int data) {

        Node newNode = new Node(data);

        if (this.root == null) {
            this.root = newNode;
        } else {
            Node current = this.root;
            Node parent;

            while (true) {
                if (current.data >= data) {
                    parent = current;
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = new Node(data);
                        return;
                    }
                } else {
                    parent = current;
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = new Node(data);
                        return;
                    }
                }
            }
        }
    }


    public void inOrderTraversal(Node node) {

        if (node != null) {
            inOrderTraversal(node.leftChild);
            System.out.printf("  %s", node.data);
            inOrderTraversal(node.rightChild);
        }

    }

    public void preOrderTraversal(Node node) {

        if (node != null) {
            System.out.printf("  %s", node.data);
            inOrderTraversal(node.leftChild);
            inOrderTraversal(node.rightChild);
        }
    }

    public void postOrderTraversal(Node node) {

        if (node != null) {
            inOrderTraversal(node.leftChild);
            inOrderTraversal(node.rightChild);
            System.out.printf("  %s", node.data);
        }
    }

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

    public Node getRoot() {
        return root;
    }

}
