package lesson6.Package1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.name= "Bob";
        person.name2= "Bob";
        System.out.println(Person.CONSTANT); //публичный
        System.out.println(person.serName);
    }
}
