package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest1 {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 2);
    }
}
