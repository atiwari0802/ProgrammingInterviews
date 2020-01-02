package binary.trees;

public class HasPathSum {

    public boolean hasPathSum(Node root, int desiredSum) {

        if (root == null) {
            return false;
        }

        if (root.leftChild == null && root.rightChild == null) {
            return (desiredSum - root.data == 0);
        }

        return hasPathSum(root.leftChild, desiredSum - root.data)
                || hasPathSum(root.rightChild, desiredSum - root.data);

    }
}
