package CodeWar;

public class Summation {
    /**
     * Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
     * Examples
     * Input: [1, 5.2, 4, 0, -1]
     * Output: 9.2
     * <p>
     * Input: []
     * Output: 0
     * <p>
     * Input: [-2.398]
     * Output: -2.398
     */
    public static void main(String[] args) {
        System.out.println(GrassHopperStr.summation(8));
    }
}

class GrassHopperStr {

    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}