package lesson5;

public class FormationString {
    public static void main(String[] args) {
        System.out.printf("This is a string, %s \n", "NICE");
        System.out.printf("This is a string, %d \n", 123);
        System.out.printf("%f This is %s a string, %d \n", 125.06, " all", 123);
        System.out.printf("String %5d \n", 123);
        System.out.printf("String %5d \n", 123036565);
        System.out.printf("String %5d \n", 1231454485);
        System.out.printf("String %5d test\n", 1);
        System.out.printf("String %-5d test\n", 1);
        System.out.printf("String %.2f \n", 56.14548);
        System.out.printf("String %.2f \n", 56.14499);
        System.out.printf("String %.4f \n", 56.14548);
    }
}
