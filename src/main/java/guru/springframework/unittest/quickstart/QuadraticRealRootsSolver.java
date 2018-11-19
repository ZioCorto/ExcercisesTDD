package guru.springframework.unittest.quickstart;

class QuadraticRealRootsSolver {
    static RealRoots findRoots(QuadraticCoefficients coefficients) {
        if (coefficients.getDelta() >= 0) {
            return createRealRootsArray(coefficients);
        } else {
            throw new ArithmeticException();
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