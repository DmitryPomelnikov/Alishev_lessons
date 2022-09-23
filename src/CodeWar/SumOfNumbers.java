package CodeWar;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(SumOfNumbersSolution.GetSum(-1, 2));
    }
}

class SumOfNumbersSolution {
    public static int GetSum(int a, int b) {
        int result = 0;
        if (a == b) {
            return a;
        } else {
            for (int q = Math.min(a, b); q <= Math.max(a, b); q++) {
                result += q;
            }
        }
        return result;
    }
}
