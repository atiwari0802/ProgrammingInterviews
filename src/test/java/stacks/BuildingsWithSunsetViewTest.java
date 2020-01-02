package stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BuildingsWithSunsetViewTest {

    private BuildingsWithSunsetView buildingsWithSunsetView;

    @BeforeEach
    public void setup() {
        buildingsWithSunsetView = new BuildingsWithSunsetView();
    }

    @Test
    public void testBuildingWithSunsetView() {

        List<Integer> list = Arrays.asList(4, 2, 4, 2, 8, 10);

        List<Integer> result = buildingsWithSunsetView.examineBuildings(list.iterator());

        Assertions.assertEquals(1, result.size());

        result.forEach(System.out::println);


    }
}
