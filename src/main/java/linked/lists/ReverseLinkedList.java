package linked.lists;

public class ReverseLinkedList {

    public ListNode<Integer> reverseEntireList(ListNode<Integer> list) {

        ListNode<Integer> dummyHead = new ListNode<>(0, list);

        while (list.next != null) {
            ListNode<Integer> temp = list.next;
            list.next = temp.next;
            temp.next = dummyHead.next;
            dummyHead.next = temp;
        }

        return dummyHead.next;
    }

    public ListNode<Integer> reverseSublist(ListNode<Integer> list, int startIndex,
                                            int endIndex) {

        ListNode<Integer> dummyHead = new ListNode<>(0, list);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 1;

        while (k++ < startIndex) {
            sublistHead = sublistHead.next;
        }

        ListNode<Integer> sublistIterator = sublistHead.next;

        while (startIndex++ < endIndex) {
            ListNode<Integer> temp = sublistIterator.next;
            sublistIterator.next = temp.next;
            temp.next = sublistHead.next;
            sublistHead.next = temp;
        }
        return dummyHead.next;
    }

}
