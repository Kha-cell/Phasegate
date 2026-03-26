import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskThreeTest {
    @Test
    public void testSquare() {
        assertEquals(16, TaskThree.square(4));
        assertEquals(0, TaskThree.square(0));
        assertEquals(25, TaskThree.square(5));
    }
}
