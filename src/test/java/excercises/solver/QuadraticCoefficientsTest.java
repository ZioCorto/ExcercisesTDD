package excercises.solver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticCoefficientsTest {
    @Test
    void testOverrideEquals() {
        QuadraticCoefficients example = new QuadraticCoefficients(1, 2, 3);
        QuadraticCoefficients same_example_values = new QuadraticCoefficients(1, 2, 3);

        Assertions.assertEquals(example, example);
        Assertions.assertEquals(example, same_example_values);

        Assertions.assertNotEquals(null, example);
        Assertions.assertNotEquals("Foo", example);
    }

    @Test
    void testGetA() {
        QuadraticCoefficients example = new QuadraticCoefficients(2, 3, 4);

        Assertions.assertEquals((Integer) 2, example.getA());

        Assertions.assertFalse(2 == example.getB());
        Assertions.assertFalse(2 == example.getC());
        Assertions.assertFalse(2 == example.getDelta());
    }

    @Test
    void testGetB() {
        QuadraticCoefficients example = new QuadraticCoefficients(3, 4, 5);

        Assertions.assertEquals((Integer) 4, example.getB());

        Assertions.assertFalse(4 == example.getA());
        Assertions.assertFalse(4 == example.getC());
        Assertions.assertFalse(4 == example.getDelta());
    }

    @Test
    void testGetC() {
        QuadraticCoefficients example = new QuadraticCoefficients(4, 5, 6);

        Assertions.assertEquals((Integer) 6, example.getC());

        Assertions.assertFalse(6 == example.getA());
        Assertions.assertFalse(6 == example.getB());
        Assertions.assertFalse(6 == example.getDelta());
    }

    @Test
    void testGetDelta() {
        QuadraticCoefficients example = new QuadraticCoefficients(5, 3, 7);

        Assertions.assertEquals((Double) (-131.0), example.getDelta());

        Assertions.assertFalse(-131.0 == example.getA());
        Assertions.assertFalse(-131.0 == example.getB());
        Assertions.assertFalse(-131.0 == example.getC());
    }
}