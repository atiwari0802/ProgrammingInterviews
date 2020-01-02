package binary.tree;

import binary.trees.ConstructTreeFromTraversals;
import binary.trees.Node;
import binary.trees.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConstructTreeFromTraversalsTest {

    private ConstructTreeFromTraversals constructTreeFromTraversals;
    private Tree tree;

    @BeforeEach
    public void setup() {
        constructTreeFromTraversals = new ConstructTreeFromTraversals();
        Node node = new Node(1);
        node.leftChild = new Node(2);
        node.leftChild.leftChild = new Node(3);
        node.leftChild.rightChild = new Node(4);
        node.rightChild = new Node(5);
        node.rightChild.rightChild = new Node(6);
    }

    @Test
    public void constructTreeTest() {

        List<Integer> preOrder = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> inorder = List.of(3, 2, 4, 1, 5, 6);

        Node root = constructTreeFromTraversals.constructFromPreorderAndInorder(preOrder, inorder);

        Tree tree = new Tree();
        tree.root = root;

        tree.inOrderTraversal(tree.getRoot());
    }

    @Test
    public void testPostAndInorderTraversal() {

        List<Integer> inorder = List.of(3, 2, 4, 1, 5, 6);
        List<Integer> postOrder = List.of(3, 4, 2, 6, 5, 1);

        Node root = constructTreeFromTraversals.constructFromInOrderAndPostOrder(postOrder, inorder);

        Tree tree = new Tree();
        tree.root = root;

        tree.inOrderTraversal(tree.getRoot());


    }
}
