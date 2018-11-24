package excercises.fizzbuzz;

class ConsoleBasedFizzBuzz implements FizzBuzz {
    private final static String MULTIPLE_OF_15 = "FizzBuzz";
    private final static String MULTIPLE_OF_5 = "Buzz";
    private final static String MULTIPLE_OF_3 = "Fizz";

    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            chooseWhatToPrint(i);
        }
    }

    private void chooseWhatToPrint(int i) {
        if (isMultipleOfThree(i) && isMultipleOfFive(i)) {
            System.out.println(MULTIPLE_OF_15);
        } else if (isMultipleOfFive(i)) {
            System.out.println(MULTIPLE_OF_5);
        } else if (isMultipleOfThree(i)) {
            System.out.println(MULTIPLE_OF_3);
        } else {
            System.out.println(i);
        }
    }

    private boolean isMultipleOfThree(int i) {
        return (i % 3) == 0;
    }

    private boolean isMultipleOfFive(int i) {
        return (i % 5) == 0;
    }
}