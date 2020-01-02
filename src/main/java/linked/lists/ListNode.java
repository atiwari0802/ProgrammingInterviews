package linked.lists;

public class ListNode<T> {

    public T data;

    public ListNode<T> next;

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void insertAfter(ListNode<T> node, ListNode<T> newNode) {
        newNode.next = node.next;
        node.next = newNode;
    }
}
