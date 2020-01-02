package linked.list;

import linked.lists.CheckIfPalindrome;
import linked.lists.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckIfPalindromeTest {

    private CheckIfPalindrome checkIfPalindrome;

    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {
        checkIfPalindrome = new CheckIfPalindrome();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(1, null));
        list.insertAfter(list, new ListNode<>(2, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testPalindromicity() {

        boolean result = checkIfPalindrome.isPalindrome(list);

        Assertions.assertTrue(result);
    }
}
