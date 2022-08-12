package CodeWar;

public class Bonjo {
    /**Create a function which answers the question "Are you playing banjo?".
     If your name starts with the letter "R" or lower case "r", you are playing banjo!

     The function takes a name as its only argument, and returns one of the following strings:

     name + " plays banjo"
     name + " does not play banjo"*/

    public static void main(String[] args) {
        System.out.println(KataBanjo.areYouPlayingBanjo("raamon"));

    }
}
class KataBanjo {
    public static String areYouPlayingBanjo(String name) {
        return name.substring(0,1).toUpperCase().equals("R")?name+" plays banjo":name + " does not play banjo";
    }

    public static String anotherWayBanjo(String name){
        return (name.charAt(0) == 'r' || name.charAt(0) == 'R') ? name + " plays banjo" : name + " does not play banjo";
    }
}