package excercises;

import java.util.List;

class PrintSolutions {
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
            System.out.println("COMPLEX");
        }
    }

    private void printRealRoots(QuadraticCoefficients equation) throws ComplexRootsException {
        RealRoots roots = QuadraticRealRootsSolver.findRoots(equation);
        System.out.println(roots.getSmallerRoot() + " " + roots.getBiggerRoot());
    }
}