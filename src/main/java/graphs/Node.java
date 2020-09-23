package graphs;

import java.util.List;
import java.util.Collections;

public class Node<T> {

    private T value;

    private List<Node<T>> adjacencyList;

    private boolean isVisited;

    public Node(T value) {
        this.value = value;
        this.adjacencyList = Collections.emptyList();
    }

    public Node(T value, List<Node<T>> adjacencyList, boolean isVisited) {
        this.value = value;
        this.adjacencyList = adjacencyList;
        this.isVisited = isVisited;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Node<T>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Node<T>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
