package interview;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] test = {1, 4, 6, 8, 5, 7};
        Integer[] reverted = reverseInPlace(test);
        System.out.println(Arrays.toString(reverted));
    }

    static Integer[] reverseInPlace(Integer[] toReverse) {
        Integer temp;
        for (int i = 0; i < toReverse.length / 2; i++) {
            temp = toReverse[i];
            toReverse[i] = toReverse[toReverse.length - (1 + i)];
            toReverse[toReverse.length - (1 + i)] = temp;
        }
        return toReverse;
    }
}