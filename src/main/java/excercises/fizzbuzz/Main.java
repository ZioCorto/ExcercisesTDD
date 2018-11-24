package excercises.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        ConsoleBasedFizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}