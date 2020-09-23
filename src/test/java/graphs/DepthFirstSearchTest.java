package graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DepthFirstSearchTest {

    private Graph<Integer> graph;

    private DepthFirstSearch depthFirstSearch;

    @BeforeEach
    public void setup() {
        depthFirstSearch = new DepthFirstSearch();

        Node<Integer> node_40 = new Node<>(40);
        Node<Integer> node_20 = new Node<>(20);
        Node<Integer> node_50 = new Node<>(50);
        Node<Integer> node_70 = new Node<>(70);
        Node<Integer> node_60 = new Node<>(60);
        Node<Integer> node_30 = new Node<>(30);
        Node<Integer> node_10 = new Node<>(10);

        node_40.setAdjacencyList(Arrays.asList(node_20));
        node_20.setAdjacencyList(Arrays.asList(node_50, node_60, node_30, node_10));
        node_50.setAdjacencyList(Arrays.asList(node_70));

        graph = new Graph<>(7, node_40);
    }

    @Test
    public void testDepthFirstSearch() {
        List<Node<Integer>> dfs = depthFirstSearch.depthFirstSearchIterative(graph);

        dfs.forEach(node -> System.out.printf(" %d -> ",node.getValue()));
    }

    @Test
    public void testDepthFirstSearchRecursive() {
        List<Node<Integer>> dfs = depthFirstSearch.depthFirstSearchRecursive(graph);

        dfs.forEach(node -> System.out.printf(" %d ->", node.getValue()));
    }
}
