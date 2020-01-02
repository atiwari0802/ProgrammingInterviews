package binary.tree;

import binary.trees.Node;
import binary.trees.SymmetricTree;
import binary.trees.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    private SymmetricTree symmetricTree;
    private Tree tree;

    @BeforeEach
    public void setup() {
        symmetricTree = new SymmetricTree();

        tree = new Tree();
        tree.insertNodeBst(1);
        tree.getRoot().leftChild = new Node(2);
        tree.getRoot().rightChild = new Node(2);
        tree.getRoot().leftChild.leftChild = new Node(3);
        tree.getRoot().leftChild.rightChild = new Node(4);
        tree.getRoot().rightChild.leftChild = new Node(4);
        tree.getRoot().rightChild.rightChild = new Node(3);
    }

    @Test
    public void testIfSymmetric() {

        Assertions.assertTrue(
                symmetricTree.isSymmetric(tree.getRoot().leftChild,
                        tree.getRoot().rightChild));
    }
}
