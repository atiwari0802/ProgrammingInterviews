package binary.tree;

import binary.trees.LowestCommonAncestorBinaryTree;
import binary.trees.SumOfRootToLeaf;
import binary.trees.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumOfRootToLeafTest {

    private SumOfRootToLeaf sumOfRootToLeaf;
    private Tree tree;

    @BeforeEach
    public void setup() {
        sumOfRootToLeaf = new SumOfRootToLeaf();
        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(8);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);
    }

    @Test
    public void testRootToLeafSum() {

        int sum = sumOfRootToLeaf.sumRootToLeaf(tree.getRoot());

        Assertions.assertEquals(39, sum);
    }
}
