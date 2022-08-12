package CodeWar;

public class RemoveExclamationMarks {
    /**
     * Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
     */
    public static void main(String[] args) {
        System.out.println(Solution.removeExclamationMarks("Hello World!"));
    }
}

class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}