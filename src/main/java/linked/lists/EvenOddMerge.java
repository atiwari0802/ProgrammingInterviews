package linked.lists;

import java.util.List;

public class EvenOddMerge {

    public ListNode<Integer> evenOddMerge(ListNode<Integer> head) {

        ListNode<Integer> evenHead = head;
        ListNode<Integer> oddHead = head.next;

        ListNode<Integer> iterator = head.next != null ? head.next.next: null;
        int turn = 0;
        ListNode<Integer> even = evenHead;
        ListNode<Integer> odd = oddHead;

        while (iterator != null) {
            if (turn == 0) {
                even.next = iterator;
                even = iterator;
            }else {
                odd.next = iterator;
                odd = iterator;
            }
            turn = turn ^ 1;
            iterator = iterator.next;
        }

        odd.next = null;
        even.next = oddHead;

        return evenHead;
    }
}
