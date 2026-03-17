import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskSixTest {
    @Test
    public void testFindLargest() {
        assertEquals(10, TaskSix.findLargest(5, 10, 3));
        assertEquals(25, TaskSix.findLargest(10, 5, 25, 3));
        assertEquals(0, TaskSix.findLargest(-1, 0, -5));
    }
}
