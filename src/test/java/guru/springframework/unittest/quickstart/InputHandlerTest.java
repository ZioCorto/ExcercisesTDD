package guru.springframework.unittest.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InputHandlerTest {
    InputHandler handler = new InputHandler();

    String filepath = "files/ExampleGoodInput.txt";
    List<QuadraticCoefficients> inputCoefficients = new ArrayList<>();


    @Test
    void parseInputFileTest() {
        inputCoefficients.add(new QuadraticCoefficients(2, 3, 4));
        inputCoefficients.add(new QuadraticCoefficients(3, 5, 1));
        inputCoefficients.add(new QuadraticCoefficients(1, -4, 4));

        Assertions.assertEquals(handler.parseInputFile(filepath), inputCoefficients);
    }
}