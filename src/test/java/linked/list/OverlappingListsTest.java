package linked.list;

import linked.lists.ListNode;
import linked.lists.OverlappingLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OverlappingListsTest {

    private OverlappingLists overlappingLists;

    private ListNode<Integer> listOne;

    private ListNode<Integer> listTwo;

    @BeforeEach
    public void setup() {

        overlappingLists = new OverlappingLists();

        ListNode<Integer> commonNode = new ListNode<>(4, null);
        ListNode<Integer> iterator;

        listOne = new ListNode<>(1, null);
        listOne.insertAfter(listOne, commonNode);
        listOne.insertAfter(listOne, new ListNode<>(3, null));
        listOne.insertAfter(listOne, new ListNode<>(2, null));

        iterator = listOne;
        while (iterator != null) {
            System.out.printf(" %s -> ", iterator.getData());
            iterator = iterator.next;
        }

        System.out.println();

        listTwo = new ListNode<>(0, null);
        listTwo.insertAfter(listTwo, commonNode);

        iterator = listTwo;
        while (iterator != null) {
            System.out.printf(" %s -> ", iterator.getData());
            iterator = iterator.next;
        }

    }

    @Test
    public void testOverlapWithNoCycles() {

        ListNode<Integer> common = overlappingLists.noCycleOverlappingLists(listOne, listTwo);

        Assertions.assertNotNull(common);

        System.out.println("----\n"+common.getData());
    }
}
