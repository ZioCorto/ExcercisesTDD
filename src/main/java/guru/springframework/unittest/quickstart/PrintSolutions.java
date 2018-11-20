package guru.springframework.unittest.quickstart;

import java.util.List;

class PrintSolutions {
    private final List<QuadraticCoefficients> coefficients;

    PrintSolutions(List<QuadraticCoefficients> coefficients) {
        this.coefficients = coefficients;
    }

    void print() {
        for (QuadraticCoefficients equation : coefficients) {
            //TODO ArithmeticException is unchecked, change it and define own exceptions when needed
            try {
                RealRoots roots = QuadraticRealRootsSolver.findRoots(equation);
            } catch (ArithmeticException e) {
                System.out.println("COMPLEX");
            }
        }
    }
}