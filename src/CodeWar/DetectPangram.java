package CodeWar;

public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(PangramChecker.check("The quick brown fox jumps over the lazy dog."));
        System.out.println(PangramChecker.check("You shall not pass!"));
    }

}
class PangramChecker {
    public static boolean check(String sentence) {
        boolean answer = true;
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < array.length; i++) {
            if (!sentence.toLowerCase().contains(array[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static boolean check2(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
}
