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
    void printComplexTest() {
        List<QuadraticCoefficients> coefficients = new ArrayList<>();
        coefficients.add(new QuadraticCoefficients(2, 3, 4));

        PrintSolutions printer = new PrintSolutions(coefficients);
        printer.print();

        Assertions.assertEquals("COMPLEX" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void printRealTest() {
        List<QuadraticCoefficients> coefficients = new ArrayList<>();
        coefficients.add(new QuadraticCoefficients(1, -4, -21));

        PrintSolutions printer = new PrintSolutions(coefficients);
        printer.print();

        Assertions.assertEquals("-3.0 7.0" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void printMixedTest() {
        List<QuadraticCoefficients> coefficients = new ArrayList<>();
        coefficients.add(new QuadraticCoefficients(2, 3, 4));
        coefficients.add(new QuadraticCoefficients(1, -4, -21));
        coefficients.add(new QuadraticCoefficients(2, 1, 2));
        coefficients.add(new QuadraticCoefficients(3, 3, 3));
        coefficients.add(new QuadraticCoefficients(1, -3, 2));
        coefficients.add(new QuadraticCoefficients(4, 12, 9));

        PrintSolutions printer = new PrintSolutions(coefficients);
        printer.print();

        Assertions.assertEquals("COMPLEX" + System.lineSeparator() +
                "-3.0 7.0" + System.lineSeparator() +
                "COMPLEX" + System.lineSeparator() +
                "COMPLEX" + System.lineSeparator() +
                "1.0 2.0" + System.lineSeparator() +
                "-1.5 -1.5" + System.lineSeparator(), outContent.toString());
    }
}