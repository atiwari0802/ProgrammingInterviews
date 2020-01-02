package linked.lists;

public class DeleteKThNodeFromLast {

    public ListNode<Integer> removeKThLastNode(ListNode<Integer> list, int k) {

        ListNode<Integer> dummyHead = new ListNode<>(0, list);
        ListNode<Integer> aheadPointer = list;
        ListNode<Integer> behindPointer = dummyHead;

        while (k-- > 0) {
            aheadPointer = aheadPointer.next;
        }

        while (aheadPointer != null) {
            aheadPointer = aheadPointer.next;
            behindPointer = behindPointer.next;
        }

        behindPointer.next = behindPointer.next.next;

        return dummyHead.next;
    }
}
