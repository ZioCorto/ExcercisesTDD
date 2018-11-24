package excercises.solver;

class QuadraticRealRootsSolver {
    private static final String COMPLEX_ROOT_MESSAGE = "These coefficients have a complex solution.";

    static RealRoots findRoots(QuadraticCoefficients coefficients) throws ComplexRootsException {
        if (coefficients.getDelta() >= 0) {
            return createRealRootsArray(coefficients);
        } else {
            throw new ComplexRootsException(COMPLEX_ROOT_MESSAGE);
        }
    }

    private static RealRoots createRealRootsArray(QuadraticCoefficients coefficients) {
        Double smallerRoot = computeSmallerRoot(coefficients);
        Double biggerRoot = computeBiggerRoot(coefficients);
        return new RealRoots(smallerRoot, biggerRoot);
    }

    private static Double computeSmallerRoot(QuadraticCoefficients coefficients) {
        return (-coefficients.getB() - Math.sqrt(coefficients.getDelta())) / (2 * coefficients.getA());
    }

    private static Double computeBiggerRoot(QuadraticCoefficients coefficients) {
        return (-coefficients.getB() + Math.sqrt(coefficients.getDelta())) / (2 * coefficients.getA());
    }
}