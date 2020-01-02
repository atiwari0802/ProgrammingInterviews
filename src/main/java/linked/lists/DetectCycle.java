package linked.lists;

public class DetectCycle {

    public ListNode<Integer> detectCycle(ListNode<Integer> head) {

        ListNode<Integer> slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int cycleLength = 0;
                do {
                    fast = fast.next;
                    cycleLength++;
                } while (slow != fast);

                ListNode<Integer> forward = head, back = head;

                while (cycleLength-- > 0) {
                    forward = forward.next;
                }

                while (forward != back) {
                    forward = forward.next;
                    back = back.next;
                }
                return forward;
            }
        }
        return null;
    }
}
