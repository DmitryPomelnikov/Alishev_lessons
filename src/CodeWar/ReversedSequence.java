package CodeWar;

import java.util.stream.IntStream;

public class ReversedSequence {
    /**
     * Build a function that returns an array of integers from n to 1 where n>0.
     * Example : n=5 --> [5,4,3,2,1]
     */
    public static void main(String[] args) {
        int[] array = Sequence.reverse(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


class Sequence {
    public static int[] reverse(int n) {
        int counter = n;
        int[] array = new int[n];
        for (int i = 0; i < counter; i++) {
            array[i] = n;
            n--;
        }
        return array;
    }

    public static int[] reverse2(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}
