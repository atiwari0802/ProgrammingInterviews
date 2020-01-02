package binary.trees;

public class InorderSuccessor {

    public Node findInorderSuccessor(Node root) {

        Node iter = root;

        if (iter.rightChild != null) {
            iter = root.rightChild;
            while (iter.leftChild != null) {
                iter = iter.leftChild;
            }
            return iter;
        }

        while (iter.parent != null && iter.parent.rightChild == iter) {
            iter = iter.parent;

        }

        return iter.parent;
    }
}
