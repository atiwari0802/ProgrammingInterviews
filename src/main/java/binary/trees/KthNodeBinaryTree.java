package binary.trees;

public class KthNodeBinaryTree {

    public Node findKthNode(Node root, int k) {

        Node iter = root;

        while (iter != null) {
            int size = findSize(iter.leftChild);
            if (k > size + 1) {
                iter = iter.rightChild;
                k -= (size + 1);
            } else if (k  == size + 1) {
                return iter;
            } else {
                iter = iter.leftChild;
            }
        }
        return null;
    }

    private int findSize(Node node) {

        if (node == null) {
            return 0;
        }

        return 1 + findSize(node.leftChild) + findSize(node.rightChild);
    }
}
