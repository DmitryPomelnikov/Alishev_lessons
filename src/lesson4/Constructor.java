package lesson4;

public class Constructor {
    public static void main(String[] args) {
        Humans humans1 = new Humans("Bob", 35);
    }
}

class Humans {

    private String name;
    private int age;

    public Humans() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println(name + " " + age);
    }

    public Humans(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Humans(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
