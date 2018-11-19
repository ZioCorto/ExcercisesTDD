package guru.springframework.unittest.quickstart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class InputHandler {
    //TODO refactor!
    List<QuadraticCoefficients> parseInputFile(String filepath) {
        try {
            FileReader reader = new FileReader(filepath);
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            Integer testCases = Integer.parseInt(line);
            InputSanitizer sanitizer = new InputSanitizer();
            if (sanitizer.sanitizeTestCases(testCases)) {
                List<QuadraticCoefficients> coefficients = new ArrayList<>();
                while ((line = buffer.readLine()) != null) {
                    String[] parts = line.split(" ");
                    Integer a = Integer.parseInt(parts[0]);
                    Integer b = Integer.parseInt(parts[1]);
                    Integer c = Integer.parseInt(parts[2]);
                    if (sanitizer.sanitizeA(a) && sanitizer.sanitizeB(b) && sanitizer.sanitizeC(c)) {
                        coefficients.add(new QuadraticCoefficients(a, b, c));
                    }
                }
                return coefficients;
            } else {
                return null; //FIXME throw exception
            }
        } catch (IOException e) {
            //TODO manage
            return null;
        }
    }
}