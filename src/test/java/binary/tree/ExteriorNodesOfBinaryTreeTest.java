package binary.tree;

import binary.trees.ExteriorNodesOfBinaryTree;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExteriorNodesOfBinaryTreeTest {

    private ExteriorNodesOfBinaryTree exteriorNodesOfBinaryTree;
    private Tree tree;

    @BeforeEach
    public void setup() {
        exteriorNodesOfBinaryTree = new ExteriorNodesOfBinaryTree();

        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(5);
        tree.insertNodeBst(4);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);

    }

    @Test
    public void testExteriorNodes() {
        List<Node> nodeList = exteriorNodesOfBinaryTree.exteriorNodes(tree.getRoot());

        nodeList.forEach(node -> System.out.println(node.data));
    }
}
