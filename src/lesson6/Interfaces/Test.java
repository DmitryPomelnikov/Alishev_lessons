package lesson6.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Dmitry");
        animal.showInfo();
        person.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");

        info1.showInfo();
        info2.showInfo();

        outoutInfo(info1);
        outoutInfo(info2);

        Animal animal1 = new Animal(3);
        Person person1 = new Person("Dave");
        outoutInfo(animal1);
        outoutInfo(person1);
    }

    public static void outoutInfo(Info info) {
        info.showInfo();
    }
}
