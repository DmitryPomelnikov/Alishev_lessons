import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Class {
    /**
     * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
     * Write a function which takes a list of strings and returns each line prepended by the correct number.
     * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
     * Examples: (Input --> Output)
     * [] --> []
     * ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
     */
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        array2.add("");
        array2.add("");
        array2.add("");
        System.out.println(LineNumbering.number(array1));
        System.out.println(LineNumbering.number(array2));
    }
}

class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> array = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < lines.size(); i++) {
            counter++;
            array.add(counter + ": " + lines.get(i));
        }
        return array;
    }
}