package linked.lists;

public class ListPivoting {

    public ListNode<Integer> listPivoting(ListNode<Integer> list, int pivot) {

        ListNode<Integer> lessThanHead = new ListNode<>(0, null);
        ListNode<Integer> equalToHead = new ListNode<>(0, null);
        ListNode<Integer> greaterThanHead = new ListNode<>(0, null);

        ListNode<Integer> lessIterator = lessThanHead;
        ListNode<Integer> equalToIterator = equalToHead;
        ListNode<Integer> greaterThanIterator = greaterThanHead;
        ListNode<Integer> iterator = list;

        while (iterator != null) {
            if (iterator.data < pivot) {
                lessIterator.next = iterator;
                lessIterator = iterator;
            } else if (iterator.data.equals(pivot)) {
                equalToIterator.next = iterator;
                equalToIterator = iterator;
            } else {
                greaterThanIterator.next = iterator;
                greaterThanIterator = iterator;
            }
            iterator = iterator.next;
        }

        greaterThanIterator.next = null;
        equalToIterator.next = greaterThanHead.next;
        lessIterator.next = equalToHead.next;

        return lessThanHead.next;
    }

}
