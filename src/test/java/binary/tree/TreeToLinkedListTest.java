package binary.tree;

import binary.trees.Tree;
import binary.trees.TreeToLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TreeToLinkedListTest {

    private TreeToLinkedList treeToLinkedList;
    private Tree tree;

    @BeforeEach
    public  void setup() {
        treeToLinkedList = new TreeToLinkedList();
        tree = new Tree();
        tree.insertNodeBst(10);
        tree.insertNodeBst(5);
        tree.insertNodeBst(4);
        tree.insertNodeBst(6);
        tree.insertNodeBst(15);
    }

    @Test
    public void testTreeToLinkedList() {

        List<Integer> list = treeToLinkedList.treeLeavesToLinkedList(tree.getRoot());

        list.forEach(System.out::println);
    }
}
