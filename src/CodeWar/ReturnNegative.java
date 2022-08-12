package CodeWar;

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(Negative.negativeValue(5));
        System.out.println(Negative.negativeValue(-5));
        System.out.println(Negative.negativeValue(0));
    }
}
class Negative{
    public static int negativeValue(final int x){
        return (x < 0) ? x : x*(-1);
    }
    //чужое решение
    public static int negativeValue2(final int x){
        return -Math.abs(x);
    }
}