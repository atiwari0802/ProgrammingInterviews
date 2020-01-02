package linked.list;

import linked.lists.ListNode;
import linked.lists.ReverseLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {
        reverseLinkedList = new ReverseLinkedList();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testReverseList() {

        ListNode<Integer> head = reverseLinkedList.reverseSublist(list, 2, 4);

        while (head != null) {
            System.out.printf(" %s ->", head.getData());
            head = head.next;
        }
    }

    @Test
    public void testReverseEntireList() {

        ListNode<Integer> head = reverseLinkedList.reverseEntireList(list);

        while (head != null) {
            System.out.printf(" %s ->", head.getData());
            head = head.next;
        }
    }
}
