package graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BreadthFirstSearchTest {

    private Graph<String> graph;

    private BreadthFirstSearch breadthFirstSearch;

    @BeforeEach
    public void setup() {
        Node<String> node_R = new Node<>("R");
        Node<String> node_V = new Node<>("V");
        Node<String> node_S = new Node<>("S");
        Node<String> node_W = new Node<>("W");
        Node<String> node_T = new Node<>("T");
        Node<String> node_X = new Node<>("X");
        Node<String> node_U = new Node<>("U");
        Node<String> node_Y = new Node<>("Y");

        node_S.setAdjacencyList(Arrays.asList(node_R, node_W));
        node_R.setAdjacencyList(Arrays.asList(node_V));
        node_W.setAdjacencyList(Arrays.asList(node_T, node_X));
        node_T.setAdjacencyList(Arrays.asList(node_X, node_U));
        node_X.setAdjacencyList(Arrays.asList(node_T, node_Y, node_W));
        node_U.setAdjacencyList(Arrays.asList(node_T, node_Y));
        node_Y.setAdjacencyList(Arrays.asList(node_U, node_X));

        graph = new Graph<>(8, node_S);

        breadthFirstSearch = new BreadthFirstSearch();
    }

    @Test
    public void testBFS() {
        List<Node<String>> bfsTraversal = breadthFirstSearch.breadthFirstSearch(graph);

        bfsTraversal.forEach(node -> System.out.printf(" %s -> ", node.getValue()));
    }
}
