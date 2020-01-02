package linked.list;

import linked.lists.ListNode;
import linked.lists.ListPivoting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListPivotingTest {

    private ListPivoting listPivoting;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {
        listPivoting = new ListPivoting();

        list = new ListNode<>(3, null);
        list.insertAfter(list, new ListNode<>(7, null));
        list.insertAfter(list, new ListNode<>(11, null));
        list.insertAfter(list, new ListNode<>(10, null));
        list.insertAfter(list, new ListNode<>(2, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testListPivoting() {

        ListNode<Integer> head = listPivoting.listPivoting(list, 7);

        while (head != null) {
            System.out.printf(" %s ->", head.data);
            head = head.next;
        }
    }
}
