package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RecordFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Programs\\Alishev_lessons\\src\\lesson10\\TestFile");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Testing 1");
        printWriter.println("Testing 2");

        printWriter.close();
    }
}
