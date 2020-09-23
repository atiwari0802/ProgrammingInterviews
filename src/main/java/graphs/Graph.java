package graphs;

import java.util.List;

public class Graph<T> {

    private int totalNodes;

    private List<Node<T>> nodes;

    private Node<T> source;

    public Graph(int totalNodes, Node<T> source) {
        this.totalNodes = totalNodes;
        this.source = source;
    }

    public Graph(int totalNodes, List<Node<T>> nodes, Node<T> source) {
        this.totalNodes = totalNodes;
        this.nodes = nodes;
        this.source = source;
    }

    public int getTotalNodes() {
        return totalNodes;
    }

    public void setTotalNodes(int totalNodes) {
        this.totalNodes = totalNodes;
    }

    public List<Node<T>> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node<T>> nodes) {
        this.nodes = nodes;
    }

    public Node<T> getSource() {
        return source;
    }

    public void setSource(Node<T> source) {
        this.source = source;
    }
}
