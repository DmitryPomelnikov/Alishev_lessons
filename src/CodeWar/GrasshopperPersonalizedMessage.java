package CodeWar;

public class GrasshopperPersonalizedMessage {
    /**Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

    Use conditionals to return the proper message:
            case	return
    name equals owner	'Hello boss'
    otherwise	'Hello guest'*/
    public static void main(String[] args) {
        System.out.println(Grasshopper.greet("Daniel", "Daniel"));
        System.out.println(Grasshopper.greet("Greg", "Daniel"));
    }
}
class Grasshopper {
    static String greet(String name, String owner) {
        return name.equals(owner)?"Hello boss":"Hello guest";
    }
}
