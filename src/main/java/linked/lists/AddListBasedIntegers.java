package linked.lists;

public class AddListBasedIntegers {

    public ListNode<Integer> addTwoIntegers(ListNode<Integer> listOne, ListNode<Integer> listTwo) {

        ListNode<Integer> dummyHead = new ListNode<>(0, null);
        ListNode<Integer> iterator = dummyHead;
        int carry = 0;

        while (listOne != null || listTwo != null || carry != 0) {
            int sum = carry + (listOne != null ? listOne.data : 0) +
                    (listTwo != null ? listTwo.data : 0);

            ListNode<Integer> newNode = new ListNode<>(sum % 10, null);
            iterator.next = newNode;
            iterator = newNode;
            listOne = listOne!= null? listOne.next : null;
            listTwo = listTwo!= null? listTwo.next : null;

            carry = sum / 10;
        }

        return dummyHead.next;
    }
}
