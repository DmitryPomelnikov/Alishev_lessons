package lesson3;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3, 4, 5};
        for (int i = 0; numbers1.length > i; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
