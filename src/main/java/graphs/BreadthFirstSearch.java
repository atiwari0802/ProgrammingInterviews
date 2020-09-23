package graphs;

import java.util.*;


public class BreadthFirstSearch {

    public <T> List<Node<T>> breadthFirstSearch(Graph<T> graph) {
        Deque<Node<T>> queue = new ArrayDeque<>();
        Node<T> source = graph.getSource();
        source.setVisited(true);
        queue.addLast(source);
        List<Node<T>> bfs = new LinkedList<>();

        while (!queue.isEmpty()) {
         Node<T> node = queue.removeFirst();
         bfs.add(node);

         for (Node<T> neighbor : node.getAdjacencyList()) {
             if (!neighbor.isVisited()) {
                 queue.addLast(neighbor);
                 neighbor.setVisited(true);
             }
         }
        }

        return bfs;
    }
}
