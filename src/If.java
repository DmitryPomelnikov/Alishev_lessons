public class If {
    public static void main(String[] args) {
        int myFirstInt = 15;
        if (myFirstInt < 10) {
            System.out.println("да, верно");
        } else if (myFirstInt > 20) {
            System.out.println("нет, не верно");
        } else System.out.println("условия не выполнены");
        int mySecondInt = 25;
        if (mySecondInt>10){
            System.out.println("условия 1");
        }
        else if(mySecondInt>20){
            System.out.println("условие 2");
        }
    }
}
