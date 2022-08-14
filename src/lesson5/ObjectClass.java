package lesson5;

public class ObjectClass {
    public static void main(String[] args) {
        HumanCreated str = new HumanCreated("Dmitry", 33);
        System.out.println(str.toString());
        System.out.println(str); //одинаково, потому что по дефолту берется toString, т.к. все классы наследуются от класса Object
    }
}

class HumanCreated {
    private String name;
    private int age;

    public HumanCreated(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //если вызвать объект, то возвращается хешкод, поэтому надо переопределить методв toString класа Object
    public String toString() {
        return name + ", " + age;
    }
}