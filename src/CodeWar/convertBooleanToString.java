package CodeWar;

public class convertBooleanToString {
    public static void main(String[] args) {
        System.out.println(BooleanToString.convert(true));
        System.out.println(BooleanToString.convert(false));
    }
}

class BooleanToString {
    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else
            return "false";
    }
}
