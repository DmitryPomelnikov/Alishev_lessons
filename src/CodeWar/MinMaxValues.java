package CodeWar;

import java.util.Arrays;

public class MinMaxValues {
    /**
     * Your task is to make two functions ( max and min, or maximum and minimum, etc.,
     * depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively.
     */
    public static void main(String[] args) {
        int[] array = {-52, 56, 30, 29, -54, 0, -110};
        int[] array1 = {42, 54, 65, 87, 0};
        int[] array2 = {4, 6, 2, 1, 9, 63, -134, 566};
        int[] array3 = {5};
        System.out.println(MinMax.min(array) + " " + MinMax.max(array));
        System.out.println(MinMax.min(array1) + " " + MinMax.max(array1));
        System.out.println(MinMax.min(array2) + " " + MinMax.max(array2));
        System.out.println(MinMax.min(array3) + " " + MinMax.max(array3));
    }
}

class MinMax {
    public static int min(int[] list) {
        int min = list[0];
        if (list.length > 1) {
            for (int i = 1; i < list.length; i++) {
                if (min > list[i]) {
                    min = list[i];
                }
            }
            return min;
        } else return min;
    }

    public static int max(int[] list) {
        int max = list[0];
        if (list.length > 1) {
            for (int i = 1; i < list.length; i++) {
                if (max < list[i]) {
                    max = list[i];
                }
            }
            return max;
        } else return max;
    }
    //лучшее решение
    public int min2(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max2(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}