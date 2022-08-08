package lesson4;

public class Encapsulation {
    public static void main(String[] args) {
        Persons3 person1 = new Persons3();
        person1.setName("Dmitry");
        person1.setAge(33);
        System.out.println("Выводим значение в main метода " + person1.getName());
        System.out.println("Выводим значение в main метода " + person1.getAge());
    }
}

class Persons3 {
    private String name;
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть больше 0");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
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
