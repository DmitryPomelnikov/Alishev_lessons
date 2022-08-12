package CodeWar;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
    /**
     * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
     * <p>
     * Example
     * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(KataPhone.createPhoneNumber(array));
    }
}

class KataPhone {
    public static String createPhoneNumber2(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }
//чужое решение
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}

