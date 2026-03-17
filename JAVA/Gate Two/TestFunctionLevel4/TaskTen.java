import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskTenTest {
    @Test
    public void testReverseNumber() {
        assertEquals(321, TaskTen.reverseNumber(123));
        assertEquals(1, TaskTen.reverseNumber(1));
        assertEquals(0, TaskTen.reverseNumber(0));
        assertEquals(54321, TaskTen.reverseNumber(12345));
    }
}
