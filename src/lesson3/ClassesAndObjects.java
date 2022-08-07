package lesson3;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Dmitry";
        person1.age = 33;
        System.out.println("My name is " + person1.name + ". I am " + person1.age + " years old");
        Person person2 = new Person();
        person2.name = "Roman";
        person2.age = 27;
        System.out.println("My name is " + person2.name + ". I am " + person2.age + " years old");
    }
}

class Person {
    String name;
    int age;
}
