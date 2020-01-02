package linked.lists;

public class OverlappingLists {

    public ListNode<Integer> noCycleOverlappingLists(ListNode<Integer> listOne,
                                                     ListNode<Integer> listTwo) {
        int lengthOfListOne = length(listOne);
        int lengthOfListTwo = length(listTwo);

        if (lengthOfListOne > lengthOfListTwo) {
            listOne = advanceList(listOne, lengthOfListOne - lengthOfListTwo);
        } else {
            listTwo = advanceList(listTwo, lengthOfListTwo - lengthOfListOne);
        }

        while (listOne != null && listTwo != null && listOne != listTwo) {
            listOne = listOne.next;
            listTwo = listTwo.next;
        }

        return listOne;
    }

    private ListNode<Integer> advanceList(ListNode<Integer> listNode, int length) {

        while (length-- > 0) {
            listNode = listNode.next;
        }

        return listNode;
    }

    private int length(ListNode<Integer> listNode) {

        int length = 0;
        while (listNode != null) {
            length++;
            listNode = listNode.next;
        }
        return length;
    }
}
