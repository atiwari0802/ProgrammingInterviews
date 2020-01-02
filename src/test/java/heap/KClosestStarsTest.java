package heap;

import heaps.KClosestStars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class KClosestStarsTest {

    private KClosestStars kClosestStars;

    @BeforeEach
    public void setup() {
        kClosestStars = new KClosestStars();
    }

    @Test
    public void testKClosestStar() {

        List<KClosestStars.Star> input = List.of(new KClosestStars.Star(10, 10, 10),
                new KClosestStars.Star(1, 1, 1), new KClosestStars.Star(15, 15, 15),
        new KClosestStars.Star(1, 4, 6));

        List<KClosestStars.Star> result = kClosestStars.getKNearestStar(input.iterator(), 2);

        result.forEach(star -> System.out.println(star.x + ": " + star.y + ": " + star.z));
    }
}
