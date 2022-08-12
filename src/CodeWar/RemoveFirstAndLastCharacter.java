package CodeWar;

public class RemoveFirstAndLastCharacter {
    /**It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
     * You're given one parameter, the original string. You don't have to worry with strings with less than two characters.*/
    public static void main(String[] args) {
        String qwe = "Hello people";
        System.out.println(qwe.length());
        String qwe2 = qwe.substring(1,11);
        System.out.println(qwe2);
        System.out.println(RemoveChars.remove("eloquent"));
    }
}
class RemoveChars {
    public static String remove(String str) {
        return str.length() > 2 ? str.substring(1, str.length() - 1) : str;
    }
}
