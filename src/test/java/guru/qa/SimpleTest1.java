package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTest1 {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 2);
    }

    @Test
    void assertFailedTest() {
        fail("another fail");
    }


}
