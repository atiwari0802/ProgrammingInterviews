package binary.tree;

import binary.trees.HasPathSum;
import binary.trees.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HasPathSumTest {

    private HasPathSum hasPathSum;
    private Tree tree;

    @BeforeEach
    public void setup() {
        hasPathSum = new HasPathSum();
        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(8);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);
    }

    @Test
    public void testHasPathSum() {

        Assertions.assertTrue(hasPathSum.hasPathSum(tree.getRoot(), 24));
    }
}
