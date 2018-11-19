package guru.springframework.unittest.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InputSanitizerTest {
    private InputSanitizer sanitizer = new InputSanitizer();

    @Test
    void testSanitizeTestCases() {
        Assertions.assertTrue(sanitizer.sanitizeTestCases(1));
        Assertions.assertTrue(sanitizer.sanitizeTestCases(10));
        Assertions.assertTrue(sanitizer.sanitizeTestCases(100));

        Assertions.assertFalse(sanitizer.sanitizeTestCases(0));
        Assertions.assertFalse(sanitizer.sanitizeTestCases(101));
    }

    @Test
    void testSanitizeA() {
        Assertions.assertTrue(sanitizer.sanitizeA(-10));
        Assertions.assertTrue(sanitizer.sanitizeA(-1));
        Assertions.assertTrue(sanitizer.sanitizeA(1));
        Assertions.assertTrue(sanitizer.sanitizeA(10));

        Assertions.assertFalse(sanitizer.sanitizeA(0));

        Assertions.assertFalse(sanitizer.sanitizeA(-11));
        Assertions.assertFalse(sanitizer.sanitizeA(11));
    }

    @Test
    void testSanitizeB() {
        Assertions.assertTrue(sanitizer.sanitizeB(-10));
        Assertions.assertTrue(sanitizer.sanitizeB(-1));
        Assertions.assertTrue(sanitizer.sanitizeB(1));
        Assertions.assertTrue(sanitizer.sanitizeB(10));

        Assertions.assertTrue(sanitizer.sanitizeB(0));

        Assertions.assertFalse(sanitizer.sanitizeB(-11));
        Assertions.assertFalse(sanitizer.sanitizeB(11));
    }

    @Test
    void testSanitizeC() {
        Assertions.assertTrue(sanitizer.sanitizeC(-10));
        Assertions.assertTrue(sanitizer.sanitizeC(-1));
        Assertions.assertTrue(sanitizer.sanitizeC(1));
        Assertions.assertTrue(sanitizer.sanitizeC(10));

        Assertions.assertTrue(sanitizer.sanitizeC(0));

        Assertions.assertFalse(sanitizer.sanitizeC(-11));
        Assertions.assertFalse(sanitizer.sanitizeC(11));
    }
}