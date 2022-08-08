package lesson4;

public class Void {
    public static void main(String[] args) {
        Persons person1 = new Persons();
        person1.name = "Dmitry";
        person1.age = 33;
        Persons person2 = new Persons();
        person2.name = "Roman";
        person2.age = 27;
        int years1 = person1.calculateYearsToRetirement();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("первому человеку до пенсии осталось - " + years1 + " лет");
        System.out.println("второму человеку до пенсии осталось - " + years2 + " лет");
    }
}

class Persons {
    String name;
    int age;

    int calculateYearsToRetirement() {
        int yearsToRetirement = 65 - age;
        return yearsToRetirement;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ". I am " + age + " years old");
        }
    }

    void hello() {
        System.out.println("Hello");
    }
}
