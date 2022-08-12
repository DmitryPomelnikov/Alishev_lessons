package CodeWar;

public class SpaceBus {
    /**
     * You have to write a function that accepts three parameters:
     * cap is the amount of people the bus can hold excluding the driver.
     * on is the number of people on the bus excluding the driver.
     * wait is the number of people waiting to get on to the bus excluding the driver.
     * If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
     * <p>
     * Usage Examples:
     * cap = 10, on = 5, wait = 5 --> 0 # He can fit all 5 passengers
     * cap = 100, on = 60, wait = 50 --> 10 # He can't fit 10 of the 50 waiting
     */
    public static void main(String[] args) {
        System.out.println(Bob.enough(10, 5, 5));
        System.out.println(Bob.enough(100, 60, 50));
        System.out.println(Bob.enough(20, 5, 5));
    }
}

class Bob {
    public static int enough(int cap, int on, int wait) {
        return cap - (wait + on) >= 0 ? 0 : (wait + on) - cap;
    }

    //не моё решение
    static int enough2(final int capacity, final int alreadyOn, final int waiting) {
        return Math.max(0, waiting + alreadyOn - capacity);
    }
}