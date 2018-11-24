package excercises.solver;

import java.util.Objects;

class RealRoots {
    private final Double smallerRoot;
    private final Double biggerRoot;

    RealRoots(final Double smallerRoot, final Double biggerRoot) {
        this.smallerRoot = smallerRoot;
        this.biggerRoot = biggerRoot;
    }

    Double getSmallerRoot() {
        return smallerRoot;
    }

    Double getBiggerRoot() {
        return biggerRoot;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof RealRoots)) {
            return false;
        }
        RealRoots other = (RealRoots) o;
        return Objects.equals(smallerRoot, other.smallerRoot) &&
                Objects.equals(biggerRoot, other.biggerRoot);
    }
}