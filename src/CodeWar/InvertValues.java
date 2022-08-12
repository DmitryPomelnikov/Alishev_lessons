package CodeWar;

import java.util.Arrays;

public class InvertValues {
    /**
     * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
     * <p>
     * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
     * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
     * invert([]) == []
     */
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4, -5};
        int[] array2 = {-1, 2, -3, 4, -5};
        int[] array3 = {0};

        System.out.println(Arrays.toString(Invert.invert(array)));
        System.out.println(Arrays.toString(Invert.invert(array2)));
        System.out.println(Arrays.toString(Invert.invert(array3)));
    }
}

class Invert {
    public static int[] invert(int[] array) {
        int[] arrayInvert = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvert[i] = array[i] * -1;
        }
        return arrayInvert;
    }
}
