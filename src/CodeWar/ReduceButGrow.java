package CodeWar;

import java.util.Arrays;

public class ReduceButGrow {
    /**
     * Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
     * <p>
     * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {4, 1, 1, 1, 4};
        int[] array2 = {2, 2, 2, 2, 2, 2};

        System.out.println(ReduceGrow.grow(array));
        System.out.println(ReduceGrow.grow(array1));
        System.out.println(ReduceGrow.grow(array2));
    }
}

class ReduceGrow {

    public static int grow(int[] x) {
        int sum = 1;
        for (int i = 0; i < x.length; i++) {
            sum *= x[i];
        }
        return sum;
    }
    //чужое решение
    public static int grow2(int[] x){
        return Arrays.stream(x).reduce(1 ,(a, b) -> a * b);
    }

}