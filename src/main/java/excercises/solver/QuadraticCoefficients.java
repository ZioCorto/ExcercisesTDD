package excercises.solver;

import java.util.Objects;

class QuadraticCoefficients {
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final Double delta;

    QuadraticCoefficients(final Integer a, final Integer b, final Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = computeDelta();
    }

    private Double computeDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    Integer getA() {
        return a;
    }

    Integer getB() {
        return b;
    }

    Integer getC() {
        return c;
    }

    Double getDelta() {
        return delta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof QuadraticCoefficients)) {
            return false;
        }
        QuadraticCoefficients other = (QuadraticCoefficients) o;
        return (Objects.equals(a, other.a)) && (Objects.equals(b, other.b)) &&
                (Objects.equals(c, other.c)) && (Objects.equals(delta, other.delta));
    }
}