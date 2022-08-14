package lesson5;

public class Static {
    public static void main(String[] args) {
        HumanStatic human1 = new HumanStatic("Dmitry", 33);
        HumanStatic human2 = new HumanStatic("Victoria", 26);
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        HumanStatic human3 = new HumanStatic("Ann", 27);
        human1.printNumberOfPeople();
        human2.printNumberOfPeople();
        human3.printNumberOfPeople();
    }
}

class HumanStatic {
    String name;
    int age;

    public static int countPeople;

    public HumanStatic(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of peole is " + countPeople);
    }
}
