package guru.springframework.unittest.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RealRootsTest {
    @Test
    void testOverrideEquals() {
        Assertions.assertEquals(new RealRoots(1.0, 2.0),
                new RealRoots(1.0, 2.0));
    }
}