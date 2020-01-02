package binary.trees;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConstructTreeFromTraversals {

    public Node constructFromPreorderAndInorder(List<Integer> preorder,
                                                List<Integer> inorder) {

        return constructFromPreOrderAndInorderHelper(preorder, 0, preorder.size(),
                0, inorder.size(),
                IntStream
                        .range(0, inorder.size())
                        .boxed()
                        .collect(Collectors.toMap(inorder::get, i -> i)));

    }

    private Node constructFromPreOrderAndInorderHelper(List<Integer> preOrder,
                                                       int preOrderStart, int preOrderEnd,
                                                       int inorderStart, int inorderEnd,
                                                       Map<Integer, Integer> inorderNodeIndex) {

        if (preOrderEnd <= preOrderStart || inorderEnd <= inorderStart) {
            return null;
        }

        int rootIndex = inorderNodeIndex.get(preOrder.get(preOrderStart));
        int leftSubtreeSize = rootIndex - inorderStart;

        Node node = new Node(preOrder.get(preOrderStart));
        node.leftChild =
                constructFromPreOrderAndInorderHelper(preOrder, preOrderStart + 1,
                        preOrderStart + 1 + leftSubtreeSize,
                        inorderStart, rootIndex, inorderNodeIndex);
        node.rightChild = constructFromPreOrderAndInorderHelper(preOrder,
                preOrderStart + 1 + leftSubtreeSize, preOrderEnd,
                rootIndex + 1, inorderEnd, inorderNodeIndex);

        return node;
    }

    public Node constructFromInOrderAndPostOrder(List<Integer> postOrder,
                                                 List<Integer> inorder) {
        return constructFromInOrderAndPostOrderHelper(postOrder, 0,
                postOrder.size(), 0, inorder.size(),
                IntStream.range(0, inorder.size())
                        .boxed()
                        .collect(Collectors.toMap(inorder::get, i -> i)));
    }

    private Node constructFromInOrderAndPostOrderHelper(List<Integer> postOrder,
                                                        int postOrderStart, int postOrderEnd,
                                                        int inOrderStart, int inOrderEnd,
                                                        Map<Integer, Integer> inorderNodeIndex) {
        if (postOrderStart >= postOrderEnd || inOrderStart >= inOrderEnd) {
            return null;
        }

        int rootIndex = inorderNodeIndex.get(postOrder.get(postOrderEnd - 1));
        int leftSubtreeSize = rootIndex - inOrderStart;

        Node node = new Node(postOrder.get(postOrderEnd - 1));
        node.leftChild = constructFromInOrderAndPostOrderHelper(postOrder,
                postOrderStart, postOrderStart + leftSubtreeSize,
                inOrderStart, rootIndex, inorderNodeIndex);
        node.rightChild = constructFromInOrderAndPostOrderHelper(postOrder,
                postOrderStart + leftSubtreeSize,
                postOrderEnd - 1,
                rootIndex + 1,
                inOrderEnd
                , inorderNodeIndex);

        return node;
    }

}
