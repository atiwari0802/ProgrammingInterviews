package binary.tree;

import binary.trees.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeTest {

    private Tree tree;

    @BeforeEach
    public  void setup() {
        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(5);
        tree.insertNodeBst(4);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);
    }

    @Test
    public void testInOrderTraversal() {

        tree.inOrderTraversal(tree.getRoot());
    }

    @Test
    public void testPreOrderTraversal() {

        tree.preOrderTraversal(tree.getRoot());
    }

    @Test
    public void testPostOrderTraversal() {

        tree.postOrderTraversal(tree.getRoot());
    }

    @Test
    public void testBreadthFirstSearch() {

        tree.breadthFirstSearch(tree.getRoot());
    }


}
