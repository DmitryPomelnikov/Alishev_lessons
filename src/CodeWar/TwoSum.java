package CodeWar;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] w = {1234,5678,9012};
        System.out.println(Arrays.toString(SolutionTwoSum.twoSum(w, 14690)));
    }
}
class SolutionTwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int [] array = new int[2];
        for(int i = 0; i<numbers.length;i++){
            for (int q = 0; q<numbers.length;q++){
                if(i==q){
                    break;
                }
                int w =numbers[i]+numbers[q];
                if (w==target){
                    array[0]=q;
                    array[1]=i;
                    break;
                }
            }
        }
        return array;
    }
}