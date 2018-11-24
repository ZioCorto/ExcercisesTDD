package excercises.fizzbuzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ConsoleBasedFizzBuzzTest {
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

    private String getExpectedOutUpTo(int from, int to) {
        String expectedOut = "";
        for (int i = from; i <= to; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                expectedOut += ("FizzBuzz" + System.lineSeparator());
            } else if ((i % 5) == 0) {
                expectedOut += ("Buzz" + System.lineSeparator());
            } else if ((i % 3) == 0) {
                expectedOut += ("Fizz" + System.lineSeparator());
            } else {
                expectedOut += (i + System.lineSeparator());
            }
        }
        return expectedOut;
    }

    @Test
    void printUpTo100Test() {
        ConsoleBasedFizzBuzz fizzbuzz = new ConsoleBasedFizzBuzz();
        String expectedOut = getExpectedOutUpTo(1, 100);
        fizzbuzz.print(1, 100);

        Assertions.assertEquals(expectedOut, outContent.toString());
    }

    @Test
    void printFrom4To257Test() {
        ConsoleBasedFizzBuzz fizzbuzz = new ConsoleBasedFizzBuzz();
        String expectedOut = getExpectedOutUpTo(4, 257);
        fizzbuzz.print(4, 257);

        Assertions.assertEquals(expectedOut, outContent.toString());
    }
}