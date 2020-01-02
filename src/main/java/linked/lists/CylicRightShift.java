package linked.lists;

public class CylicRightShift {

    public ListNode<Integer> cyclicRightShift(ListNode<Integer> head, int k) {

        ListNode<Integer> tail = head;
        int n = 1;

        while(tail.next != null) {
            tail = tail.next;
            n++;
        }

        tail.next = head;
        int stepsToJump = n - k;

        while (stepsToJump-- > 0) {
            tail = tail.next;
        }

        ListNode<Integer> newHead = tail.next;
        tail.next = null;

        return newHead;
    }
}
