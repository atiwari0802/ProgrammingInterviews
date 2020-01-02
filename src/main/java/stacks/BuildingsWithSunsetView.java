package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingsWithSunsetView {

    public List<Integer> examineBuildings(Iterator<Integer> sequenceFromRight) {

        int buildingIndex = 0;
        Deque<Building> candidates = new ArrayDeque<>();

        while (sequenceFromRight.hasNext()) {
            int buildingHeight = sequenceFromRight.next();
            while (!candidates.isEmpty()
                    && candidates.peekFirst().height < buildingHeight) {
                candidates.removeFirst();
            }
            candidates.addFirst(new Building(buildingIndex++, buildingHeight));
        }
        return candidates
                .stream()
                .map(b -> b.id)
                .collect(Collectors.toList());
    }

    public class Building {

        int height, id;

        public Building(int height, int id) {
            this.height = height;
            this.id = id;
        }
    }

}
