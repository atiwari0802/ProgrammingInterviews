package graphs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch {

    public <T> List<Node<T>> depthFirstSearchIterative(Graph<T> graph) {
        Deque<Node<T>> stack = new ArrayDeque<>();
        stack.addLast(graph.getSource());
        List<Node<T>> depthFirstSearch = new LinkedList<>();

        while (!stack.isEmpty()) {
            Node<T> currentNode = stack.removeLast();
            currentNode.setVisited(true);
            depthFirstSearch.add(currentNode);

            for (Node<T> node : currentNode.getAdjacencyList()) {
                if (!node.isVisited()){
                    stack.addLast(node);
                }
            }
        }

        return depthFirstSearch;
    }

    public <T> List<Node<T>> depthFirstSearchRecursive(Graph<T> graph) {
        List<Node<T>> dfs = new LinkedList<>();
        depthFirstSearchRecursiveHelper(graph.getSource(), dfs);

        return dfs;
    }

    private <T> void depthFirstSearchRecursiveHelper(Node<T> source, List<Node<T>> dfs) {
        source.setVisited(true);
        dfs.add(source);

        for (Node<T> node : source.getAdjacencyList()) {
            if (!node.isVisited()) {
                depthFirstSearchRecursiveHelper(node, dfs);
            }
        }
    }
}
