package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskSchedulingTest {

    private TaskScheduling taskScheduling;

    @BeforeEach
    public void setup() {
        taskScheduling = new TaskScheduling();
    }

    @Test
    public void testTaskScheduling() {
        char[] input = {'A','A','A','B','B','B'};
        int coolingTime = 2;

        int result = taskScheduling.leastInterval(input, coolingTime);

        Assertions.assertEquals(8, result);
    }
}
