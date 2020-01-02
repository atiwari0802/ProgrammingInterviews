package linked.list;

import linked.lists.DeleteNodeFromLinkedList;
import linked.lists.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeleteNodeFromLinkedListTest {

    private DeleteNodeFromLinkedList deleteNodeFromLinkedList;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {
        deleteNodeFromLinkedList = new DeleteNodeFromLinkedList();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testDeleteNode() {

        deleteNodeFromLinkedList.deleteNode(list);

        while (list != null) {
            System.out.printf(" %s ->", list.data);
            list = list.next;
        }
    }

}
