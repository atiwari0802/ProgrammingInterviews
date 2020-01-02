package linked.lists;

public class DeleteNodeFromLinkedList {

    public void deleteNode(ListNode<Integer> nodeToBeDeleted) {

        nodeToBeDeleted.data = nodeToBeDeleted.next.data;
        nodeToBeDeleted.next = nodeToBeDeleted.next.next;
    }

}
