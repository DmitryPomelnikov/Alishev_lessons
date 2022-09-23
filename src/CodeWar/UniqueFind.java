package CodeWar;

import java.util.Arrays;

public class UniqueFind {
    public static void main(String[] args) {
        System.out.println(SolutionUnique.findUniq2(new double[]{1, 1, 1, 2, 1, 1}));
    }
}

class SolutionUnique {
    public static double findUniq(double arr[]) {
        double result = 0;
        for (int i = 0; i<arr.length; i++){
            if (result!=0){
                break;
            }
            int counter =0;
            for (int q=0; q<arr.length;q++){
                if(arr[i]==arr[q]){
                    counter++;
                }
                if(q== arr.length-1 && counter==1){
                    result=arr[i];
                    break;
                }
            }
        }
        return result;
    }
    public static double findUniq2 (double arr[]) {
        Arrays.sort(arr);
        double result = 0;
        if (arr[0]!=arr[1]){
            return arr[0];
        }
        else if(arr[arr.length-1]!=arr[arr.length-2]){
            return arr[arr.length-1];
        }
        for (int i = 1; i<arr.length-1;i++){
            if(arr[i]!=arr[i-1] || arr[i]!=arr[i+1]){
                result = arr[i];
                break;
            }
        }
        return result;
    }
}
