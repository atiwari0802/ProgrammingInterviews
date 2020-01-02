package binary.tree;

import binary.trees.InOrderTraversalWithoutRecursion;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InOrderTraversalWithoutRecursionTest {

    private InOrderTraversalWithoutRecursion inOrderTraversalWithoutRecursion;
    private Tree tree;

    @BeforeEach
    public void setup() {
        inOrderTraversalWithoutRecursion = new InOrderTraversalWithoutRecursion();
        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(8);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);

    }

    @Test
    public void testInorderTraversal() {
        List<Node> inOrder = inOrderTraversalWithoutRecursion.performInOrderTraversal(tree.getRoot());

        inOrder.forEach( node -> System.out.printf("%s ", node.data));
    }
}
