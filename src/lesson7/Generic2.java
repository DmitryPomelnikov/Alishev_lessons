package lesson7;

import lesson6.Animal;
import lesson6.Dog;

import java.util.ArrayList;
import java.util.List;

public class Generic2 {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal());
        listOfAnimal.add(new Animal());

        List <Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());
    }
}
