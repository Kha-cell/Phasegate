import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateNumberTest {

    @Test
    public void testUniqueNumbers() {

        int[] input = {9, 2, 3, 2, 1};

        String expected = "9 3 1";
        String actual = DuplicateNumber.uniqueNumbers(input);

        assertEquals(expected, actual);
    }
}