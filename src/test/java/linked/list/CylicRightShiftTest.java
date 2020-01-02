package linked.list;

import linked.lists.CylicRightShift;
import linked.lists.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CylicRightShiftTest {

    private CylicRightShift cylicRightShift;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {
        cylicRightShift = new CylicRightShift();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testCyclicShift() {

        ListNode<Integer> head = cylicRightShift.cyclicRightShift(list, 2);

        while (head != null) {
            System.out.printf(" %s -> ", head.data);
            head = head.next;
        }
    }
}
