package excercises;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filepath = "files/GoodInput.txt";
        InputHandler handler = new InputHandler();
        try {
            List<QuadraticCoefficients> coefficients = handler.parseInputFile(filepath);
            PrintSolutions printer = new PrintSolutions(coefficients);
            printer.print();
        } catch (IOException e) {
            System.out.println("Something went wrong reading the input file...");
        }
    }
}