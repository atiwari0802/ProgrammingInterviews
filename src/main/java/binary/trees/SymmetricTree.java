package binary.trees;

public class SymmetricTree {

    public boolean isSymmetric(Node leftSubTree, Node rightSubTree) {

        if (leftSubTree == null && rightSubTree == null) {
            return true;
        }
        if (leftSubTree == null ^ rightSubTree == null) {
            return false;
        }
        return (leftSubTree.data == rightSubTree.data &&
                isSymmetric(leftSubTree.leftChild, rightSubTree.rightChild)
                && isSymmetric(leftSubTree.rightChild, rightSubTree.leftChild));
    }
}
