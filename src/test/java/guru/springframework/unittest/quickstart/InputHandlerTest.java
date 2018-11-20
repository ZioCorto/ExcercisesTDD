package guru.springframework.unittest.quickstart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InputHandlerTest {
    private InputHandler handler = new InputHandler();

    private List<QuadraticCoefficients> inputCoefficients = new ArrayList<>();


    @Test
    void parseInputFileTest() throws IOException {
        inputCoefficients.add(new QuadraticCoefficients(2, 3, 4));
        inputCoefficients.add(new QuadraticCoefficients(3, 5, 1));
        inputCoefficients.add(new QuadraticCoefficients(1, -4, 4));

        String filepath = "files/ExampleGoodInput.txt";

        Assertions.assertEquals(handler.parseInputFile(filepath), inputCoefficients);
    }
}