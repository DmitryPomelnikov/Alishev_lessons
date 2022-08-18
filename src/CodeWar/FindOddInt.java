package CodeWar;

public class FindOddInt {
    /**
     * Given an array of integers, find the one that appears an odd number of times.
     * There will always be only one integer that appears an odd number of times.
     * Examples
     * [7] should return 7, because it occurs 1 time (which is odd).
     * [0] should return 0, because it occurs 1 time (which is odd).
     * [1,1,2] should return 2, because it occurs 1 time (which is odd).
     * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
     * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
     */
    public static void main(String[] args) {
        int[] array = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] array2 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] array3 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] array4 = {10};
        int[] array5 = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] array6 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        System.out.println(FindOdd.findIt(array));
        System.out.println(FindOdd.findIt(array2));
        System.out.println(FindOdd.findIt(array3));
        System.out.println(FindOdd.findIt(array4));
        System.out.println(FindOdd.findIt(array5));
        System.out.println(FindOdd.findIt(array6));

    }
}

class FindOdd {
    public static int findIt(int[] a) {
        int value = a[0];
        int counter = 0;
        int index = 0;
        if (a.length == 1) {
            return value;
        } else {
            while (true) {
                for (int i = 0; i < a.length; i++) {
                    if (value == a[i]) {
                        counter++;
                    }
                }
                index++;
                if (counter % 2 == 1) {
                    break;
                } else value = a[index];
            }
        }
        return value;
    }
    //чужое решение
    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
