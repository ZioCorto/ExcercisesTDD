package interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void evenArrayTest() {
        Integer[] evenArray = {1, 3, 5, 4, 6, 9};
        Integer[] revertedArray = {9, 6, 4, 5, 3, 1};

        Assertions.assertArrayEquals(revertedArray, Main.reverseInPlace(evenArray));
    }

    @Test
    void oddArrayTest() {
        Integer[] evenArray = {1, 3, 4, 6, 9};
        Integer[] revertedArray = {9, 6, 4, 3, 1};

        Assertions.assertArrayEquals(revertedArray, Main.reverseInPlace(evenArray));
    }

    @Test
    void emptyArrayTest() {
        Integer[] empty = {};
        Integer[] reverted = {};

        Assertions.assertArrayEquals(reverted, Main.reverseInPlace(empty));
    }

    @Test
    void singleElementArrayTest() {
        Integer[] single = {2};

        Assertions.assertArrayEquals(single, Main.reverseInPlace(single));
    }

    @Test
    void nullArrayTest() {
        Assertions.assertThrows(NullPointerException.class, () -> Main.reverseInPlace(null));
    }
}