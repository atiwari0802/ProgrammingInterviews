package binary.tree;

import binary.trees.BreadthFirstSearch;
import binary.trees.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BreadthFirstSearchTest {

    private BreadthFirstSearch breadthFirstSearch;
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
    public void testBreadthFirstSearch() {

        tree.breadthFirstSearch(tree.getRoot());
    }
}
