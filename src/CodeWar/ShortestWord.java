package CodeWar;

import java.util.Arrays;

public class ShortestWord {
    /**
     * Simple, given a string of words, return the length of the shortest word(s).
     * String will never be empty and you do not need to account for different data types.
     */
    public static void main(String[] args) {
        System.out.println(KataShortWord.findShort("turns out random test cases are easier than writing out basic ones"));
    }
}

class KataShortWord {
    public static int findShort(String s) {
        String[] array = s.split(" ");
        int shortWord = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (shortWord > array[i].length()) {
                shortWord = array[i].length();
            }
        }
        return shortWord;
    }

    //не моё решение
    public static int findShort2(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}