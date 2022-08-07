package lesson3;

public class Method {
    public static void main(String[] args) {
        Persons person1 = new Persons();
        person1.name = "Dmitry";
        person1.age = 33;
        person1.speak();
        Persons person2 = new Persons();
        person2.name = "Roman";
        person2.age = 27;
        person2.hello();
    }
}

class Persons {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ". I am " + age + " years old");
        }
    }

    void hello() {
        System.out.println("Hello");
    }
}
