package CodeWar;

public class AreaOrPerimeter {
    /**
     * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
     * If it is a square, return its area. If it is a rectangle, return its perimeter.
     * Example(Input1, Input2 --> Output):
     * 6, 10 --> 32
     * 3, 3 --> 9
     */
    public static void main(String[] args) {
        System.out.println(SolutionAreaPerimeter.areaOrPerimeter(4, 4));
        System.out.println(SolutionAreaPerimeter.areaOrPerimeter(6, 10));
    }
}

class SolutionAreaPerimeter {
    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : (l + w) * 2;
    }
}
