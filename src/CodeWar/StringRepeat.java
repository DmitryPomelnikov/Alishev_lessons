package CodeWar;

public class StringRepeat {
    /**
     * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
     * <p>
     * Examples (input -> output)
     * 6, "I"     -> "IIIIII"
     * 5, "Hello" -> "HelloHelloHelloHelloHello"
     */
    public static void main(String[] args) {
        System.out.println(SolutionRepeat.repeatStr(4, "Dimon"));
        System.out.println(SolutionRepeat.repeatStr(8, "Yes"));
        System.out.println(SolutionRepeat.repeatStr(5, "a"));
        System.out.println(SolutionRepeat.repeatStr(5, ""));
        System.out.println(SolutionRepeat.repeatStr(0, "Kata"));
    }
}

class SolutionRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String word = string;
        if (repeat == 0 || string.equals("")) {
            return "";
        } else {
            for (int i = 0; i < repeat - 1; i++) {
                word += string;
            }
        }
        return word;
    }
// элегантное решение, но мб доступно repeat в других версия
//    public static String repeatStr(final int repeat, final String string) {
//    return string.repeat(repeat);
//}
}
