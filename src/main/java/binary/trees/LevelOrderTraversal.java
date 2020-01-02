package binary.trees;

import java.util.*;

public class LevelOrderTraversal {

    public Map<Integer, List<Node>> levelOrderTraversal(Node root) {

        Map<Integer, List<Node>> result = new HashMap<>();
        int level = 0;
        Deque<Node> nodeLevels = new ArrayDeque<>();
        nodeLevels.push(root);

        while (!nodeLevels.isEmpty()) {
            int queueSize = nodeLevels.size();
            for (int i = 0; i < queueSize; i++) {
                Node currentNode = nodeLevels.removeFirst();
                List<Node> nodesAtThisLevel = result.get(level);
                if (nodesAtThisLevel == null) {
                    nodesAtThisLevel = new ArrayList<>();
                    nodesAtThisLevel.add(currentNode);
                    result.put(level, nodesAtThisLevel);
                } else {
                    nodesAtThisLevel.add(currentNode);
                    result.put(level, nodesAtThisLevel);
                }
                if (currentNode.leftChild != null) {
                    nodeLevels.addLast(currentNode.leftChild);
                }
                if (currentNode.rightChild != null) {
                    nodeLevels.addLast(currentNode.rightChild);
                }
            }
            level++;
        }
        return result;
    }
}
