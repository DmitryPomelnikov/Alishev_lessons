package CodeWar;


import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(HighestAndLowestSolution.highAndLow(numbers));
    }
}
class HighestAndLowestSolution {
    public static String highAndLow(String numbers) {
        String [] array = numbers.split(" ");
        int [] arrayInt = new int[array.length];
        for (int i = 0 ; i< array.length;i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arrayInt);
        return arrayInt[arrayInt.length - 1] +" "+ arrayInt[0];

    }
}