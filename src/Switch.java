import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("You born");
                break;
            case 10:
                System.out.println("You are disciple");
                break;
            case 18:
                System.out.println("You are student");
                break;
            default:
                System.out.println("Noither condition didn`t done");
        }
    }
}
