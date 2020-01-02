package binary.trees;

public class MaximumHeightOfBinaryTree {

    public int maximumHeightOfBT(Node root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maximumHeightOfBT(root.leftChild),
                maximumHeightOfBT(root.rightChild));
    }
}
