package lesson7;

import lesson6.polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List animals = new ArrayList<>();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(ourAnimal);
        ////////////с появлением дженериков\\\\\\\\\\
        List<String> animals3 = new ArrayList<>();
    }
}
