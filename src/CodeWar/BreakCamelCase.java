package CodeWar;

import java.util.ArrayList;
import java.util.Arrays;

public class BreakCamelCase {
    public static void main(String[] args) {
        String name = "xsxAasdAert";
//        System.out.println(SolutionBreakCamelCase.camelCase(name));
        System.out.println(SolutionBreakCamelCase.camelCase2(name));
    }
}

class SolutionBreakCamelCase  {
    public static String camelCase(String input) {
        char[] name1 = input.toCharArray();
        String result ="";
        for (int i =0; i<name1.length; i++){
            result = Character.isUpperCase(name1[i])?result+" "+name1[i]:result+name1[i];
        }
        return result;
    }

    public static String camelCase2(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}

