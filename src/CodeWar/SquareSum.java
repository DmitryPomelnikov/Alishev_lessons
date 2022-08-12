package CodeWar;

public class SquareSum {
    /**
     * Complete the square sum function so that it squares each number passed into it and then sums the results together.
     * <p>
     * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2};
        int[] array2 = {1, 2};
        int[] array3 = {5, -3, 4};
        int[] array4 = {};

        System.out.println(SqSum.squareSum(array1));
        System.out.println(SqSum.squareSum(array2));
        System.out.println(SqSum.squareSum(array3));
        System.out.println(SqSum.squareSum(array4));
    }
}

class SqSum {
    public static int squareSum(int[] n) {
        int value = 0;
        for (int i = 0; i < n.length; i++) {
            value += (int) Math.pow(n[i], 2);
        }
        return value;
    }
}
