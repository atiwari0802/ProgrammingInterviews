package graphs;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayList;

public class KruskalsMinimumSpanningTree {

    /**
     * @param <T>
     * @return
     */
    public List<Edge<Integer>> kruskalsMST(Graph<Integer> graph, List<Subset> subsets) {
        List<Edge<Integer>> minimumSpanningTree = new ArrayList<>();
        List<Edge<Integer>> edges = graph.getAllEdges();
        PriorityQueue<Edge<Integer>> priorityQueue = new PriorityQueue<>(edges.size(),
                Comparator.comparingInt(Edge::getWeight));
        priorityQueue.addAll(edges);
        int count = 0;

        while (count < graph.getTotalNodes() - 1 || priorityQueue.isEmpty()) {
            Edge<Integer> currentEdge = priorityQueue.poll();
            int sourceNodeIndex = currentEdge.getSource().getValue();
            int destinationNodeIndex = currentEdge.getDestination().getValue();

            Subset parentNodeOne = find(subsets, sourceNodeIndex);
            Subset parentNodeTwo = find(subsets, destinationNodeIndex);

            if (parentNodeOne.parent != parentNodeTwo.parent) {
                minimumSpanningTree.add(currentEdge);
                union(subsets, parentNodeOne.parent, parentNodeTwo.parent);
                count++;
            }
        }
        return minimumSpanningTree.size() == graph.getTotalNodes() - 1 ? minimumSpanningTree : null;
    }

    private Subset find(List<Subset> subsets, int nodeIndex) {
        if (subsets.get(nodeIndex).parent != nodeIndex) {
            subsets.set(nodeIndex, find(subsets, subsets.get(nodeIndex).parent));
            return subsets.get(nodeIndex);
        }

        return subsets.get(nodeIndex);
    }

    private void union(List<Subset> subsets, int nodeIndexOne, int nodeIndexTwo) {
        if (subsets.get(nodeIndexOne).rank >= subsets.get(nodeIndexTwo).rank) {
            subsets.get(nodeIndexTwo).parent = nodeIndexOne;
            subsets.get(nodeIndexOne).rank += subsets.get(nodeIndexTwo).rank;
        } else {
            subsets.get(nodeIndexOne).parent = nodeIndexTwo;
            subsets.get(nodeIndexTwo).rank += subsets.get(nodeIndexOne).rank;
        }
    }

    static class Subset {
        int parent, rank;

        public Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }
}
