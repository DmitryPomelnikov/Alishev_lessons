package CodeWar;

public class Square {
    /** A square of squares
     You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!
     However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.*/
    public static void main(String[] args) {
        System.out.println(KataSquare.isSquare(-1));
        System.out.println(KataSquare.isSquare(0));
        System.out.println(KataSquare.isSquare(3));
        System.out.println(KataSquare.isSquare(4));
        System.out.println(KataSquare.isSquare(25));
        System.out.println(KataSquare.isSquare(26));
    }
}

class KataSquare {
    public static boolean isSquare(int n) {
        double count = Math.sqrt(n);
        int count2= (int) count;
        return (count-count2)==0;
    }
    //более изящное решение чужое
    public static boolean isSquare2(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}