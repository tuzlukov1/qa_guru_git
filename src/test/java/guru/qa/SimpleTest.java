package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 2);
    }

    @Test
    void assertFalseTest() {
        Assertions.fail();
    }

    @Test
    void assertFailedTest() {
        fail("another fail");
    }


}
