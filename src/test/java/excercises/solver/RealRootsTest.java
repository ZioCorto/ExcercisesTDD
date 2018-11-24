package excercises.solver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RealRootsTest {
    @Test
    void testOverrideEquals() {
        RealRoots example = new RealRoots(-1.0, -1.5);
        RealRoots same_example_values = new RealRoots(-1.0, -1.5);

        Assertions.assertEquals(example, example);
        Assertions.assertEquals(example, same_example_values);

        Assertions.assertNotEquals(null, example);
        Assertions.assertNotEquals("FooString", example);
    }

    @Test
    void testGetSmallerRoot() {
        RealRoots example = new RealRoots(3.4, 4.4);

        Assertions.assertEquals((Double) 3.4, example.getSmallerRoot());
        Assertions.assertFalse(4.4 == example.getSmallerRoot());
    }

    @Test
    void testGetBiggerRoot() {
        RealRoots example = new RealRoots(3.1, 6.1);

        Assertions.assertEquals((Double) 6.1, example.getBiggerRoot());
        Assertions.assertFalse(6.1 == example.getSmallerRoot());
    }
}