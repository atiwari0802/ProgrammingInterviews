package linked.lists;

public class RemoveDuplicatesFromSortedList {

    public ListNode<Integer> removeDuplicates(ListNode<Integer> head) {

        ListNode<Integer> iterator = head;
        ListNode<Integer> nextDistinct = null;

        while (iterator != null) {
            nextDistinct = iterator.next;
            while (nextDistinct != null && nextDistinct.data == iterator.data) {
                nextDistinct = nextDistinct.next;
            }
            iterator.next = nextDistinct;
            iterator = nextDistinct;
        }

        return head;
    }
}
