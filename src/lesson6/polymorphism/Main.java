package lesson6.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();

        //к объекту класс дог обращаемся через переменную родительского типа
        Animal animal1 = new Dog(); //но не имеем доступа к методу класса Dog
        animal.eat();
        Dog dog1 = new Dog(); //есть доступы к методам обоих классов
        dog1.eat();
        dog1.bark();

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        testing(animal);
        testing(dog2);
        testing(cat);
    }

    public static void testing(Animal animal) {
        animal.eat();
    }
}
