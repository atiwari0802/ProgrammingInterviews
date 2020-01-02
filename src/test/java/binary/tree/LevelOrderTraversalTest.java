package binary.tree;

import binary.trees.LevelOrderTraversal;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LevelOrderTraversalTest {

    private LevelOrderTraversal levelOrderTraversal;
    private Tree tree;

    @BeforeEach
    public void setup() {
        levelOrderTraversal = new LevelOrderTraversal();
        tree = new Tree();
        tree.insertNodeBst(1);
        tree.getRoot().leftChild = new Node(2);
        tree.getRoot().rightChild = new Node(3);
        tree.getRoot().leftChild.leftChild = new Node(4);
        tree.getRoot().leftChild.rightChild = new Node(5);
        tree.getRoot().rightChild.leftChild = new Node(6);
        tree.getRoot().rightChild.rightChild = new Node(7);
    }

    @Test
    public void testLevelOrderTraversal() {

        Map<Integer, List<Node>> levelOrderedNodes =
                levelOrderTraversal.levelOrderTraversal(tree.getRoot());

        levelOrderedNodes.forEach((k, v) -> System.out.printf(" %s --> %s%n", k,
                v));
    }
}
