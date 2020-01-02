package linked.list;

import linked.lists.AddListBasedIntegers;
import linked.lists.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddListBasedIntegerTest {

    private AddListBasedIntegers addListBasedInteger;

    private ListNode<Integer> listNodeOne;

    private ListNode<Integer> listNodeTwo;

    @BeforeEach
    public void setup() {
        addListBasedInteger = new AddListBasedIntegers();

        listNodeOne = new ListNode<>(3, null);
        listNodeOne.insertAfter(listNodeOne, new ListNode<>(1, null));
        listNodeOne.insertAfter(listNodeOne, new ListNode<>(4, null));

        listNodeTwo = new ListNode<>(7, null);
        listNodeTwo.insertAfter(listNodeTwo, new ListNode<>(0, null));
        listNodeTwo.insertAfter(listNodeTwo, new ListNode<>(9, null));
    }

    @Test
    public void testAddListBasedIntegers() {

        ListNode<Integer> sum = addListBasedInteger.addTwoIntegers(listNodeOne, listNodeTwo);

        while (sum != null) {
            System.out.printf(" %s ->", sum.data);
            sum = sum.next;
        }

    }
}
