package linked.list;

import linked.lists.EvenOddMerge;
import linked.lists.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenOddMergeTest {

    private EvenOddMerge evenOddMerge;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {

        evenOddMerge = new EvenOddMerge();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testEvenOddMerge() {

        ListNode<Integer> head = evenOddMerge.evenOddMerge(list);

        while (head != null) {
            System.out.printf( " %s -> ", head.data);
            head = head.next;
        }
    }
}
