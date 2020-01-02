package linked.list;

import linked.lists.ListNode;
import linked.lists.RemoveDuplicatesFromSortedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {

    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    private ListNode<Integer> list = null;

    @BeforeEach
    public void setup() {
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
        list.insertAfter(list, new ListNode<>(2, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testRemoveDuplicates() {

        ListNode<Integer> head = removeDuplicatesFromSortedList.removeDuplicates(list);

        while (head != null) {
            System.out.printf(" %s ->", head.data);
            head = head.next;
        }
    }
}
