package CodeWar;

import java.util.Locale;

public class Isograms {
    /**
     * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
     * Example: (Input --> Output)
     * "Dermatoglyphics" --> true
     * "aba" --> false
     * "moOse" --> false (ignore letter case)
     */
    public static void main(String[] args) {
        System.out.println(Isogram.isIsogram("Dermatoglyphics"));
        System.out.println(Isogram.isIsogram("isogram"));
        System.out.println(Isogram.isIsogram("moose"));
        System.out.println(Isogram.isIsogram("isIsogram"));
    }
}

class Isogram {
    public static boolean isIsogram2(String str) {
        String result = "";
        char[] charArray = str.toUpperCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (result.equals("")) {
                for (int q = 0; q < charArray.length; q++) {
                    if (i == q) {
                        continue;
                    } else if (charArray[i] == charArray[q]) {
                        result = "Yes";
                        break;
                    }
                }
            } else break;
        }
        return result.equals("");
    }

    //Не моё решение
    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}