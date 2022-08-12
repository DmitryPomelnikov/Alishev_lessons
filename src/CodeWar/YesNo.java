package CodeWar;

public class YesNo {
    public static void main(String[] args) {
        System.out.println(YesOrNo.boolToWord(true));
    }
}

class YesOrNo {
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}