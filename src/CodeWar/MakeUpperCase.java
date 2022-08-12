package CodeWar;

public class MakeUpperCase {
    /**
     * Write a function which converts the input string to uppercase.
     */
    public static void main(String[] args) {
        System.out.println(Upper.MakeUpperCase("hello"));
    }
}

class Upper {
    public static String MakeUpperCase(String str) {
        return str.toUpperCase();
    }
}