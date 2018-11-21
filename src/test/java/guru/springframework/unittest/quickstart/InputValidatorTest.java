package guru.springframework.unittest.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InputValidatorTest {
    private InputValidator validator = new InputValidator();

    @Test
    void testSanitizeTestCases() {
        Assertions.assertTrue(validator.isValidTestCases(1));
        Assertions.assertTrue(validator.isValidTestCases(10));
        Assertions.assertTrue(validator.isValidTestCases(100));

        Assertions.assertFalse(validator.isValidTestCases(0));
        Assertions.assertFalse(validator.isValidTestCases(101));
    }

    @Test
    void testSanitizeA() {
        Assertions.assertTrue(validator.isValidA(-10));
        Assertions.assertTrue(validator.isValidA(-1));
        Assertions.assertTrue(validator.isValidA(1));
        Assertions.assertTrue(validator.isValidA(10));

        Assertions.assertFalse(validator.isValidA(0));

        Assertions.assertFalse(validator.isValidA(-11));
        Assertions.assertFalse(validator.isValidA(11));
    }

    @Test
    void testSanitizeB() {
        Assertions.assertTrue(validator.isValidB(-10));
        Assertions.assertTrue(validator.isValidB(-1));
        Assertions.assertTrue(validator.isValidB(1));
        Assertions.assertTrue(validator.isValidB(10));

        Assertions.assertTrue(validator.isValidB(0));

        Assertions.assertFalse(validator.isValidB(-11));
        Assertions.assertFalse(validator.isValidB(11));
    }

    @Test
    void testSanitizeC() {
        Assertions.assertTrue(validator.isValidC(-10));
        Assertions.assertTrue(validator.isValidC(-1));
        Assertions.assertTrue(validator.isValidC(1));
        Assertions.assertTrue(validator.isValidC(10));

        Assertions.assertTrue(validator.isValidC(0));

        Assertions.assertFalse(validator.isValidC(-11));
        Assertions.assertFalse(validator.isValidC(11));
    }
}