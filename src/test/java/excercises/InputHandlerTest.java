package excercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InputHandlerTest {


    @Test
    void parseInputFileTest() throws IOException {
        InputHandler handler = new InputHandler();
        List<QuadraticCoefficients> inputCoefficients = new ArrayList<>();
        inputCoefficients.add(new QuadraticCoefficients(2, 3, 4));
        inputCoefficients.add(new QuadraticCoefficients(3, 5, 1));
        inputCoefficients.add(new QuadraticCoefficients(1, -4, 4));

        String filepath = "files/GoodInput.txt";
        Assertions.assertEquals(handler.parseInputFile(filepath), inputCoefficients);
    }

    @Test
    void declaredBiggerThanProvidedTest() {
        InputHandler handler = new InputHandler();

        String filepath = "files/DeclaredBiggerThanProvided.txt";
        Assertions.assertThrows(NotValidInputException.class, () -> handler.parseInputFile(filepath));
    }

    @Test
    void declaredSmallerThanProvidedTest() {
        InputHandler handler = new InputHandler();

        String filepath = "files/DeclaredSmallerThanProvided.txt";
        Assertions.assertThrows(NotValidInputException.class, () -> handler.parseInputFile(filepath));
    }

    @Test
    void tooFewTestCasesTest() {
        InputHandler handler = new InputHandler();

        String filepath = "files/TooFewTestCases.txt";
        Assertions.assertThrows(NotValidInputException.class, () -> handler.parseInputFile(filepath));
    }

    //TODO add many more tests for each coefficient, malformed input, etc.
}