package CodeWar;

import java.util.Locale;

public class SplitString {
    /**
     * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
     * The output should be two capital letters with a dot separating them.
     * It should look like this:
     * Sam Harris => S.H
     * patrick feeney => P.F
     */
    public static void main(String[] args) {
        System.out.println(AbbreviateTwoWords.abbrevName("P Favuzzi"));
        System.out.println(AbbreviateTwoWords.abbrevName("patrick reeney"));
    }
}

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        return words[0].substring(0, 1).toUpperCase() + "." + words[1].substring(0, 1).toUpperCase();
    }

    //чужое решение
    public static String abbrevName2(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}