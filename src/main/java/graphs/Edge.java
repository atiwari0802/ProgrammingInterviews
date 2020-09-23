package graphs;

public class Edge<T> {

    private Node<T> source;

    private Node<T> destination;

    private int weight;

    public Edge() {
    }

    public Edge(Node<T> source, Node<T> destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Node<T> getSource() {
        return source;
    }

    public void setSource(Node<T> source) {
        this.source = source;
    }

    public Node<T> getDestination() {
        return destination;
    }

    public void setDestination(Node<T> destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
