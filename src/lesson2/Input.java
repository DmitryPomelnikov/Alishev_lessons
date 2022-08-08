package lesson2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputValue = firstScanner.nextInt();
        System.out.println("Вы ввели "+inputValue);
    }
}
