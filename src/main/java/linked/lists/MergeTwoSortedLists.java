package linked.lists;

public class MergeTwoSortedLists {

    public ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> listOne,
                                                 ListNode<Integer> listTwo) {

        ListNode<Integer> dummyHead = new ListNode<>(0, null);
        ListNode<Integer> current = dummyHead;

        while(listOne != null && listTwo != null) {
            if (listOne.getData() <= listTwo.getData()) {
                current.next = listOne;
                listOne = listOne.next;
            }else {
                current.next = listTwo;
                listTwo = listTwo.next;
            }
            current = current.next;
        }

        current.next = listOne == null? listTwo: listOne;

        return dummyHead.next;
    }

}
