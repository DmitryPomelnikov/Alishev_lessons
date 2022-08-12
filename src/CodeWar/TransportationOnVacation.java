package CodeWar;

public class TransportationOnVacation {
    /**
     * After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
     * You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.
     * Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
     * Write a code that gives out the total amount for different days(d).
     */
    public static void main(String[] args) {
        System.out.println(Rent.rentalCarCost(1));
        System.out.println(Rent.rentalCarCost(2));
        System.out.println(Rent.rentalCarCost(3));
        System.out.println(Rent.rentalCarCost(4));
        System.out.println(Rent.rentalCarCost(5));
        System.out.println(Rent.rentalCarCost(6));
        System.out.println(Rent.rentalCarCost(7));
        System.out.println(Rent.rentalCarCost(8));
        System.out.println(Rent.rentalCarCost(9));
        System.out.println(Rent.rentalCarCost(10));
    }
}

class Rent {
    private static final int COST_PER_DAY = 40;

    public static int rentalCarCost(int d) {
        int cost = d * COST_PER_DAY;
        if (d >= 3 && d < 7) {
            return cost - 20;
        } else if (d >= 7) {
            return cost - 50;
        } else return cost;
    }
}
