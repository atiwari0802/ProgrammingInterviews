package binary.tree;

import binary.trees.KthNodeBinaryTree;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KthNodeBinaryTreeTest {

    private KthNodeBinaryTree kthNodeBinaryTree;
    private Tree tree;

    @BeforeEach
    public void setup() {
        kthNodeBinaryTree = new KthNodeBinaryTree();

        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(8);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);
    }

    @Test
    public void testFindKthNode() {
        Node kthNode = kthNodeBinaryTree.findKthNode(tree.getRoot(), 2);

        Assertions.assertEquals(8, kthNode.data);
    }
}
