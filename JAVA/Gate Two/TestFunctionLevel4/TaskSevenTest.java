import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskSevenTest {
    @Test
    public void testCalculateSimpleInterest() {
        assertEquals(10.0, TaskSeven.calculateSimpleInterest(100, 5, 2), 0.01);
        assertEquals(50.0, TaskSeven.calculateSimpleInterest(500, 10, 1), 0.01);
        assertEquals(0.0, TaskSeven.calculateSimpleInterest(100, 0, 2), 0.01);
    }
}
