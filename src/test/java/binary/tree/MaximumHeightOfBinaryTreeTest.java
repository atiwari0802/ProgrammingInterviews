package binary.tree;

import binary.trees.MaximumHeightOfBinaryTree;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumHeightOfBinaryTreeTest {

    private MaximumHeightOfBinaryTree maximumHeightOfBinaryTree;
    private Tree tree;

    @BeforeEach
    public void setup() {
        maximumHeightOfBinaryTree = new MaximumHeightOfBinaryTree();
        tree = new Tree();
        tree.insertNodeBst(1);
        tree.getRoot().leftChild = new Node(2);
        tree.getRoot().rightChild = new Node(3);
        tree.getRoot().leftChild.leftChild = new Node(4);
        tree.getRoot().leftChild.leftChild.leftChild = new Node(5);

    }

    @Test
    public void testMaxHeight() {

        int maxHeight = maximumHeightOfBinaryTree.maximumHeightOfBT(tree.getRoot());

        Assertions.assertEquals(4, maxHeight);
    }
}
