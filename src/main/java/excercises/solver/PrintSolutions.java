package excercises.solver;

import java.util.List;

class PrintSolutions {
    private final static String PRINT_COMPLEX_ROOT = "COMPLEX";
    private final List<QuadraticCoefficients> equations;

    PrintSolutions(List<QuadraticCoefficients> equations) {
        this.equations = equations;
    }

    void print() {
        for (QuadraticCoefficients equation : equations) {
            printEquation(equation);
        }
    }

    private void printEquation(QuadraticCoefficients equation) {
        try {
            printRealRoots(equation);
        } catch (ComplexRootsException e) {
            System.out.println(PRINT_COMPLEX_ROOT);
        }
    }

    private void printRealRoots(QuadraticCoefficients equation) throws ComplexRootsException {
        RealRoots roots = QuadraticRealRootsSolver.findRoots(equation);
        System.out.println(roots.getSmallerRoot() + " " + roots.getBiggerRoot());
    }
}