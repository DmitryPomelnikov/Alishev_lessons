package CodeWar;

public class WhoLikesIt {
    /**
     * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
     * Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:
     * []                                -->  "no one likes this"
     * ["Peter"]                         -->  "Peter likes this"
     * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
     * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
     * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
     */
    public static void main(String[] args) {
        System.out.println(SolutionCountingNames.whoLikesIt("Max", "John", "Mark"));
    }
}

class SolutionCountingNames {
    public static String whoLikesIt(String... names) {
        String namesCounting = "";
        switch (names.length) {
            case 0:
                namesCounting = "no one likes this";
                break;
            case 1:
                namesCounting = names[0] + " likes this";
                break;
            case 2:
                namesCounting = names[0] + ", " + names[1] + " like this";
                break;
            case 3:
                namesCounting = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                namesCounting = names[0] + ", " + names[1] + " and " + (names.length - 2) + "others like this";
                break;
        }
        return namesCounting;
    }
}