package binary.trees;

import java.util.ArrayList;
import java.util.List;

public class ExteriorNodesOfBinaryTree {

    public List<Node> exteriorNodes(Node root) {

        List<Node> exteriorNodes = new ArrayList<>();
        exteriorNodes.add(root);
        addExteriorLeftNodes(root.leftChild, true, exteriorNodes);
        addExteriorRightNodes(root.rightChild, true, exteriorNodes);

        return exteriorNodes;
    }

    private void addExteriorLeftNodes(Node node, boolean isExterior, List<Node> exteriorNodes) {

        if (node == null) {
            return;
        }

        if (isExterior || isLeaf(node)) {
            exteriorNodes.add(node);
        }

        addExteriorLeftNodes(node.leftChild, true, exteriorNodes);
        addExteriorLeftNodes(node.rightChild, isExterior && node.leftChild == null, exteriorNodes);
    }

    private void addExteriorRightNodes(Node node, boolean isExterior, List<Node> exteriorNodes) {

        if (node == null) {
            return;
        }

        addExteriorRightNodes(node.rightChild, true, exteriorNodes);
        addExteriorRightNodes(node.leftChild, isExterior && node.rightChild == null, exteriorNodes);

        if (isExterior || isLeaf(node)) {
            exteriorNodes.add(node);
        }
    }

    private boolean isLeaf(Node node) {

        return node.leftChild == null && node.rightChild == null;

    }
}
