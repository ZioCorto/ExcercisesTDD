package guru.springframework.unittest.quickstart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class PrintSolutionsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStream() {
        System.setOut(originalOut);
    }

    @Test
    void printTest() {
        List<QuadraticCoefficients> coefficients = new ArrayList<>();
        coefficients.add(new QuadraticCoefficients(2, 3, 4));

        PrintSolutions printer = new PrintSolutions(coefficients);
        printer.print();

        Assertions.assertEquals("COMPLEX" + System.lineSeparator(), outContent.toString());
    }
}