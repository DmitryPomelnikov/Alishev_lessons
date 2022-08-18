package CodeWar;

public class GrasshopperGrade {
    public static void main(String[] args) {
        System.out.println(GrassHopperGradeBook.getGrade(44,55,52));
        System.out.println(GrassHopperGradeBook.getGrade(48,55,52));
        System.out.println(GrassHopperGradeBook.getGrade(58,59,60));
        System.out.println(GrassHopperGradeBook.getGrade(0,0,0));
    }
}
class GrassHopperGradeBook {

    public static char getGrade(int s1, int s2, int s3) {
int result = (s1+s2+s3)/3;
        return result>=90?'A':result>=80?'B':result>=70?'C':result>=60?'D':'F';
    }
}