package excercises.solver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class QuadraticRealRootsSolverTest {

    private static Stream<Arguments> coefficientsAndRealRootsProvider() {
        return Stream.of(
                Arguments.of(new QuadraticCoefficients(1, -5, 6),
                        new RealRoots(2.0, 3.0)),
                Arguments.of(new QuadraticCoefficients(2, -10, 12),
                        new RealRoots(2.0, 3.0)),
                Arguments.of(new QuadraticCoefficients(1, -9, 14),
                        new RealRoots(2.0, 7.0)),
                Arguments.of(new QuadraticCoefficients(1, -5, -14),
                        new RealRoots(-2.0, 7.0)),
                Arguments.of(new QuadraticCoefficients(1, 22, 121),
                        new RealRoots(-11.0, -11.0)),
                Arguments.of(new QuadraticCoefficients(1, -3, 2),
                        new RealRoots(1.0, 2.0))
        );
    }

    private static Stream<Arguments> coefficientsForComplexRootsProvider() {
        return Stream.of(
                Arguments.of(new QuadraticCoefficients(1, 1, 1)),
                Arguments.of(new QuadraticCoefficients(2, 1, 2)),
                Arguments.of(new QuadraticCoefficients(4, 2, 3)),
                Arguments.of(new QuadraticCoefficients(1, 2, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("coefficientsAndRealRootsProvider")
    void testRealRoots(QuadraticCoefficients coefficients, RealRoots solution) throws ComplexRootsException {
        Assertions.assertEquals(QuadraticRealRootsSolver.findRoots(coefficients), solution);
    }

    @ParameterizedTest
    @MethodSource("coefficientsForComplexRootsProvider")
    void testComplexRoots(QuadraticCoefficients coefficients) {
        Assertions.assertThrows(ComplexRootsException.class, () -> QuadraticRealRootsSolver.findRoots(coefficients));
    }
}