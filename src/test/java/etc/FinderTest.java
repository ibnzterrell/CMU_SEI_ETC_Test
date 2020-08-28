package etc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

/**
 * Units Tests for Code Test for CMU SEI ETC
 * @author Terrell Ibanez
 * @version 1.0
 */
public class FinderTest {
    /**
     * Tests for findMissing
     */
    @Test
    void findMissingTest() {
        assertEquals(1, Finder.findMissing(Arrays.asList(0, 2)));
        assertEquals(5, Finder.findMissing(Arrays.asList(0, 1, 2, 3, 4, 6)));
        assertEquals(6, Finder.findMissing(Arrays.asList(1, 2, 3, 4, 5, 7)));
    }
}