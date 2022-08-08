package lesson4;

public class Parameters {
    public static void main(String[] args) {
        Persons2 person1 = new Persons2();
        person1.setName("Dmitry", 33);
        person1.age = 33;
        Persons2 person2 = new Persons2();
        String st1 = "Roman";
        person2.setName(st1, 52);
        person1.speak();
        person2.speak();
    }
}

class Persons2 {
    String name;
    int age;

    void setName(String username, int userAge) {
        name = username;
        age = userAge;
    }

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

