package lesson3;

public class Arrays_of_String {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] string = new String[3];
        string[0] = "Hello";
        string[1] = "World";
        string[2] = "Java";

        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }
        System.out.println();
        for (String strings : string) {
            System.out.println(strings);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
