package CodeWar;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(GetTheMiddleCharacterKata.getMiddle("testing"));
        System.out.println(GetTheMiddleCharacterKata.getMiddle("A"));
    }
}

class GetTheMiddleCharacterKata {
    public static String getMiddle(String word) {
        return word.length()%2==1?word.substring((word.length()-1)/2,(word.length()-1)/2+1):word.substring((word.length())/2-1,(word.length())/2+1);
    }
}
