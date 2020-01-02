package linked.list;

import linked.lists.DetectCycle;
import linked.lists.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DetectCycleTest {

    private DetectCycle detectCycle;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {

        detectCycle = new DetectCycle();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));

        ListNode<Integer> iterator = list;
        while (iterator.next != null) {
            iterator = iterator.next;
        }

        iterator.next = list;
    }

    @Test
    public void testDetectCycle() {

        ListNode<Integer> cycleStartNode = detectCycle.detectCycle(list);

        Assertions.assertNotNull(cycleStartNode);

        System.out.println(cycleStartNode.getData());
    }

}
