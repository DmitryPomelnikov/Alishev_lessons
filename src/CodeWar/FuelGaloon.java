package CodeWar;

public class FuelGaloon {
    /**
     * You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
     * <p>
     * Considering these factors, write a function that tells you if it is possible to get to the pump or not.
     * <p>
     * Function should return true if it is possible and false if not.
     */
    public static void main(String[] args) {
        System.out.println(AverageFuel.zeroFuel(50, 25, 2));
        System.out.println(AverageFuel.zeroFuel(100, 50, 1));
    }
}

class AverageFuel {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (mpg * fuelLeft) >= distanceToPump;
    }

}

