package binary.trees;

import java.util.LinkedList;
import java.util.List;

public class TreeToLinkedList {

    public List<Integer> treeLeavesToLinkedList(Node root) {

        List<Integer> linkedList = new LinkedList<>();
        treeLeavesToLinkedList(root, linkedList);
        return linkedList;
    }

    private void treeLeavesToLinkedList(Node node, List<Integer> list) {

        if (node == null) {
            return;
        }

        if (node.leftChild == null && node.rightChild == null) {
            list.add(node.data);
        }

        treeLeavesToLinkedList(node.leftChild, list);
        treeLeavesToLinkedList(node.rightChild, list);
    }
}
