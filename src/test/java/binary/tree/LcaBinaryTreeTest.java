package binary.tree;

import binary.trees.LowestCommonAncestorBinaryTree;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LcaBinaryTreeTest {

    private LowestCommonAncestorBinaryTree lowestCommonAncestorBinaryTree;

    private Tree tree;

    @BeforeEach
    public void setup() {
        lowestCommonAncestorBinaryTree = new LowestCommonAncestorBinaryTree();
        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(5);
        tree.insertNodeBst(4);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);
    }

    @Test
    public void testLowestCommonAncestor() {
        LowestCommonAncestorBinaryTree.Status status = lowestCommonAncestorBinaryTree
                .findLowestCommonAncestor(tree.getRoot(),
                        new Node(6), new Node(15));

        Assertions.assertEquals(10, status.ancestor.data);
    }
}
