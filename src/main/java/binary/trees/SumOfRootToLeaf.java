package binary.trees;

public class SumOfRootToLeaf {

    public int sumRootToLeaf(Node root) {
        return sumRootToLeafHelper(root);
    }

    private int sumRootToLeafHelper(Node root) {

        if (root == null) {
            return 0;
        }

        return root.data + sumRootToLeafHelper(root.leftChild)
                + sumRootToLeafHelper(root.rightChild);
    }
}

