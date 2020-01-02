package binary.trees;

public class LowestCommonAncestorBinaryTree {

    public Status findLowestCommonAncestor(Node root, Node node1, Node node2) {

        if (root == null) {
            return new Status(0, null);
        }

        Status leftSubTree = findLowestCommonAncestor(root.leftChild, node1, node2);
        if (leftSubTree.numberOfTargetNodes == 2) {
            return leftSubTree;
        }

        Status rightSubTree = findLowestCommonAncestor(root.rightChild, node1, node2);
        if (rightSubTree.numberOfTargetNodes == 2) {
            return rightSubTree;
        }

        int numberOfTargets = leftSubTree.numberOfTargetNodes + rightSubTree.numberOfTargetNodes
                + (root.data == node1.data ? 1 : 0) + (root.data == node2.data ? 1 : 0);

        return new Status(numberOfTargets, numberOfTargets == 2 ? root : null);
    }

    public class Status {
        int numberOfTargetNodes;
        public Node ancestor;

        public Status(int numberOfTargetNodes, Node ancestor) {
            this.numberOfTargetNodes = numberOfTargetNodes;
            this.ancestor = ancestor;
        }
    }
}

