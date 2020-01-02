package linked.list;

import linked.lists.DeleteKThNodeFromLast;
import linked.lists.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeleteKThNodeFromLastTest {

    private DeleteKThNodeFromLast deleteKThNodeFromLast;
    private ListNode<Integer> list;

    @BeforeEach
    public void setup() {
        deleteKThNodeFromLast = new DeleteKThNodeFromLast();

        list = new ListNode<>(1, null);
        list.insertAfter(list, new ListNode<>(5, null));
        list.insertAfter(list, new ListNode<>(4, null));
        list.insertAfter(list, new ListNode<>(3, null));
        list.insertAfter(list, new ListNode<>(2, null));
    }

    @Test
    public void testDeleteKThNode() {

        list = deleteKThNodeFromLast.removeKThLastNode(list, 2);

        while (list != null) {
            System.out.printf(" %s ->", list.data);
            list = list.next;
        }
    }

}
