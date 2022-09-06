package lesson10;

public class RecursionClass {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    private static int factorial(int value) {
        if (value == 0) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
