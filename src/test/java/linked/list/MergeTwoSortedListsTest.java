package linked.list;

import linked.lists.ListNode;
import linked.lists.MergeTwoSortedLists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    private ListNode<Integer> listOne;

    private ListNode<Integer> listTwo;

    @BeforeEach
    public void setup() {

        mergeTwoSortedLists = new MergeTwoSortedLists();

        listOne = new ListNode<>(1, null);
        listOne.insertAfter(listOne, new ListNode<>(5, null));
        listOne.insertAfter(listOne, new ListNode<>(3, null));

        listTwo = new ListNode<>(2, null);
        listTwo.insertAfter(listTwo, new ListNode<>(8, null));
        listTwo.insertAfter(listTwo, new ListNode<>(6, null));
        listTwo.insertAfter(listTwo, new ListNode<>(4, null));
    }

    @Test
    public void testMerge() {

        ListNode<Integer> head = mergeTwoSortedLists.mergeTwoSortedLists(listOne, listTwo);

        while(head != null) {
            System.out.printf("%s -> ", head.getData());
            head = head.next;
        }

    }
}
