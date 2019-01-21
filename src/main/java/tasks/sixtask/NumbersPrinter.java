package tasks.sixtask;

import java.util.stream.IntStream;

public class NumbersPrinter {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(num -> System.out.println(convertNumber(num)));
    }

    private static String convertNumber(int num) {
        if (num%15 == 0) {
            return "FizzBuzz";
        }

        if (num%5 == 0) {
            return  "Buzz";
        }

        if (num%3 == 0) {
            return  "Fizz";
        }

        return String.valueOf(num);
    }

}
