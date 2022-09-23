package CodeWar;

public class SquareEveryDigit {
    /**Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

     For example, if we run 9119 through the function, 811181 will come out, because 9 in sqr is 81 and 1 in sqr is 1.

     Note: The function accepts an integer and returns an integer*/
    public static void main(String[] args) {
        System.out.println(SquareDigit.squareDigits(9119));
    }
}

class SquareDigit {

    public static int squareDigits(int n) {
        int[] array = new int[Integer.toString(n).length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = (n % 10) * (n % 10);
            n /= 10;
        }
        String result = "";
        for (int qwe : array) {
            result += Integer.toString(qwe);
        }
        return Integer.parseInt(result);
    }

    public int squareDigits2(int n) {
        if (n < 10) return n * n;
        else {
            int h = squareDigits2(n / 10);
            int l = n % 10;
            return Integer.parseInt(h + "" + l * l);
        }
    }
}
