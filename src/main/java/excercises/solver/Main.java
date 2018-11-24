package excercises.solver;

import java.io.IOException;
import java.util.List;

public class Main {
    private final static String READING_ERROR = "Something went wrong reading the input file...";

    public static void main(String[] args) {
        String filepath = "files/GoodInput.txt";
        InputHandler handler = new InputHandler();
        try {
            List<QuadraticCoefficients> coefficients = handler.parseInputFile(filepath);
            PrintSolutions printer = new PrintSolutions(coefficients);
            printer.print();
        } catch (IOException e) {
            System.out.println(READING_ERROR);
        }
    }
}