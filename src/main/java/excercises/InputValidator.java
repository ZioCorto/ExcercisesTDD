package excercises;

import java.util.Objects;

class InputValidator {
    private final static Integer MINIMUM_TEST_CASES = 1;
    private final static Integer MAXIMUM_TEST_CASES = 100;
    private final static Integer NOT_ALLOWED_A = 0;
    private final static Integer MINIMUM_A = -10;
    private final static Integer MAXIMUM_A = 10;
    private final static Integer MINIMUM_B = -10;
    private final static Integer MAXIMUM_B = 10;
    private final static Integer MINIMUM_C = -10;
    private final static Integer MAXIMUM_C = 10;

    boolean isValidTestCases(Integer testCases) {
        return (MINIMUM_TEST_CASES <= testCases) && (testCases <= MAXIMUM_TEST_CASES);
    }

    boolean isValidA(Integer a) {
        return (MINIMUM_A <= a) && (a <= MAXIMUM_A)
                && (!Objects.equals(a, NOT_ALLOWED_A));
    }

    boolean isValidB(Integer b) {
        return (MINIMUM_B <= b) && (b <= MAXIMUM_B);
    }

    boolean isValidC(Integer c) {
        return (MINIMUM_C <= c) && (c <= MAXIMUM_C);
    }
}