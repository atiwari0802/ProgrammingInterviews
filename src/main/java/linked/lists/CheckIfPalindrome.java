package linked.lists;

public class CheckIfPalindrome {

    public boolean isPalindrome(ListNode<Integer> list) {

        ListNode<Integer> slow = list, fast = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode<Integer> firstHalfIter = list, secondHalfIter = null;
        int length = getLength(list);

        if (length % 2 == 0) {
            secondHalfIter = reverseList(slow);
        } else {
            secondHalfIter = reverseList(slow.next);
        }

        while (firstHalfIter != null && secondHalfIter != null) {

            if (!firstHalfIter.data.equals(secondHalfIter.data)) {
                return false;
            }
            firstHalfIter = firstHalfIter.next;
            secondHalfIter = secondHalfIter.next;
        }
        return true;
    }

    private ListNode<Integer> reverseList(ListNode<Integer> list) {

        ListNode<Integer> dummyHead = new ListNode<>(0, list);

        while (list.next != null) {
            ListNode<Integer> temp = list.next;
            list.next = temp.next;
            temp.next = dummyHead.next;
            dummyHead.next = temp;
        }

        return dummyHead.next;
    }

    private int getLength(ListNode<Integer> list) {

        int counter = 1;
        while (list != null) {
            counter++;
            list = list.next;
        }
        return counter;
    }
}
