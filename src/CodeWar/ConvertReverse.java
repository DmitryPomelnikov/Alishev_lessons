package CodeWar;

public class ConvertReverse {
    /**
     * Convert number to reversed array of digits
     * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
     */
    public static void main(String[] args) {
        int[] arrrrray = Reversed.digitize2(35235);
    }
}

class Reversed {
    public static int[] digitize(long n) {
        int lengthArray = Long.toString(n).length();
        int[] array = new int[lengthArray];
        long constanta = n;
        long a = 0;
        long qwerty = 1;
        for (int q = 0; q < lengthArray - 1; q++) {
            qwerty = qwerty * 10;
        }
        long qqswxec = n / qwerty;
        int zxscd = (int) qqswxec;
        array[lengthArray - 1] = zxscd;
        for (int i = 0; i < lengthArray - 1; i++) {
            a = constanta - ((constanta / 10) * 10);
            array[i] = (int) a;
            constanta = constanta / 10;
        }
        for (int hj = 0; hj < array.length; hj++) {
            System.out.println(array[hj]);
        }
        return array;
    }

    public static int[] digitize2(long n) {
        int[] result = new int[("" + n).length()];
        for (int i = 0; n > 0; i++) {
            result[i] = (int) (n % 10);
            n /= 10;
        }
        for (int hj = 0; hj < result.length; hj++) {
            System.out.println(result[hj]);
        }
        return result;
    }
}
