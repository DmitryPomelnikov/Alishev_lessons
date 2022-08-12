package CodeWar;

public class CenturyFromYear {
    /**
     * The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
     * <p>
     * Task
     * Given a year, return the century it is in.
     * <p>
     * Examples
     * 1705 --> 18
     * 1900 --> 19
     * 1601 --> 17
     * 2000 --> 20
     */
    public static void main(String[] args) {
        System.out.println(SolutionCenturyFromYear.century(1705));
        System.out.println(SolutionCenturyFromYear.century(1900));
        System.out.println(SolutionCenturyFromYear.century(1601));
        System.out.println(SolutionCenturyFromYear.century(2000));
        System.out.println(SolutionCenturyFromYear.century(89));
    }
}

class SolutionCenturyFromYear {
    public static int century(int number) {
        int counting = number / 100;
        return number - (counting) * 100 == 0 ? counting : number - (counting) * 100 > 0 ? counting + 1 : 1;
    }

    //чужое решение
    public static int century2(int number) {
        return (int) Math.ceil((double) number / 100);
    }
}