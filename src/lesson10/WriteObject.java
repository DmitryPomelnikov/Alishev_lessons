package lesson10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Nina");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Programs\\Alishev_lessons\\src\\lesson10\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        oos.writeObject(person1);
        oos.writeObject(person2);

        oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
