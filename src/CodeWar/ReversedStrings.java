package CodeWar;

public class ReversedStrings {
    /**
     * Complete the solution so that it reverses the string passed into it.
     * 'world'  =>  'dlrow'
     * 'word'   =>  'drow'
     */
    public static void main(String[] args) {
        System.out.println(KataReverse.solution2("world"));
    }
}

class KataReverse {

    public static StringBuilder solution(String str) {
        StringBuilder result = new StringBuilder("");
        String[] array = str.split("");
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result;
    }

    public static String solution2(String str) {
        String result = "";
        String[] array = str.split("");
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }
    public static String solution3(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}