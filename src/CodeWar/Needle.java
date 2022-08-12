package CodeWar;

import java.util.Arrays;

public class Needle {
    /**
     * Can you find the needle in the haystack?
     * <p>
     * Write a function findNeedle() that takes an array full of junk but containing one "needle"
     * <p>
     * After your function finds the needle it should return a message (as a string) that says:
     */
    public static void main(String[] args) {
        Object[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54};
        Object[] array2 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(KataNeedle.findNeedle(array));
        System.out.println(KataNeedle.findNeedle(array2));
    }
}

class KataNeedle {
    public static String findNeedle2(Object[] haystack) {
        String indexNeedle = "";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) {
                continue;
            } else if (haystack[i].equals("needle")) {
                indexNeedle = "found the needle at position " + i;
                break;
            }
        }
        return indexNeedle;
    }

    //чужое решение
    public static String findNeedle(Object[] haystack) {
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}