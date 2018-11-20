package guru.springframework.unittest.quickstart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InputHandler {
    private List<QuadraticCoefficients> coefficients;
    private InputSanitizer sanitizer;

    InputHandler() {
        coefficients = new ArrayList<>();
        sanitizer = new InputSanitizer();
    }

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
            throw new ArithmeticException("Number of declared test cases and provided test cases does not match!");
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
        if (sanitizer.sanitizeTestCases(testCases)) {
            return testCases;
        } else {
            throw new ArithmeticException("Number of test cases not allowed!");
        }
    }

    private Integer buildA(String aStr) {
        Integer a = Integer.parseInt(aStr);
        if (sanitizer.sanitizeA(a)) {
            return a;
        } else {
            throw new ArithmeticException("Coefficient A not allowed!");
        }
    }

    private Integer buildB(String bStr) {
        Integer b = Integer.parseInt(bStr);
        if (sanitizer.sanitizeB(b)) {
            return b;
        } else {
            throw new ArithmeticException("Coefficient B not allowed!");
        }
    }

    private Integer buildC(String cStr) {
        Integer c = Integer.parseInt(cStr);
        if (sanitizer.sanitizeC(c)) {
            return c;
        } else {
            throw new ArithmeticException("Coefficient C not allowed!");
        }
    }
}