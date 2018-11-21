package guru.springframework.unittest.quickstart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InputHandler {
    private List<QuadraticCoefficients> coefficients;
    private InputValidator sanitizer;

    InputHandler() {
        coefficients = new ArrayList<>();
        sanitizer = new InputValidator();
    }

    //https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
    List<QuadraticCoefficients> parseInputFile(String filepath) throws IOException {
        FileReader reader = new FileReader(filepath);
        BufferedReader buffer = new BufferedReader(reader);
        String line = buffer.readLine();
        Integer testCases = builtTestCases(line);
        while ((line = buffer.readLine()) != null) {
            parseLine(line);
        }
        return matchDeclaredProvided(testCases);
    }

    private List<QuadraticCoefficients> matchDeclaredProvided(Integer declared) {
        if (coefficients.size() == declared) {
            return coefficients;
        } else {
            throw new NotValidInputException("Number of declared test cases and provided test cases does not match!");
        }
    }

    private void parseLine(String line) {
        String[] parts = line.split(" ");
        Integer a = buildA(parts[0]);
        Integer b = buildB(parts[1]);
        Integer c = buildC(parts[2]);
        coefficients.add(new QuadraticCoefficients(a, b, c));
    }

    private Integer builtTestCases(String testCasesStr) {
        Integer testCases = Integer.parseInt(testCasesStr);
        if (sanitizer.isValidTestCases(testCases)) {
            return testCases;
        } else {
            throw new NotValidInputException("Number of test cases not allowed!");
        }
    }

    private Integer buildA(String aStr) {
        Integer a = Integer.parseInt(aStr);
        if (sanitizer.isValidA(a)) {
            return a;
        } else {
            throw new NotValidInputException("Coefficient A not allowed!");
        }
    }

    private Integer buildB(String bStr) {
        Integer b = Integer.parseInt(bStr);
        if (sanitizer.isValidB(b)) {
            return b;
        } else {
            throw new NotValidInputException("Coefficient B not allowed!");
        }
    }

    private Integer buildC(String cStr) {
        Integer c = Integer.parseInt(cStr);
        if (sanitizer.isValidC(c)) {
            return c;
        } else {
            throw new NotValidInputException("Coefficient C not allowed!");
        }
    }
}